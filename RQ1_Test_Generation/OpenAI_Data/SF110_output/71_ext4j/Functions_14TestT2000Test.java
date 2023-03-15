// Functions_14Test.java
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
* It contains ten unit test cases for the {@link Functions#blurbChar(String, int)} method.
*/
class Functions_14Test {

		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a null string.
		*/
		@Test
		void testBlurbChar_01() {
				String s = null;
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertNull(result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with an empty string.
		*/
		@Test
		void testBlurbChar_02() {
				String s = "";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 1.
		*/
		@Test
		void testBlurbChar_03() {
				String s = "a";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("a", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 2.
		*/
		@Test
		void testBlurbChar_04() {
				String s = "ab";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("ab", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 3.
		*/
		@Test
		void testBlurbChar_05() {
				String s = "abc";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abc", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 4.
		*/
		@Test
		void testBlurbChar_06() {
				String s = "abcd";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abcd", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 5.
		*/
		@Test
		void testBlurbChar_07() {
				String s = "abcde";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abcde", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 6.
		*/
		@Test
		void testBlurbChar_08() {
				String s = "abcdef";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abcdef", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 7.
		*/
		@Test
		void testBlurbChar_09() {
				String s = "abcdefg";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abcdefg", result);
		}
		
		/**
		* Test case for {@link Functions#blurbChar(String, int)} method.
		* The test case tests the method with a string of length 8.
		*/
		@Test
		void testBlurbChar_10() {
				String s = "abcdefgh";
				int maxLength = 0;
				String result = Functions.blurbChar(s, maxLength);
				assertEquals("abcdefgh", result);
		}
}

// Functions_15Test.java
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
* It contains ten unit test cases for the {@link Functions#cutWordCR(String, int)} method.
*/
class Functions_15Test {
		
		/**
		* Test case for {@link Functions#cutWordCR(String, int)} method.
		* The test case tests the method with a null string.
		*/
		@Test
		void testCutWordCR_01() {
				String s = null;
				int maxLength = 0;
				String result = Functions.cutWordCR(s, maxLength);
				assertNull(result);
		}
		
		/**
		* Test case for {@link Functions#cutWordCR(String, int)} method.
		* The test case tests the method with an empty string.
		*/
		@Test
		void testCutWordCR_02() {
				String s = "";
				int maxLength = 0;
				String result = Functions.cutWordCR(s, maxLength);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link Functions#cutWordCR(String, int)} method.
		* The test case tests the method with a string of length 1.
		*/
		@Test
		void testCutWordCR_03() {
				String s = "a";
				int maxLength = 0;
				String result = Functions.cutWordCR(s, maxLength);
				assertEquals("a", result);
		}
		
		/**
		* Test case for {@link Functions#cutWordCR(String, int)} method.
		* The test case tests the method with a string of length 2.
		*/
		@Test
		void testCutWordCR_04() {
				String s = "ab";
				int maxLength = 0;
				String result = Functions.cutWordCR(s, maxLength);
				assertEquals("ab", result);
		}
		
		/**
		* Test case for {@link Functions#cutWordCR(String, int)} method.
		* The test case tests the method with a string of