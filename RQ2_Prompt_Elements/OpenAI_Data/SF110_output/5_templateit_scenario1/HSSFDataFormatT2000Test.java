// HSSFDataFormatTest.java
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
	 * Test case for {@link HSSFDataFormat#getFormat(String)}
	 * 
	 * @author Andrew C. Oliver (acoliver at apache dot org)
	 */
	@Test
	public void testGetFormat() {
		HSSFDataFormat format = new HSSFDataFormat(new Workbook());
		assertEquals(0, format.getFormat("General"));
		assertEquals(1, format.getFormat("0"));
		assertEquals(2, format.getFormat("0.00"));
		assertEquals(3, format.getFormat("#,##0"));
		assertEquals(4, format.getFormat("#,##0.00"));
		assertEquals(9, format.getFormat("0%"));
		assertEquals(10, format.getFormat("0.00%"));
		assertEquals(11, format.getFormat("0.00E+00"));
		assertEquals(14, format.getFormat("mm-dd-yy"));
		assertEquals(15, format.getFormat("d-mmm-yy"));
		assertEquals(16, format.getFormat("d-mmm"));
		assertEquals(17, format.getFormat("mmm-yy"));
		assertEquals(18, format.getFormat("h:mm AM/PM"));
		assertEquals(19, format.getFormat("h:mm:ss AM/PM"));
		assertEquals(20, format.getFormat("h:mm"));
		assertEquals(21, format.getFormat("h:mm:ss"));
		assertEquals(22, format.getFormat("m/d/yy h:mm"));
		assertEquals(37, format.getFormat("#,##0 ;(#,##0)"));
		assertEquals(38, format.getFormat("#,##0 ;[Red](#,##0)"));
		assertEquals(39, format.getFormat("#,##0.00;(#,##0.00)"));
		assertEquals(40, format.getFormat("#,##0.00;[Red](#,##0.00)"));
		assertEquals(45, format.getFormat("mm:ss"));
		assertEquals(46, format.getFormat("[h]:mm:ss"));
		assertEquals(47, format.getFormat("mmss.0"));
		assertEquals(48, format.getFormat("##0.0E+0"));
		assertEquals(49, format.getFormat("@"));
		assertEquals(27, format.getFormat("#,##0.00_);(#,##0.00)"));
		assertEquals(26, format.getFormat("#,##0.00_);[Red](#,##0.00)"));
		assertEquals(50, format.getFormat("mm:ss.0"));
		assertEquals(51, format.getFormat("##0.0E+0"));
		assertEquals(52, format.getFormat("@"));
		assertEquals(0, format.getFormat("General"));
		assertEquals(1, format.getFormat("0"));
		assertEquals(2, format.getFormat("0.00"));
		assertEquals(3, format.getFormat("#,##0"));
		assertEquals(4, format.getFormat("#,##0.00"));
		assertEquals(9, format.getFormat("0%"));
		assertEquals(10, format.getFormat("0.00%"));
		assertEquals(11, format.getFormat("0.00E+00"));
		assertEquals(14, format.getFormat("mm-dd-yy"));
		assertEquals(15, format.getFormat("d-mmm-yy"));
		assertEquals(16, format.getFormat("d-mmm"));
		assertEquals(17, format.getFormat("mmm-yy"));
		assertEquals(18, format.getFormat("h:mm AM/PM"));
		assertEquals(19, format.getFormat("h:mm:ss AM/PM"));
		assertEquals(20, format.getFormat("h:mm"));
		assertEquals(21, format.getFormat("h:mm:ss"));
		assertEquals(22, format.getFormat("m/d/yy h:mm"));
		assertEquals(37, format.getFormat("#,##0 ;(#,##0)"));
		assertEquals(38, format.getFormat("#,##0 ;[Red](#,##0)"));
		assertEquals(39, format.getFormat("#,##0.00;(#,##0.00)"));
		assertEquals(40, format.getFormat("#,##0.00;[Red](#,##0.00)"));
		assertEquals(45, format.getFormat("mm:ss"));
		assertEquals(46, format.getFormat("[h]:mm:ss"));
		assertEquals(47, format.getFormat("mmss.0"));
		assertEquals(48, format.getFormat("##0.0E+0"));
		assertEquals(49, format.getFormat("@"));
		assertEquals(27, format.getFormat("#,##0.00_);(#,##0.00)"));
		assertEquals(26, format.getFormat("#,##0.00_);[Red](#,##0.00)"));
		assertEquals(50, format.getFormat("mm:ss.0"));
		assertEquals(51, format.getFormat("##0.0E+0"));
		assertEquals(52, format.getFormat("@"));
		assertEquals(0, format.getFormat("General"));
		assertEquals(1, format.getFormat("0"));
		assertEquals(2, format.getFormat("0.00"));
		assertEquals(3, format.getFormat("#,##0"));
		assertEquals(4, format.getFormat("#,##0.00"));
		assertEquals(9, format.getFormat("0%"));
		assertEquals(10, format.getFormat("0.00%"));
		assertEquals(11, format.getFormat("0.00E+00"));
		assertEquals(14, format.getFormat("mm-dd-yy"));
		assertEquals(15, format.getFormat("d-mmm-yy"));
		assertEquals(16, format.getFormat("d-mmm"));
		assertEquals(17, format.getFormat("mmm-yy"));
		assertEquals(18, format.getFormat("h:mm AM/PM"));
		assertEquals(19, format.getFormat("h:mm:ss AM/PM"));
		assertEquals(20, format.getFormat("h:mm"));
		assertEquals(21, format.getFormat("h:mm:ss"));
		assertEquals(22, format.getFormat("m/d/yy h:mm"));
		assertEquals(37, format.getFormat("#,##0 ;(#,##0)"));
		assertEquals(38, format.getFormat("#,##0 ;[Red](#,##0)"));
		assertEquals(39, format.getFormat("#,##0.00;(#,##0.00)"));
		assertEquals(40, format.getFormat("#,##0.00;[Red](#,##0.00)"));
		assertEquals(45, format.getFormat("mm:ss"));
		assertEquals(46, format.getFormat("[h]:mm:ss"));
		assertEquals(47, format.getFormat("mmss.0"));
		assertEqu