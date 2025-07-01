package org.apache.bookkeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        boolean boolean24 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        java.lang.String str11 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.resetPage();
        long long12 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        long long19 = ledgerEntryPage9.getLastEntry();
        int int20 = ledgerEntryPage9.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        long long4 = ledgerEntryPage2.getLastEntry();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = ledgerEntryPage2.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        ledgerEntryPage2.close();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage17.getEntriesIterator();
        long long23 = ledgerEntryPage17.getLastEntry();
        java.lang.String str24 = ledgerEntryPage17.toString();
        ledgerEntryPage17.usePage();
        ledgerEntryPage17.releasePage();
        int int27 = ledgerEntryPage17.getVersion();
        long long28 = ledgerEntryPage17.getLastEntry();
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) long28);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        java.lang.String str16 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        java.lang.String str15 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 2" + "'", str15, "-1@-1 clean 2");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(entryKey3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey37 = ledgerEntryPage16.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor38 = null;
        ledgerEntryPage16.getEntries(entryVisitor38);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage16.setOffset((long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
        org.junit.Assert.assertNotNull(entryKey37);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage10 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage10.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage10.getEntries(entryVisitor12);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage10.getEntries(entryVisitor14);
        ledgerEntryPage10.usePage();
        java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage10.getPageToWrite();
        ledgerEntryPage10.resetPage();
        java.lang.String str19 = ledgerEntryPage10.toString();
        boolean boolean20 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage10);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage2.getEntries(entryVisitor21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        int int26 = ledgerEntryPage22.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage22.getEntriesIterator();
        long long28 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey29 = ledgerEntryPage22.getEntryKey();
        boolean boolean30 = ledgerEntryPage22.inUse();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.zeroPage();
        ledgerEntryPage22.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage22.getEntriesIterator();
        boolean boolean35 = ledgerEntryPage2.equals((java.lang.Object) ofLong34);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(entryKey29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        int int26 = ledgerEntryPage9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(100L, 100);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        ledgerEntryPage22.close();
        long long31 = ledgerEntryPage22.getLastEntry();
        ledgerEntryPage22.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage22.close();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = ledgerEntryPage2.getOffset((int) (short) 10);
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
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long13 = ledgerEntryPage12.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage12.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage12.inUse();
        boolean boolean16 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage12);
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        int int18 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 8);
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        boolean boolean7 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        java.lang.String str9 = ledgerEntryPage2.toString();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage13 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage13.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage13.getEntries(entryVisitor15);
        int int17 = ledgerEntryPage13.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage13.getEntriesIterator();
        long long19 = ledgerEntryPage13.getLastEntry();
        int int20 = ledgerEntryPage13.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage13.getEntriesIterator();
        boolean boolean22 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 1" + "'", str9, "-1@-1 clean 1");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.usePage();
        int int7 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        boolean boolean6 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        java.lang.String str12 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, 100);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) 100);
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(entryKey3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
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
        boolean boolean29 = ledgerEntryPage19.inUse();
        boolean boolean30 = ledgerEntryPage19.inUse();
        boolean boolean31 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage19);
        ledgerEntryPage19.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        int int22 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.String str26 = ledgerEntryPage9.toString();
        java.lang.Class<?> wildcardClass27 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        boolean boolean39 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.usePage();
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
        ledgerEntryPage14.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        boolean boolean12 = ledgerEntryPage2.equals((java.lang.Object) 100.0f);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.markDeleted();
        long long10 = ledgerEntryPage2.getLastEntry();
        java.lang.String str11 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long16 = ledgerEntryPage15.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage15.getEntriesIterator();
        ledgerEntryPage15.usePage();
        ledgerEntryPage15.markDeleted();
        ledgerEntryPage15.usePage();
        boolean boolean21 = ledgerEntryPage15.isDeleted();
        boolean boolean22 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int int18 = ledgerEntryPage14.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage14.getEntriesIterator();
        long long20 = ledgerEntryPage14.getLastEntry();
        java.lang.String str21 = ledgerEntryPage14.toString();
        ledgerEntryPage14.usePage();
        ledgerEntryPage14.usePage();
        ledgerEntryPage14.close();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage14.getEntriesIterator();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage14);
        boolean boolean27 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1@-1 clean 0" + "'", str21, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        long long13 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePageNoCallback();
        long long15 = ledgerEntryPage2.getLastEntry();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, 0);
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
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        long long7 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int15 = ledgerEntryPage14.getVersion();
        ledgerEntryPage14.resetPage();
        long long17 = ledgerEntryPage14.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage14.getEntryKey();
        boolean boolean19 = ledgerEntryPage2.equals((java.lang.Object) entryKey18);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) 'a');
        int int3 = ledgerEntryPage2.getVersion();
        java.lang.String str4 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.Object obj22 = null;
        boolean boolean23 = ledgerEntryPage2.equals(obj22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        int int3 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage6 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage6.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage6.getEntries(entryVisitor8);
        int int10 = ledgerEntryPage6.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage6.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage6.getEntriesIterator();
        ledgerEntryPage6.usePage();
        java.lang.String str14 = ledgerEntryPage6.toString();
        ledgerEntryPage6.releasePageNoCallback();
        boolean boolean16 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage6.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 1" + "'", str14, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        long long21 = ledgerEntryPage9.getLastEntry();
        java.lang.String str22 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, (int) (byte) 1);
        int int3 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey4 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey4);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        ledgerEntryPage2.resetPage();
        int int13 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(entryKey11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.String str17 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 0" + "'", str17, "-1@-1 clean 0");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        java.nio.ByteBuffer byteBuffer53 = ledgerEntryPage2.getPageToWrite();
        java.lang.Class<?> wildcardClass54 = byteBuffer53.getClass();
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
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        ledgerEntryPage2.resetPage();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePageNoCallback();
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        int int11 = ledgerEntryPage2.getVersion();
        boolean boolean12 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) '#');
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) ' ');
        ledgerEntryPage2.usePage();
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        ledgerEntryPage2.zeroPage();
        int int46 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.zeroPage();
        java.lang.String str48 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "-1@-1 clean 1" + "'", str48, "-1@-1 clean 1");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean7 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        ledgerEntryPage2.resetPage();
        long long13 = ledgerEntryPage2.getLastEntry();
        long long14 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(100, (int) (byte) 1);
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(entryKey3);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass25 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(1, 8);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey41 = ledgerEntryPage29.getEntryKey();
        java.lang.String str42 = ledgerEntryPage29.toString();
        boolean boolean43 = ledgerEntryPage29.inUse();
        int int44 = ledgerEntryPage29.getVersion();
        long long45 = ledgerEntryPage29.getLastEntry();
        ledgerEntryPage29.resetPage();
        boolean boolean47 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage29);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-1@-1 clean 0" + "'", str36, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(entryKey41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1@-1 clean 0" + "'", str42, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = ledgerEntryPage2.getPageToWrite();
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
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey20 = ledgerEntryPage9.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage9.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
            ledgerEntryPage2.setOffset(10L, (int) ' ');
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage26 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long27 = ledgerEntryPage26.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage26.getEntriesIterator();
        boolean boolean29 = ledgerEntryPage26.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage32 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage32.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage32.getEntries(entryVisitor34);
        boolean boolean36 = ledgerEntryPage32.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey37 = ledgerEntryPage32.getEntryKey();
        boolean boolean38 = ledgerEntryPage26.equals((java.lang.Object) entryKey37);
        java.lang.Class<?> wildcardClass39 = ledgerEntryPage26.getClass();
        boolean boolean40 = ledgerEntryPage21.equals((java.lang.Object) wildcardClass39);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(entryKey37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, 0);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        long long20 = ledgerEntryPage9.getLastEntry();
        boolean boolean22 = ledgerEntryPage9.equals((java.lang.Object) "-1@-1 clean 4");
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        int int9 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        ledgerEntryPage2.releasePageNoCallback();
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage2.getEntries(entryVisitor27);
        ledgerEntryPage2.markDeleted();
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
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        ledgerEntryPage16.usePage();
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong6);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        ledgerEntryPage2.zeroPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.String str12 = ledgerEntryPage2.toString();
        java.lang.String str13 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.Class<?> wildcardClass24 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        boolean boolean15 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        java.lang.String str16 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

