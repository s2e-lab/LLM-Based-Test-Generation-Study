// DateTools_2Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateTools_2Test {

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd".
     */
    @Test
    void testParse_yyyy_MM_dd() {
        String dateString = "2019-01-01";
        Date expected = new Date(2019, 0, 1);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss() {
        String dateString = "2019-01-01 12:00:00";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS() {
        String dateString = "2019-01-01 12:00:00.000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS Z".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_Z() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "yyyy-MM-dd HH:mm:ss.SSS ZZZZZZZZZZ".
     */
    @Test
    void testParse_yyyy_MM_dd_HH_mm_ss_SSS_ZZZZZZZZZZ() {
        String dateString = "2019-01-01 12:00:00.000 +0000";
        Date expected = new Date(2019, 0, 1, 12, 0, 0);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link DateTools#parse(String)}
     * when the date string is in the format "