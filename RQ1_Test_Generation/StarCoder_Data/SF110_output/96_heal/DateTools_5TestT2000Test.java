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
        assertTrue(DateTools.isValidDate("2018-01-01"));
        assertTrue(DateTools.isValidDate("2018-01-01", "yyyy-MM-dd"));
        assertTrue(DateTools.isValidDate("2018-01-01 00:00:00"));
        assertTrue(DateTools.isValidDate("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss"));
        assertTrue(DateTools.isValidDate("01/01/2018"));
        assertTrue(DateTools.isValidDate("01/01/2018", "MM/dd/yyyy"));
        assertTrue(DateTools.isValidDate("01-01-2018"));
        assertTrue(DateTools.isValidDate("01-01-2018", "MM-dd-yyyy"));
        assertTrue(DateTools.isValidDate("2018"));
        assertTrue(DateTools.isValidDate("2018", "yyyy"));
        assertFalse(DateTools.isValidDate("2018-01-01 00:00:00", "yyyy-MM-dd"));
        assertFalse(DateTools.isValidDate("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01/01/2018", "yyyy-MM-dd"));
        assertFalse(DateTools.isValidDate("01/01/2018", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("01-01-2018", "yyyy-MM-dd"));
        assertFalse(DateTools.isValidDate("01-01-2018", "yyyy-MM-dd HH:mm:ss"));
        assertFalse(DateTools.isValidDate("2018", "yyyy-MM-dd"));
        assertFalse(DateTools.isValidDate("2018", "yyyy-MM-dd HH:mm:ss"));
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
        assertTrue(DateTools.isValidDate("2018-01-01"));
        assertTrue(DateTools.isValidDate("2018-01-01 00:00:00"));
        assertTrue(DateTools.isValidDate("01/01/2018"));
        assertTrue(DateTools.isValidDate("01-01-2018"));
        assertTrue(DateTools.isValidDate("2018"));
        assertFalse(DateTools.isValidDate("2018-01-01 00:00:00"));
        assertFalse(DateTools.isValidDate("01/01/2018"));
        assertFalse(DateTools.isValidDate("01-01-2018"));
        assertFalse(DateTools.isValidDate("2018"));
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
        Date date = DateTools.parse("2018-01-01");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018-01-01 00:00:00");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01/01/2018");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01-01-2018");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018", "yyyy");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01/01/2018", "yyyy-MM-dd");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01/01/2018", "yyyy-MM-dd HH:mm:ss");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01-01-2018", "yyyy-MM-dd");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("01-01-2018", "yyyy-MM-dd HH:mm:ss");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018", "yyyy-MM-dd");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
        date = DateTools.parse("2018", "yyyy-MM-dd HH:mm:ss");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1, date.getDate());
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
        Date date = DateTools.parse("2018-01-01");
        assertEquals(2018, date.getYear() + 1900);
        assertEquals(0, date.getMonth());
        assertEquals(1,