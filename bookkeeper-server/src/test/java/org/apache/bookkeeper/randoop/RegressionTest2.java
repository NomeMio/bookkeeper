package org.apache.bookkeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        boolean boolean15 = ledgerEntryPage2.inUse();
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 2" + "'", str15, "-1@-1 clean 2");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        long long22 = ledgerEntryPage9.getLastEntry();
        boolean boolean23 = ledgerEntryPage9.isDeleted();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey27 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey27);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage13.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey24);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
            ledgerEntryPage5.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        ledgerEntryPage2.releasePageNoCallback();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey4 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(entryKey3);
        org.junit.Assert.assertNotNull(entryKey4);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        int int12 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        long long11 = ledgerEntryPage2.getLastEntry();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        int int17 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        int int6 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(entryKey18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
            ledgerEntryPage14.zeroPage();
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        ledgerEntryPage2.resetPage();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        long long6 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        long long14 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        int int7 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        long long42 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        long long44 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        boolean boolean22 = ledgerEntryPage9.isDeleted();
        java.lang.Class<?> wildcardClass23 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        boolean boolean17 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        boolean boolean42 = ledgerEntryPage9.equals((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (byte) 10);
        java.lang.String str3 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor34 = null;
        ledgerEntryPage9.getEntries(entryVisitor34);
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
        org.junit.Assert.assertNotNull(ofLong33);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage24.getEntries(entryVisitor26);
        int int28 = ledgerEntryPage24.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage24.getEntriesIterator();
        long long30 = ledgerEntryPage24.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage24.getEntryKey();
        boolean boolean32 = ledgerEntryPage24.inUse();
        boolean boolean33 = ledgerEntryPage24.isDeleted();
        java.lang.String str34 = ledgerEntryPage24.toString();
        int int35 = ledgerEntryPage24.getVersion();
        ledgerEntryPage24.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage24.getEntries(entryVisitor37);
        java.lang.String str39 = ledgerEntryPage24.toString();
        boolean boolean40 = ledgerEntryPage9.equals((java.lang.Object) str39);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) '4', (int) ' ');
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
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(entryKey31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1@-1 clean 0" + "'", str39, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        ledgerEntryPage2.resetPage();
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        ledgerEntryPage2.usePage();
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage24.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage24.getEntries(entryVisitor26);
        int int28 = ledgerEntryPage24.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage24.getEntriesIterator();
        long long30 = ledgerEntryPage24.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage24.getEntryKey();
        boolean boolean32 = ledgerEntryPage24.inUse();
        boolean boolean33 = ledgerEntryPage24.isDeleted();
        java.lang.String str34 = ledgerEntryPage24.toString();
        int int35 = ledgerEntryPage24.getVersion();
        ledgerEntryPage24.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage24.getEntries(entryVisitor37);
        java.lang.String str39 = ledgerEntryPage24.toString();
        boolean boolean40 = ledgerEntryPage9.equals((java.lang.Object) str39);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(entryKey31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1@-1 clean 0" + "'", str39, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(entryKey41);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        java.lang.Class<?> wildcardClass16 = byteBuffer15.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        ledgerEntryPage9.resetPage();
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePageNoCallback();
        int int28 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey29 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(entryKey29);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(0L, 10);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
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
        ledgerEntryPage12.usePage();
        long long30 = ledgerEntryPage12.getLastEntry();
        boolean boolean31 = ledgerEntryPage12.inUse();
        boolean boolean32 = ledgerEntryPage2.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1@-1 clean 0" + "'", str26, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
        boolean boolean13 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, (int) (short) -1);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        int int9 = ledgerEntryPage5.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage5.getEntriesIterator();
        long long11 = ledgerEntryPage5.getLastEntry();
        java.lang.String str12 = ledgerEntryPage5.toString();
        ledgerEntryPage5.usePage();
        boolean boolean14 = ledgerEntryPage5.inUse();
        ledgerEntryPage5.zeroPage();
        ledgerEntryPage5.releasePageNoCallback();
        int int17 = ledgerEntryPage5.getVersion();
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage5);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.releasePage();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) 'a');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        long long10 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePageNoCallback();
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 2" + "'", str13, "-1@-1 clean 2");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = ledgerEntryPage2.getOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, 2);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        boolean boolean8 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        boolean boolean9 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        boolean boolean25 = ledgerEntryPage9.inUse();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ofLong26);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        ledgerEntryPage2.zeroPage();
        java.lang.String str16 = ledgerEntryPage2.toString();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 2" + "'", str16, "-1@-1 clean 2");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, (-1));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage2.getEntryKey();
        boolean boolean20 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.lang.String str22 = ledgerEntryPage2.toString();
        long long23 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        ledgerEntryPage2.resetPage();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        int int14 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        java.lang.String str4 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 1" + "'", str4, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.lang.Class<?> wildcardClass19 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        long long7 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        ledgerEntryPage29.releasePageNoCallback();
        ledgerEntryPage29.markDeleted();
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
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        ledgerEntryPage2.usePage();
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset(2);
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
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = ledgerEntryPage2.getOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        long long17 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        boolean boolean21 = ledgerEntryPage9.inUse();
        java.lang.Class<?> wildcardClass22 = ledgerEntryPage9.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str23 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        long long30 = ledgerEntryPage9.getLastEntry();
        ledgerEntryPage9.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = ledgerEntryPage9.getOffset((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        int int23 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage9.getEntryKey();
        java.lang.String str25 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(entryKey24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1@-1 clean 0" + "'", str25, "-1@-1 clean 0");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        int int10 = ledgerEntryPage2.getVersion();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        java.lang.String str4 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 1" + "'", str4, "-1@-1 clean 1");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        int int13 = ledgerEntryPage2.getVersion();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        int int15 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        java.nio.ByteBuffer byteBuffer25 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.resetPage();
        long long27 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        boolean boolean13 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
            ledgerEntryPage16.setOffset((long) 0, (int) (short) 0);
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage9.getEntries(entryVisitor18);
        ledgerEntryPage9.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage9.getEntries(entryVisitor20);
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.Class<?> wildcardClass30 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        int int8 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(6553600L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, 0);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage5 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage5.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage5.getEntries(entryVisitor7);
        int int9 = ledgerEntryPage5.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage5.getEntriesIterator();
        int int11 = ledgerEntryPage5.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage5.getEntries(entryVisitor12);
        ledgerEntryPage5.markDeleted();
        ledgerEntryPage5.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage5.getEntries(entryVisitor16);
        boolean boolean18 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage5);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        ledgerEntryPage2.releasePage();
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage8 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage8.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage8.getEntries(entryVisitor10);
        int int12 = ledgerEntryPage8.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage8.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage8.getEntriesIterator();
        boolean boolean15 = ledgerEntryPage2.equals((java.lang.Object) ofLong14);
        boolean boolean16 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        boolean boolean37 = ledgerEntryPage23.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1@-1 clean 0" + "'", str29, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        ledgerEntryPage2.close();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
            ledgerEntryPage18.setOffset((long) (short) 1, 2);
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        ledgerEntryPage13.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage13.getEntries(entryVisitor25);
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage13.getEntriesIterator();
        ledgerEntryPage13.releasePageNoCallback();
        boolean boolean29 = ledgerEntryPage13.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        long long18 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage6 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int7 = ledgerEntryPage6.getVersion();
        ledgerEntryPage6.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage6.getEntryKey();
        boolean boolean10 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        ledgerEntryPage2.releasePage();
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass10 = ofLong9.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        java.lang.String str9 = ledgerEntryPage2.toString();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        ledgerEntryPage23.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage23.getEntriesIterator();
        java.lang.String str34 = ledgerEntryPage23.toString();
        boolean boolean35 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage23);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage23.close();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        long long17 = ledgerEntryPage2.getLastEntry();
        java.lang.String str18 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 0" + "'", str18, "-1@-1 clean 0");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ledgerEntryPage9.getOffset(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        boolean boolean16 = ledgerEntryPage2.inUse();
        boolean boolean17 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        ledgerEntryPage6.zeroPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage6.getEntries(entryVisitor20);
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        long long10 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        ledgerEntryPage9.close();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ledgerEntryPage9.getOffset((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(ofLong26);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong28);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        ledgerEntryPage9.releasePageNoCallback();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = ledgerEntryPage9.getOffset((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = ledgerEntryPage2.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
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
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, 10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass5 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        int int16 = ledgerEntryPage2.getVersion();
        boolean boolean17 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 0, (int) '4');
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
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        ledgerEntryPage2.zeroPage();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = ledgerEntryPage2.getOffset((int) (byte) 10);
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
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.resetPage();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage10 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage10.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage10.getEntries(entryVisitor12);
        int int14 = ledgerEntryPage10.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage10.getEntriesIterator();
        int int16 = ledgerEntryPage10.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage10.getEntries(entryVisitor17);
        ledgerEntryPage10.markDeleted();
        ledgerEntryPage10.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage10.getEntries(entryVisitor21);
        long long23 = ledgerEntryPage10.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage26 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage26.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage26.getEntries(entryVisitor28);
        int int30 = ledgerEntryPage26.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage26.getEntriesIterator();
        boolean boolean32 = ledgerEntryPage26.isDeleted();
        java.lang.String str33 = ledgerEntryPage26.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage26.getEntryKey();
        boolean boolean35 = ledgerEntryPage10.equals((java.lang.Object) ledgerEntryPage26);
        ledgerEntryPage26.markDeleted();
        boolean boolean37 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage26);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1@-1 clean 0" + "'", str33, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
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
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
            long long14 = ledgerEntryPage2.getOffset(8);
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) (byte) 100, (-1));
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
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
        java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 4" + "'", str15, "-1@-1 clean 4");
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage22.getEntries(entryVisitor26);
        ledgerEntryPage22.usePage();
        boolean boolean29 = ledgerEntryPage22.inUse();
        long long30 = ledgerEntryPage22.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor31 = null;
        ledgerEntryPage22.getEntries(entryVisitor31);
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage22.getEntriesIterator();
        ledgerEntryPage22.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey35 = ledgerEntryPage22.getEntryKey();
        boolean boolean36 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage22);
        java.util.PrimitiveIterator.OfLong ofLong37 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(ofLong37);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean20 = ledgerEntryPage9.isDeleted();
        ledgerEntryPage9.releasePageNoCallback();
        java.lang.Class<?> wildcardClass22 = ledgerEntryPage9.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.resetPage();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 0" + "'", str15, "-1@-1 clean 0");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        ledgerEntryPage2.markDeleted();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        int int15 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 'a', 100);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage10 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str11 = ledgerEntryPage10.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage10.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) entryVisitor12);
        boolean boolean15 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
            ledgerEntryPage2.zeroPage();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.lang.String str10 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 1" + "'", str10, "-1@-1 clean 1");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        boolean boolean14 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass5 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, 0);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        boolean boolean34 = ledgerEntryPage9.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        long long22 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.nio.ByteBuffer byteBuffer25 = ledgerEntryPage2.getPageToWrite();
        int int26 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.close();
        ledgerEntryPage2.resetPage();
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = ledgerEntryPage9.getOffset((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor38 = null;
        ledgerEntryPage9.getEntries(entryVisitor38);
        java.lang.String str40 = ledgerEntryPage9.toString();
        java.util.PrimitiveIterator.OfLong ofLong41 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1@-1 clean 0" + "'", str40, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong41);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage24 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long25 = ledgerEntryPage24.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage24.getEntriesIterator();
        ledgerEntryPage24.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage30 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage30.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor32 = null;
        ledgerEntryPage30.getEntries(entryVisitor32);
        int int34 = ledgerEntryPage30.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage37 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong38 = ledgerEntryPage37.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor39 = null;
        ledgerEntryPage37.getEntries(entryVisitor39);
        int int41 = ledgerEntryPage37.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong42 = ledgerEntryPage37.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong43 = ledgerEntryPage37.getEntriesIterator();
        ledgerEntryPage37.usePage();
        boolean boolean45 = ledgerEntryPage30.equals((java.lang.Object) ledgerEntryPage37);
        boolean boolean46 = ledgerEntryPage24.equals((java.lang.Object) boolean45);
        ledgerEntryPage24.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor48 = null;
        ledgerEntryPage24.getEntries(entryVisitor48);
        boolean boolean50 = ledgerEntryPage9.equals((java.lang.Object) entryVisitor48);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(ofLong38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(ofLong42);
        org.junit.Assert.assertNotNull(ofLong43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
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
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.util.PrimitiveIterator.OfLong ofLong38 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong38);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.String str28 = ledgerEntryPage18.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 0" + "'", str28, "-1@-1 clean 0");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        long long22 = ledgerEntryPage9.getLastEntry();
        int int23 = ledgerEntryPage9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) '4', 10);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(6553600L, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.lang.String str27 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 1" + "'", str27, "-1@-1 clean 1");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        ledgerEntryPage2.releasePageNoCallback();
        long long14 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage17 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage17.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage17.getEntries(entryVisitor19);
        int int21 = ledgerEntryPage17.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage17.getEntriesIterator();
        long long23 = ledgerEntryPage17.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage17.getEntryKey();
        boolean boolean25 = ledgerEntryPage17.inUse();
        boolean boolean26 = ledgerEntryPage17.isDeleted();
        java.lang.String str27 = ledgerEntryPage17.toString();
        boolean boolean28 = ledgerEntryPage17.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage31 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong32 = ledgerEntryPage31.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor33 = null;
        ledgerEntryPage31.getEntries(entryVisitor33);
        int int35 = ledgerEntryPage31.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong36 = ledgerEntryPage31.getEntriesIterator();
        boolean boolean37 = ledgerEntryPage31.isDeleted();
        java.lang.String str38 = ledgerEntryPage31.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey39 = ledgerEntryPage31.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage31.getEntriesIterator();
        boolean boolean41 = ledgerEntryPage17.equals((java.lang.Object) ledgerEntryPage31);
        java.lang.String str42 = ledgerEntryPage17.toString();
        java.lang.String str43 = ledgerEntryPage17.toString();
        boolean boolean44 = ledgerEntryPage2.equals((java.lang.Object) str43);
        org.apache.bookkeeper.bookie.EntryKey entryKey45 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(ofLong18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(entryKey24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ofLong32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(ofLong36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1@-1 clean 0" + "'", str38, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey39);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1@-1 clean 0" + "'", str42, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1@-1 clean 0" + "'", str43, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(entryKey45);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage22.getEntriesIterator();
        int int31 = ledgerEntryPage22.getVersion();
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.releasePage();
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
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        long long22 = ledgerEntryPage16.getLastEntry();
        int int23 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        boolean boolean26 = ledgerEntryPage16.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage9.getEntries(entryVisitor28);
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong30);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 8);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(3, 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 100);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        ledgerEntryPage2.releasePageNoCallback();
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
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int14 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        int int12 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        boolean boolean20 = ledgerEntryPage16.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        boolean boolean29 = ledgerEntryPage23.isDeleted();
        java.lang.String str30 = ledgerEntryPage23.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage23.getEntryKey();
        boolean boolean32 = ledgerEntryPage16.equals((java.lang.Object) ledgerEntryPage23);
        boolean boolean33 = ledgerEntryPage23.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage36 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong37 = ledgerEntryPage36.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor38 = null;
        ledgerEntryPage36.getEntries(entryVisitor38);
        int int40 = ledgerEntryPage36.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong41 = ledgerEntryPage36.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong42 = ledgerEntryPage36.getEntriesIterator();
        ledgerEntryPage36.usePage();
        boolean boolean45 = ledgerEntryPage36.equals((java.lang.Object) '4');
        ledgerEntryPage36.zeroPage();
        int int47 = ledgerEntryPage36.getVersion();
        ledgerEntryPage36.releasePage();
        boolean boolean49 = ledgerEntryPage36.isDeleted();
        boolean boolean50 = ledgerEntryPage23.equals((java.lang.Object) boolean49);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor51 = null;
        ledgerEntryPage23.getEntries(entryVisitor51);
        boolean boolean53 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage23);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ofLong37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(ofLong41);
        org.junit.Assert.assertNotNull(ofLong42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        ledgerEntryPage9.zeroPage();
        ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        long long11 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        ledgerEntryPage2.usePage();
        boolean boolean4 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        long long29 = ledgerEntryPage23.getLastEntry();
        java.lang.String str30 = ledgerEntryPage23.toString();
        ledgerEntryPage23.usePage();
        ledgerEntryPage23.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage23.getEntriesIterator();
        java.lang.String str34 = ledgerEntryPage23.toString();
        boolean boolean35 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage23);
        ledgerEntryPage23.resetPage();
        ledgerEntryPage23.usePage();
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
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        long long32 = ledgerEntryPage12.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage14.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage14.getEntries(entryVisitor16);
        int int18 = ledgerEntryPage14.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage14.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage14.getEntriesIterator();
        ledgerEntryPage14.usePage();
        boolean boolean23 = ledgerEntryPage14.equals((java.lang.Object) '4');
        ledgerEntryPage14.zeroPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage14.getEntryKey();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage14);
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        ledgerEntryPage2.releasePageNoCallback();
        int int14 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(0L, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        ledgerEntryPage14.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage14.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        boolean boolean12 = ledgerEntryPage2.inUse();
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        ledgerEntryPage2.releasePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, 1);
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
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        long long12 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) -1, (int) (byte) -1);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, 0);
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
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        boolean boolean22 = ledgerEntryPage9.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = ledgerEntryPage9.getOffset((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage7 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage7.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage7.getEntries(entryVisitor9);
        int int11 = ledgerEntryPage7.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage7.getEntriesIterator();
        int int13 = ledgerEntryPage7.getVersion();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) int13);
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage2.getEntries(entryVisitor16);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        long long17 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 4" + "'", str15, "-1@-1 clean 4");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) -1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str14 = ledgerEntryPage2.toString();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 1" + "'", str14, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 10, 3);
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
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        long long10 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        ledgerEntryPage2.resetPage();
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.lang.String str24 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage25.getEntriesIterator();
        ledgerEntryPage25.usePage();
        boolean boolean33 = ledgerEntryPage18.equals((java.lang.Object) ledgerEntryPage25);
        ledgerEntryPage25.close();
        ledgerEntryPage25.resetPage();
        ledgerEntryPage25.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage39 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage39.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor41 = null;
        ledgerEntryPage39.getEntries(entryVisitor41);
        int int43 = ledgerEntryPage39.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong44 = ledgerEntryPage39.getEntriesIterator();
        long long45 = ledgerEntryPage39.getLastEntry();
        java.lang.String str46 = ledgerEntryPage39.toString();
        ledgerEntryPage39.usePage();
        ledgerEntryPage39.usePage();
        java.lang.String str49 = ledgerEntryPage39.toString();
        ledgerEntryPage39.releasePageNoCallback();
        java.util.PrimitiveIterator.OfLong ofLong51 = ledgerEntryPage39.getEntriesIterator();
        boolean boolean52 = ledgerEntryPage39.inUse();
        boolean boolean53 = ledgerEntryPage25.equals((java.lang.Object) boolean52);
        boolean boolean54 = ledgerEntryPage2.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(ofLong40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(ofLong44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1@-1 clean 0" + "'", str46, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1@-1 clean 2" + "'", str49, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        long long18 = ledgerEntryPage12.getLastEntry();
        java.lang.String str19 = ledgerEntryPage12.toString();
        ledgerEntryPage12.usePage();
        ledgerEntryPage12.releasePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage12.getEntryKey();
        ledgerEntryPage12.resetPage();
        boolean boolean24 = ledgerEntryPage12.inUse();
        java.lang.Object obj25 = null;
        boolean boolean26 = ledgerEntryPage12.equals(obj25);
        java.lang.String str27 = ledgerEntryPage12.toString();
        boolean boolean28 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        ledgerEntryPage9.resetPage();
        int int27 = ledgerEntryPage9.getVersion();
        ledgerEntryPage9.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = ledgerEntryPage9.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        boolean boolean16 = ledgerEntryPage2.inUse();
        boolean boolean17 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        boolean boolean12 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePageNoCallback();
        ledgerEntryPage9.markDeleted();
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        boolean boolean15 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
        ledgerEntryPage2.resetPage();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        boolean boolean17 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        ledgerEntryPage9.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.lang.String str19 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage14.getEntriesIterator();
        ledgerEntryPage14.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage20 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage20.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor22 = null;
        ledgerEntryPage20.getEntries(entryVisitor22);
        int int24 = ledgerEntryPage20.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage27 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage27.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage27.getEntries(entryVisitor29);
        int int31 = ledgerEntryPage27.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong32 = ledgerEntryPage27.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage27.getEntriesIterator();
        ledgerEntryPage27.usePage();
        boolean boolean35 = ledgerEntryPage20.equals((java.lang.Object) ledgerEntryPage27);
        boolean boolean36 = ledgerEntryPage14.equals((java.lang.Object) boolean35);
        ledgerEntryPage14.usePage();
        boolean boolean38 = ledgerEntryPage14.inUse();
        boolean boolean39 = ledgerEntryPage2.equals((java.lang.Object) boolean38);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) -1, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(ofLong32);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage48 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong49 = ledgerEntryPage48.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor50 = null;
        ledgerEntryPage48.getEntries(entryVisitor50);
        boolean boolean52 = ledgerEntryPage48.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage55 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong56 = ledgerEntryPage55.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor57 = null;
        ledgerEntryPage55.getEntries(entryVisitor57);
        int int59 = ledgerEntryPage55.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong60 = ledgerEntryPage55.getEntriesIterator();
        boolean boolean61 = ledgerEntryPage55.isDeleted();
        java.lang.String str62 = ledgerEntryPage55.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey63 = ledgerEntryPage55.getEntryKey();
        boolean boolean64 = ledgerEntryPage48.equals((java.lang.Object) ledgerEntryPage55);
        boolean boolean65 = ledgerEntryPage55.inUse();
        boolean boolean66 = ledgerEntryPage55.inUse();
        long long67 = ledgerEntryPage55.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey68 = ledgerEntryPage55.getEntryKey();
        java.lang.String str69 = ledgerEntryPage55.toString();
        boolean boolean70 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage55);
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
        org.junit.Assert.assertNotNull(ofLong49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(ofLong56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(ofLong60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-1@-1 clean 0" + "'", str62, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(entryKey68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-1@-1 clean 0" + "'", str69, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        int int8 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        ledgerEntryPage9.resetPage();
        int int27 = ledgerEntryPage9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ledgerEntryPage9.getOffset((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        boolean boolean20 = ledgerEntryPage16.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage23 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage23.getEntries(entryVisitor25);
        int int27 = ledgerEntryPage23.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage23.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage23.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey30 = ledgerEntryPage23.getEntryKey();
        boolean boolean31 = ledgerEntryPage16.equals((java.lang.Object) ledgerEntryPage23);
        org.apache.bookkeeper.bookie.EntryKey entryKey32 = ledgerEntryPage16.getEntryKey();
        long long33 = ledgerEntryPage16.getLastEntry();
        boolean boolean34 = ledgerEntryPage2.equals((java.lang.Object) long33);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(entryKey32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        long long53 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean34 = ledgerEntryPage9.isDeleted();
        int int35 = ledgerEntryPage9.getVersion();
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        int int22 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        boolean boolean29 = ledgerEntryPage25.inUse();
        java.lang.String str30 = ledgerEntryPage25.toString();
        boolean boolean31 = ledgerEntryPage25.isDeleted();
        boolean boolean32 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage25);
        java.lang.String str33 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1@-1 clean 0" + "'", str33, "-1@-1 clean 0");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        java.lang.String str11 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        org.junit.Assert.assertNotNull(entryKey37);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 1" + "'", str9, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        ledgerEntryPage18.markDeleted();
        ledgerEntryPage18.usePage();
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.resetPage();
        java.lang.String str11 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage2.getPageToWrite();
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
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (byte) 10);
        java.lang.String str3 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        ledgerEntryPage2.zeroPage();
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
            long long29 = ledgerEntryPage15.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = ledgerEntryPage2.equals(obj16);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (short) 100);
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
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        java.lang.String str17 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 1" + "'", str17, "-1@-1 clean 1");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        boolean boolean3 = ledgerEntryPage2.inUse();
        java.lang.String str4 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        int int11 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.lang.String str10 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage15.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor19 = null;
        ledgerEntryPage15.getEntries(entryVisitor19);
        ledgerEntryPage15.usePage();
        java.nio.ByteBuffer byteBuffer22 = ledgerEntryPage15.getPageToWrite();
        long long23 = ledgerEntryPage15.getLastEntry();
        boolean boolean24 = ledgerEntryPage15.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey25 = ledgerEntryPage15.getEntryKey();
        boolean boolean26 = ledgerEntryPage2.equals((java.lang.Object) entryKey25);
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 1" + "'", str10, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(entryKey25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
        long long14 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        int int13 = ledgerEntryPage2.getVersion();
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage9.getEntries(entryVisitor28);
        java.nio.ByteBuffer byteBuffer30 = ledgerEntryPage9.getPageToWrite();
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
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        java.lang.Class<?> wildcardClass19 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.usePage();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) -1);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage9.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) 3, (int) ' ');
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
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage7 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage7.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage7.getEntries(entryVisitor9);
        int int11 = ledgerEntryPage7.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage7.getEntriesIterator();
        int int13 = ledgerEntryPage7.getVersion();
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) int13);
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (int) '4');
        ledgerEntryPage2.markDeleted();
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
            long long13 = ledgerEntryPage2.getOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertNotNull(entryKey19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        int int17 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        ledgerEntryPage2.resetPage();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, 0);
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
            ledgerEntryPage18.zeroPage();
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        int int13 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.releasePage();
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.String str27 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        java.nio.ByteBuffer byteBuffer25 = ledgerEntryPage2.getPageToWrite();
        int int26 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.EntryKey entryKey28 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entryKey28);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
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
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (int) (byte) -1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        long long6 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage9.getEntriesIterator();
        boolean boolean34 = ledgerEntryPage9.isDeleted();
        boolean boolean35 = ledgerEntryPage9.inUse();
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
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        int int20 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage16.getEntriesIterator();
        long long22 = ledgerEntryPage16.getLastEntry();
        int int23 = ledgerEntryPage16.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage16.getEntriesIterator();
        boolean boolean25 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = ledgerEntryPage16.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        long long5 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        boolean boolean26 = ledgerEntryPage9.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor8 = null;
        ledgerEntryPage2.getEntries(entryVisitor8);
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage19.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor21 = null;
        ledgerEntryPage19.getEntries(entryVisitor21);
        int int23 = ledgerEntryPage19.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong24 = ledgerEntryPage19.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage19.getEntriesIterator();
        ledgerEntryPage19.usePage();
        boolean boolean27 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage19);
        long long28 = ledgerEntryPage12.getLastEntry();
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) long28);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ofLong24);
        org.junit.Assert.assertNotNull(ofLong25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        ledgerEntryPage2.releasePageNoCallback();
        ledgerEntryPage2.releasePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        int int19 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, 0);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(1, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.markDeleted();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        boolean boolean16 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.releasePage();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor26 = null;
        ledgerEntryPage2.getEntries(entryVisitor26);
        ledgerEntryPage2.close();
        int int29 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
            java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ledgerEntryPage2.getOffset(8);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(entryKey8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(ofLong18);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        // The following exception was thrown during execution in test generation
        try {
            long long48 = ledgerEntryPage2.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        java.lang.String str14 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        boolean boolean15 = ledgerEntryPage2.inUse();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage22.getEntriesIterator();
        java.lang.Class<?> wildcardClass31 = ledgerEntryPage22.getClass();
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
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage15 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long16 = ledgerEntryPage15.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage15.getEntries(entryVisitor17);
        boolean boolean19 = ledgerEntryPage15.inUse();
        boolean boolean20 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage15);
        boolean boolean21 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        long long12 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        ledgerEntryPage9.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong25 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong25);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        boolean boolean16 = ledgerEntryPage2.inUse();
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage9 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long10 = ledgerEntryPage9.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage9.getEntriesIterator();
        ledgerEntryPage9.usePage();
        ledgerEntryPage9.markDeleted();
        long long14 = ledgerEntryPage9.getLastEntry();
        long long15 = ledgerEntryPage9.getLastEntry();
        boolean boolean16 = ledgerEntryPage2.equals((java.lang.Object) long15);
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        long long19 = ledgerEntryPage2.getLastEntry();
        boolean boolean20 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        long long10 = ledgerEntryPage2.getLastEntry();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage2.getEntries(entryVisitor20);
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
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor32 = null;
        ledgerEntryPage19.getEntries(entryVisitor32);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        int int24 = ledgerEntryPage13.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage13.setOffset((long) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', 2);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        // The following exception was thrown during execution in test generation
        try {
            long long33 = ledgerEntryPage2.getOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        ledgerEntryPage2.markDeleted();
        boolean boolean28 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        boolean boolean29 = ledgerEntryPage5.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey40 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey40);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage28 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage28.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor30 = null;
        ledgerEntryPage28.getEntries(entryVisitor30);
        int int32 = ledgerEntryPage28.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage28.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage28.getEntriesIterator();
        ledgerEntryPage28.usePage();
        int int36 = ledgerEntryPage28.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage28.getEntries(entryVisitor37);
        boolean boolean39 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage28);
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
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        long long31 = ledgerEntryPage25.getLastEntry();
        java.lang.String str32 = ledgerEntryPage25.toString();
        ledgerEntryPage25.usePage();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage25.getEntriesIterator();
        ledgerEntryPage25.usePage();
        ledgerEntryPage25.releasePage();
        ledgerEntryPage25.resetPage();
        boolean boolean38 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage25);
        ledgerEntryPage25.resetPage();
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
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1@-1 clean 0" + "'", str32, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        java.lang.String str9 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Object obj12 = null;
        boolean boolean13 = ledgerEntryPage2.equals(obj12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.String str22 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 1" + "'", str22, "-1@-1 clean 1");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        boolean boolean23 = ledgerEntryPage9.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.inUse();
        int int9 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        boolean boolean19 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong20 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(ofLong20);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        long long23 = ledgerEntryPage9.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(entryKey16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        ledgerEntryPage9.markDeleted();
        boolean boolean24 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage27 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage27.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage27.getEntries(entryVisitor29);
        boolean boolean31 = ledgerEntryPage27.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage34 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong35 = ledgerEntryPage34.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor36 = null;
        ledgerEntryPage34.getEntries(entryVisitor36);
        int int38 = ledgerEntryPage34.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong39 = ledgerEntryPage34.getEntriesIterator();
        boolean boolean40 = ledgerEntryPage34.isDeleted();
        java.lang.String str41 = ledgerEntryPage34.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey42 = ledgerEntryPage34.getEntryKey();
        boolean boolean43 = ledgerEntryPage27.equals((java.lang.Object) ledgerEntryPage34);
        ledgerEntryPage34.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage47 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong48 = ledgerEntryPage47.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor49 = null;
        ledgerEntryPage47.getEntries(entryVisitor49);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor51 = null;
        ledgerEntryPage47.getEntries(entryVisitor51);
        ledgerEntryPage47.usePage();
        boolean boolean54 = ledgerEntryPage34.equals((java.lang.Object) ledgerEntryPage47);
        java.util.PrimitiveIterator.OfLong ofLong55 = ledgerEntryPage47.getEntriesIterator();
        int int56 = ledgerEntryPage47.getVersion();
        boolean boolean57 = ledgerEntryPage9.equals((java.lang.Object) int56);
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
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ofLong35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(ofLong39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1@-1 clean 0" + "'", str41, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(ofLong48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ofLong55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        ledgerEntryPage9.releasePageNoCallback();
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
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
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ledgerEntryPage2.getOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        int int24 = ledgerEntryPage13.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage13.setOffset((long) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.lang.String str27 = ledgerEntryPage2.toString();
        java.lang.String str28 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 0" + "'", str28, "-1@-1 clean 0");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.util.PrimitiveIterator.OfLong ofLong40 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong40);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.lang.String str13 = ledgerEntryPage2.toString();
        boolean boolean14 = ledgerEntryPage2.inUse();
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        long long4 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (byte) 10);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor37 = null;
        ledgerEntryPage2.getEntries(entryVisitor37);
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        long long18 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage21.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage21.getEntries(entryVisitor23);
        int int25 = ledgerEntryPage21.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage21.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage21.getEntriesIterator();
        ledgerEntryPage21.usePage();
        java.nio.ByteBuffer byteBuffer29 = ledgerEntryPage21.getPageToWrite();
        ledgerEntryPage21.usePage();
        ledgerEntryPage21.usePage();
        ledgerEntryPage21.markDeleted();
        ledgerEntryPage21.usePage();
        java.nio.ByteBuffer byteBuffer34 = ledgerEntryPage21.getPageToWrite();
        boolean boolean35 = ledgerEntryPage2.equals((java.lang.Object) byteBuffer34);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = ledgerEntryPage2.getOffset(0);
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
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        ledgerEntryPage2.releasePage();
        long long19 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        ledgerEntryPage12.markDeleted();
        int int18 = ledgerEntryPage12.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', 3);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        ledgerEntryPage29.resetPage();
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
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
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        long long6 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        long long9 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        ledgerEntryPage2.markDeleted();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        java.lang.String str23 = ledgerEntryPage9.toString();
        java.lang.String str24 = ledgerEntryPage9.toString();
        boolean boolean25 = ledgerEntryPage9.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey26 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(entryKey26);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        long long10 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong11 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean12 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        int int22 = ledgerEntryPage9.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        boolean boolean29 = ledgerEntryPage25.inUse();
        java.lang.String str30 = ledgerEntryPage25.toString();
        boolean boolean31 = ledgerEntryPage25.isDeleted();
        boolean boolean32 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage25);
        boolean boolean33 = ledgerEntryPage25.isDeleted();
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
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 0" + "'", str30, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        int int19 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        ledgerEntryPage2.resetPage();
        boolean boolean17 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.lang.String str5 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1@-1 clean 0" + "'", str5, "-1@-1 clean 0");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 3" + "'", str14, "-1@-1 clean 3");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor3 = null;
        ledgerEntryPage2.getEntries(entryVisitor3);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        long long15 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) 'a');
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
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) (short) 1);
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.lang.String str23 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 1" + "'", str23, "-1@-1 clean 1");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass12 = entryKey11.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass9 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.Class<?> wildcardClass21 = entryKey20.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.lang.Object obj13 = null;
        boolean boolean14 = ledgerEntryPage2.equals(obj13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(entryKey11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage44 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong45 = ledgerEntryPage44.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor46 = null;
        ledgerEntryPage44.getEntries(entryVisitor46);
        boolean boolean48 = ledgerEntryPage44.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage51 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong52 = ledgerEntryPage51.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor53 = null;
        ledgerEntryPage51.getEntries(entryVisitor53);
        int int55 = ledgerEntryPage51.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong56 = ledgerEntryPage51.getEntriesIterator();
        boolean boolean57 = ledgerEntryPage51.isDeleted();
        java.lang.String str58 = ledgerEntryPage51.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey59 = ledgerEntryPage51.getEntryKey();
        boolean boolean60 = ledgerEntryPage44.equals((java.lang.Object) ledgerEntryPage51);
        boolean boolean61 = ledgerEntryPage51.inUse();
        boolean boolean62 = ledgerEntryPage51.inUse();
        java.util.PrimitiveIterator.OfLong ofLong63 = ledgerEntryPage51.getEntriesIterator();
        boolean boolean64 = ledgerEntryPage2.equals((java.lang.Object) ofLong63);
        boolean boolean65 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertNotNull(ofLong45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(ofLong52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(ofLong56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-1@-1 clean 0" + "'", str58, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(ofLong63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong6 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(ofLong6);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (short) 100);
        ledgerEntryPage2.resetPage();
        java.lang.String str4 = ledgerEntryPage2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        boolean boolean7 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        int int29 = ledgerEntryPage25.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong30 = ledgerEntryPage25.getEntriesIterator();
        long long31 = ledgerEntryPage25.getLastEntry();
        java.lang.String str32 = ledgerEntryPage25.toString();
        ledgerEntryPage25.usePage();
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage25.getEntriesIterator();
        ledgerEntryPage25.usePage();
        ledgerEntryPage25.releasePage();
        ledgerEntryPage25.resetPage();
        boolean boolean38 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage25);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(ofLong30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1@-1 clean 0" + "'", str32, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, 1);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 2" + "'", str15, "-1@-1 clean 2");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) 'a');
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.lang.String str27 = ledgerEntryPage2.toString();
        java.lang.String str28 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 0" + "'", str28, "-1@-1 clean 0");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        boolean boolean8 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        ledgerEntryPage2.markDeleted();
        int int10 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
    }
}

