// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {

    /**
    * Test case for the {@link HTMLFilter#filter(String)} method.
    */
    @Test
    void testFilter() {
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test"));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
        assertEquals("This is a test.", HTMLFilter.filter("This is a test."));
    }
}
