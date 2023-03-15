// Functions_19Test.java
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
* It contains ten unit test cases for the {@link Functions#orderWords(String, String)} method.
*/
class Functions_19Test {

		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is null.
		 */
		@Test
		void testOrderWords_01() {
				String input = null;
				String separator = " ";
				String expected = null;
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is empty.
		 */
		@Test
		void testOrderWords_02() {
				String input = "";
				String separator = " ";
				String expected = "";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is equal to the separator.
		 */
		@Test
		void testOrderWords_03() {
				String input = " ";
				String separator = " ";
				String expected = null;
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains only one word.
		 */
		@Test
		void testOrderWords_04() {
				String input = "word";
				String separator = " ";
				String expected = "word";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words.
		 */
		@Test
		void testOrderWords_05() {
				String input = "word1 word2";
				String separator = " ";
				String expected = "word1 word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words and the separator is a comma.
		 */
		@Test
		void testOrderWords_06() {
				String input = "word1,word2";
				String separator = ",";
				String expected = "word1,word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words and the separator is a comma.
		 */
		@Test
		void testOrderWords_07() {
				String input = "word1,word2";
				String separator = ",";
				String expected = "word1,word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words and the separator is a comma.
		 */
		@Test
		void testOrderWords_08() {
				String input = "word1,word2";
				String separator = ",";
				String expected = "word1,word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words and the separator is a comma.
		 */
		@Test
		void testOrderWords_09() {
				String input = "word1,word2";
				String separator = ",";
				String expected = "word1,word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string contains two words and the separator is a comma.
		 */
		@Test
		void testOrderWords_10() {
				String input = "word1,word2";
				String separator = ",";
				String expected = "word1,word2";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
}

// Functions_20Test.java
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
* It contains ten unit test cases for the {@link Functions#orderWords(String, String)} method.
*/
class Functions_20Test {
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is null.
		 */
		@Test
		void testOrderWords_01() {
				String input = null;
				String separator = " ";
				String expected = null;
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is empty.
		 */
		@Test
		void testOrderWords_02() {
				String input = "";
				String separator = " ";
				String expected = "";
				String actual = Functions.orderWords(input, separator);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#orderWords(String, String)} method.
		 * It tests the case when the input string is equal to the separator.
		 */
		@Test
		void testOrderWords_03() {
				String input = " ";
				String separator = " ";
				String expected = null;
				String actual = Functions.orderWords(input, separator);
	