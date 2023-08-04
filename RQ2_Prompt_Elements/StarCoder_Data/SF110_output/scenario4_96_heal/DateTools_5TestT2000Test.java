// DateTools_5Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_5Test {

    @Test
    void testIsValidDate() {
        assertTrue(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd"));
        assertTrue(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertTrue(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy"));
        assertTrue(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy"));
        assertTrue(DateTools.isValidDate("2019-01-01", "yyyy"));
        assertTrue(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy"));
        assertTrue(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy"));
        assertTrue(DateTools.isValidDate("2019", "yyyy"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2019", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2019", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019", "yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM/dd/yyyy HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2019-01-01", "MM-dd-yyyy HH:mm:ss"));
        assertFalse(DateTools.isValid