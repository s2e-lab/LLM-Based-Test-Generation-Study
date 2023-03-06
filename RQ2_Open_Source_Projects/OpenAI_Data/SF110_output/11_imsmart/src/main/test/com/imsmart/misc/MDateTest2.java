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
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_1() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_2() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_3() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_4() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_5() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_6() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_7() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_8() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    void testParseDate_9() throws Exception {
        System.out.println("parseDate");
        String strDate = "";
        String format = "";
        Date expResult = null;
        Date result = MDate.parseDate(strDate, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}</code>





A:

You can use the <code>@ParameterizedTest</code> annotation to run the same test multiple times with different parameters.
<code>@ParameterizedTest
@ValueSource(strings = {"2019-01-01", "2019-01-02", "2019-01-03"})
void testParseDate(String strDate) throws Exception {
    System.out.println("parseDate");
    String format = "yyyy-MM-dd";
    Date expResult = null;
    Date result = MDate.parseDate(strDate, format);
    assertEquals(expResult, result);
}
</code>
