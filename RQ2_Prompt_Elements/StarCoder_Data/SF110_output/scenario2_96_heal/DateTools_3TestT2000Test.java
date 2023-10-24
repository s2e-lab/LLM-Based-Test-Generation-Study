// DateTools_3Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_3Test {

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd".
     */
    @Test
    void testParse_yyyy_MM_dd() {
        String dateString = "2018-01-01";
        String format = "yyyy-MM-dd";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss() {
        String dateString = "2018-01-01 00:00:00";
        String format = "yyyy-MM-dd HH:mm:ss";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_2() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_3() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_4() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_5() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_6() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_7() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_8() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_9() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String, String)}.
     * It tests the parsing of a date with the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_10() {
        String dateString = "2018-01-01 00:00:00.000";
        String format = "yyyy-MM-dd HH:mm:ss.SSS";
        Date expected = new Date(2018 - 1900, 0, 1);
        Date actual = DateTools.parse(dateString, format);
        assertEquals(expected, actual);
    }
}

// DateTools_2Test.java
package org.heal.util;

import java.text.