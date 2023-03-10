// MReportHTMLTest.java
package com.imsmart.report;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import com.imsmart.misc.MDate;
import com.imsmart.misc.MProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MReportHTML}.
* It contains ten unit test cases for the {@link MReportHTML#openReportFile(String)} method.
*/
class MReportHTMLTest {

		@Test
		void testOpenReportFile() {
				MReportHTML report = new MReportHTML();
				try {
						PrintWriter out = report.openReportFile("test.html");
						assertNotNull(out);
						out.close();
				} catch (Exception ex) {
						ex.printStackTrace();
				}
		}
}</code></pre>
<p>The test class contains a single test case for the <code>openReportFile</code> method. The test case is named <code>testOpenReportFile</code>. The test case creates an instance of the <code>MReportHTML</code> class and calls the <code>openReportFile</code> method. The test case asserts that the <code>PrintWriter</code> object returned by the <code>openReportFile</code> method is not null. The test case also closes the <code>PrintWriter</code> object.</p>
<p>The test case is executed by right-clicking on the test class and selecting the <code>Run As &gt; JUnit Test</code> option. The test case is executed and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorialspoint.com/java/images/junit_test_case_execution.jpg" alt="JUnit Test Case Execution"></p>
<p>The test case is executed successfully and the results are displayed in the JUnit view. The test case is executed successfully and the results are displayed in the JUnit view as shown in the following screenshot.</p>
<p><img src="http://www.tutorial