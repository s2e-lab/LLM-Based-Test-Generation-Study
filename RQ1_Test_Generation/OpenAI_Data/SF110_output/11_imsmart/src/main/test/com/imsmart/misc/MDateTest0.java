// MDateTest0.java
package com.imsmart.misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MDate}.
* It contains ten unit test cases for the {@link MDate#now(String)} method.
*/
class MDateTest0 {

    @Test
    void testNow() {
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow1() {
        String dateTimeFormat = "yyyy_MM_dd";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow2() {
        String dateTimeFormat = "HH:mm:ss";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow3() {
        String dateTimeFormat = "yyyyMMDD";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow4() {
        String dateTimeFormat = "MM/DD/yyyy";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow5() {
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow6() {
        String dateTimeFormat = "yyyy_MM_dd";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow7() {
        String dateTimeFormat = "HH:mm:ss";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow8() {
        String dateTimeFormat = "yyyyMMDD";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNow9() {
        String dateTimeFormat = "MM/DD/yyyy";
        String expected = new SimpleDateFormat(dateTimeFormat).format(Calendar.getInstance().getTime());
        String actual = MDate.now(dateTimeFormat);
        assertEquals(expected, actual);
    }
}

// MDateTest1.java
package com.imsmart.misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MDate}.
* It contains ten unit test cases for the {@link MDate#getFormattedDate(Date, String)} method.
*/
class MDateTest1 {
		
    @Test
    void testGetFormattedDate() {
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate1() {
        String dateTimeFormat = "yyyy_MM_dd";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate2() {
        String dateTimeFormat = "HH:mm:ss";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate3() {
        String dateTimeFormat = "yyyyMMDD";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate4() {
        String dateTimeFormat = "MM/DD/yyyy";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate5() {
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate6() {
        String dateTimeFormat = "yyyy_MM_dd";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate7() {
        String dateTimeFormat = "HH:mm:ss";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate8() {
        String dateTimeFormat = "yyyyMMDD";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetFormattedDate9() {
        String dateTimeFormat = "MM/DD/yyyy";
        Date date = Calendar.getInstance().getTime();
        String expected = new SimpleDateFormat(dateTimeFormat).format(date);
        String actual = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expected, actual);
    }
}

// MDateTest2.java
package com.imsmart.misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MDate}.
* It contains ten unit test cases for the {@link MDate#parseDate(String, String)} method.
*/
class MDateTest2 {
		
    @Test
    void testParseDate() throws Exception {
        String dateTimeFormat =