// HSSFDataFormat_2Test.java
/*
 * HSSFDataFormat.java
 *
 * Created on December 18, 2001, 12:42 PM
 */
package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.FormatRecord;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSSFDataFormat}.
* It contains ten unit test cases for the {@link HSSFDataFormat#getFormat(String)} method.
*/
class HSSFDataFormat_2Test {

    private static List builtinFormats = HSSFDataFormat.getBuiltinFormats();

    private Vector formats = new Vector();

    private Workbook workbook;

    // Flag to see if need to
    private boolean movedBuiltins = false;

    // check the built in list
    // or if the regular list
    // has all entries.
    /**
    * Construncts a new data formatter.  It takes a workbook to have
    * access to the workbooks format records.
    * @param workbook the workbook the formats are tied to.
    */
    public HSSFDataFormat_2Test(Workbook workbook) {
        this.workbook = workbook;
        Iterator i = workbook.getFormats().iterator();
        while (i.hasNext()) {
            FormatRecord r = (FormatRecord) i.next();
            if (formats.size() < r.getIndexCode() + 1) {
                formats.setSize(r.getIndexCode() + 1);
            }
            formats.set(r.getIndexCode(), r.getFormatString());
        }
    }

    /**
    * Test of getFormat method, of class HSSFDataFormat.
    */
    @Test
    void testGetFormat() {
        HSSFDataFormat instance = new HSSFDataFormat(null);
        String expResult = "General";
        String result = instance.getFormat(0);
        assertEquals(expResult, result);
        expResult = "0";
        result = instance.getFormat(1);
        assertEquals(expResult, result);
        expResult = "0.00";
        result = instance.getFormat(2);
        assertEquals(expResult, result);
        expResult = "#,##0";
        result = instance.getFormat(3);
        assertEquals(expResult, result);
        expResult = "#,##0.00";
        result = instance.getFormat(4);
        assertEquals(expResult, result);
        expResult = "$#,##0_);($#,##0)";
        result = instance.getFormat(5);
        assertEquals(expResult, result);
        expResult = "$#,##0_);[Red]($#,##0)";
        result = instance.getFormat(6);
        assertEquals(expResult, result);
        expResult = "$#,##0.00_);($#,##0.00)";
        result = instance.getFormat(7);
        assertEquals(expResult, result);
        expResult = "$#,##0.00_);[Red]($#,##0.00)";
        result = instance.getFormat(8);
        assertEquals(expResult, result);
        expResult = "0%";
        result = instance.getFormat(9);
        assertEquals(expResult, result);
        expResult = "0.00%";
        result = instance.getFormat(0xa);
        assertEquals(expResult, result);
        expResult = "0.00E+00";
        result = instance.getFormat(0xb);
        assertEquals(expResult, result);
        expResult = "# ?/?";
        result = instance.getFormat(0xc);
        assertEquals(expResult, result);
        expResult = "# ??/??";
        result = instance.getFormat(0xd);
        assertEquals(expResult, result);
        expResult = "m/d/yy";
        result = instance.getFormat(0xe);
        assertEquals(expResult, result);
        expResult = "d-mmm-yy";
        result = instance.getFormat(0xf);
        assertEquals(expResult, result);
        expResult = "d-mmm";
        result = instance.getFormat(0x10);
        assertEquals(expResult, result);
        expResult = "mmm-yy";
        result = instance.getFormat(0x11);
        assertEquals(expResult, result);
        expResult = "h:mm AM/PM";
        result = instance.getFormat(0x12);
        assertEquals(expResult, result);
        expResult = "h:mm:ss AM/PM";
        result = instance.getFormat(0x13);
        assertEquals(expResult, result);
        expResult = "h:mm";
        result = instance.getFormat(0x14);
        assertEquals(expResult, result);
        expResult = "h:mm:ss";
        result = instance.getFormat(0x15);
        assertEquals(expResult, result);
        expResult = "m/d/yy h:mm";
        result = instance.getFormat(0x16);
        assertEquals(expResult, result);
        expResult = "(#,##0_);(#,##0)";
        result = instance.getFormat(0x25);
        assertEquals(expResult, result);
        expResult = "(#,##0_);[Red](#,##0)";
        result = instance.getFormat(0x26);
        assertEquals(expResult, result);
        expResult = "(#,##0.00_);(#,##0.00)";
        result = instance.getFormat(0x27);
        assertEquals(expResult, result);
        expResult = "(#,##0.00_);[Red](#,##0.00)";
        result = instance.getFormat(0x28);
        assertEquals(expResult, result);
        expResult = "_(*#,##0_);_(*(#,##0);_(* \"-\"_);_(@_)";
        result = instance.getFormat(0x29);
        assertEquals(expResult, result);
        expResult = "_($*#,##0_);_($*(#,##0);_($* \"-\"_);_(@_)";
        result = instance.getFormat(0x2a);
        assertEquals(expResult, result);
        expResult = "_(*#,##0.00_);_(*(#,##0.00);_(*\"-\"??_);_(@_)";
        result = instance.getFormat(0x2b);
        assertEquals(expResult, result);
        expResult = "_($*#,##0.00_);_($*(#,##0.00);_($*\"-\"??_);_(@_)";
        result = instance.getFormat(0x2c);
        assertEquals(expResult, result);
        expResult = "mm:ss";
        result = instance.getFormat(0x2d);
        assertEquals(expResult, result);
        expResult = "[h]:mm:ss";
        result = instance.getFormat(0x2e);
        assertEquals(expResult, result);
        expResult = "mm:ss.0";
        result = instance.getFormat(0x2f);
        assertEquals(expResult, result);
        expResult = "##0.0E+0";
        result = instance.getFormat(0x30);
        assertEquals(expResult, result);
        expResult = "@";
        result = instance.getFormat(0x31);
        assertEquals(expResult, result);
    }
}
