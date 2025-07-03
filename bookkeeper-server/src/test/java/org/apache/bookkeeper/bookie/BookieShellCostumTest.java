/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.bookkeeper.bookie;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.common.collect.Maps;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.Function;
import lombok.Cleanup;

import org.apache.bookkeeper.bookie.BookieShell;
import org.apache.bookkeeper.bookie.Cookie;
import org.apache.bookkeeper.bookie.BookieShell.MyCommand;
import org.apache.bookkeeper.bookie.BookieShell.RecoverCmd;
import org.apache.bookkeeper.client.BookKeeperAdmin;
import org.apache.bookkeeper.client.api.LedgerMetadata;
import org.apache.bookkeeper.conf.ClientConfiguration;
import org.apache.bookkeeper.conf.ServerConfiguration;
import org.apache.bookkeeper.discover.RegistrationManager;
import org.apache.bookkeeper.meta.MetadataDrivers;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.tools.cli.commands.bookie.LastMarkCommand;
import org.apache.bookkeeper.tools.cli.commands.bookies.ClusterInfoCommand;
import org.apache.bookkeeper.tools.cli.commands.bookies.ListBookiesCommand;
import org.apache.bookkeeper.tools.cli.commands.client.SimpleTestCommand;
import org.apache.bookkeeper.tools.cli.commands.client.SimpleTestCommand.Flags;
import org.apache.bookkeeper.tools.framework.CliFlags;
import org.apache.bookkeeper.util.EntryFormatter;
import org.apache.bookkeeper.util.LedgerIdFormatter;
import org.apache.bookkeeper.versioning.LongVersion;
import org.apache.bookkeeper.versioning.Version;
import org.apache.bookkeeper.versioning.Versioned;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.ParseException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Unit test for {@link BookieShell}.
 */
@RunWith(MockitoJUnitRunner.Silent.class) 
public class BookieShellCostumTest {

    private ClientConfiguration clientConf;
    private BookieShell shell;
    private BookKeeperAdmin admin;
    private RegistrationManager rm;
    private Cookie cookie;
    private Version version;

    private ListBookiesCommand.Flags mockListBookiesFlags;
    private ListBookiesCommand mockListBookiesCommand;
    private MockedStatic<ListBookiesCommand> listBookiesCommandMockedStatic;
    private MockedStatic<MetadataDrivers> metadataDriversMockedStatic;
    private MockedStatic<BookKeeperAdmin> bookKeeperAdminMockedStatic;
    private MockedStatic<ListBookiesCommand.Flags> listBookiesCommandflagsMockedStatic;

     @Before
    public void setup() throws Exception {
        this.shell = new BookieShell(LedgerIdFormatter.LONG_LEDGERID_FORMATTER, EntryFormatter.STRING_FORMATTER);

        this.mockListBookiesFlags = spy(new ListBookiesCommand.Flags());
        this.listBookiesCommandflagsMockedStatic = mockStatic(ListBookiesCommand.Flags.class);
        listBookiesCommandflagsMockedStatic.when(() -> ListBookiesCommand.Flags.newFlags())
                .thenReturn(mockListBookiesFlags);
        this.mockListBookiesCommand = spy(new ListBookiesCommand());
        doReturn(true).when(mockListBookiesCommand)
                .apply(any(ServerConfiguration.class), any(ListBookiesCommand.Flags.class));
        listBookiesCommandMockedStatic = mockStatic(ListBookiesCommand.class);
        listBookiesCommandMockedStatic.when(() -> ListBookiesCommand.newListBookiesCommand(mockListBookiesFlags))
                .thenReturn(mockListBookiesCommand);

        // construct the bookie shell.
        this.admin = mock(BookKeeperAdmin.class);

        bookKeeperAdminMockedStatic = mockStatic(BookKeeperAdmin.class);
        bookKeeperAdminMockedStatic.when(() -> BookKeeperAdmin.newBookKeeperAdmin(any(ClientConfiguration.class)))
                .thenReturn(admin);
        this.clientConf = new ClientConfiguration();
        this.clientConf.setMetadataServiceUri("zk://127.0.0.1/path/to/ledgers");
        when(admin.getConf()).thenReturn(this.clientConf);
        this.rm = mock(RegistrationManager.class);
        this.cookie = Cookie.newBuilder()
            .setBookieId("127.0.0.1:3181")
            .setInstanceId("xyz")
            .setJournalDirs("/path/to/journal/dir")
            .setLedgerDirs("/path/to/journal/dir")
            .setLayoutVersion(Cookie.CURRENT_COOKIE_LAYOUT_VERSION)
            .build();
        this.version = new LongVersion(1L);
        when(rm.readCookie(any(BookieId.class)))
            .thenReturn(new Versioned<>(cookie.toString().getBytes(UTF_8), version));

        metadataDriversMockedStatic = mockStatic(MetadataDrivers.class);
        metadataDriversMockedStatic
                .when(() -> MetadataDrivers.runFunctionWithRegistrationManager(
                        any(ServerConfiguration.class), any(Function.class)))
                .thenAnswer(invocationOnMock -> {
                    Function<RegistrationManager, Object> function = invocationOnMock.getArgument(1);
                    function.apply(rm);
                    return null;
                });
    }

    @After
    public void teardown() throws Exception {
       /*  listBookiesCommandMockedStatic.close();
        listBookiesCommandflagsMockedStatic.close();
        metadataDriversMockedStatic.close();
        bookKeeperAdminMockedStatic.close();
    */}

    private static CommandLine parseCommandLine(MyCommand cmd, String... args) throws ParseException {
        BasicParser parser = new BasicParser();
        return parser.parse(cmd.getOptions(), args);
    }
    @Test
    public void testRecoverCmdMissingArgument() throws Exception {

SimpleTestCommand.Flags mockSimpleTestFlags = spy(new SimpleTestCommand.Flags());

        

        shell.run(new String[] {
            "simpletest",
            "-e", "10",
            "-w", "5",
            "-a", "3",
            "-n", "200"
        });
       }

}
