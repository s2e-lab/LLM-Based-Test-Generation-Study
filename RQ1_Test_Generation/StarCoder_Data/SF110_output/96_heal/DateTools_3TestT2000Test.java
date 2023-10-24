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
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse2() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse3() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse4() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse5() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse6() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse7() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse8() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse9() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse10() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01", "yyyy-MM-dd");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
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
    void testParse() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse2() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse3() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse4() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse5() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse6() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse7() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse8() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse9() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse10() {
        DateTools dateTools = new DateTools();
        Date date = dateTools.parse("2019-01-01");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
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
        Date date = new Date();
        String dateString = dateTools.format(date, "yyyy-MM-dd");
        assertEquals(dateString, "2019-01-01");
    }

    @Test
    void testFormat2() {
        DateTools dateTools = new DateTools();
        Date date = new Date();
        String dateString = dateTools.format(date, "yyyy-MM-dd");
        assertEquals(dateString, "2019-01-01");
    }

    @Test
    void testFormat3() {
        DateTools dateTools = new DateTools();
        Date date = new Date();
        String dateString = dateTools.format(date, "yyyy-MM-dd");
        assertEquals(dateString, "2019-01-01");
    }

    @Test
    void testFormat4() {
        DateTools dateTools = new DateTools();
        Date date = new Date();
        String dateString = dateTools.format(date, "yyyy-MM-dd");
        assertEquals(dateString, "2019-0