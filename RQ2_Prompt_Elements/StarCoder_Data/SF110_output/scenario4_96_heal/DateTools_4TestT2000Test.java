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
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_2() {
        String dateString = "2019-01-01 00:00:00";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_3() {
        String dateString = "01/01/2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_4() {
        String dateString = "01-01-2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_5() {
        String dateString = "2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_6() {
        String dateString = "2019-01-01 00:00:00";
        assertTrue(DateTools.isValidDate(dateString, DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testIsValidDate_7() {
        String dateString = "01/01/2019";
        assertTrue(DateTools.isValidDate(dateString, "MM/dd/yyyy"));
    }

    @Test
    void testIsValidDate_8() {
        String dateString = "01-01-2019";
        assertTrue(DateTools.isValidDate(dateString, "MM-dd-yyyy"));
    }

    @Test
    void testIsValidDate_9() {
        String dateString = "2019";
        assertTrue(DateTools.isValidDate(dateString, "yyyy"));
    }

    @Test
    void testIsValidDate_10() {
        String dateString = "2019-01-01";
        assertFalse(DateTools.isValidDate(dateString, "yyyy-MM-dd"));
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
        String dateString = "2019-01-01";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_2() {
        String dateString = "2019-01-01 00:00:00";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_3() {
        String dateString = "01/01/2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_4() {
        String dateString = "01-01-2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_5() {
        String dateString = "2019";
        assertTrue(DateTools.isValidDate(dateString));
    }

    @Test
    void testIsValidDate_6() {
        String dateString = "2019-01-01 00:00:00";
        assertTrue(DateTools.isValidDate(dateString, DateTools.LONG_DATE_FORMAT));
    }

    @Test
    void testIsValidDate_7() {
        String dateString = "01/01/2019";
        assertTrue(DateTools.isValidDate(dateString, "MM/dd/yyyy"));
    }

    @Test
    void testIsValidDate_8() {
        String dateString = "01-01-2019";
        assertTrue(DateTools.isValidDate(dateString, "MM-dd-yyyy"));
    }

    @Test
    void testIsValidDate_9() {
        String dateString = "2019";
        assertTrue(DateTools.isValidDate(dateString, "yyyy"));
    }

    @Test
    void testIsValidDate_10() {
        String dateString = "2019-01-01";
        assertFalse(DateTools.isValidDate(dateString, "yyyy-MM-dd"));
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
        String dateString = "2019-01-01";
        Date date = DateTools.parse(dateString);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_2() {
        String dateString = "2019-01-01 00:00:00";
        Date date = DateTools.parse(dateString);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_3() {
        String dateString = "01/01/2019";
        Date date = DateTools.parse(dateString);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_4() {
        String dateString = "01-01-2019";
        Date date = DateTools.parse(dateString);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_5() {
        String dateString = "2019";
        Date date = DateTools.parse(dateString);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_6() {
        String dateString = "2019-01-01 00:00:00";
        Date date = DateTools.parse(dateString, DateTools.LONG_DATE_FORMAT);
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_7() {
        String dateString = "01/01/2019";
        Date date = DateTools.parse(dateString, "MM/dd/yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_8() {
        String dateString = "01-01-2019";
        Date date = DateTools.parse(dateString, "MM-dd-yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_9() {
        String dateString = "2019";
        Date date = DateTools.parse(dateString, "yyyy");
        assertEquals(date.toString(), "Sat Jan 01 00:00:00 CET 2019");
    }

    @Test
    void testParse_10() {
        String dateString = "2019-01-01";
        Date date = DateTools.parse(dateString, "yyyy-MM-dd");
        assertNull(date);
    }
}

// DateTools_7Test.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit