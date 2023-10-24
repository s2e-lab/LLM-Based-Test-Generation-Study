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
        Date date = new Date();
        String dateString = DateTools.format(date);
        assertEquals(dateString, new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date));
    }

    @Test
    void testFormat1() {
        Date date = new Date();
        String dateString = DateTools.format(date, "MM/dd/yyyy");
        assertEquals(dateString, new SimpleDateFormat("MM/dd/yyyy").format(date));
    }

    @Test
    void testFormat2() {
        Date date = new Date();
        String dateString = DateTools.format(date, "MM-dd-yyyy");
        assertEquals(dateString, new SimpleDateFormat("MM-dd-yyyy").format(date));
    }

    @Test
    void testFormat3() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy");
        assertEquals(dateString, new SimpleDateFormat("yyyy").format(date));
    }

    @Test
    void testFormat4() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd").format(date));
    }

    @Test
    void testFormat5() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }

    @Test
    void testFormat6() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSS");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date));
    }

    @Test
    void testFormat7() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSSS");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS").format(date));
    }

    @Test
    void testFormat8() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSSSS");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSS").format(date));
    }

    @Test
    void testFormat9() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSSSSS");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").format(date));
    }

    @Test
    void testFormat10() {
        Date date = new Date();
        String dateString = DateTools.format(date, "yyyy-MM-dd HH:mm:ss.SSSSSSS");
        assertEquals(dateString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSS").format(date));
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
* It contains ten unit test cases for the {@link DateTools#parse(String, String)} method.
*/
class DateTools_2Test {
		
    @Test
    void testParse() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        Date date1 = DateTools.parse(dateString);
        assertEquals(date, date1);
    }

    @Test
    void testParse1() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("MM/dd/yyyy").format(date);
        Date date1 = DateTools.parse(dateString, "MM/dd/yyyy");
        assertEquals(date, date1);
    }

    @Test
    void testParse2() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("MM-dd-yyyy").format(date);
        Date date1 = DateTools.parse(dateString, "MM-dd-yyyy");
        assertEquals(date, date1);
    }

    @Test
    void testParse3() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy");
        assertEquals(date, date1);
    }

    @Test
    void testParse4() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd");
        assertEquals(date, date1);
    }

    @Test
    void testParse5() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertEquals(date, date1);
    }

    @Test
    void testParse6() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSS");
        assertEquals(date, date1);
    }

    @Test
    void testParse7() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSSS");
        assertEquals(date, date1);
    }

    @Test
    void testParse8() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSS").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSSSS");
        assertEquals(date, date1);
    }

    @Test
    void testParse9() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSSSSS");
        assertEquals(date, date1);
    }

    @Test
    void testParse10() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSS").format(date);
        Date date1 = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss.SSSSSSS");
        assertEquals(date, date1);
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
* It contains ten unit test cases for the {@link DateTools#isValidDate(String, String)} method.
*/
class DateTools_3Test {
		
    @Test
    void testIsValidDate() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate1() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("MM/dd/yyyy").format(date);
        assertTrue(DateTools.isValidDate(dateString, "MM/dd/yyyy"));
    }

    @Test
    void testIsValidDate2() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("MM-dd-yyyy").format(date);
        assertTrue(DateTools.isValidDate(dateString, "MM-dd-yyyy"));
    }

    @Test
    void testIsValidDate3() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy").format(date);
        assertTrue(DateTools.isValidDate(dateString, "yyyy"));
    }

    @Test
    void testIsValidDate4() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);
        assertTrue(DateTools.isValidDate(dateString, "yyyy