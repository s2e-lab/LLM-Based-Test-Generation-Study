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
    * Test method for {@link HSSFDataFormat#getFormat(String)}.
    */
    @Test
    void testGetFormat() {
        HSSFDataFormat dataFormat = new HSSFDataFormat();
        assertEquals(0, dataFormat.getFormat("General"));
        assertEquals(1, dataFormat.getFormat("0"));
        assertEquals(2, dataFormat.getFormat("0.00"));
        assertEquals(3, dataFormat.getFormat("#,##0"));
        assertEquals(4, dataFormat.getFormat("#,##0.00"));
        assertEquals(5, dataFormat.getFormat("($#,##0_);($#,##0)"));
        assertEquals(6, dataFormat.getFormat("($#,##0_);[Red]($#,##0)"));
        assertEquals(7, dataFormat.getFormat("($#,##0.00_);($#,##0.00)"));
        assertEquals(8, dataFormat.getFormat("($#,##0.00_);[Red]($#,##0.00)"));
        assertEquals(9, dataFormat.getFormat("0%"));
        assertEquals(10, dataFormat.getFormat("0.00%"));
        assertEquals(11, dataFormat.getFormat("0.00E+00"));
        assertEquals(12, dataFormat.getFormat("# ?/?"));
        assertEquals(13, dataFormat.getFormat("# ??/??"));
        assertEquals(14, dataFormat.getFormat("m/d/yy"));
        assertEquals(15, dataFormat.getFormat("d-mmm-yy"));
        assertEquals(16, dataFormat.getFormat("d-mmm"));
        assertEquals(17, dataFormat.getFormat("mmm-yy"));
        assertEquals(18, dataFormat.getFormat("h:mm AM/PM"));
        assertEquals(19, dataFormat.getFormat("h:mm:ss AM/PM"));
        assertEquals(20, dataFormat.getFormat("h:mm"));
        assertEquals(21, dataFormat.getFormat("h:mm:ss"));
        assertEquals(22, dataFormat.getFormat("m/d/yy h:mm"));
        assertEquals(23, dataFormat.getFormat("mm:ss"));
        assertEquals(24, dataFormat.getFormat("[h]:mm:ss"));
        assertEquals(25, dataFormat.getFormat("mmss.0"));
        assertEquals(26, dataFormat.getFormat("##0.0E+0"));
        assertEquals(27, dataFormat.getFormat("@"));
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
 * This class is used to format numeric cell values as strings,
 * and to format System data types as strings.
 *
 * @author  <NAME>
 * @author  <NAME> (glens at apache.org)
 * @author  <NAME> (slaubach at apache dot org) (DataFormatter refactor)
 * @author  <NAME> (acoliver at apache dot org)
 * @author  <NAME> (bsanders at risklabs dot com) - custom number formats
 * @author  <NAME> (dsherman at isisph.com)
 * @author  <NAME> (hak at 2mba dot pl)
 * @author  <NAME> (pkrupets at palmtreebusiness dot com)
 * @author  <NAME> (kestrel at burdell dot org)
 * @author  <NAME> (peter at apache dot org)
 * @author  <NAME> (sidney at zeroc dot com) - custom number formats
 * @author  <NAME> (brianwhx at brianwhx dot com) - custom number formats
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix for 44909
 * @author  <NAME> (jean-pierre.paris at gmail dot com) - fix