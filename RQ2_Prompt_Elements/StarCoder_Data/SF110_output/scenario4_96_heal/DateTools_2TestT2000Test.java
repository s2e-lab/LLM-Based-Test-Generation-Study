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

    @Test
    void testParse() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse_2() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }

    @Test
    void testParse_3() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2019");
        assertEquals(date, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2019"));
    }

    @Test
    void testParse_4() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2019");
        assertEquals(date, new SimpleDateFormat("MM-dd-yyyy").parse("01-01-2019"));
    }

    @Test
    void testParse_5() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019");
        assertEquals(date, new SimpleDateFormat("yyyy").parse("2019"));
    }

    @Test
    void testParse_6() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }

    @Test
    void testParse_7() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2019");
        assertEquals(date, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2019"));
    }

    @Test
    void testParse_8() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2019");
        assertEquals(date, new SimpleDateFormat("MM-dd-yyyy").parse("01-01-2019"));
    }

    @Test
    void testParse_9() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019");
        assertEquals(date, new SimpleDateFormat("yyyy").parse("2019"));
    }

    @Test
    void testParse_10() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }
}

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
		
    @Test
    void testParse_1() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse_2() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }

    @Test
    void testParse_3() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2019", "MM/dd/yyyy");
        assertEquals(date, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2019"));
    }

    @Test
    void testParse_4() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2019", "MM-dd-yyyy");
        assertEquals(date, new SimpleDateFormat("MM-dd-yyyy").parse("01-01-2019"));
    }

    @Test
    void testParse_5() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019", "yyyy");
        assertEquals(date, new SimpleDateFormat("yyyy").parse("2019"));
    }

    @Test
    void testParse_6() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }

    @Test
    void testParse_7() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2019", "MM/dd/yyyy");
        assertEquals(date, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2019"));
    }

    @Test
    void testParse_8() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2019", "MM-dd-yyyy");
        assertEquals(date, new SimpleDateFormat("MM-dd-yyyy").parse("01-01-2019"));
    }

    @Test
    void testParse_9() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019", "yyyy");
        assertEquals(date, new SimpleDateFormat("yyyy").parse("2019"));
    }

    @Test
    void testParse_10() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-01-01 00:00:00"));
    }
}

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
    void testIsValidDate() {
        DateTools dateTools = new DateTools();
        assertTrue(dateTools.isValidDate("2019-01-01"));
    }

    @Test
    void testIsValidDate_2() {
        DateTools dateTools = new DateTools();
        assertTrue(dateTools.isValidDate("2019-01-01 00:00:00"));
    }

    @Test
    void testIsValidDate_3() {
        DateTools dateTools = new DateTools();
        assertTrue(dateTools.isValidDate("01/01/2019"));
    }

    @Test
    void testIsValidDate_4() {
        DateTools dateTools = new DateTools();
        assertTrue(dateTools.isValidDate("01-0