package org.apache.bookkeeper.bookie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused"})
public class LedgerEntryPageCostumTest {

    private List<LedgerEntryPage> pages;

    @Before
    public void setUp() {
        pages = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        for (LedgerEntryPage lep : pages) {
            if (lep != null) {
                lep.close();
            }
        }
    }

    private LedgerEntryPage createLedgerEntryPage(int pageSize, int entriesPerPage) {
        LedgerEntryPage lep = new LedgerEntryPage(pageSize, entriesPerPage);
        pages.add(lep);
        return lep;
    }

    private LedgerEntryPage createLedgerEntryPage(int pageSize, int entriesPerPage, LEPStateChangeCallback callback) {
        LedgerEntryPage lep = new LedgerEntryPage(pageSize, entriesPerPage, callback);
        pages.add(lep);
        return lep;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativePageSizeThrows() {
        createLedgerEntryPage(-1, 8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeEntriesPerPageThrows() {
        createLedgerEntryPage(1024, -5);
    }


    /*
    @Test
    public void testConstructorWithoutCallback() {
        LedgerEntryPage lep = new LedgerEntryPage(1024, 8);
        assertNotNull(lep);
        assertFalse(lep.inUse());
        assertEquals(1024, lep.getPageToWrite().capacity());
    }

    @Test
    public void testConstructorWithNullCallback() {
        LedgerEntryPage lep = new LedgerEntryPage(512, 4, null);
        assertNotNull(lep);
        assertFalse(lep.inUse());
        assertEquals(512, lep.getPageToWrite().capacity());
    }

    @Test
    public void testConstructorWithCallback() {
        LEPStateChangeCallback callback = mock(LEPStateChangeCallback.class);
        LedgerEntryPage lep = new LedgerEntryPage(256, 2, callback);
        assertNotNull(lep);
        assertFalse(lep.inUse());
        assertEquals(256, lep.getPageToWrite().capacity());
        // Verify that onResetInUse is called during construction
        verify(callback, times(1)).onResetInUse(lep);
    }
    @Test
    public void testUseAndReleasePage() {
        LedgerEntryPage lep = new LedgerEntryPage(1024, 8);
        assertFalse(lep.inUse());
        lep.usePage();
        assertTrue(lep.inUse());
        lep.releasePage();
        assertFalse(lep.inUse());
    }

    @Test(expected = IllegalStateException.class)
    public void testReleasePageWithoutUseThrows() {
        LedgerEntryPage lep = new LedgerEntryPage(1024, 8);
        lep.releasePage(); // Should throw IllegalStateException
    }*/
}