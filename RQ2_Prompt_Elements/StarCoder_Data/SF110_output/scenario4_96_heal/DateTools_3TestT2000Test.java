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
    void testParse() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse2() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse3() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse4() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse5() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse6() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse7() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse8() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse9() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse10() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }
}

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
    void testParse2() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse3() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse4() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse5() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse6() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse7() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse8() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse9() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }

    @Test
    void testParse10() throws ParseException {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"));
    }
}

// DateTools_1Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {
		
    @Test
    void testFormat() {
        DateTools dateTools = new DateTools();
        String date = dateTools.format(new Date(), "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @Test
    void testFormat2() {
        DateTools dateTools = new DateTools();
        String date = dateTools.format(new Date(), "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @Test
    void testFormat3() {
        DateTools dateTools = new DateTools();
        String date = dateTools.format(new Date(), "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @Test
    void testFormat4() {
        DateTools dateTools = new DateTools();
        String date = dateTools.format(new Date(), "yyyy-MM-dd");
        assertEquals(date, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @Test
    void testFormat5() {
        DateTools dateTools = new DateTools();
        String date = dateTools.format(new Date(), "yyyy-MM-