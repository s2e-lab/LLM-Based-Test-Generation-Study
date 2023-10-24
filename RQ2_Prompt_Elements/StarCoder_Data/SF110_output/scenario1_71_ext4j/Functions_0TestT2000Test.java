// Functions_0Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_0() {
        Date pDateTime = null;
        String pPattern = null;
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_1() {
        Date pDateTime = new Date();
        String pPattern = null;
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_2() {
        Date pDateTime = new Date();
        String pPattern = "";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_3() {
        Date pDateTime = new Date();
        String pPattern = " ";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_4() {
        Date pDateTime = new Date();
        String pPattern = "  ";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_5() {
        Date pDateTime = new Date();
        String pPattern = "yyyy";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_6() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_7() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_8() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_9() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_10() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd ";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_11() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_12() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_13() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_14() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_15() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_16() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_17() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_18() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_19() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_20() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_21() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSSSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_22() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSSSSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_23() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSSSSSS";
        String oResult = Functions.dateFormat(pDateTime, pPattern);
        assertEquals("", oResult);
    }

    /**
    * Test case for the {@link Functions#dateFormat(Date, String)} method.
    */
    @Test
    void testDateFormat_24() {
        Date pDateTime = new Date();
        String pPattern = "yyyy-MM-dd HH:mm:ss.SSSSSSSSS";
        String oResult = Functions.dateFormat(pDateTime,