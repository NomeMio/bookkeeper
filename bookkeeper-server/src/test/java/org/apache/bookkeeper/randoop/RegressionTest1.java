package org.apache.bookkeeper.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 2, (int) 'a');
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = ledgerEntryPage9.getOffset((int) (byte) 1);
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
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 1" + "'", str9, "-1@-1 clean 1");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.Class<?> wildcardClass13 = entryKey12.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        int int9 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertNotNull(entryKey8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean6 = ledgerEntryPage2.isDeleted();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '4', (int) (short) 10);
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
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) ' ', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.String str14 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        long long10 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass11 = entryKey10.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey32 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey32);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (byte) 1);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ledgerEntryPage9.getOffset((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
            long long17 = ledgerEntryPage2.getOffset(2);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        boolean boolean3 = ledgerEntryPage2.inUse();
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = ledgerEntryPage2.getOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
            long long19 = ledgerEntryPage2.getOffset((int) '#');
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ofLong20);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ledgerEntryPage9.getOffset((int) (short) 10);
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass38 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str20 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1@-1 clean 0" + "'", str20, "-1@-1 clean 0");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 100, (-1));
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
            java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(1, (int) (byte) 100);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 10, (int) (byte) 10);
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, (int) (short) 10);
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.Class<?> wildcardClass43 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) (byte) 0, 1);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        long long13 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset(100);
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        org.junit.Assert.assertNotNull(entryKey20);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ledgerEntryPage2.getOffset((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(entryKey19);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        java.lang.String str7 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 1" + "'", str7, "-1@-1 clean 1");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ledgerEntryPage9.getOffset((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        int int6 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 2" + "'", str16, "-1@-1 clean 2");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePage();
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        ledgerEntryPage2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        ledgerEntryPage9.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        ledgerEntryPage2.markDeleted();
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
            ledgerEntryPage2.setOffset((long) '#', (int) (byte) 1);
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) ' ');
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.util.PrimitiveIterator.OfLong ofLong21 = ledgerEntryPage9.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
            long long27 = ledgerEntryPage9.getOffset((int) (short) 100);
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) (-1.0d));
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        int int44 = ledgerEntryPage2.getVersion();
        java.nio.ByteBuffer byteBuffer45 = ledgerEntryPage2.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteBuffer45);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (-1));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        int int12 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = ledgerEntryPage2.getOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        long long6 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        boolean boolean22 = ledgerEntryPage9.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong23);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage9.getPageToWrite();
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
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (short) 100);
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        int int21 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
            ledgerEntryPage2.setOffset((long) (byte) 1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        boolean boolean15 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.String str15 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 100, 2);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 0" + "'", str15, "-1@-1 clean 0");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = ledgerEntryPage2.getPageToWrite();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (byte) 0);
        int int3 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.lang.Class<?> wildcardClass20 = entryKey19.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = ledgerEntryPage2.getOffset(10);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        ledgerEntryPage9.releasePage();
        long long19 = ledgerEntryPage9.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        java.lang.Class<?> wildcardClass24 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        ledgerEntryPage2.releasePage();
        java.lang.Class<?> wildcardClass45 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass5 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) ' ', 8);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        long long20 = ledgerEntryPage2.getLastEntry();
        long long21 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (int) (short) 100);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = ledgerEntryPage23.getPageToWrite();
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (byte) 1);
        boolean boolean3 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        int int10 = ledgerEntryPage2.getVersion();
        int int11 = ledgerEntryPage2.getVersion();
        boolean boolean12 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        boolean boolean14 = ledgerEntryPage2.equals((java.lang.Object) "-1@-1 clean 2");
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        long long19 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.Class<?> wildcardClass36 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        java.lang.String str6 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        int int24 = ledgerEntryPage9.getVersion();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        java.lang.String str18 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 0" + "'", str18, "-1@-1 clean 0");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 8);
        ledgerEntryPage2.resetPage();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        ledgerEntryPage9.releasePageNoCallback();
        int int26 = ledgerEntryPage9.getVersion();
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        int int10 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        boolean boolean5 = ledgerEntryPage2.isDeleted();
        java.lang.String str6 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage2.getPageToWrite();
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
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer4 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.getEntries(entryVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        long long11 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (int) '#');
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        java.lang.String str10 = ledgerEntryPage2.toString();
        long long11 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1@-1 clean 0" + "'", str10, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) 'a');
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage16 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage16.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage16.getEntries(entryVisitor18);
        long long20 = ledgerEntryPage16.getLastEntry();
        boolean boolean21 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage16.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        ledgerEntryPage2.releasePage();
        long long14 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor11 = null;
        ledgerEntryPage2.getEntries(entryVisitor11);
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        int int20 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ledgerEntryPage2.getOffset((int) '4');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.Class<?> wildcardClass21 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        int int15 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, 0);
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        long long18 = ledgerEntryPage2.getLastEntry();
        java.lang.String str19 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
            long long22 = ledgerEntryPage9.getOffset((int) (byte) 100);
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
            ledgerEntryPage2.setOffset((long) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        ledgerEntryPage9.releasePage();
        long long19 = ledgerEntryPage9.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) '4', (int) '4');
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        int int12 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertNotNull(ofLong23);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass11 = entryKey10.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = ledgerEntryPage2.getOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(3, 3);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        int int23 = ledgerEntryPage9.getVersion();
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
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        ledgerEntryPage2.markDeleted();
        boolean boolean18 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey48 = ledgerEntryPage27.getEntryKey();
        long long49 = ledgerEntryPage27.getLastEntry();
        boolean boolean50 = ledgerEntryPage2.equals((java.lang.Object) long49);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(byteBuffer17);
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
        org.junit.Assert.assertNotNull(entryKey48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '4', (int) '#');
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
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        int int13 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((-1));
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
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer30 = ledgerEntryPage16.getPageToWrite();
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
        boolean boolean19 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        boolean boolean13 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        ledgerEntryPage22.markDeleted();
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
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ledgerEntryPage9.getOffset((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
            long long16 = ledgerEntryPage2.getOffset(100);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
            ledgerEntryPage9.setOffset((long) (short) 10, (int) (byte) 10);
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ledgerEntryPage9.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (int) ' ');
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ledgerEntryPage2.getOffset((int) (byte) -1);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.resetPage();
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
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.lang.String str13 = ledgerEntryPage2.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
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
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) (byte) -1, 10);
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) (short) 100, (int) (short) -1);
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
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ledgerEntryPage2.getOffset((int) 'a');
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
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        int int3 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, 8);
        ledgerEntryPage2.resetPage();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        java.lang.String str7 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer31 = ledgerEntryPage9.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ofLong27);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (byte) 1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.getEntries(entryVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryKey3);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 0" + "'", str15, "-1@-1 clean 0");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(8);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (byte) 0);
        int int3 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey21 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (byte) 10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        ledgerEntryPage9.releasePageNoCallback();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ledgerEntryPage2.getOffset(2);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 0" + "'", str17, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
        ledgerEntryPage2.resetPage();
        int int4 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        boolean boolean29 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = ledgerEntryPage2.getOffset((-1));
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
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey24 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey24);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        long long7 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(entryKey5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        int int29 = ledgerEntryPage9.getVersion();
        java.lang.String str30 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1@-1 clean 2" + "'", str30, "-1@-1 clean 2");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey15 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        int int9 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.lang.String str12 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, 0);
        ledgerEntryPage2.resetPage();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.lang.String str5 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1@-1 clean 0" + "'", str5, "-1@-1 clean 0");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        boolean boolean17 = ledgerEntryPage2.isDeleted();
        java.lang.String str18 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 0" + "'", str18, "-1@-1 clean 0");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.lang.String str24 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        boolean boolean4 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.Class<?> wildcardClass26 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage12 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage12.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage12.getEntries(entryVisitor14);
        int int16 = ledgerEntryPage12.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage12.getEntriesIterator();
        long long18 = ledgerEntryPage12.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey19 = ledgerEntryPage12.getEntryKey();
        boolean boolean20 = ledgerEntryPage12.inUse();
        boolean boolean21 = ledgerEntryPage2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(entryKey19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        java.lang.Class<?> wildcardClass5 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(100, (int) 'a');
        java.lang.String str3 = ledgerEntryPage2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.lang.String str28 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 1" + "'", str28, "-1@-1 clean 1");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long15 = ledgerEntryPage14.getLastEntry();
        boolean boolean16 = ledgerEntryPage14.isDeleted();
        boolean boolean17 = ledgerEntryPage2.equals((java.lang.Object) boolean16);
        boolean boolean18 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
            ledgerEntryPage2.setOffset(100L, 0);
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
            java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage2.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        boolean boolean12 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, 10);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        ledgerEntryPage2.markDeleted();
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) ' ', (int) (short) 100);
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
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        long long28 = ledgerEntryPage13.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 100, (int) (short) -1);
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
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((int) (short) 1);
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        boolean boolean39 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
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
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        boolean boolean3 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.lang.String str13 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        long long16 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
            java.nio.ByteBuffer byteBuffer21 = ledgerEntryPage9.getPageToWrite();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
            long long24 = ledgerEntryPage14.getOffset((int) (byte) 1);
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, (int) (short) 100);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        boolean boolean18 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        boolean boolean3 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        ledgerEntryPage9.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(entryKey20);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.close();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int19 = ledgerEntryPage18.getVersion();
        boolean boolean20 = ledgerEntryPage18.inUse();
        int int21 = ledgerEntryPage18.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage18.getEntryKey();
        boolean boolean23 = ledgerEntryPage2.equals((java.lang.Object) entryKey22);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 100, (int) '4');
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey12 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor13 = null;
        ledgerEntryPage2.getEntries(entryVisitor13);
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor17 = null;
        ledgerEntryPage2.getEntries(entryVisitor17);
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
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = ledgerEntryPage9.getPageToWrite();
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
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        boolean boolean4 = ledgerEntryPage2.inUse();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        ledgerEntryPage2.close();
        java.util.PrimitiveIterator.OfLong ofLong14 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Class<?> wildcardClass14 = entryKey13.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(entryKey13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
            ledgerEntryPage19.releasePage();
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
        org.junit.Assert.assertNotNull(ofLong20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.lang.Class<?> wildcardClass20 = entryKey18.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(entryKey18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        boolean boolean11 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        boolean boolean9 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (byte) 0);
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        int int21 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.EntryKey entryKey22 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        // The following exception was thrown during execution in test generation
        try {
            long long40 = ledgerEntryPage2.getOffset((int) (short) 100);
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
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), 1);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) 100);
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryKey3);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
            ledgerEntryPage19.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
            long long29 = ledgerEntryPage9.getOffset((int) '4');
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        // The following exception was thrown during execution in test generation
        try {
            long long39 = ledgerEntryPage9.getOffset((int) (short) 0);
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
            ledgerEntryPage2.setOffset((long) 3, (int) (short) -1);
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.Class<?> wildcardClass17 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.zeroPage();
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.lang.Class<?> wildcardClass19 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        ledgerEntryPage9.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset(100L, (int) (short) -1);
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        org.junit.Assert.assertNotNull(entryKey15);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (short) 100);
        boolean boolean15 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        ledgerEntryPage22.usePage();
        ledgerEntryPage22.usePage();
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
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        boolean boolean19 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        boolean boolean19 = ledgerEntryPage2.isDeleted();
        java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
        int int17 = ledgerEntryPage2.getVersion();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor18 = null;
        ledgerEntryPage2.getEntries(entryVisitor18);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        long long5 = ledgerEntryPage2.getLastEntry();
        int int6 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        ledgerEntryPage2.markDeleted();
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        ledgerEntryPage2.markDeleted();
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.lang.String str18 = ledgerEntryPage9.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage21.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage21.getEntries(entryVisitor23);
        boolean boolean25 = ledgerEntryPage21.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage28 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong29 = ledgerEntryPage28.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor30 = null;
        ledgerEntryPage28.getEntries(entryVisitor30);
        int int32 = ledgerEntryPage28.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong33 = ledgerEntryPage28.getEntriesIterator();
        boolean boolean34 = ledgerEntryPage28.isDeleted();
        java.lang.String str35 = ledgerEntryPage28.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey36 = ledgerEntryPage28.getEntryKey();
        boolean boolean37 = ledgerEntryPage21.equals((java.lang.Object) ledgerEntryPage28);
        boolean boolean38 = ledgerEntryPage28.inUse();
        boolean boolean39 = ledgerEntryPage28.inUse();
        long long40 = ledgerEntryPage28.getLastEntry();
        boolean boolean41 = ledgerEntryPage28.inUse();
        ledgerEntryPage28.usePage();
        java.nio.ByteBuffer byteBuffer43 = ledgerEntryPage28.getPageToWrite();
        ledgerEntryPage28.resetPage();
        ledgerEntryPage28.usePage();
        boolean boolean46 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage28);
        boolean boolean47 = ledgerEntryPage9.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1@-1 clean 0" + "'", str18, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ofLong29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(ofLong33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1@-1 clean 0" + "'", str35, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(ofLong9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) 100, 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.lang.String str22 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(2);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.lang.String str38 = ledgerEntryPage9.toString();
        boolean boolean39 = ledgerEntryPage9.inUse();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1@-1 clean 0" + "'", str38, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
            long long14 = ledgerEntryPage2.getOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.inUse();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.close();
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor14 = null;
        ledgerEntryPage2.getEntries(entryVisitor14);
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        long long30 = ledgerEntryPage17.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        ledgerEntryPage2.resetPage();
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage9.getPageToWrite();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor10 = null;
        ledgerEntryPage2.getEntries(entryVisitor10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        boolean boolean4 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.Class<?> wildcardClass24 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(entryKey16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ledgerEntryPage2.getOffset(0);
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
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
            ledgerEntryPage9.releasePageNoCallback();
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        ledgerEntryPage2.releasePage();
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage18.getEntries(entryVisitor28);
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        long long15 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong16 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, 100);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(ofLong16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.lang.String str21 = ledgerEntryPage2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1@-1 clean 0" + "'", str21, "-1@-1 clean 0");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.resetPage();
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        int int4 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey16 = ledgerEntryPage2.getEntryKey();
        java.util.PrimitiveIterator.OfLong ofLong17 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertNotNull(ofLong17);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        ledgerEntryPage2.releasePage();
        ledgerEntryPage2.markDeleted();
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
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', 3);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor7 = null;
        ledgerEntryPage2.getEntries(entryVisitor7);
        java.util.PrimitiveIterator.OfLong ofLong9 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        java.lang.String str6 = ledgerEntryPage2.toString();
        ledgerEntryPage2.setOffset((long) (byte) 100, (int) (short) 0);
        long long11 = ledgerEntryPage2.getOffset(2);
        org.junit.Assert.assertNotNull(entryKey3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 1" + "'", str6, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6553600L + "'", long11 == 6553600L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, (int) (byte) 0);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        ledgerEntryPage13.close();
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
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        boolean boolean20 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ledgerEntryPage2.getOffset(2);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
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
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage31 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int32 = ledgerEntryPage31.getVersion();
        ledgerEntryPage31.resetPage();
        long long34 = ledgerEntryPage31.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey35 = ledgerEntryPage31.getEntryKey();
        boolean boolean36 = ledgerEntryPage5.equals((java.lang.Object) ledgerEntryPage31);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage31.releasePageNoCallback();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str13 = ledgerEntryPage2.toString();
        boolean boolean14 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.releasePageNoCallback();
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
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        int int24 = ledgerEntryPage9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = ledgerEntryPage9.getOffset((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage22.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        boolean boolean19 = ledgerEntryPage9.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        int int13 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey13 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.nio.ByteBuffer byteBuffer32 = ledgerEntryPage22.getPageToWrite();
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
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        int int5 = ledgerEntryPage2.getVersion();
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.Class<?> wildcardClass22 = entryKey21.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(entryKey18);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = ledgerEntryPage9.getOffset(10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.zeroPage();
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
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        ledgerEntryPage2.resetPage();
        int int9 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage16.getEntries(entryVisitor20);
        ledgerEntryPage16.usePage();
        java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage16.getPageToWrite();
        int int24 = ledgerEntryPage16.getVersion();
        ledgerEntryPage16.close();
        boolean boolean26 = ledgerEntryPage16.inUse();
        boolean boolean27 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage16);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor15 = null;
        ledgerEntryPage2.getEntries(entryVisitor15);
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
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
        ledgerEntryPage12.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage25 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage25.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor27 = null;
        ledgerEntryPage25.getEntries(entryVisitor27);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor29 = null;
        ledgerEntryPage25.getEntries(entryVisitor29);
        ledgerEntryPage25.usePage();
        boolean boolean32 = ledgerEntryPage12.equals((java.lang.Object) ledgerEntryPage25);
        ledgerEntryPage25.close();
        long long34 = ledgerEntryPage25.getLastEntry();
        boolean boolean35 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage25);
        org.junit.Assert.assertNotNull(ofLong6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(entryKey8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) '4');
        ledgerEntryPage2.releasePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        boolean boolean21 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(entryKey6);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage26 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong27 = ledgerEntryPage26.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor28 = null;
        ledgerEntryPage26.getEntries(entryVisitor28);
        boolean boolean30 = ledgerEntryPage26.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage33 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong34 = ledgerEntryPage33.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor35 = null;
        ledgerEntryPage33.getEntries(entryVisitor35);
        int int37 = ledgerEntryPage33.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong38 = ledgerEntryPage33.getEntriesIterator();
        boolean boolean39 = ledgerEntryPage33.isDeleted();
        java.lang.String str40 = ledgerEntryPage33.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey41 = ledgerEntryPage33.getEntryKey();
        boolean boolean42 = ledgerEntryPage26.equals((java.lang.Object) ledgerEntryPage33);
        ledgerEntryPage33.markDeleted();
        ledgerEntryPage33.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey45 = ledgerEntryPage33.getEntryKey();
        int int46 = ledgerEntryPage33.getVersion();
        boolean boolean47 = ledgerEntryPage9.equals((java.lang.Object) int46);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor48 = null;
        ledgerEntryPage9.getEntries(entryVisitor48);
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
        org.junit.Assert.assertNotNull(ofLong27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ofLong34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(ofLong38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1@-1 clean 0" + "'", str40, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(entryKey45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey18 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey18);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ledgerEntryPage2.getOffset(100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        ledgerEntryPage2.usePage();
        int int14 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, 1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage9.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(ofLong28);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        int int14 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
            long long18 = ledgerEntryPage2.getOffset((int) '4');
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        int int18 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
            long long18 = ledgerEntryPage2.getOffset((int) 'a');
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        ledgerEntryPage9.markDeleted();
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
}

