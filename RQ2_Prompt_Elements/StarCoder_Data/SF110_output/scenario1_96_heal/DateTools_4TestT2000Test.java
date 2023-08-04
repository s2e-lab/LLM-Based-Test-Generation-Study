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

    @Test
    void testIsValidDate_1() {
        String dateString = "2019-01-01";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_2() {
        String dateString = "2019-01-01 00:00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_3() {
        String dateString = "2019-01-01 00:00:00.000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_4() {
        String dateString = "2019-01-01 00:00:00.000+0000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_5() {
        String dateString = "2019-01-01 00:00:00.000+00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_6() {
        String dateString = "2019-01-01 00:00:00.000+00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_7() {
        String dateString = "2019-01-01 00:00:00.000Z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_8() {
        String dateString = "2019-01-01 00:00:00.000z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_9() {
        String dateString = "2019-01-01 00:00:00.000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_10() {
        String dateString = "2019-01-01 00:00:00.000+0000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_11() {
        String dateString = "2019-01-01 00:00:00.000+00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_12() {
        String dateString = "2019-01-01 00:00:00.000+00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_13() {
        String dateString = "2019-01-01 00:00:00.000Z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_14() {
        String dateString = "2019-01-01 00:00:00.000z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_15() {
        String dateString = "2019-01-01 00:00:00.000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_16() {
        String dateString = "2019-01-01 00:00:00.000+0000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_17() {
        String dateString = "2019-01-01 00:00:00.000+00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_18() {
        String dateString = "2019-01-01 00:00:00.000+00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_19() {
        String dateString = "2019-01-01 00:00:00.000Z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_20() {
        String dateString = "2019-01-01 00:00:00.000z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_21() {
        String dateString = "2019-01-01 00:00:00.000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_22() {
        String dateString = "2019-01-01 00:00:00.000+0000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_23() {
        String dateString = "2019-01-01 00:00:00.000+00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_24() {
        String dateString = "2019-01-01 00:00:00.000+00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_25() {
        String dateString = "2019-01-01 00:00:00.000Z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_26() {
        String dateString = "2019-01-01 00:00:00.000z";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_27() {
        String dateString = "2019-01-01 00:00:00.000";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_28() {
        String dateString = "2019-01-01 00:00:00.000+00