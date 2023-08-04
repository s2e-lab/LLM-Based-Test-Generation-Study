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
        String dateString = "2018-01-01";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_2() {
        String dateString = "2018-01-01 00:00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_3() {
        String dateString = "01/01/2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_4() {
        String dateString = "01-01-2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_5() {
        String dateString = "2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_6() {
        String dateString = "2018-01-01 00:00:00";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, DateTools.LONG_DATE_FORMAT);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_7() {
        String dateString = "01/01/2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, "MM/dd/yyyy");
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_8() {
        String dateString = "01-01-2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, "MM-dd-yyyy");
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_9() {
        String dateString = "2018";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, "yyyy");
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_10() {
        String dateString = "2018-01-01 00:00:00";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, "yyyy-MM-dd");
        assertEquals(expected, actual);
    }
}

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
    void testIsValidDate_1() {
        String dateString = "2018-01-01";
        String format = "yyyy-MM-dd";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_2() {
        String dateString = "2018-01-01 00:00:00";
        String format = "yyyy-MM-dd HH:mm:ss";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_3() {
        String dateString = "01/01/2018";
        String format = "MM/dd/yyyy";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_4() {
        String dateString = "01-01-2018";
        String format = "MM-dd-yyyy";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_5() {
        String dateString = "2018";
        String format = "yyyy";
        boolean expected = true;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_6() {
        String dateString = "2018-01-01 00:00:00";
        String format = "yyyy-MM-dd";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_7() {
        String dateString = "01/01/2018";
        String format = "MM/dd/yyyy";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_8() {
        String dateString = "01-01-2018";
        String format = "MM-dd-yyyy";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_9() {
        String dateString = "2018";
        String format = "yyyy";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }

    @Test
    void testIsValidDate_10() {
        String dateString = "2018-01-01 00:00:00";
        String format = "yyyy-MM-dd HH:mm:ss";
        boolean expected = false;
        boolean actual = DateTools.isValidDate(dateString, format);
        assertEquals(expected, actual);
    }
}

// DateTools_6Test.java
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
class DateTools_6Test {
		
    @Test
    void testParse_1() {
        String dateString = "2018-01-01";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParse_2() {
        String dateString = "2018-01-01 00:00:00";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParse_3() {
        String dateString = "01/01/2018";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParse_4() {
        String dateString = "01-01-2018";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParse_5() {
        String dateString = "2018";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString);
        assertEquals(expected, actual);
    }

    @Test
    void testParse_6() {
        String dateString = "2018-01-01 00:00:00";
        Date expected = new Date(1514764800000L);
        Date actual = DateTools.parse(dateString