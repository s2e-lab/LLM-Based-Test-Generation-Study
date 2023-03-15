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
		 * It tests the case when the input string is null.
		 */
		@Test
		void testCutWordCR_01() {
				String s = null;
				int maxLength = 10;
				String expected = null;
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is empty.
		 */
		@Test
		void testCutWordCR_02() {
				String s = "";
				int maxLength = 10;
				String expected = "";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is shorter than the max length.
		 */
		@Test
		void testCutWordCR_03() {
				String s = "abc";
				int maxLength = 10;
				String expected = "abc";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_04() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = 10;
				String expected = "abcdefghij<br />klmnopqrst<br />uvwxyz";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_05() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = 5;
				String expected = "abcde<br />fghij<br />klmno<br />pqrst<br />uvwxy<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_06() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = 1;
				String expected = "a<br />b<br />c<br />d<br />e<br />f<br />g<br />h<br />i<br />j<br />k<br />l<br />m<br />n<br />o<br />p<br />q<br />r<br />s<br />t<br />u<br />v<br />w<br />x<br />y<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_07() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = 0;
				String expected = "a<br />b<br />c<br />d<br />e<br />f<br />g<br />h<br />i<br />j<br />k<br />l<br />m<br />n<br />o<br />p<br />q<br />r<br />s<br />t<br />u<br />v<br />w<br />x<br />y<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_08() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = -1;
				String expected = "a<br />b<br />c<br />d<br />e<br />f<br />g<br />h<br />i<br />j<br />k<br />l<br />m<br />n<br />o<br />p<br />q<br />r<br />s<br />t<br />u<br />v<br />w<br />x<br />y<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_09() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = -10;
				String expected = "a<br />b<br />c<br />d<br />e<br />f<br />g<br />h<br />i<br />j<br />k<br />l<br />m<br />n<br />o<br />p<br />q<br />r<br />s<br />t<br />u<br />v<br />w<br />x<br />y<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link Functions#cutWordCR(String, int)} method.
		 * It tests the case when the input string is longer than the max length.
		 */
		@Test
		void testCutWordCR_10() {
				String s = "abcdefghijklmnopqrstuvwxyz";
				int maxLength = -100;
				String expected = "a<br />b<br />c<br />d<br />e<br />f<br />g<br />h<br />i<br />j<br />k<br />l<br />m<br />n<br />o<br />p<br />q<br />r<br />s<br />t<br />u<br />v<br />w<br />x<br />y<br />z";
				String actual = Functions.cutWordCR(s, maxLength);
				assertEquals(