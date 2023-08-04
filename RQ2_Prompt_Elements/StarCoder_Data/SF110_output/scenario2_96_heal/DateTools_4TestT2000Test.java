// DateTools_4Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_4Test {

    /**
     * Test method for {@link DateTools#isValidDate(String)}.
     */
    @Test
    void testIsValidDate() {
        assertTrue(DateTools.isValidDate("2004-02-29"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.0000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.0000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.0000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.0000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.000000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.0000000000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000000000000000000000"));
        assertTrue(DateTools.isValidDate("2004-02-29 13:00:00.00000000000000000000000000000000000000000000