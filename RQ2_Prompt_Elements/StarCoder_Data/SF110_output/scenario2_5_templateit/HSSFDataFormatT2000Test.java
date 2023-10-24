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
        expResult = 1;
        result = instance.getFormat("0");
        assertEquals(expResult, result);
        expResult = 2;
        result = instance.getFormat("0.00");
        assertEquals(expResult, result);
        expResult = 3;
        result = instance.getFormat("#,##0");
        assertEquals(expResult, result);
        expResult = 4;
        result = instance.getFormat("#,##0.00");
        assertEquals(expResult, result);
        expResult = 5;
        result = instance.getFormat("($#,##0_);($#,##0)");
        assertEquals(expResult, result);
        expResult = 6;
        result = instance.getFormat("($#,##0_);[Red]($#,##0)");
        assertEquals(expResult, result);
        expResult = 7;
        result = instance.getFormat("($#,##0.00_);($#,##0.00)");
        assertEquals(expResult, result);
        expResult = 8;
        result = instance.getFormat("($#,##0.00_);[Red]($#,##0.00)");
        assertEquals(expResult, result);
        expResult = 9;
        result = instance.getFormat("0%");
        assertEquals(expResult, result);
        expResult = 10;
        result = instance.getFormat("0.00%");
        assertEquals(expResult, result);
        expResult = 11;
        result = instance.getFormat("0.00E+00");
        assertEquals(expResult, result);
        expResult = 12;
        result = instance.getFormat("# ?/?");
        assertEquals(expResult, result);
        expResult = 13;
        result = instance.getFormat("# ??/??");
        assertEquals(expResult, result);
        expResult = 14;
        result = instance.getFormat("m/d/yy");
        assertEquals(expResult, result);
        expResult = 15;
        result = instance.getFormat("d-mmm-yy");
        assertEquals(expResult, result);
        expResult = 16;
        result = instance.getFormat("d-mmm");
        assertEquals(expResult, result);
        expResult = 17;
        result = instance.getFormat("mmm-yy");
        assertEquals(expResult, result);
        expResult = 18;
        result = instance.getFormat("h:mm AM/PM");
        assertEquals(expResult, result);
        expResult = 19;
        result = instance.getFormat("h:mm:ss AM/PM");
        assertEquals(expResult, result);
        expResult = 20;
        result = instance.getFormat("h:mm");
        assertEquals(expResult, result);
        expResult = 21;
        result = instance.getFormat("h:mm:ss");
        assertEquals(expResult, result);
        expResult = 22;
        result = instance.getFormat("m/d/yy h:mm");
        assertEquals(expResult, result);
        expResult = 23;
        result = instance.getFormat("#,##0 ;(#,##0)");
        assertEquals(expResult, result);
        expResult = 24;
        result = instance.getFormat("#,##0 ;[Red](#,##0)");
        assertEquals(expResult, result);
        expResult = 25;
        result = instance.getFormat("#,##0.00;(#,##0.00)");
        assertEquals(expResult, result);
        expResult = 26;
        result = instance.getFormat("#,##0.00;[Red](#,##0.00)");
        assertEquals(expResult, result);
        expResult = 27;
        result = instance.getFormat("_(*#,##0_);_(*(#,##0);_(*\"-\"_);_(@_)");
        assertEquals(expResult, result);
        expResult = 28;
        result = instance.getFormat("_($*#,##0_);_($*(#,##0);_($*\"-\"_);_(@_)");
        assertEquals(expResult, result);
        expResult = 29;
        result = instance.getFormat("_(*#,##0.00_);_(*(#,##0.00);_(*\"-\"??_);_(@_)");
        assertEquals(expResult, result);
        expResult = 30;
        result = instance.getFormat("_($*#,##0.00_);_($*(#,##0.00);_($*\"-\"??_);_(@_)");
        assertEquals(expResult, result);
        expResult = 31;
        result = instance.getFormat("mm:ss");
        assertEquals(expResult, result);
        expResult = 32;
        result = instance.getFormat("[h]:mm:ss");
        assertEquals(expResult, result);
        expResult = 33;
        result = instance.getFormat("mm:ss.0");
        assertEquals(expResult, result);
        expResult = 34;
        result = instance.getFormat("##0.0E+0");
        assertEquals(expResult, result);
        expResult = 35;
        result = instance.getFormat("@");
        assertEquals(expResult, result);
    }
}

// HSSFDataFormatter.java
/*
 * HSSFDataFormatter.java
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

/**
 * Formats numeric cell values as strings, and handles
 *  formulas and boolean cells.
 *
 * @author  <NAME> (acoliver at apache dot org)
 * @author  <NAME> (glens at apache.org)
 * @author  <NAME> (slaubach at apache dot org)
 * @author  <NAME> (jheight at chariot dot net dot au)
 * @author  <NAME> (glens at apache.org)
 * @version 2.0-pre
 */
public class HSSFDataFormatter {

    /**
     * Creates new HSSFDataFormatter
     */
    public HSSFDataFormatter() {
    }

    /**
     * Get the format index that matches the given format
     *  string, creating a new format entry if required.
     * Aliases text to the proper format as required.
     *
     * @param format string matching a built in format
     * @return index of format.
     */
    public short getFormat(String format) {
        ListIterator i;
        int ind;
        if (format.toUpperCase().equals("TEXT"))
            format = "@";
        if (!movedBuiltins) {
            i = builtinFormats.listIterator();
            while (i.hasNext()) {
                ind = i.nextIndex();
                if (formats.size() < ind + 1) {
                    formats.setSize(ind + 1);
                }
                formats.set(ind, i.next());
            }
            movedBuiltins = true;
        }
        i = formats.listIterator();
        while (i.hasNext()) {
            ind = i.nextIndex();
            if (format.equals(i.next()))
                return (short) ind;
        }
        ind = workbook.getFormat(format, true);
        if (formats.size() <= ind)
            formats.setSize(ind + 1);
        formats.set(ind, format);
        return (short) ind;
    }
}

// HSSFDataFormatterTest.java
/*
 * HSSFDataFormatter.java
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
* Test class of {@link HSSFDataFormatter}.
* It contains ten unit test cases for