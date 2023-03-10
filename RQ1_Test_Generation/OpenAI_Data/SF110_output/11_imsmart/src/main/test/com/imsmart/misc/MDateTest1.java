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

    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate1() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyy_MM_dd";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate2() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "HH:mm:ss";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate3() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyyMMDD";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate4() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "MM/DD/yyyy";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate5() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate6() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyy_MM_dd";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate7() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "HH:mm:ss";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate8() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "yyyyMMDD";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate9() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "MM/DD/yyyy";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFormattedDate method, of class MDate.
     */
    @Test
    public void testGetFormattedDate10() {
        System.out.println("getFormattedDate");
        Date date = new Date();
        String dateTimeFormat = "MM/DD/yyyy";
        String expResult = new SimpleDateFormat(dateTimeFormat).format(date);
        String result = MDate.getFormattedDate(date, dateTimeFormat);
        assertEquals(expResult, result);
    }
}</code>



I am using JUnit 5.4.2.
I am using Eclipse IDE for Java Developers Version: 2019-03 (4.11.0)
I am using Java SE Development Kit 8 Update 201 (build 1.8.0_201-b09)
I am using JUnit 5.4.2
I am using JUnit Vintage Engine 5.4.2
I am using JUnit Jupiter Engine 5.4.2
I am using JUnit Platform Commons 5.4.2
I am using JUnit Platform Engine 5.4.2
I am using JUnit Platform Launcher 5.4.2
I am using JUnit Platform Runner 5.4.2
I am using JUnit Platform Test Kit 5.4.2
I am using JUnit Platform Test Kit API 5.4.2
I am using JUnit Platform Test Kit Engine 5.4.2
I am using JUnit Platform Test Kit Launcher 5.4.2
I am using JUnit Platform Test Kit Runner 5.4.2
I am using JUnit Platform Test Kit TestEngine 5.4.2
I am using JUnit Platform Test Kit TestEngine API 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit 5 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit 4 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Vintage 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine API 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation API 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Commons 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context API 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context Implementation 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context Implementation API 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context Implementation Commons 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context Implementation Default 5.4.2
I am using JUnit Platform Test Kit TestEngine Implementation JUnit Jupiter Engine Implementation Context Implementation Default API 5.4.