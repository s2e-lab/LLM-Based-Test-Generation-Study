// MReportCSVTest.java
package com.imsmart.report;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.imsmart.misc.MDate;
import com.imsmart.misc.MProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MReportCSV}.
* It contains ten unit test cases for the {@link MReportCSV#openReportFile(String)} method.
*/
class MReportCSVTest {

		private MReportCSV report;
		
		public MReportCSVTest() {
			report = new MReportCSV();
		}
		
		@Test
		public void testOpenReportFile() throws Exception {
			String reportFileName = MDate.now(MDate.DATE_ONLY) + ".csv";
			PrintWriter out = report.openReportFile(reportFileName);
			assertNotNull(out);
			report.closeReportFile(out);
		}
		
		@Test
		public void testOpenReportFileWithNullFileName() throws Exception {
			String reportFileName = null;
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithEmptyFileName() throws Exception {
			String reportFileName = "";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName() throws Exception {
			String reportFileName = "invalid.csv";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName2() throws Exception {
			String reportFileName = "invalid.txt";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName3() throws Exception {
			String reportFileName = "invalid.xls";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName4() throws Exception {
			String reportFileName = "invalid.xlsx";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName5() throws Exception {
			String reportFileName = "invalid.doc";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName6() throws Exception {
			String reportFileName = "invalid.docx";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName7() throws Exception {
			String reportFileName = "invalid.pdf";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName8() throws Exception {
			String reportFileName = "invalid.jpg";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName9() throws Exception {
			String reportFileName = "invalid.png";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
		
		@Test
		public void testOpenReportFileWithInvalidFileName10() throws Exception {
			String reportFileName = "invalid.gif";
			assertThrows(Exception.class, () -&gt; {
				report.openReportFile(reportFileName);
			});
		}
}</code>



I am using JUnit 5.
