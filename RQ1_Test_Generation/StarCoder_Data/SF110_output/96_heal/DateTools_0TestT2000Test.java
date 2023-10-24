// DateTools_0Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_0Test {

    @Test
    void testFormat() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_0() {
        Date date = null;
        String dateString = DateTools.format(date);
        assertNull(dateString);
    }

    @Test
    void testFormat_1() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_2() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_3() {
        Date date = new Date();
        String dateString = DateTools.format(date, "MM/dd/yyyy");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_4() {
        Date date = new Date();
        String dateString = DateTools.format(date, "MM-dd-yyyy");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_5() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_6() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_7() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_8() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
    }

    @Test
    void testFormat_9() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(dateString);
        assertEquals(dateString, date.toString());
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
* It contains ten unit test cases for the {@link DateTools#parse(String)} method.
*/
class DateTools_1Test {
		
    @Test
    void testParse() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString);
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_0() {
        Date date = null;
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString);
        assertNull(date2);
    }

    @Test
    void testParse_1() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_2() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_3() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "MM/dd/yyyy");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_4() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "MM-dd-yyyy");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_5() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_6() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_7() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_8() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(date2);
        assertEquals(date, date2);
    }

    @Test
    void testParse_9() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        Date date2 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSS");
        assertNotNull(date2);
        assertEquals(date, date2);
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
* It contains ten unit test cases for the {@link DateTools#isValidDate(String)} method.
*/
class DateTools_2Test {
		
    @Test
    void testIsValidDate() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString);
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_0() {
        Date date = null;
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString);
        assertFalse(isValid);
    }

    @Test
    void testIsValidDate_1() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString, "yyyy-MM-dd");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_2() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_3() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString, "MM/dd/yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_4() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString, "MM-dd-yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_5() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        boolean isValid = DateTools.isValidDate(dateString, "yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDate_6() {
        Date date = new Date();
        String dateString = DateTools.format(date);
       