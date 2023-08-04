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
    void testFormatDate() {
        Date date = new Date();
        String formattedDate = DateTools.format(date);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy-MM-dd");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString2() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString3() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "MM/dd/yyyy");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString4() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "MM-dd-yyyy");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString5() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString6() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "MM/dd/yyyy HH:mm:ss");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString7() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "MM-dd-yyyy HH:mm:ss");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString8() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy HH:mm:ss");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString9() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatDateString10() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(formattedDate);
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
    void testParseString() {
        String dateString = "2019-01-01";
        Date date = DateTools.parse(dateString);
        assertNotNull(date);
    }

    @Test
    void testParseStringString() {
        String dateString = "2019-01-01";
        Date date = DateTools.parse(dateString, "yyyy-MM-dd");
        assertNotNull(date);
    }

    @Test
    void testParseStringString2() {
        String dateString = "2019-01-01";
        Date date = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(date);
    }

    @Test
    void testParseStringString3() {
        String dateString = "01/01/2019";
        Date date = DateTools.parse(dateString, "MM/dd/yyyy");
        assertNotNull(date);
    }

    @Test
    void testParseStringString4() {
        String dateString = "01-01-2019";
        Date date = DateTools.parse(dateString, "MM-dd-yyyy");
        assertNotNull(date);
    }

    @Test
    void testParseStringString5() {
        String dateString = "2019";
        Date date = DateTools.parse(dateString, "yyyy");
        assertNotNull(date);
    }

    @Test
    void testParseStringString6() {
        String dateString = "01/01/2019 00:00:00";
        Date date = DateTools.parse(dateString, "MM/dd/yyyy HH:mm:ss");
        assertNotNull(date);
    }

    @Test
    void testParseStringString7() {
        String dateString = "01-01-2019 00:00:00";
        Date date = DateTools.parse(dateString, "MM-dd-yyyy HH:mm:ss");
        assertNotNull(date);
    }

    @Test
    void testParseStringString8() {
        String dateString = "2019 00:00:00";
        Date date = DateTools.parse(dateString, "yyyy HH:mm:ss");
        assertNotNull(date);
    }

    @Test
    void testParseStringString9() {
        String dateString = "2019-01-01 00:00:00";
        Date date = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(date);
    }

    @Test
    void testParseStringString10() {
        String dateString = "2019-01-01 00:00:00";
        Date date = DateTools.parse(dateString, "yyyy-MM-dd HH:mm:ss");
        assertNotNull(date);
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
    void testIsValidDateString() {
        String dateString = "2019-01-01";
        boolean isValid = DateTools.isValidDate(dateString);
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString2() {
        String dateString = "2019-01-01";
        boolean isValid = DateTools.isValidDate(dateString, "yyyy-MM-dd");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString3() {
        String dateString = "2019-01-01";
        boolean isValid = DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString4() {
        String dateString = "01/01/2019";
        boolean isValid = DateTools.isValidDate(dateString, "MM/dd/yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString5() {
        String dateString = "01-01-2019";
        boolean isValid = DateTools.isValidDate(dateString, "MM-dd-yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString6() {
        String dateString = "2019";
        boolean isValid = DateTools.isValidDate(dateString, "yyyy");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString7() {
        String dateString = "01/01/2019 00:00:00";
        boolean isValid = DateTools.isValidDate(dateString, "MM/dd/yyyy HH:mm:ss");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString8() {
        String dateString = "01-01-2019 00:00:00";
        boolean isValid = DateTools.isValidDate(dateString, "MM-dd-yyyy HH:mm:ss");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString9() {
        String dateString = "2019 00:00:00";
        boolean isValid = DateTools.isValidDate(dateString, "yyyy HH:mm:ss");
        assertTrue(isValid);
    }

    @Test
    void testIsValidDateString10() {
        String dateString = "2019-01-01 00:00:00";
        boolean isValid = DateTools.isValidDate(dateString, "yyyy-MM-dd HH:mm:ss");
        assertTrue(isValid);
    }
}

// DateTools_4