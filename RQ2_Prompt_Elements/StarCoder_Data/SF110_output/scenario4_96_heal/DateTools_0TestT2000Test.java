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
        assertEquals(dateString, new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date));
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
        Date date = new Date();
        String dateString = DateTools.format(date, DateTools.DEFAULT_DATE_FORMAT);
        assertNotNull(dateString);
        assertEquals(dateString, new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date));
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
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        Date parsedDate = DateTools.parse(dateString);
        assertNotNull(parsedDate);
        assertEquals(date, parsedDate);
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
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        Date parsedDate = DateTools.parse(dateString, DateTools.DEFAULT_DATE_FORMAT);
        assertNotNull(parsedDate);
        assertEquals(date, parsedDate);
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
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        assertTrue(DateTools.isValidDate(dateString));
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
    void testIsValidDate() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        assertTrue(DateTools.isValidDate(dateString, DateTools.DEFAULT_DATE_FORMAT));
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
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateTools_6Test {
		
    @Test
    void testFormat() {
        Date date = new Date();
        String dateString = DateTools.format(date);
        assertNotNull(dateString);
        assertEquals(dateString, new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date));
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
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_7Test {
		
    @Test
    void testFormat() {
        Date date = new Date();
        String dateString = DateTools.format(date, DateTools.DEFAULT_DATE_FORMAT);
        assertNotNull(dateString);
        assertEquals(dateString, new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date));
    }
}

// DateTools_8Test.java
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
class DateTools_8Test {
		
    @Test
    void testParse() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        Date parsedDate = DateTools.parse(dateString);
        assertNotNull(parsedDate);
        assertEquals(date, parsedDate);
    }
}

// DateTools_9Test.java
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
class DateTools_9Test {
		
    @Test
    void testParse() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        Date parsedDate = DateTools.parse(dateString, DateTools.DEFAULT_DATE_FORMAT);
        assertNotNull(parsedDate);
        assertEquals(date, parsedDate);
    }
}

// DateTools_10Test.java
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
class DateTools_10Test {
		
    @Test
    void testIsValidDate() {
        Date date = new Date();
        String dateString = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).format(date);
        assertTrue(DateTools.isValidDate(dateString));
    }
}

// DateTools_11Test.java
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
class DateTools_11Test {
		
    @Test
    void testIsValid