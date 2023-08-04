// HSSFDataFormatTest.java
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
class HSSFDataFormatTest {

    /**
     * Test of getFormat method, of class HSSFDataFormat.
     */
    @Test
    void testGetFormat() {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFDataFormat instance = new HSSFDataFormat(workbook);
        short expResult = 0;
        short result = instance.getFormat("General");
        assertEquals(expResult, result);
        expResult = 0x0;
        result = instance.getFormat("0");
        assertEquals(expResult, result);
        expResult = 0x1;
        result = instance.getFormat("0.00");
        assertEquals(expResult, result);
        expResult = 0x2;
        result = instance.getFormat("#,##0");
        assertEquals(expResult, result);
        expResult = 0x3;
        result = instance.getFormat("#,##0.00");
        assertEquals(expResult, result);
        expResult = 0x4;
        result = instance.getFormat("($#,##0_);($#,##0)");
        assertEquals(expResult, result);
        expResult = 0x5;
        result = instance.getFormat("($#,##0_);[Red]($#,##0)");
        assertEquals(expResult, result);
        expResult = 0x6;
        result = instance.getFormat("($#,##0.00_);($#,##0.00)");
        assertEquals(expResult, result);
        expResult = 0x7;
        result = instance.getFormat("($#,##0.00_);[Red]($#,##0.00)");
        assertEquals(expResult, result);
        expResult = 0x8;
        result = instance.getFormat("0%");
        assertEquals(expResult, result);
        expResult = 0x9;
        result = instance.getFormat("0.00%");
        assertEquals(expResult, result);
        expResult = 0xa;
        result = instance.getFormat("0.00E+00");
        assertEquals(expResult, result);
        expResult = 0xb;
        result = instance.getFormat("# ?/?");
        assertEquals(expResult, result);
        expResult = 0xc;
        result = instance.getFormat("# ??/??");
        assertEquals(expResult, result);
        expResult = 0xd;
        result = instance.getFormat("m/d/yy");
        assertEquals(expResult, result);
        expResult = 0xe;
        result = instance.getFormat("d-mmm-yy");
        assertEquals(expResult, result);
        expResult = 0xf;
        result = instance.getFormat("d-mmm");
        assertEquals(expResult, result);
        expResult = 0x10;
        result = instance.getFormat("mmm-yy");
        assertEquals(expResult, result);
        expResult = 0x11;
        result = instance.getFormat("h:mm AM/PM");
        assertEquals(expResult, result);
        expResult = 0x12;
        result = instance.getFormat("h:mm:ss AM/PM");
        assertEquals(expResult, result);
        expResult = 0x13;
        result = instance.getFormat("h:mm");
        assertEquals(expResult, result);
        expResult = 0x14;
        result = instance.getFormat("h:mm:ss");
        assertEquals(expResult, result);
        expResult = 0x15;
        result = instance.getFormat("m/d/yy h:mm");
        assertEquals(expResult, result);
        expResult = 0x16;
        result = instance.getFormat("mm:ss");
        assertEquals(expResult, result);
        expResult = 0x17;
        result = instance.getFormat("[h]:mm:ss");
        assertEquals(expResult, result);
        expResult = 0x18;
        result = instance.getFormat("mmss.0");
        assertEquals(expResult, result);
        expResult = 0x19;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x1a;
        result = instance.getFormat("@");
        assertEquals(expResult, result);
        expResult = 0x1b;
        result = instance.getFormat("[h]:mm:ss");
        assertEquals(expResult, result);
        expResult = 0x1c;
        result = instance.getFormat("mm:ss.0");
        assertEquals(expResult, result);
        expResult = 0x1d;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x1e;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x1f;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x20;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x21;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x22;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x23;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x24;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x25;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x26;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x27;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x28;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x29;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2a;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2b;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2c;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2d;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2e;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x2f;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x30;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x31;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x32;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x33;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x34;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x35;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x36;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x37;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x38;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 0x39;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        exp