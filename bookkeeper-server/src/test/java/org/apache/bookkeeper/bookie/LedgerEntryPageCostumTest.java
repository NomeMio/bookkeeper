
package org.apache.bookkeeper.bookie;

import org.junit.Test;
import static org.junit.Assert.*;

public class LedgerEntryPageCostumTest {

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
    }
}