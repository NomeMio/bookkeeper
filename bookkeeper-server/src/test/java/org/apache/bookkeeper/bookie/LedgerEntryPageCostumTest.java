package org.apache.bookkeeper.bookie;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused"})
public class LedgerEntryPageCostumTest {

   
    
    private LEPStateChangeCallback mockLEPStateChangeCallback() {
        LEPStateChangeCallback callback = mock(LEPStateChangeCallback.class);
        doNothing().when(callback).onResetInUse(any(LedgerEntryPage.class));
        doNothing().when(callback).onSetInUse(any(LedgerEntryPage.class));
        doNothing().when(callback).onSetClean(any(LedgerEntryPage.class));
        doNothing().when(callback).onSetDirty(any(LedgerEntryPage.class));
    return callback;
}
   


    /*
     * Test cases for LedgerEntryPage constructor with various parameters
     */
    @ParameterizedTest
    // number:pageSize, number:entriesPerPage, boolean:withCallback, boolean:expectException
    // if withCallback is true, a mock callback is created and passed to the constructor
    // if expectException is true, the constructor should throw IllegalArgumentException otherwise the test fails
    // if expectException is false, the constructor should not throw an exception and the test passes
    @CsvSource({
        "0,0,false,false",
        "-1, 8, false, true",
        "1024, -5, false, false",
        "1024, 8, false, false",
        "0,0,true,false",
        "-1, 8, true, true",
        "1024, -5, true, false",
        "1024, 8, true, false",
        "512, 4, true, false"
    })
    void testConstructorParametrized(int pageSize, int entriesPerPage, boolean withCallback, boolean expectException) {
        LEPStateChangeCallback callback = withCallback ? mockLEPStateChangeCallback() : null;
        try {
            new LedgerEntryPage(pageSize, entriesPerPage, callback);
            if (expectException) {
                fail("Expected IllegalArgumentException");
            }
        } catch (IllegalArgumentException e) {
            if (!expectException) {
                fail("Did not expect exception, but got: " + e);
            }
        }
    }    


    /*
     * Test cases for inUse() method 
     */
    @ParameterizedTest
    // boolean:withCallback, boolean:expectException
    // if withCallback is true, a mock callback is created and passed to the constructor
    // if expectException is true, the constructor should throw IllegalArgumentException otherwise the test fails
    // if expectException is false, the constructor should not throw an exception and the test passes
    @CsvSource({
        "false, false",
        "true, false",
    })
    void testUsePage(boolean withCallback, boolean expectException) {
        LEPStateChangeCallback callback = withCallback ? mockLEPStateChangeCallback() : null;
        LedgerEntryPage leg = new LedgerEntryPage(64, 2, callback);
        if (leg.inUse()) {
            fail("LedgerEntryPage should not be in use at this point");
        }
        leg.usePage();
        if(!leg.inUse()){
            fail("LedgerEntryPage should be in use after usePage() call");
        }
        
    }


    /*
     * Test cases for resetPage() method
     */    
    @ParameterizedTest
    // number:pageSize, number:entriesPerPage, boolean:withCallback, boolean:expectException
    // if withCallback is true, a mock callback is created and passed to the constructor
    // if expectException is true, the constructor should throw IllegalArgumentException otherwise the test fails
    // if expectException is false, the constructor should not throw an exception and the test passes
    @CsvSource({
        "0,0,false,false",
        "1024,8,false,false",
        "0,0,true,false",
        "1024,8,true,false"
    })
    void testResetPage(int pageSize, int entriesPerPage, boolean withCallback, boolean expectException){
        LEPStateChangeCallback callback = withCallback ? mockLEPStateChangeCallback() : null;
        LedgerEntryPage leg=new LedgerEntryPage(pageSize, entriesPerPage, callback);
        if(leg.inUse()){
            fail("LedgerEntryPage should not be in use at this point");
        }
        leg.usePage();
        if(!leg.inUse()){
            fail("LedgerEntryPage should be in use after usePage() call");
        }
        leg.resetPage();
    }


}