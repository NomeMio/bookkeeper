package org.apache.bookkeeper.randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.bookkeeper.bookie.LedgerEntryPage.getIndexEntrySize();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.Class<?> wildcardClass9 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
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
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        int int5 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass9 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ledgerEntryPage2.getOffset((int) (byte) 10);
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
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
            java.nio.ByteBuffer byteBuffer13 = ledgerEntryPage2.getPageToWrite();
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
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
            long long13 = ledgerEntryPage2.getOffset((int) (byte) 100);
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
            long long15 = ledgerEntryPage2.getOffset(10);
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
            java.nio.ByteBuffer byteBuffer18 = ledgerEntryPage2.getPageToWrite();
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
            ledgerEntryPage2.setOffset((long) (byte) 0, 0);
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
            ledgerEntryPage2.zeroPage();
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.Class<?> wildcardClass22 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
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
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ledgerEntryPage9.getOffset((int) (short) 100);
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
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
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
            ledgerEntryPage2.setOffset((long) (byte) 0, (int) (byte) 100);
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage9.getPageToWrite();
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
            java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
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
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((int) (short) 10);
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
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
            java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = ledgerEntryPage9.getOffset((int) (byte) 1);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
            ledgerEntryPage2.setOffset((long) (short) 100, 1);
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
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass8 = entryKey7.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass3 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
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
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = ledgerEntryPage2.getOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) 100, (int) (short) 0);
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) 1, (int) '4');
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.junit.Assert.assertNotNull(ofLong11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
            long long14 = ledgerEntryPage2.getOffset((int) (short) 1);
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
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        org.junit.Assert.assertNotNull(entryKey22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        int int4 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.inUse();
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
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.lang.Class<?> wildcardClass13 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '4', 10);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.lang.String str4 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        // The following exception was thrown during execution in test generation
        try {
            long long32 = ledgerEntryPage22.getOffset(0);
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(ofLong30);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(1L, (int) 'a');
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
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.resetPage();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        int int4 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage2.getPageToWrite();
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.lang.String str4 = ledgerEntryPage2.toString();
        boolean boolean5 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong5 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
            java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass10 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        java.lang.Class<?> wildcardClass13 = entryKey12.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 10, (int) (short) 1);
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
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = ledgerEntryPage9.getPageToWrite();
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        ledgerEntryPage2.markDeleted();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            ledgerEntryPage2.setOffset((long) (short) 10, 10);
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.junit.Assert.assertNotNull(ofLong12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        boolean boolean11 = ledgerEntryPage2.equals((java.lang.Object) 'a');
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor12 = null;
        ledgerEntryPage2.getEntries(entryVisitor12);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer10 = ledgerEntryPage2.getPageToWrite();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 100, 10);
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) (byte) 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage9.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = ledgerEntryPage9.getOffset(0);
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
        org.junit.Assert.assertNotNull(entryKey31);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
        boolean boolean8 = ledgerEntryPage2.equals((java.lang.Object) (byte) 1);
        int int9 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
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
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = ledgerEntryPage2.getOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        boolean boolean5 = ledgerEntryPage2.inUse();
        long long6 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = ledgerEntryPage2.getOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
            long long21 = ledgerEntryPage8.getOffset((int) (byte) -1);
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        ledgerEntryPage2.releasePage();
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
            java.nio.ByteBuffer byteBuffer25 = ledgerEntryPage9.getPageToWrite();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = ledgerEntryPage2.getOffset((int) (short) 10);
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
        org.junit.Assert.assertNotNull(entryKey16);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
            ledgerEntryPage2.releasePageNoCallback();
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass16 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
            ledgerEntryPage2.setOffset(10L, (int) ' ');
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((-1), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
            ledgerEntryPage2.setOffset((long) 8, (int) '#');
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass5 = ofLong4.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
            long long14 = ledgerEntryPage2.getOffset((int) (short) 0);
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) (byte) -1, (int) '4');
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.lang.Class<?> wildcardClass11 = ofLong10.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage2.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) '#', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(entryKey21);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        boolean boolean13 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        long long10 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        long long5 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entryKey3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
            long long12 = ledgerEntryPage2.getOffset((int) (short) 1);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 100, 1);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
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
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.inUse();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.inUse();
        java.lang.String str11 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        int int19 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) 'a', 1);
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        boolean boolean7 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage9.setOffset((long) ' ', (int) 'a');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1@-1 clean 0" + "'", str15, "-1@-1 clean 0");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
            ledgerEntryPage2.setOffset(1L, (int) '4');
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (short) -1);
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
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
            ledgerEntryPage2.setOffset((long) 'a', (int) '#');
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
            java.nio.ByteBuffer byteBuffer14 = ledgerEntryPage2.getPageToWrite();
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        boolean boolean4 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
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
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((int) ' ');
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
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
            java.nio.ByteBuffer byteBuffer16 = ledgerEntryPage2.getPageToWrite();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
            ledgerEntryPage2.setOffset((long) 0, (int) ' ');
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        boolean boolean21 = ledgerEntryPage9.isDeleted();
        long long22 = ledgerEntryPage9.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        long long11 = ledgerEntryPage2.getLastEntry();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        boolean boolean26 = ledgerEntryPage9.inUse();
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(1L, (int) (byte) 100);
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass7 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        boolean boolean3 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.lang.String str21 = ledgerEntryPage9.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1@-1 clean 0" + "'", str21, "-1@-1 clean 0");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
            java.nio.ByteBuffer byteBuffer12 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
            ledgerEntryPage2.setOffset(10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage7 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage7.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage7.getEntries(entryVisitor9);
        int int11 = ledgerEntryPage7.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong12 = ledgerEntryPage7.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong13 = ledgerEntryPage7.getEntriesIterator();
        ledgerEntryPage7.usePage();
        java.nio.ByteBuffer byteBuffer15 = ledgerEntryPage7.getPageToWrite();
        boolean boolean16 = ledgerEntryPage7.isDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage19 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long20 = ledgerEntryPage19.getLastEntry();
        ledgerEntryPage19.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage19.getEntriesIterator();
        boolean boolean23 = ledgerEntryPage7.equals((java.lang.Object) ofLong22);
        boolean boolean24 = ledgerEntryPage2.equals((java.lang.Object) ofLong22);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(100L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        ledgerEntryPage2.usePage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        boolean boolean15 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = ledgerEntryPage9.getPageToWrite();
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) 'a');
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass3 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        long long10 = ledgerEntryPage2.getLastEntry();
        java.lang.String str11 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 1" + "'", str11, "-1@-1 clean 1");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.EntryKey entryKey5 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(entryKey5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.Class<?> wildcardClass22 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(ofLong9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertNotNull(ofLong16);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage14.getEntriesIterator();
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
        org.junit.Assert.assertNotNull(ofLong22);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        long long7 = ledgerEntryPage2.getLastEntry();
        java.nio.ByteBuffer byteBuffer8 = ledgerEntryPage2.getPageToWrite();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        int int26 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = ledgerEntryPage2.getOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(0L, (int) (short) 0);
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        long long9 = ledgerEntryPage2.getLastEntry();
        int int10 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.String str16 = ledgerEntryPage2.toString();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 1" + "'", str16, "-1@-1 clean 1");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ledgerEntryPage2.getOffset((int) (byte) 1);
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
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
            ledgerEntryPage2.zeroPage();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer9 = ledgerEntryPage2.getPageToWrite();
        int int10 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) ' ', 1);
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
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.junit.Assert.assertNotNull(entryKey21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1@-1 clean 0" + "'", str22, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey28 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertNotNull(entryKey28);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        java.lang.String str8 = ledgerEntryPage2.toString();
        long long9 = ledgerEntryPage2.getLastEntry();
        int int10 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        boolean boolean15 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.Class<?> wildcardClass17 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.close();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 1" + "'", str9, "-1@-1 clean 1");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.equals((java.lang.Object) 100L);
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor25 = null;
        ledgerEntryPage2.getEntries(entryVisitor25);
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        boolean boolean9 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.releasePageNoCallback();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        boolean boolean16 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
            ledgerEntryPage2.setOffset(1L, (int) (short) 0);
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        boolean boolean31 = ledgerEntryPage9.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) 'a', (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.junit.Assert.assertNotNull(ofLong40);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1@-1 clean 0" + "'", str14, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage14 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong15 = ledgerEntryPage14.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor16 = null;
        ledgerEntryPage14.getEntries(entryVisitor16);
        boolean boolean18 = ledgerEntryPage14.inUse();
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage21 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong22 = ledgerEntryPage21.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage21.getEntries(entryVisitor23);
        int int25 = ledgerEntryPage21.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong26 = ledgerEntryPage21.getEntriesIterator();
        boolean boolean27 = ledgerEntryPage21.isDeleted();
        java.lang.String str28 = ledgerEntryPage21.toString();
        org.apache.bookkeeper.bookie.EntryKey entryKey29 = ledgerEntryPage21.getEntryKey();
        boolean boolean30 = ledgerEntryPage14.equals((java.lang.Object) ledgerEntryPage21);
        int int31 = ledgerEntryPage21.getVersion();
        boolean boolean32 = ledgerEntryPage21.isDeleted();
        boolean boolean33 = ledgerEntryPage2.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ofLong15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ofLong22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(ofLong26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1@-1 clean 0" + "'", str28, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
            long long25 = ledgerEntryPage9.getOffset((int) (short) 10);
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.junit.Assert.assertNotNull(entryKey20);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage22 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage22.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor24 = null;
        ledgerEntryPage22.getEntries(entryVisitor24);
        boolean boolean26 = ledgerEntryPage22.inUse();
        java.lang.String str27 = ledgerEntryPage22.toString();
        boolean boolean28 = ledgerEntryPage22.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey29 = ledgerEntryPage22.getEntryKey();
        ledgerEntryPage22.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong31 = ledgerEntryPage22.getEntriesIterator();
        java.lang.Class<?> wildcardClass32 = ledgerEntryPage22.getClass();
        boolean boolean33 = ledgerEntryPage9.equals((java.lang.Object) ledgerEntryPage22);
        org.apache.bookkeeper.bookie.EntryKey entryKey34 = ledgerEntryPage9.getEntryKey();
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1@-1 clean 0" + "'", str27, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(entryKey29);
        org.junit.Assert.assertNotNull(ofLong31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(entryKey34);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        long long9 = ledgerEntryPage2.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        int int13 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        java.lang.String str6 = ledgerEntryPage2.toString();
        boolean boolean7 = ledgerEntryPage2.isDeleted();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1@-1 clean 0" + "'", str6, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        ledgerEntryPage2.zeroPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(entryKey13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.lang.Class<?> wildcardClass12 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        java.lang.String str5 = ledgerEntryPage2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1@-1 clean 0" + "'", str5, "-1@-1 clean 0");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        int int9 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong10 = ledgerEntryPage2.getEntriesIterator();
        java.lang.String str11 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
            java.nio.ByteBuffer byteBuffer23 = ledgerEntryPage9.getPageToWrite();
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
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        org.apache.bookkeeper.bookie.EntryKey entryKey11 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(entryKey11);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass8 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(entryKey7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
            ledgerEntryPage2.setOffset((long) 8, 0);
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        org.apache.bookkeeper.bookie.EntryKey entryKey7 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey8 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ledgerEntryPage2.getOffset(100);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
            ledgerEntryPage2.setOffset((long) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
            long long14 = ledgerEntryPage2.getOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.inUse();
        boolean boolean10 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
            ledgerEntryPage8.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass14 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.close();
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ledgerEntryPage2.getOffset((int) (byte) 1);
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
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        ledgerEntryPage2.usePage();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getLastEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(ofLong15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 10, (int) (short) 100);
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
            long long26 = ledgerEntryPage9.getOffset((int) 'a');
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(entryKey11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        long long23 = ledgerEntryPage9.getLastEntry();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
            long long17 = ledgerEntryPage2.getOffset((int) (short) 0);
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        boolean boolean11 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        org.apache.bookkeeper.bookie.EntryKey entryKey3 = ledgerEntryPage2.getEntryKey();
        org.junit.Assert.assertNotNull(entryKey3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
            ledgerEntryPage2.close();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ofLong13);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
            ledgerEntryPage2.setOffset((long) (byte) 10, (int) (byte) -1);
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 100);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.Class<?> wildcardClass21 = ledgerEntryPage9.getClass();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        java.lang.String str7 = ledgerEntryPage2.toString();
        java.lang.String str8 = ledgerEntryPage2.toString();
        ledgerEntryPage2.markDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1@-1 clean 0" + "'", str7, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1@-1 clean 0" + "'", str8, "-1@-1 clean 0");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
            ledgerEntryPage2.setOffset((long) (short) 0, 100);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
            java.nio.ByteBuffer byteBuffer36 = ledgerEntryPage9.getPageToWrite();
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        ledgerEntryPage22.releasePageNoCallback();
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
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = ledgerEntryPage16.getPageToWrite();
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey14 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ledgerEntryPage2.getOffset((int) (short) 10);
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
        org.junit.Assert.assertNotNull(entryKey14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1@-1 clean 0" + "'", str16, "-1@-1 clean 0");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.lang.Class<?> wildcardClass13 = ofLong12.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(ofLong12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        ledgerEntryPage2.usePage();
        boolean boolean32 = ledgerEntryPage2.isDeleted();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (byte) 10, 8);
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        boolean boolean5 = ledgerEntryPage2.inUse();
        java.lang.Class<?> wildcardClass6 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
            ledgerEntryPage9.setOffset((long) 8, (int) (byte) 1);
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, (int) '#');
        boolean boolean3 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.markDeleted();
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        boolean boolean6 = ledgerEntryPage2.inUse();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        boolean boolean4 = ledgerEntryPage2.inUse();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.zeroPage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
            ledgerEntryPage2.releasePage();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        boolean boolean14 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(entryKey30);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean9 = ledgerEntryPage2.isDeleted();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        int int13 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey9 = ledgerEntryPage2.getEntryKey();
        org.apache.bookkeeper.bookie.EntryKey entryKey10 = ledgerEntryPage2.getEntryKey();
        java.lang.Class<?> wildcardClass11 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(entryKey9);
        org.junit.Assert.assertNotNull(entryKey10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
            long long32 = ledgerEntryPage9.getOffset((int) (short) 100);
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (short) 0);
        java.lang.String str3 = ledgerEntryPage2.toString();
        java.lang.String str4 = ledgerEntryPage2.toString();
        ledgerEntryPage2.resetPage();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1@-1 clean 0" + "'", str3, "-1@-1 clean 0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1@-1 clean 0" + "'", str4, "-1@-1 clean 0");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        boolean boolean8 = ledgerEntryPage2.isDeleted();
        java.lang.String str9 = ledgerEntryPage2.toString();
        int int10 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        boolean boolean3 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
            ledgerEntryPage2.setOffset(0L, (int) '#');
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.markDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = ledgerEntryPage2.getOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass15 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.junit.Assert.assertNotNull(entryKey22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1@-1 clean 0" + "'", str23, "-1@-1 clean 0");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        int int17 = ledgerEntryPage2.getVersion();
        java.lang.Class<?> wildcardClass18 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(entryKey16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
        int int17 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong18 = ledgerEntryPage2.getEntriesIterator();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(ofLong18);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        int int9 = ledgerEntryPage2.getVersion();
        boolean boolean10 = ledgerEntryPage2.inUse();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 1" + "'", str12, "-1@-1 clean 1");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 0, (int) (byte) 10);
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
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        boolean boolean21 = ledgerEntryPage9.isDeleted();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', (int) (short) 0);
        ledgerEntryPage2.markDeleted();
        java.lang.Class<?> wildcardClass4 = ledgerEntryPage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong7 = ledgerEntryPage2.getEntriesIterator();
        long long8 = ledgerEntryPage2.getLastEntry();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.usePage();
        java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
        ledgerEntryPage2.usePage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        boolean boolean13 = ledgerEntryPage2.isDeleted();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ledgerEntryPage2.getOffset((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
            ledgerEntryPage2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) ' ', (int) (short) -1);
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage16.close();
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage18 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong19 = ledgerEntryPage18.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor20 = null;
        ledgerEntryPage18.getEntries(entryVisitor20);
        int int22 = ledgerEntryPage18.getVersion();
        java.util.PrimitiveIterator.OfLong ofLong23 = ledgerEntryPage18.getEntriesIterator();
        long long24 = ledgerEntryPage18.getLastEntry();
        java.lang.String str25 = ledgerEntryPage18.toString();
        ledgerEntryPage18.usePage();
        ledgerEntryPage18.releasePage();
        java.util.PrimitiveIterator.OfLong ofLong28 = ledgerEntryPage18.getEntriesIterator();
        boolean boolean29 = ledgerEntryPage2.equals((java.lang.Object) ofLong28);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(entryKey14);
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertNotNull(ofLong19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(ofLong23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1@-1 clean 0" + "'", str25, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1@-1 clean 0" + "'", str11, "-1@-1 clean 0");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 2" + "'", str12, "-1@-1 clean 2");
        org.junit.Assert.assertNotNull(ofLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        java.util.PrimitiveIterator.OfLong ofLong4 = ledgerEntryPage2.getEntriesIterator();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.markDeleted();
        ledgerEntryPage2.usePage();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(ofLong4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Class<?> wildcardClass40 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        ledgerEntryPage2.markDeleted();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor5 = null;
        ledgerEntryPage2.getEntries(entryVisitor5);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset(10L, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.EntryKey entryKey6 = ledgerEntryPage2.getEntryKey();
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(entryKey6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
            java.nio.ByteBuffer byteBuffer11 = ledgerEntryPage2.getPageToWrite();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        ledgerEntryPage2.resetPage();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 0" + "'", str13, "-1@-1 clean 0");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.junit.Assert.assertNotNull(ofLong13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(ofLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1@-1 clean 0" + "'", str19, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey20);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        ledgerEntryPage2.releasePage();
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        // The following exception was thrown during execution in test generation
        try {
            long long32 = ledgerEntryPage9.getOffset((int) (byte) 1);
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
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
            long long18 = ledgerEntryPage2.getOffset(1);
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        int int12 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) 0, 1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        long long3 = ledgerEntryPage2.getLastEntry();
        int int4 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.markDeleted();
        int int6 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ledgerEntryPage2.getOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        java.util.PrimitiveIterator.OfLong ofLong8 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor9 = null;
        ledgerEntryPage2.getEntries(entryVisitor9);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong8);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        int int3 = ledgerEntryPage2.getVersion();
        ledgerEntryPage2.resetPage();
        long long5 = ledgerEntryPage2.getLastEntry();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor23 = null;
        ledgerEntryPage9.getEntries(entryVisitor23);
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor6 = null;
        ledgerEntryPage2.getEntries(entryVisitor6);
        ledgerEntryPage2.usePage();
        java.lang.String str9 = ledgerEntryPage2.toString();
        ledgerEntryPage2.releasePageNoCallback();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 1" + "'", str9, "-1@-1 clean 1");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        boolean boolean24 = ledgerEntryPage9.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 1, (int) (short) 100);
        ledgerEntryPage2.resetPage();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.getEntries(entryVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = ledgerEntryPage2.getOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Page not marked in use");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(8, 100);
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.releasePageNoCallback();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Use count has gone below 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1@-1 clean 0" + "'", str12, "-1@-1 clean 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1@-1 clean 0" + "'", str17, "-1@-1 clean 0");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass12 = ofLong11.getClass();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) '4', (int) (short) -1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        ledgerEntryPage2.markDeleted();
        boolean boolean25 = ledgerEntryPage2.inUse();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage(0, (-1));
        java.util.PrimitiveIterator.OfLong ofLong3 = ledgerEntryPage2.getEntriesIterator();
        org.apache.bookkeeper.bookie.LedgerEntryPage.EntryVisitor entryVisitor4 = null;
        ledgerEntryPage2.getEntries(entryVisitor4);
        int int6 = ledgerEntryPage2.getVersion();
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
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        boolean boolean37 = ledgerEntryPage27.inUse();
        boolean boolean38 = ledgerEntryPage27.inUse();
        long long39 = ledgerEntryPage27.getLastEntry();
        org.apache.bookkeeper.bookie.EntryKey entryKey40 = ledgerEntryPage27.getEntryKey();
        ledgerEntryPage27.resetPage();
        boolean boolean42 = ledgerEntryPage27.inUse();
        java.lang.Class<?> wildcardClass43 = ledgerEntryPage27.getClass();
        boolean boolean44 = ledgerEntryPage2.equals((java.lang.Object) ledgerEntryPage27);
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1@-1 clean 0" + "'", str9, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ofLong21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ofLong28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(ofLong32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1@-1 clean 0" + "'", str34, "-1@-1 clean 0");
        org.junit.Assert.assertNotNull(entryKey35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(entryKey40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
            ledgerEntryPage9.setOffset((long) 100, 100);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1@-1 clean 0" + "'", str24, "-1@-1 clean 0");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        ledgerEntryPage2.zeroPage();
        ledgerEntryPage2.resetPage();
        int int17 = ledgerEntryPage2.getVersion();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(ofLong21);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        // The following exception was thrown during execution in test generation
        try {
            ledgerEntryPage2.setOffset((long) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1@-1 clean 1" + "'", str13, "-1@-1 clean 1");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: capacity < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        int int16 = ledgerEntryPage2.getVersion();
        org.junit.Assert.assertNotNull(ofLong3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ofLong7);
        org.junit.Assert.assertNotNull(ofLong8);
        org.junit.Assert.assertNotNull(ofLong10);
        org.junit.Assert.assertNotNull(ofLong11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.bookkeeper.bookie.LedgerEntryPage ledgerEntryPage2 = new org.apache.bookkeeper.bookie.LedgerEntryPage((int) (byte) 10, (int) (byte) 10);
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.apache.bookkeeper.bookie.EntryKey entryKey31 = ledgerEntryPage9.getEntryKey();
        java.lang.Class<?> wildcardClass32 = ledgerEntryPage9.getClass();
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
        org.junit.Assert.assertNotNull(entryKey31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
            long long24 = ledgerEntryPage9.getOffset((int) ' ');
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
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

