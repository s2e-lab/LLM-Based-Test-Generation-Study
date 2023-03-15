// Functions_17Test.java
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
* It contains ten unit test cases for the {@link Functions#replaceCRWithBR(String)} method.
*/
class Functions_17Test {

		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string is null.
		 */
		@Test
		void testReplaceCRWithBR_01() {
				String input = null;
				String expected = null;
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string is empty.
		 */
		@Test
		void testReplaceCRWithBR_02() {
				String input = "";
				String expected = "";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_03() {
				String input = "This is a test string.";
				String expected = "This is a test string.";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_04() {
				String input = "This is a test string.\n";
				String expected = "This is a test string.<br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_05() {
				String input = "This is a test string.\r\n";
				String expected = "This is a test string.<br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_06() {
				String input = "This is a test string.\n\r";
				String expected = "This is a test string.<br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_07() {
				String input = "This is a test string.\r";
				String expected = "This is a test string.<br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_08() {
				String input = "This is a test string.\n\r\n";
				String expected = "This is a test string.<br /><br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_09() {
				String input = "This is a test string.\r\n\r";
				String expected = "This is a test string.<br /><br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_10() {
				String input = "This is a test string.\n\r\n\r";
				String expected = "This is a test string.<br /><br /><br />";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
}

// Functions_18Test.java
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
* It contains ten unit test cases for the {@link Functions#replaceCRWithBR(String)} method.
*/
class Functions_18Test {
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string is null.
		 */
		@Test
		void testReplaceCRWithBR_01() {
				String input = null;
				String expected = null;
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string is empty.
		 */
		@Test
		void testReplaceCRWithBR_02() {
				String input = "";
				String expected = "";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line.
		 */
		@Test
		void testReplaceCRWithBR_03() {
				String input = "This is a test string.";
				String expected = "This is a test string.";
				String actual = Functions.replaceCRWithBR(input);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#replaceCRWithBR(String)} method.
		 * It tests the case when the input string contains only one line