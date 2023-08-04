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
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_2() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_3() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2018");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_4() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2018");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_5() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_6() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_7() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_8() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_9() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_10() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
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
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_2() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_3() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01/01/2018", "MM/dd/yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_4() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("01-01-2018", "MM-dd-yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_5() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018", "yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_6() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_7() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_8() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_9() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
    }

    @Test
    void testParse_10() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2018");
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
        assertTrue(dateTools.isValidDate("2018-01-01"));
    }

    @Test
    void testIsValidDate_2() {
        DateTools dateTools = new DateTools();
        assertTrue(dateTools.isValidDate("2018-01-01 00:00:00"));
    }

    @Test
    void testIsValidDate_3() {
        DateTools dateTools = new Date