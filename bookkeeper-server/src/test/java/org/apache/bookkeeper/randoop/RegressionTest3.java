package org.apache.bookkeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        boolean boolean14 = ledgerEntryPage2.inUse();
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        int int21 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey23 = ledgerEntryPage9.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertNotNull(entryKey23);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        boolean boolean16 = ledgerEntryPage2.inUse();
        long long17 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        long long12 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        boolean boolean24 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.resetPage();
        boolean boolean26 = ledgerEntryPage9.inUse();
        long long27 = ledgerEntryPage9.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage9.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(ofLong28);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean16 = ledgerEntryPage2.inUse();
        boolean boolean17 = ledgerEntryPage2.inUse();
        java.lang.String str18 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 1" + "'", str18, "-1@-1 clean 1");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        boolean boolean11 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        ledgerEntryPage2.markDeleted();
        int int11 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.close();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.releasePage();
        ledgerEntryPage9.releasePageNoCallback();
        long long31 = ledgerEntryPage9.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (byte) 0);
        int int3 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey4 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        long long13 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePage();
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.usePage();
        long long4 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        long long14 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.releasePage();
        ledgerEntryPage9.releasePageNoCallback();
        boolean boolean31 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong32 = ledgerEntryPage9.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ofLong32);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        int int17 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.usePage();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', 100);
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        long long12 = ledgerEntryPage2.getLastEntry();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) ' ');
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int19 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (byte) 1);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage14.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage14.getEntries(entryVisitor16);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage14.getEntries(entryVisitor18);
        java.lang.String str20 = ledgerEntryPage14.toString();
        boolean boolean21 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage14);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1@-1 clean 0" + "'", str20, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage9.getEntries(entryVisitor26);
        boolean boolean28 = ledgerEntryPage9.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.zeroPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str17 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 3" + "'", str17, "-1@-1 clean 3");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage9.getEntryKey();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, 10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        ledgerEntryPage9.resetPage();
        boolean boolean23 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage9.getEntries(entryVisitor24);
        boolean boolean26 = ledgerEntryPage9.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = ledgerEntryPage9.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        int int8 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        int int12 = ledgerEntryPage2.getVersion();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (int) (byte) -1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        boolean boolean18 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong19);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        int int9 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str11 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage12.getEntriesIterator();
        ledgerEntryPage12.usePage();
        java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage12.getPageToWrite();
        ledgerEntryPage12.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long25 = ledgerEntryPage24.getLastEntry();
        ledgerEntryPage24.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage24.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ofLong27);
        ledgerEntryPage12.releasePageNoCallback();
        boolean boolean30 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage12);
        java.lang.String str31 = ledgerEntryPage12.toString();
        boolean boolean32 = ledgerEntryPage12.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1@-1 clean 1" + "'", str31, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage17.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage17.getEntriesIterator();
        ledgerEntryPage17.usePage();
        boolean boolean26 = ledgerEntryPage17.equals((java.lang.Object) 'a');
        boolean boolean27 = ledgerEntryPage17.isDeleted();
        long long28 = ledgerEntryPage17.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage17.getEntriesIterator();
        boolean boolean30 = ledgerEntryPage17.inUse();
        boolean boolean31 = ledgerEntryPage17.inUse();
        boolean boolean32 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage17);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean30 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.close();
        ledgerEntryPage22.resetPage();
        long long33 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage22.getEntryKey();
        boolean boolean35 = ledgerEntryPage22.inUse();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        ledgerEntryPage2.zeroPage();
        boolean boolean38 = ledgerEntryPage2.inUse();
        java.lang.String str39 = ledgerEntryPage2.toString();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1@-1 clean 1" + "'", str39, "-1@-1 clean 1");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        java.lang.String str26 = ledgerEntryPage19.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage19.getEntryKey();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage32.getEntries(entryVisitor36);
        ledgerEntryPage32.usePage();
        boolean boolean39 = ledgerEntryPage19.equals((java.lang.Object) ledgerEntryPage32);
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage32.getEntriesIterator();
        boolean boolean41 = ledgerEntryPage2.equals((java.lang.Object) ofLong40);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor42 = null;
        ledgerEntryPage2.getEntries(entryVisitor42);
        java.lang.String str44 = ledgerEntryPage2.toString();
        boolean boolean45 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong46 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1@-1 clean 1" + "'", str44, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(ofLong46);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        ledgerEntryPage14.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ofLong17);
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        boolean boolean20 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        boolean boolean32 = ledgerEntryPage23.inUse();
        java.nio.ByteBuffer byteBuffer33 = ledgerEntryPage23.getPageToWrite();
        boolean boolean34 = ledgerEntryPage23.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage23.getEntriesIterator();
        boolean boolean36 = ledgerEntryPage16.equals((java.lang.Object) ledgerEntryPage23);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage16.getEntries(entryVisitor37);
        ledgerEntryPage16.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage16.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        boolean boolean19 = ledgerEntryPage15.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage22.isDeleted();
        java.lang.String str29 = ledgerEntryPage22.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage22.getEntryKey();
        boolean boolean31 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage35 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong36 = ledgerEntryPage35.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage35.getEntries(entryVisitor37);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor39 = null;
        ledgerEntryPage35.getEntries(entryVisitor39);
        ledgerEntryPage35.usePage();
        boolean boolean42 = ledgerEntryPage22.equals((java.lang.Object) ledgerEntryPage35);
        java.lang.Class<?> wildcardClass43 = ledgerEntryPage22.getClass();
        boolean boolean44 = ledgerEntryPage2.equals((java.lang.Object) wildcardClass43);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor45 = null;
        ledgerEntryPage2.getEntries(entryVisitor45);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        long long20 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        long long13 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long20 = ledgerEntryPage19.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage19.inUse();
        ledgerEntryPage19.usePage();
        ledgerEntryPage19.zeroPage();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.releasePage();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = ledgerEntryPage19.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(1, (-1));
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage6 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage6.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage6.getEntries(entryVisitor8);
        int int10 = ledgerEntryPage6.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage6.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage6.getEntriesIterator();
        ledgerEntryPage6.usePage();
        boolean boolean15 = ledgerEntryPage6.equals((java.lang.Object) 'a');
        boolean boolean16 = ledgerEntryPage6.isDeleted();
        long long17 = ledgerEntryPage6.getLastEntry();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage6);
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        boolean boolean14 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        int int13 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage17.getEntriesIterator();
        int int23 = ledgerEntryPage17.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage17.getEntries(entryVisitor24);
        ledgerEntryPage17.markDeleted();
        long long27 = ledgerEntryPage17.getLastEntry();
        java.lang.Class<?> wildcardClass28 = ledgerEntryPage17.getClass();
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage17);
        java.lang.String str30 = ledgerEntryPage17.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean7 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(entryKey11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(entryKey16);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage12.getEntriesIterator();
        ledgerEntryPage12.usePage();
        java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage12.getPageToWrite();
        ledgerEntryPage12.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long25 = ledgerEntryPage24.getLastEntry();
        ledgerEntryPage24.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage24.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ofLong27);
        ledgerEntryPage12.releasePageNoCallback();
        boolean boolean30 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage12);
        ledgerEntryPage12.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.close();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        int int9 = ledgerEntryPage5.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage5.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage5.getEntriesIterator();
        ledgerEntryPage5.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage5.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage5.getEntriesIterator();
        int int15 = ledgerEntryPage5.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        boolean boolean19 = ledgerEntryPage18.isDeleted();
        boolean boolean20 = ledgerEntryPage5.equals((java.lang.Object) ledgerEntryPage18);
        boolean boolean21 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage18);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.lang.String str13 = ledgerEntryPage2.toString();
        int int14 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        long long28 = ledgerEntryPage22.getLastEntry();
        java.lang.String str29 = ledgerEntryPage22.toString();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage22.getEntries(entryVisitor33);
        org.apache.bookkeeper.bookie.EntryKey entryKey35 = ledgerEntryPage22.getEntryKey();
        ledgerEntryPage22.resetPage();
        boolean boolean37 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey39 = ledgerEntryPage9.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(entryKey39);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        long long17 = ledgerEntryPage2.getLastEntry();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        boolean boolean19 = ledgerEntryPage2.inUse();
        int int20 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.lang.String str22 = ledgerEntryPage9.toString();
        int int23 = ledgerEntryPage9.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        boolean boolean8 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str10 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 2" + "'", str10, "-1@-1 clean 2");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        boolean boolean14 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass17 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage15.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        boolean boolean23 = ledgerEntryPage8.equals((java.lang.Object) ledgerEntryPage15);
        boolean boolean24 = ledgerEntryPage2.equals((java.lang.Object) boolean23);
        boolean boolean25 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        java.util.PrimitiveIterator.OfLong ofLong36 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage39 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage39.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor41 = null;
        ledgerEntryPage39.getEntries(entryVisitor41);
        boolean boolean43 = ledgerEntryPage39.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage46 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong47 = ledgerEntryPage46.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor48 = null;
        ledgerEntryPage46.getEntries(entryVisitor48);
        int int50 = ledgerEntryPage46.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong51 = ledgerEntryPage46.getEntriesIterator();
        boolean boolean52 = ledgerEntryPage46.isDeleted();
        java.lang.String str53 = ledgerEntryPage46.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey54 = ledgerEntryPage46.getEntryKey();
        boolean boolean55 = ledgerEntryPage39.equals((java.lang.Object) ledgerEntryPage46);
        ledgerEntryPage46.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage59 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong60 = ledgerEntryPage59.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor61 = null;
        ledgerEntryPage59.getEntries(entryVisitor61);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor63 = null;
        ledgerEntryPage59.getEntries(entryVisitor63);
        ledgerEntryPage59.usePage();
        boolean boolean66 = ledgerEntryPage46.equals((java.lang.Object) ledgerEntryPage59);
        java.util.PrimitiveIterator.OfLong ofLong67 = ledgerEntryPage59.getEntriesIterator();
        boolean boolean68 = ledgerEntryPage29.equals((java.lang.Object) ofLong67);
        long long69 = ledgerEntryPage29.getLastEntry();
        java.nio.ByteBuffer byteBuffer70 = ledgerEntryPage29.getPageToWrite();
        boolean boolean71 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage29);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor72 = null;
        ledgerEntryPage2.getEntries(entryVisitor72);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(ofLong47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(ofLong51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1@-1 clean 0" + "'", str53, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(ofLong60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(ofLong67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean11 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        long long13 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        long long22 = ledgerEntryPage16.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey23 = ledgerEntryPage16.getEntryKey();
        boolean boolean24 = ledgerEntryPage16.inUse();
        boolean boolean25 = ledgerEntryPage16.isDeleted();
        java.lang.Class<?> wildcardClass26 = ledgerEntryPage16.getClass();
        boolean boolean27 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(entryKey23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        long long13 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage12.isDeleted();
        java.lang.String str19 = ledgerEntryPage12.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage12.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage2.equals((java.lang.Object) ofLong21);
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(entryKey24);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        long long12 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        ledgerEntryPage23.usePage();
        java.lang.String str33 = ledgerEntryPage23.toString();
        ledgerEntryPage23.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage23.getEntriesIterator();
        boolean boolean36 = ledgerEntryPage23.inUse();
        boolean boolean37 = ledgerEntryPage9.equals((java.lang.Object) boolean36);
        ledgerEntryPage9.resetPage();
        int int39 = ledgerEntryPage9.getVersion();
        int int40 = ledgerEntryPage9.getVersion();
        ledgerEntryPage9.markDeleted();
        int int42 = ledgerEntryPage9.getVersion();
        long long43 = ledgerEntryPage9.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1@-1 clean 2" + "'", str33, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(entryKey11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.resetPage();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        long long12 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.releasePageNoCallback();
        long long15 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        boolean boolean16 = ledgerEntryPage15.isDeleted();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage15.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.inUse();
        long long15 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage23.getEntriesIterator();
        ledgerEntryPage23.usePage();
        boolean boolean32 = ledgerEntryPage23.equals((java.lang.Object) '4');
        ledgerEntryPage23.zeroPage();
        int int34 = ledgerEntryPage23.getVersion();
        ledgerEntryPage23.usePage();
        ledgerEntryPage23.releasePageNoCallback();
        boolean boolean37 = ledgerEntryPage23.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey38 = ledgerEntryPage23.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey39 = ledgerEntryPage23.getEntryKey();
        boolean boolean40 = ledgerEntryPage9.equals((java.lang.Object) entryKey39);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(entryKey38);
        org.junit.Assert.assertNotNull(entryKey39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        boolean boolean14 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        boolean boolean18 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int20 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        int int13 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        boolean boolean24 = ledgerEntryPage9.inUse();
        boolean boolean25 = ledgerEntryPage9.isDeleted();
        long long26 = ledgerEntryPage9.getLastEntry();
        boolean boolean27 = ledgerEntryPage9.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long12 = ledgerEntryPage11.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage11.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage11.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage11.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) entryVisitor15);
        boolean boolean18 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.lang.Object obj6 = null;
        boolean boolean7 = ledgerEntryPage2.equals(obj6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int19 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        boolean boolean26 = ledgerEntryPage22.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        int int33 = ledgerEntryPage29.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage29.getEntriesIterator();
        boolean boolean35 = ledgerEntryPage29.isDeleted();
        java.lang.String str36 = ledgerEntryPage29.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey37 = ledgerEntryPage29.getEntryKey();
        boolean boolean38 = ledgerEntryPage22.equals((java.lang.Object) ledgerEntryPage29);
        ledgerEntryPage29.markDeleted();
        ledgerEntryPage29.resetPage();
        int int41 = ledgerEntryPage29.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey42 = ledgerEntryPage29.getEntryKey();
        boolean boolean43 = ledgerEntryPage29.inUse();
        ledgerEntryPage29.usePage();
        boolean boolean45 = ledgerEntryPage29.inUse();
        int int46 = ledgerEntryPage29.getVersion();
        boolean boolean47 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage29);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor48 = null;
        ledgerEntryPage29.getEntries(entryVisitor48);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1@-1 clean 0" + "'", str36, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(entryKey42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        long long13 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.lang.String str22 = ledgerEntryPage9.toString();
        boolean boolean23 = ledgerEntryPage9.inUse();
        int int24 = ledgerEntryPage9.getVersion();
        long long25 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.resetPage();
        boolean boolean27 = ledgerEntryPage9.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.close();
        boolean boolean12 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        long long18 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 1" + "'", str10, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 1" + "'", str11, "-1@-1 clean 1");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage2.inUse();
        long long16 = ledgerEntryPage2.getLastEntry();
        int int17 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ledgerEntryPage2.getOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        boolean boolean10 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        ledgerEntryPage14.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ofLong17);
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong6);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePageNoCallback();
        long long15 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        ledgerEntryPage14.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ofLong17);
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(entryKey20);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (int) '4');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        boolean boolean11 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        int int11 = ledgerEntryPage2.getVersion();
        java.lang.String str12 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage8.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage8.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryKey13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean16 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        long long17 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        int int22 = ledgerEntryPage9.getVersion();
        java.lang.String str23 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage8.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage8.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryKey13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        boolean boolean20 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        long long12 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage9.getEntriesIterator();
        java.lang.Class<?> wildcardClass27 = ofLong26.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        java.lang.String str6 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        long long28 = ledgerEntryPage22.getLastEntry();
        java.lang.String str29 = ledgerEntryPage22.toString();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage22.getEntries(entryVisitor33);
        org.apache.bookkeeper.bookie.EntryKey entryKey35 = ledgerEntryPage22.getEntryKey();
        ledgerEntryPage22.resetPage();
        boolean boolean37 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        org.apache.bookkeeper.bookie.EntryKey entryKey38 = ledgerEntryPage22.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(entryKey38);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        long long18 = ledgerEntryPage12.getLastEntry();
        java.lang.String str19 = ledgerEntryPage12.toString();
        ledgerEntryPage12.usePage();
        boolean boolean21 = ledgerEntryPage12.inUse();
        java.nio.ByteBuffer byteBuffer22 = ledgerEntryPage12.getPageToWrite();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) byteBuffer22);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, (int) (byte) 1);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.getEntries(entryVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.zeroPage();
        java.lang.String str15 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 1" + "'", str15, "-1@-1 clean 1");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean11 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.usePage();
        long long20 = ledgerEntryPage2.getLastEntry();
        boolean boolean21 = ledgerEntryPage2.inUse();
        boolean boolean22 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(entryKey25);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, (int) (byte) 1);
        int int3 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage6 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage6.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage6.getEntries(entryVisitor8);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage6.getEntries(entryVisitor10);
        ledgerEntryPage6.usePage();
        boolean boolean13 = ledgerEntryPage6.inUse();
        ledgerEntryPage6.releasePageNoCallback();
        boolean boolean15 = ledgerEntryPage6.inUse();
        boolean boolean16 = ledgerEntryPage2.equals((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage9.getEntryKey();
        java.lang.String str20 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1@-1 clean 2" + "'", str20, "-1@-1 clean 2");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        long long12 = ledgerEntryPage2.getLastEntry();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        boolean boolean18 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int20 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.lang.String str15 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 0" + "'", str15, "-1@-1 clean 0");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        int int13 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        int int11 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        boolean boolean22 = ledgerEntryPage9.inUse();
        java.lang.String str23 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage18.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage18.getEntriesIterator();
        ledgerEntryPage18.usePage();
        java.nio.ByteBuffer byteBuffer26 = ledgerEntryPage18.getPageToWrite();
        ledgerEntryPage18.usePage();
        ledgerEntryPage18.markDeleted();
        boolean boolean29 = ledgerEntryPage18.isDeleted();
        java.nio.ByteBuffer byteBuffer30 = ledgerEntryPage18.getPageToWrite();
        boolean boolean31 = ledgerEntryPage2.equals((java.lang.Object) byteBuffer30);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage13 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage13.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage13.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage13.getEntries(entryVisitor17);
        ledgerEntryPage13.usePage();
        java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage13.getPageToWrite();
        int int21 = ledgerEntryPage13.getVersion();
        boolean boolean22 = ledgerEntryPage13.isDeleted();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage13);
        ledgerEntryPage13.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int19 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        boolean boolean26 = ledgerEntryPage22.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        int int33 = ledgerEntryPage29.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage29.getEntriesIterator();
        boolean boolean35 = ledgerEntryPage29.isDeleted();
        java.lang.String str36 = ledgerEntryPage29.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey37 = ledgerEntryPage29.getEntryKey();
        boolean boolean38 = ledgerEntryPage22.equals((java.lang.Object) ledgerEntryPage29);
        ledgerEntryPage29.markDeleted();
        ledgerEntryPage29.resetPage();
        int int41 = ledgerEntryPage29.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey42 = ledgerEntryPage29.getEntryKey();
        boolean boolean43 = ledgerEntryPage29.inUse();
        ledgerEntryPage29.usePage();
        boolean boolean45 = ledgerEntryPage29.inUse();
        int int46 = ledgerEntryPage29.getVersion();
        boolean boolean47 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage29);
        java.lang.Class<?> wildcardClass48 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1@-1 clean 0" + "'", str36, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(entryKey42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long21 = ledgerEntryPage20.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage20.getEntriesIterator();
        boolean boolean23 = ledgerEntryPage20.inUse();
        int int24 = ledgerEntryPage20.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage20.getEntryKey();
        boolean boolean26 = ledgerEntryPage9.equals((java.lang.Object) entryKey25);
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage9.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        long long17 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean31 = ledgerEntryPage22.equals((java.lang.Object) '4');
        ledgerEntryPage22.zeroPage();
        int int33 = ledgerEntryPage22.getVersion();
        ledgerEntryPage22.releasePage();
        boolean boolean35 = ledgerEntryPage22.isDeleted();
        boolean boolean36 = ledgerEntryPage9.equals((java.lang.Object) boolean35);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage9.getEntries(entryVisitor37);
        java.lang.String str39 = ledgerEntryPage9.toString();
        int int40 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey41 = ledgerEntryPage9.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1@-1 clean 0" + "'", str39, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(entryKey41);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.markDeleted();
        boolean boolean19 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage8);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ledgerEntryPage8.getOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 8);
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        java.lang.String str3 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        long long12 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        boolean boolean16 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        int int16 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str14 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage24.getEntries(entryVisitor26);
        int int28 = ledgerEntryPage24.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage24.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage24.getEntriesIterator();
        ledgerEntryPage24.usePage();
        boolean boolean32 = ledgerEntryPage17.equals((java.lang.Object) ledgerEntryPage24);
        ledgerEntryPage24.usePage();
        boolean boolean34 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage24);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 1" + "'", str14, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.zeroPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        java.lang.Object obj13 = null;
        boolean boolean14 = ledgerEntryPage2.equals(obj13);
        ledgerEntryPage2.releasePageNoCallback();
        java.lang.String str16 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 1" + "'", str16, "-1@-1 clean 1");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        int int11 = ledgerEntryPage2.getVersion();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', 3);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePageNoCallback();
        long long15 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        int int11 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage15.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage15.getPageToWrite();
        ledgerEntryPage15.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage15.getEntryKey();
        ledgerEntryPage15.close();
        boolean boolean27 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        boolean boolean28 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(100, (int) (byte) 100);
        int int3 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage11.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage11.getEntries(entryVisitor13);
        int int15 = ledgerEntryPage11.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage11.getEntriesIterator();
        boolean boolean17 = ledgerEntryPage11.isDeleted();
        java.lang.String str18 = ledgerEntryPage11.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage11.getEntryKey();
        java.lang.String str20 = ledgerEntryPage11.toString();
        long long21 = ledgerEntryPage11.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage11.getEntriesIterator();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) ofLong22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 0" + "'", str18, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1@-1 clean 0" + "'", str20, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        java.lang.String str9 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.zeroPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) -1);
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        long long13 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(entryKey16);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        boolean boolean16 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        boolean boolean14 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage2.getEntries(entryVisitor18);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ledgerEntryPage2.getOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage18.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage18.getEntriesIterator();
        ledgerEntryPage18.usePage();
        java.nio.ByteBuffer byteBuffer26 = ledgerEntryPage18.getPageToWrite();
        ledgerEntryPage18.usePage();
        ledgerEntryPage18.usePage();
        ledgerEntryPage18.markDeleted();
        boolean boolean30 = ledgerEntryPage18.isDeleted();
        boolean boolean31 = ledgerEntryPage2.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        java.lang.String str16 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str22 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 1" + "'", str16, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        long long17 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage21.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage21.getEntries(entryVisitor23);
        int int25 = ledgerEntryPage21.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage21.getEntriesIterator();
        long long27 = ledgerEntryPage21.getLastEntry();
        java.lang.String str28 = ledgerEntryPage21.toString();
        ledgerEntryPage21.usePage();
        ledgerEntryPage21.releasePage();
        int int31 = ledgerEntryPage21.getVersion();
        ledgerEntryPage21.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey33 = ledgerEntryPage21.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage21.getEntryKey();
        boolean boolean35 = ledgerEntryPage2.equals((java.lang.Object) entryKey34);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 0" + "'", str28, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(entryKey33);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        int int11 = ledgerEntryPage2.getVersion();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        java.nio.ByteBuffer byteBuffer36 = ledgerEntryPage29.getPageToWrite();
        int int37 = ledgerEntryPage29.getVersion();
        ledgerEntryPage29.usePage();
        ledgerEntryPage29.close();
        ledgerEntryPage29.releasePageNoCallback();
        boolean boolean41 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage29);
        ledgerEntryPage9.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage9.getEntryKey();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(ofLong19);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, 3);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        java.lang.String str26 = ledgerEntryPage19.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage19.getEntryKey();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage12.resetPage();
        ledgerEntryPage12.markDeleted();
        boolean boolean31 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage12);
        ledgerEntryPage12.usePage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.lang.String str15 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 1" + "'", str15, "-1@-1 clean 1");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(3, (int) (byte) 100);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.getEntries(entryVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        int int17 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage2.getEntries(entryVisitor18);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ledgerEntryPage2.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        long long20 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage24.getEntries(entryVisitor26);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage24.getEntries(entryVisitor28);
        boolean boolean31 = ledgerEntryPage24.equals((java.lang.Object) (-1.0d));
        boolean boolean32 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage24);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage9.getEntryKey();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
        boolean boolean22 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        boolean boolean13 = ledgerEntryPage9.inUse();
        java.lang.String str14 = ledgerEntryPage9.toString();
        boolean boolean15 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        boolean boolean22 = ledgerEntryPage18.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        boolean boolean31 = ledgerEntryPage25.isDeleted();
        java.lang.String str32 = ledgerEntryPage25.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey33 = ledgerEntryPage25.getEntryKey();
        boolean boolean34 = ledgerEntryPage18.equals((java.lang.Object) ledgerEntryPage25);
        ledgerEntryPage25.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage38 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong39 = ledgerEntryPage38.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor40 = null;
        ledgerEntryPage38.getEntries(entryVisitor40);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor42 = null;
        ledgerEntryPage38.getEntries(entryVisitor42);
        ledgerEntryPage38.usePage();
        boolean boolean45 = ledgerEntryPage25.equals((java.lang.Object) ledgerEntryPage38);
        java.util.PrimitiveIterator.OfLong ofLong46 = ledgerEntryPage38.getEntriesIterator();
        boolean boolean47 = ledgerEntryPage9.equals((java.lang.Object) ofLong46);
        boolean boolean48 = ledgerEntryPage2.equals((java.lang.Object) ofLong46);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1@-1 clean 0" + "'", str32, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(ofLong39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(ofLong46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage13 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage13.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage13.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage13.getEntries(entryVisitor17);
        ledgerEntryPage13.usePage();
        java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage13.getPageToWrite();
        int int21 = ledgerEntryPage13.getVersion();
        boolean boolean22 = ledgerEntryPage13.isDeleted();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage13);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage26 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage26.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage26.getEntries(entryVisitor28);
        int int30 = ledgerEntryPage26.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage26.getEntriesIterator();
        boolean boolean33 = ledgerEntryPage26.equals((java.lang.Object) 100L);
        ledgerEntryPage26.markDeleted();
        boolean boolean35 = ledgerEntryPage26.isDeleted();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.close();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        long long19 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage9.getEntryKey();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
        boolean boolean22 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        int int6 = ledgerEntryPage5.getVersion();
        boolean boolean7 = ledgerEntryPage2.equals((java.lang.Object) int6);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (int) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long6 = ledgerEntryPage5.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage5.getEntriesIterator();
        ledgerEntryPage5.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage11.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage11.getEntries(entryVisitor13);
        int int15 = ledgerEntryPage11.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage18.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage18.getEntriesIterator();
        ledgerEntryPage18.usePage();
        boolean boolean26 = ledgerEntryPage11.equals((java.lang.Object) ledgerEntryPage18);
        boolean boolean27 = ledgerEntryPage5.equals((java.lang.Object) boolean26);
        ledgerEntryPage5.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage5.getEntries(entryVisitor29);
        boolean boolean31 = ledgerEntryPage5.inUse();
        boolean boolean32 = ledgerEntryPage2.equals((java.lang.Object) boolean31);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.usePage();
        long long20 = ledgerEntryPage2.getLastEntry();
        boolean boolean21 = ledgerEntryPage2.inUse();
        boolean boolean22 = ledgerEntryPage2.inUse();
        long long23 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage10 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage10.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage10.getEntries(entryVisitor12);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage10.getEntries(entryVisitor14);
        ledgerEntryPage10.usePage();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage10.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage20.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage20.getEntries(entryVisitor22);
        boolean boolean24 = ledgerEntryPage20.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage27 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage27.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage27.getEntries(entryVisitor29);
        int int31 = ledgerEntryPage27.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong32 = ledgerEntryPage27.getEntriesIterator();
        boolean boolean33 = ledgerEntryPage27.isDeleted();
        java.lang.String str34 = ledgerEntryPage27.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey35 = ledgerEntryPage27.getEntryKey();
        boolean boolean36 = ledgerEntryPage20.equals((java.lang.Object) ledgerEntryPage27);
        ledgerEntryPage27.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage40 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong41 = ledgerEntryPage40.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor42 = null;
        ledgerEntryPage40.getEntries(entryVisitor42);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor44 = null;
        ledgerEntryPage40.getEntries(entryVisitor44);
        ledgerEntryPage40.usePage();
        boolean boolean47 = ledgerEntryPage27.equals((java.lang.Object) ledgerEntryPage40);
        java.util.PrimitiveIterator.OfLong ofLong48 = ledgerEntryPage40.getEntriesIterator();
        boolean boolean49 = ledgerEntryPage10.equals((java.lang.Object) ofLong48);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor50 = null;
        ledgerEntryPage10.getEntries(entryVisitor50);
        boolean boolean52 = ledgerEntryPage2.equals((java.lang.Object) entryVisitor50);
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(ofLong32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(ofLong41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(ofLong48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage15.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        boolean boolean23 = ledgerEntryPage8.equals((java.lang.Object) ledgerEntryPage15);
        boolean boolean24 = ledgerEntryPage2.equals((java.lang.Object) boolean23);
        ledgerEntryPage2.usePage();
        boolean boolean26 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        int int33 = ledgerEntryPage29.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage29.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage29.getEntriesIterator();
        ledgerEntryPage29.usePage();
        java.nio.ByteBuffer byteBuffer37 = ledgerEntryPage29.getPageToWrite();
        ledgerEntryPage29.usePage();
        ledgerEntryPage29.usePage();
        ledgerEntryPage29.markDeleted();
        boolean boolean41 = ledgerEntryPage29.isDeleted();
        ledgerEntryPage29.zeroPage();
        java.util.PrimitiveIterator.OfLong ofLong43 = ledgerEntryPage29.getEntriesIterator();
        boolean boolean44 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage29);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(ofLong43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage16.getEntries(entryVisitor20);
        ledgerEntryPage16.usePage();
        java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage16.getPageToWrite();
        long long24 = ledgerEntryPage16.getLastEntry();
        java.lang.Class<?> wildcardClass25 = ledgerEntryPage16.getClass();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        int int8 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) ' ');
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        int int9 = ledgerEntryPage5.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage5.getEntriesIterator();
        boolean boolean12 = ledgerEntryPage5.equals((java.lang.Object) 100L);
        boolean boolean13 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        boolean boolean16 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        int int6 = ledgerEntryPage5.getVersion();
        boolean boolean7 = ledgerEntryPage2.equals((java.lang.Object) int6);
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage8.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage8.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryKey13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        int int18 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePageNoCallback();
        long long15 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long21 = ledgerEntryPage20.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage20.getEntriesIterator();
        boolean boolean23 = ledgerEntryPage20.inUse();
        int int24 = ledgerEntryPage20.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage20.getEntryKey();
        boolean boolean26 = ledgerEntryPage9.equals((java.lang.Object) entryKey25);
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage9.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer28 = ledgerEntryPage9.getPageToWrite();
        int int29 = ledgerEntryPage9.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.close();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long20 = ledgerEntryPage19.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage19.inUse();
        ledgerEntryPage19.usePage();
        ledgerEntryPage19.zeroPage();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage19.getEntriesIterator();
        ledgerEntryPage19.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ofLong26);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        int int15 = ledgerEntryPage2.getVersion();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        long long14 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage14.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage14.getEntries(entryVisitor16);
        boolean boolean18 = ledgerEntryPage14.inUse();
        java.lang.String str19 = ledgerEntryPage14.toString();
        boolean boolean20 = ledgerEntryPage14.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage14.getEntryKey();
        java.lang.String str22 = ledgerEntryPage14.toString();
        java.lang.String str23 = ledgerEntryPage14.toString();
        boolean boolean24 = ledgerEntryPage14.isDeleted();
        boolean boolean25 = ledgerEntryPage14.inUse();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) boolean25);
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(entryKey27);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        ledgerEntryPage9.resetPage();
        boolean boolean24 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage9.getEntriesIterator();
        int int26 = ledgerEntryPage9.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int18 = ledgerEntryPage17.getVersion();
        boolean boolean19 = ledgerEntryPage17.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage17.getEntryKey();
        boolean boolean21 = ledgerEntryPage2.equals((java.lang.Object) entryKey20);
        int int22 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage22.getEntries(entryVisitor26);
        ledgerEntryPage22.usePage();
        boolean boolean29 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        boolean boolean30 = ledgerEntryPage9.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage22.getEntries(entryVisitor26);
        ledgerEntryPage22.usePage();
        boolean boolean29 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage9.getEntryKey();
        long long31 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor32 = null;
        ledgerEntryPage9.getEntries(entryVisitor32);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage7 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage7.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage7.getEntries(entryVisitor9);
        int int11 = ledgerEntryPage7.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage7.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage7.getEntriesIterator();
        ledgerEntryPage7.usePage();
        boolean boolean16 = ledgerEntryPage7.equals((java.lang.Object) '4');
        ledgerEntryPage7.zeroPage();
        int int18 = ledgerEntryPage7.getVersion();
        ledgerEntryPage7.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        int int28 = ledgerEntryPage22.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage22.getEntries(entryVisitor29);
        ledgerEntryPage22.markDeleted();
        long long32 = ledgerEntryPage22.getLastEntry();
        java.lang.Class<?> wildcardClass33 = ledgerEntryPage22.getClass();
        boolean boolean34 = ledgerEntryPage7.equals((java.lang.Object) ledgerEntryPage22);
        boolean boolean35 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage22);
        java.lang.String str36 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1@-1 clean 0" + "'", str36, "-1@-1 clean 0");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        int int15 = ledgerEntryPage2.getVersion();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        boolean boolean21 = ledgerEntryPage17.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage24.getEntries(entryVisitor26);
        int int28 = ledgerEntryPage24.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage24.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage24.getEntryKey();
        boolean boolean32 = ledgerEntryPage17.equals((java.lang.Object) ledgerEntryPage24);
        org.apache.bookkeeper.bookie.EntryKey entryKey33 = ledgerEntryPage17.getEntryKey();
        boolean boolean34 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage17);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(entryKey31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(entryKey33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage17.getEntriesIterator();
        int int23 = ledgerEntryPage17.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage17.getEntries(entryVisitor24);
        ledgerEntryPage17.markDeleted();
        long long27 = ledgerEntryPage17.getLastEntry();
        java.lang.Class<?> wildcardClass28 = ledgerEntryPage17.getClass();
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage17);
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass19 = ofLong18.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        ledgerEntryPage2.markDeleted();
        long long14 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        ledgerEntryPage2.zeroPage();
        long long15 = ledgerEntryPage2.getLastEntry();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage20.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage20.getEntries(entryVisitor22);
        int int24 = ledgerEntryPage20.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage20.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage20.isDeleted();
        java.lang.String str27 = ledgerEntryPage20.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey28 = ledgerEntryPage20.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage20.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor30 = null;
        ledgerEntryPage20.getEntries(entryVisitor30);
        java.lang.String str32 = ledgerEntryPage20.toString();
        ledgerEntryPage20.usePage();
        ledgerEntryPage20.markDeleted();
        java.nio.ByteBuffer byteBuffer35 = ledgerEntryPage20.getPageToWrite();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage20.getEntries(entryVisitor36);
        ledgerEntryPage20.close();
        boolean boolean39 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage20);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey28);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1@-1 clean 0" + "'", str32, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        boolean boolean22 = ledgerEntryPage18.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey32 = ledgerEntryPage25.getEntryKey();
        boolean boolean33 = ledgerEntryPage18.equals((java.lang.Object) ledgerEntryPage25);
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage18.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor35 = null;
        ledgerEntryPage18.getEntries(entryVisitor35);
        ledgerEntryPage18.markDeleted();
        boolean boolean38 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage18);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertNotNull(entryKey32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage9.getEntryKey();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
        boolean boolean22 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        int int14 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        ledgerEntryPage14.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ofLong17);
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        boolean boolean32 = ledgerEntryPage23.inUse();
        ledgerEntryPage23.zeroPage();
        ledgerEntryPage23.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage37 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong38 = ledgerEntryPage37.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor39 = null;
        ledgerEntryPage37.getEntries(entryVisitor39);
        boolean boolean41 = ledgerEntryPage23.equals((java.lang.Object) ledgerEntryPage37);
        boolean boolean42 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage23);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(ofLong38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage16.getEntriesIterator();
        ledgerEntryPage16.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage16.getEntries(entryVisitor25);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage16.getEntries(entryVisitor27);
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.markDeleted();
        boolean boolean19 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage8);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        int int24 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        boolean boolean8 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        boolean boolean16 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        int int15 = ledgerEntryPage2.getVersion();
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.close();
        ledgerEntryPage2.zeroPage();
        long long15 = ledgerEntryPage2.getLastEntry();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        long long23 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage9.getEntries(entryVisitor25);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        long long36 = ledgerEntryPage29.getLastEntry();
        ledgerEntryPage29.usePage();
        boolean boolean38 = ledgerEntryPage29.isDeleted();
        boolean boolean39 = ledgerEntryPage29.inUse();
        ledgerEntryPage29.zeroPage();
        boolean boolean41 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage29);
        boolean boolean42 = ledgerEntryPage9.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        java.lang.String str14 = ledgerEntryPage2.toString();
        int int15 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        long long17 = ledgerEntryPage2.getLastEntry();
        int int18 = ledgerEntryPage2.getVersion();
        java.lang.String str19 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong20);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', 2);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long17 = ledgerEntryPage2.getLastEntry();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        java.lang.String str26 = ledgerEntryPage19.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage19.getEntryKey();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage32.getEntries(entryVisitor36);
        ledgerEntryPage32.usePage();
        boolean boolean39 = ledgerEntryPage19.equals((java.lang.Object) ledgerEntryPage32);
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage32.getEntriesIterator();
        boolean boolean41 = ledgerEntryPage2.equals((java.lang.Object) ofLong40);
        java.util.PrimitiveIterator.OfLong ofLong42 = ledgerEntryPage2.getEntriesIterator();
        long long43 = ledgerEntryPage2.getLastEntry();
        java.lang.String str44 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(ofLong42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1@-1 clean 1" + "'", str44, "-1@-1 clean 1");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 1" + "'", str14, "-1@-1 clean 1");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ledgerEntryPage2.getOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        boolean boolean3 = ledgerEntryPage2.inUse();
        java.lang.String str4 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean12 = ledgerEntryPage11.inUse();
        ledgerEntryPage11.markDeleted();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage11);
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) (short) 1);
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage6 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long7 = ledgerEntryPage6.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage6.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage6.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage12.getEntryKey();
        boolean boolean18 = ledgerEntryPage6.equals((java.lang.Object) entryKey17);
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage6.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage6.getEntriesIterator();
        boolean boolean21 = ledgerEntryPage6.isDeleted();
        ledgerEntryPage6.resetPage();
        ledgerEntryPage6.resetPage();
        boolean boolean24 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage6);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryKey3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        boolean boolean18 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int20 = ledgerEntryPage2.getVersion();
        boolean boolean21 = ledgerEntryPage2.inUse();
        java.lang.String str22 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean12 = ledgerEntryPage11.inUse();
        ledgerEntryPage11.markDeleted();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage11);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.markDeleted();
        boolean boolean19 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage8);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage2.getEntries(entryVisitor23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey4 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey4);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        ledgerEntryPage2.zeroPage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 1" + "'", str16, "-1@-1 clean 1");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage9.getEntriesIterator();
        long long27 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.usePage();
        java.lang.String str29 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 3" + "'", str29, "-1@-1 clean 3");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        java.lang.String str12 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        java.lang.String str14 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage15.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage15.getPageToWrite();
        ledgerEntryPage15.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage15.getEntryKey();
        ledgerEntryPage15.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage15.getEntryKey();
        boolean boolean28 = ledgerEntryPage2.equals((java.lang.Object) entryKey27);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = ledgerEntryPage2.getOffset(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean30 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.close();
        ledgerEntryPage22.resetPage();
        long long33 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage22.getEntryKey();
        boolean boolean35 = ledgerEntryPage22.inUse();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        long long20 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.lang.String str22 = ledgerEntryPage9.toString();
        int int23 = ledgerEntryPage9.getVersion();
        ledgerEntryPage9.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        int int8 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        long long15 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage18.getEntriesIterator();
        boolean boolean24 = ledgerEntryPage18.isDeleted();
        java.lang.String str25 = ledgerEntryPage18.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey26 = ledgerEntryPage18.getEntryKey();
        boolean boolean27 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage18);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1@-1 clean 0" + "'", str25, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 0);
        int int3 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        java.lang.String str18 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 2" + "'", str18, "-1@-1 clean 2");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        boolean boolean15 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage2.getEntries(entryVisitor18);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePageNoCallback();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(ofLong18);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage22.getEntries(entryVisitor26);
        ledgerEntryPage22.usePage();
        boolean boolean29 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage9.getEntryKey();
        long long31 = ledgerEntryPage9.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        int int14 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        long long11 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage15.getEntries(entryVisitor19);
        ledgerEntryPage15.usePage();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        boolean boolean29 = ledgerEntryPage25.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        int int36 = ledgerEntryPage32.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong37 = ledgerEntryPage32.getEntriesIterator();
        boolean boolean38 = ledgerEntryPage32.isDeleted();
        java.lang.String str39 = ledgerEntryPage32.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey40 = ledgerEntryPage32.getEntryKey();
        boolean boolean41 = ledgerEntryPage25.equals((java.lang.Object) ledgerEntryPage32);
        ledgerEntryPage32.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage45 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong46 = ledgerEntryPage45.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor47 = null;
        ledgerEntryPage45.getEntries(entryVisitor47);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor49 = null;
        ledgerEntryPage45.getEntries(entryVisitor49);
        ledgerEntryPage45.usePage();
        boolean boolean52 = ledgerEntryPage32.equals((java.lang.Object) ledgerEntryPage45);
        java.util.PrimitiveIterator.OfLong ofLong53 = ledgerEntryPage45.getEntriesIterator();
        boolean boolean54 = ledgerEntryPage15.equals((java.lang.Object) ofLong53);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor55 = null;
        ledgerEntryPage15.getEntries(entryVisitor55);
        ledgerEntryPage15.usePage();
        java.util.PrimitiveIterator.OfLong ofLong58 = ledgerEntryPage15.getEntriesIterator();
        boolean boolean59 = ledgerEntryPage2.equals((java.lang.Object) ofLong58);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(entryKey11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(ofLong37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1@-1 clean 0" + "'", str39, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(ofLong46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(ofLong53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ofLong58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, (int) (short) 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.lang.String str22 = ledgerEntryPage9.toString();
        boolean boolean23 = ledgerEntryPage9.inUse();
        int int24 = ledgerEntryPage9.getVersion();
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(3, 100);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = ledgerEntryPage2.getOffset(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        long long14 = ledgerEntryPage2.getLastEntry();
        java.lang.String str15 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 1" + "'", str15, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        boolean boolean23 = ledgerEntryPage19.inUse();
        java.lang.String str24 = ledgerEntryPage19.toString();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        long long26 = ledgerEntryPage19.getLastEntry();
        ledgerEntryPage19.resetPage();
        boolean boolean28 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        long long29 = ledgerEntryPage19.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = ledgerEntryPage19.getOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        boolean boolean7 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (int) '4');
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage2.getPageToWrite();
        long long20 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage12.isDeleted();
        java.lang.String str19 = ledgerEntryPage12.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage12.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage2.equals((java.lang.Object) ofLong21);
        ledgerEntryPage2.markDeleted();
        int int24 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        boolean boolean19 = ledgerEntryPage15.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage22.isDeleted();
        java.lang.String str29 = ledgerEntryPage22.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage22.getEntryKey();
        boolean boolean31 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage35 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong36 = ledgerEntryPage35.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage35.getEntries(entryVisitor37);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor39 = null;
        ledgerEntryPage35.getEntries(entryVisitor39);
        ledgerEntryPage35.usePage();
        boolean boolean42 = ledgerEntryPage22.equals((java.lang.Object) ledgerEntryPage35);
        java.lang.Class<?> wildcardClass43 = ledgerEntryPage22.getClass();
        boolean boolean44 = ledgerEntryPage2.equals((java.lang.Object) wildcardClass43);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage14.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage14.getEntries(entryVisitor16);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage14.getEntries(entryVisitor18);
        ledgerEntryPage14.usePage();
        long long21 = ledgerEntryPage14.getLastEntry();
        java.nio.ByteBuffer byteBuffer22 = ledgerEntryPage14.getPageToWrite();
        ledgerEntryPage14.releasePage();
        boolean boolean24 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean30 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.close();
        ledgerEntryPage22.resetPage();
        long long33 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage22.getEntryKey();
        boolean boolean35 = ledgerEntryPage22.inUse();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong39 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean40 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(ofLong39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        int int19 = ledgerEntryPage9.getVersion();
        boolean boolean20 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        boolean boolean22 = ledgerEntryPage9.inUse();
        int int23 = ledgerEntryPage9.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        long long20 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        ledgerEntryPage23.usePage();
        java.lang.String str33 = ledgerEntryPage23.toString();
        ledgerEntryPage23.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage23.getEntriesIterator();
        boolean boolean36 = ledgerEntryPage23.inUse();
        boolean boolean37 = ledgerEntryPage9.equals((java.lang.Object) boolean36);
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1@-1 clean 2" + "'", str33, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        boolean boolean24 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.resetPage();
        boolean boolean26 = ledgerEntryPage9.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage16.isDeleted();
        java.lang.String str23 = ledgerEntryPage16.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage16.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        int int27 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey24);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        boolean boolean24 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.resetPage();
        long long26 = ledgerEntryPage9.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (int) (short) 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        java.lang.String str13 = ledgerEntryPage2.toString();
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 2" + "'", str13, "-1@-1 clean 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 2" + "'", str14, "-1@-1 clean 2");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage8.getEntriesIterator();
        ledgerEntryPage8.markDeleted();
        boolean boolean19 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage8);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.String str11 = ledgerEntryPage2.toString();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        int int14 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        java.nio.ByteBuffer byteBuffer36 = ledgerEntryPage29.getPageToWrite();
        int int37 = ledgerEntryPage29.getVersion();
        ledgerEntryPage29.usePage();
        ledgerEntryPage29.close();
        ledgerEntryPage29.releasePageNoCallback();
        boolean boolean41 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage29);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage29.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        boolean boolean7 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage16.isDeleted();
        java.lang.String str23 = ledgerEntryPage16.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage16.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        ledgerEntryPage16.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey24);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '#');
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        java.lang.String str15 = ledgerEntryPage2.toString();
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 1" + "'", str15, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        java.lang.String str17 = ledgerEntryPage2.toString();
        boolean boolean18 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 0" + "'", str17, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.usePage();
        long long20 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePageNoCallback();
        boolean boolean22 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        java.lang.String str26 = ledgerEntryPage19.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage19.getEntryKey();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage32.getEntries(entryVisitor36);
        ledgerEntryPage32.usePage();
        boolean boolean39 = ledgerEntryPage19.equals((java.lang.Object) ledgerEntryPage32);
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage32.getEntriesIterator();
        boolean boolean41 = ledgerEntryPage2.equals((java.lang.Object) ofLong40);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor42 = null;
        ledgerEntryPage2.getEntries(entryVisitor42);
        java.lang.String str44 = ledgerEntryPage2.toString();
        boolean boolean45 = ledgerEntryPage2.isDeleted();
        boolean boolean46 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-1@-1 clean 1" + "'", str44, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.inUse();
        long long15 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        ledgerEntryPage14.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ofLong17);
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage2.getEntryKey();
        boolean boolean21 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        int int7 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.releasePage();
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        int int17 = ledgerEntryPage2.getVersion();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        boolean boolean19 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        ledgerEntryPage9.resetPage();
        boolean boolean24 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage9.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = ledgerEntryPage9.getOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ofLong25);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage21.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage21.getEntries(entryVisitor23);
        int int25 = ledgerEntryPage21.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage21.getEntriesIterator();
        boolean boolean28 = ledgerEntryPage21.equals((java.lang.Object) 100L);
        java.lang.String str29 = ledgerEntryPage21.toString();
        long long30 = ledgerEntryPage21.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage33 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long34 = ledgerEntryPage33.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage33.getEntriesIterator();
        ledgerEntryPage33.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage39 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage39.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor41 = null;
        ledgerEntryPage39.getEntries(entryVisitor41);
        int int43 = ledgerEntryPage39.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage46 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong47 = ledgerEntryPage46.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor48 = null;
        ledgerEntryPage46.getEntries(entryVisitor48);
        int int50 = ledgerEntryPage46.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong51 = ledgerEntryPage46.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong52 = ledgerEntryPage46.getEntriesIterator();
        ledgerEntryPage46.usePage();
        boolean boolean54 = ledgerEntryPage39.equals((java.lang.Object) ledgerEntryPage46);
        boolean boolean55 = ledgerEntryPage33.equals((java.lang.Object) boolean54);
        ledgerEntryPage33.usePage();
        boolean boolean57 = ledgerEntryPage33.inUse();
        boolean boolean58 = ledgerEntryPage21.equals((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = ledgerEntryPage21.getClass();
        boolean boolean60 = ledgerEntryPage2.equals((java.lang.Object) wildcardClass59);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(ofLong47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(ofLong51);
        org.junit.Assert.assertNotNull(ofLong52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage16.isDeleted();
        java.lang.String str23 = ledgerEntryPage16.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage16.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        int int27 = ledgerEntryPage16.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage16.setOffset((long) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey24);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.inUse();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        int int13 = ledgerEntryPage2.getVersion();
        int int14 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean30 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.close();
        ledgerEntryPage22.resetPage();
        long long33 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage22.getEntryKey();
        boolean boolean35 = ledgerEntryPage22.inUse();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        ledgerEntryPage2.zeroPage();
        boolean boolean38 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        boolean boolean40 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage43 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong44 = ledgerEntryPage43.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor45 = null;
        ledgerEntryPage43.getEntries(entryVisitor45);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor47 = null;
        ledgerEntryPage43.getEntries(entryVisitor47);
        java.lang.String str49 = ledgerEntryPage43.toString();
        boolean boolean50 = ledgerEntryPage43.inUse();
        ledgerEntryPage43.markDeleted();
        boolean boolean52 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage43);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(ofLong44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1@-1 clean 0" + "'", str49, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        int int19 = ledgerEntryPage2.getVersion();
        int int20 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        int int21 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        int int23 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage9.getEntries(entryVisitor24);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        long long14 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        boolean boolean15 = ledgerEntryPage2.inUse();
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.lang.String str13 = ledgerEntryPage2.toString();
        long long14 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 2" + "'", str13, "-1@-1 clean 2");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.lang.String str22 = ledgerEntryPage9.toString();
        boolean boolean23 = ledgerEntryPage9.inUse();
        int int24 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage9.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage9.getEntriesIterator();
        long long27 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.releasePageNoCallback();
        ledgerEntryPage9.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long20 = ledgerEntryPage19.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage19.inUse();
        ledgerEntryPage19.usePage();
        ledgerEntryPage19.zeroPage();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        boolean boolean26 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer27 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', 10);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        long long12 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long16 = ledgerEntryPage15.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage15.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey19);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.close();
        ledgerEntryPage9.resetPage();
        long long20 = ledgerEntryPage9.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        boolean boolean22 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage25.getEntriesIterator();
        int int32 = ledgerEntryPage25.getVersion();
        boolean boolean33 = ledgerEntryPage25.isDeleted();
        boolean boolean34 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage25);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage9.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong20);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.usePage();
        boolean boolean30 = ledgerEntryPage15.equals((java.lang.Object) ledgerEntryPage22);
        ledgerEntryPage22.close();
        ledgerEntryPage22.resetPage();
        long long33 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage22.getEntryKey();
        boolean boolean35 = ledgerEntryPage22.inUse();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) boolean35);
        ledgerEntryPage2.resetPage();
        java.lang.String str38 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1@-1 clean 0" + "'", str38, "-1@-1 clean 0");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long20 = ledgerEntryPage19.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage19.inUse();
        ledgerEntryPage19.usePage();
        ledgerEntryPage19.zeroPage();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        boolean boolean26 = ledgerEntryPage19.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        int int21 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        int int23 = ledgerEntryPage9.getVersion();
        ledgerEntryPage9.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.String str14 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        boolean boolean23 = ledgerEntryPage19.inUse();
        java.lang.String str24 = ledgerEntryPage19.toString();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        long long26 = ledgerEntryPage19.getLastEntry();
        ledgerEntryPage19.resetPage();
        boolean boolean28 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        java.lang.String str29 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass30 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 1" + "'", str29, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int16 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage21.markDeleted();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage21);
        ledgerEntryPage2.releasePage();
        int int25 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
        ledgerEntryPage9.usePage();
        boolean boolean26 = ledgerEntryPage9.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        java.nio.ByteBuffer byteBuffer36 = ledgerEntryPage29.getPageToWrite();
        int int37 = ledgerEntryPage29.getVersion();
        ledgerEntryPage29.usePage();
        ledgerEntryPage29.close();
        ledgerEntryPage29.releasePageNoCallback();
        boolean boolean41 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage29);
        ledgerEntryPage9.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage9.getEntries(entryVisitor13);
        ledgerEntryPage9.usePage();
        long long16 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.usePage();
        java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage9.getPageToWrite();
        boolean boolean19 = ledgerEntryPage9.isDeleted();
        boolean boolean20 = ledgerEntryPage2.equals((java.lang.Object) boolean19);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        boolean boolean27 = ledgerEntryPage23.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage30 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage30.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor32 = null;
        ledgerEntryPage30.getEntries(entryVisitor32);
        int int34 = ledgerEntryPage30.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage30.getEntriesIterator();
        boolean boolean36 = ledgerEntryPage30.isDeleted();
        java.lang.String str37 = ledgerEntryPage30.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey38 = ledgerEntryPage30.getEntryKey();
        boolean boolean39 = ledgerEntryPage23.equals((java.lang.Object) ledgerEntryPage30);
        boolean boolean40 = ledgerEntryPage30.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage43 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong44 = ledgerEntryPage43.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor45 = null;
        ledgerEntryPage43.getEntries(entryVisitor45);
        int int47 = ledgerEntryPage43.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong48 = ledgerEntryPage43.getEntriesIterator();
        long long49 = ledgerEntryPage43.getLastEntry();
        java.lang.String str50 = ledgerEntryPage43.toString();
        ledgerEntryPage43.usePage();
        ledgerEntryPage43.usePage();
        ledgerEntryPage43.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor54 = null;
        ledgerEntryPage43.getEntries(entryVisitor54);
        org.apache.bookkeeper.bookie.EntryKey entryKey56 = ledgerEntryPage43.getEntryKey();
        ledgerEntryPage43.resetPage();
        boolean boolean58 = ledgerEntryPage30.equals((java.lang.Object) ledgerEntryPage43);
        boolean boolean59 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage43);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor60 = null;
        ledgerEntryPage43.getEntries(entryVisitor60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1@-1 clean 0" + "'", str37, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ofLong44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(ofLong48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-1@-1 clean 0" + "'", str50, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        boolean boolean14 = ledgerEntryPage2.inUse();
        java.lang.Object obj15 = null;
        boolean boolean16 = ledgerEntryPage2.equals(obj15);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 1" + "'", str16, "-1@-1 clean 1");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        boolean boolean16 = ledgerEntryPage12.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage19.isDeleted();
        java.lang.String str26 = ledgerEntryPage19.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage19.getEntryKey();
        boolean boolean28 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage32.getEntries(entryVisitor36);
        ledgerEntryPage32.usePage();
        boolean boolean39 = ledgerEntryPage19.equals((java.lang.Object) ledgerEntryPage32);
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage32.getEntriesIterator();
        boolean boolean41 = ledgerEntryPage2.equals((java.lang.Object) ofLong40);
        boolean boolean42 = ledgerEntryPage2.isDeleted();
        java.lang.String str43 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1@-1 clean 1" + "'", str43, "-1@-1 clean 1");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int12 = ledgerEntryPage2.getVersion();
        boolean boolean13 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePageNoCallback();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage9.getEntries(entryVisitor22);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        int int22 = ledgerEntryPage9.getVersion();
        boolean boolean23 = ledgerEntryPage9.isDeleted();
        java.lang.String str24 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        long long14 = ledgerEntryPage2.getLastEntry();
        boolean boolean15 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(1, (int) (short) -1);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        int int9 = ledgerEntryPage5.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage5.getEntriesIterator();
        long long11 = ledgerEntryPage5.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage5.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage5.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage5);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        long long12 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        boolean boolean19 = ledgerEntryPage9.inUse();
        boolean boolean20 = ledgerEntryPage9.inUse();
        long long21 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.inUse();
        long long23 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage9.getEntries(entryVisitor25);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage29 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage29.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage29.getEntries(entryVisitor31);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage29.getEntries(entryVisitor33);
        ledgerEntryPage29.usePage();
        long long36 = ledgerEntryPage29.getLastEntry();
        ledgerEntryPage29.usePage();
        boolean boolean38 = ledgerEntryPage29.isDeleted();
        boolean boolean39 = ledgerEntryPage29.inUse();
        ledgerEntryPage29.zeroPage();
        boolean boolean41 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage29);
        java.lang.String str42 = ledgerEntryPage29.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1@-1 clean 2" + "'", str42, "-1@-1 clean 2");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage8.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage8.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryKey13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean17 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long6 = ledgerEntryPage5.getLastEntry();
        ledgerEntryPage5.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage10 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage10.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage10.getEntries(entryVisitor12);
        int int14 = ledgerEntryPage10.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage10.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage10.getEntriesIterator();
        ledgerEntryPage10.usePage();
        java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage10.getPageToWrite();
        boolean boolean19 = ledgerEntryPage10.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long23 = ledgerEntryPage22.getLastEntry();
        ledgerEntryPage22.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage22.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage10.equals((java.lang.Object) ofLong25);
        boolean boolean27 = ledgerEntryPage5.equals((java.lang.Object) ofLong25);
        boolean boolean28 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage5);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage5.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.usePage();
        long long20 = ledgerEntryPage2.getLastEntry();
        boolean boolean21 = ledgerEntryPage2.inUse();
        boolean boolean22 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey23 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage2.getEntries(entryVisitor24);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(entryKey23);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        int int12 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        long long17 = ledgerEntryPage2.getLastEntry();
        long long18 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage2.getEntries(entryVisitor19);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        int int14 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        java.lang.String str14 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 3" + "'", str14, "-1@-1 clean 3");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        java.lang.String str10 = ledgerEntryPage2.toString();
        java.lang.String str11 = ledgerEntryPage2.toString();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage15.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage15.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage15.getPageToWrite();
        ledgerEntryPage15.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage15.getEntryKey();
        ledgerEntryPage15.close();
        boolean boolean27 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        ledgerEntryPage15.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str4 = ledgerEntryPage2.toString();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        long long8 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.zeroPage();
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        int int15 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.markDeleted();
        ledgerEntryPage9.resetPage();
        int int21 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        boolean boolean23 = ledgerEntryPage9.inUse();
        ledgerEntryPage9.usePage();
        boolean boolean25 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey26 = ledgerEntryPage9.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage9.getEntries(entryVisitor27);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(entryKey26);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        long long14 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong9);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage11 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage11.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage11.getEntries(entryVisitor13);
        int int15 = ledgerEntryPage11.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage11.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage11.getEntriesIterator();
        ledgerEntryPage11.usePage();
        boolean boolean20 = ledgerEntryPage11.equals((java.lang.Object) '4');
        ledgerEntryPage11.zeroPage();
        int int22 = ledgerEntryPage11.getVersion();
        ledgerEntryPage11.usePage();
        ledgerEntryPage11.releasePageNoCallback();
        int int25 = ledgerEntryPage11.getVersion();
        java.nio.ByteBuffer byteBuffer26 = ledgerEntryPage11.getPageToWrite();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage11.getEntriesIterator();
        ledgerEntryPage11.releasePageNoCallback();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage11.getEntries(entryVisitor29);
        boolean boolean31 = ledgerEntryPage2.equals((java.lang.Object) entryVisitor29);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage2.usePage();
        long long20 = ledgerEntryPage2.getLastEntry();
        boolean boolean21 = ledgerEntryPage2.inUse();
        boolean boolean22 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, 8);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        boolean boolean9 = ledgerEntryPage5.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean18 = ledgerEntryPage12.isDeleted();
        java.lang.String str19 = ledgerEntryPage12.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage12.getEntryKey();
        boolean boolean21 = ledgerEntryPage5.equals((java.lang.Object) ledgerEntryPage12);
        boolean boolean22 = ledgerEntryPage12.inUse();
        boolean boolean23 = ledgerEntryPage12.inUse();
        long long24 = ledgerEntryPage12.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage12.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage28 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage28.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor30 = null;
        ledgerEntryPage28.getEntries(entryVisitor30);
        int int32 = ledgerEntryPage28.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage28.getEntriesIterator();
        long long34 = ledgerEntryPage28.getLastEntry();
        java.lang.String str35 = ledgerEntryPage28.toString();
        ledgerEntryPage28.usePage();
        java.util.PrimitiveIterator.OfLong ofLong37 = ledgerEntryPage28.getEntriesIterator();
        ledgerEntryPage28.usePage();
        ledgerEntryPage28.releasePage();
        ledgerEntryPage28.resetPage();
        boolean boolean41 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage28);
        boolean boolean42 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage28);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1@-1 clean 0" + "'", str35, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        boolean boolean12 = ledgerEntryPage8.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage8.getEntryKey();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryKey13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage20.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage20.getEntries(entryVisitor22);
        int int24 = ledgerEntryPage20.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage20.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage20.getEntriesIterator();
        ledgerEntryPage20.usePage();
        java.nio.ByteBuffer byteBuffer28 = ledgerEntryPage20.getPageToWrite();
        boolean boolean29 = ledgerEntryPage20.isDeleted();
        boolean boolean30 = ledgerEntryPage2.equals((java.lang.Object) boolean29);
        boolean boolean31 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage9.getEntries(entryVisitor11);
        int int13 = ledgerEntryPage9.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage9.isDeleted();
        java.lang.String str16 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey17 = ledgerEntryPage9.getEntryKey();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage9);
        ledgerEntryPage9.resetPage();
        java.lang.String str20 = ledgerEntryPage9.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1@-1 clean 0" + "'", str20, "-1@-1 clean 0");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        long long12 = ledgerEntryPage2.getLastEntry();
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(100, (int) (short) 1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey11);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        boolean boolean12 = ledgerEntryPage2.inUse();
        long long13 = ledgerEntryPage2.getLastEntry();
        int int14 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        int int7 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}

