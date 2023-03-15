// Utils_3Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#pseudoAbsoluteURL(String)} method.
*/
class Utils_3Test {

		/**
		 * Test case 1 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a null value.
		 */
		@Test
		void testPseudoAbsoluteURL_1() {
				assertFalse(Utils.pseudoAbsoluteURL(null));
		}
		
		/**
		 * Test case 2 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with an empty string.
		 */
		@Test
		void testPseudoAbsoluteURL_2() {
				assertFalse(Utils.pseudoAbsoluteURL(""));
		}
		
		/**
		 * Test case 3 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash.
		 */
		@Test
		void testPseudoAbsoluteURL_3() {
				assertTrue(Utils.pseudoAbsoluteURL("/"));
		}
		
		/**
		 * Test case 4 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a letter.
		 */
		@Test
		void testPseudoAbsoluteURL_4() {
				assertTrue(Utils.pseudoAbsoluteURL("/a"));
		}
		
		/**
		 * Test case 5 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a number.
		 */
		@Test
		void testPseudoAbsoluteURL_5() {
				assertTrue(Utils.pseudoAbsoluteURL("/1"));
		}
		
		/**
		 * Test case 6 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a special character.
		 */
		@Test
		void testPseudoAbsoluteURL_6() {
				assertTrue(Utils.pseudoAbsoluteURL("/!"));
		}
		
		/**
		 * Test case 7 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a space.
		 */
		@Test
		void testPseudoAbsoluteURL_7() {
				assertTrue(Utils.pseudoAbsoluteURL("/ "));
		}
		
		/**
		 * Test case 8 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a tab.
		 */
		@Test
		void testPseudoAbsoluteURL_8() {
				assertTrue(Utils.pseudoAbsoluteURL("/\t"));
		}
		
		/**
		 * Test case 9 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a newline.
		 */
		@Test
		void testPseudoAbsoluteURL_9() {
				assertTrue(Utils.pseudoAbsoluteURL("/\n"));
		}
		
		/**
		 * Test case 10 for the {@link Utils#pseudoAbsoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a carriage return.
		 */
		@Test
		void testPseudoAbsoluteURL_10() {
				assertTrue(Utils.pseudoAbsoluteURL("/\r"));
		}
}

// Utils_4Test.java
package nu.staldal.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Utils}.
* It contains ten unit test cases for the {@link Utils#absoluteURL(String)} method.
*/
class Utils_4Test {
		
		/**
		 * Test case 1 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a null value.
		 */
		@Test
		void testAbsoluteURL_1() {
				assertFalse(Utils.absoluteURL(null));
		}
		
		/**
		 * Test case 2 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with an empty string.
		 */
		@Test
		void testAbsoluteURL_2() {
				assertFalse(Utils.absoluteURL(""));
		}
		
		/**
		 * Test case 3 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash.
		 */
		@Test
		void testAbsoluteURL_3() {
				assertFalse(Utils.absoluteURL("/"));
		}
		
		/**
		 * Test case 4 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a letter.
		 */
		@Test
		void testAbsoluteURL_4() {
				assertFalse(Utils.absoluteURL("/a"));
		}
		
		/**
		 * Test case 5 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a number.
		 */
		@Test
		void testAbsoluteURL_5() {
				assertFalse(Utils.absoluteURL("/1"));
		}
		
		/**
		 * Test case 6 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a special character.
		 */
		@Test
		void testAbsoluteURL_6() {
				assertFalse(Utils.absoluteURL("/!"));
		}
		
		/**
		 * Test case 7 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a space.
		 */
		@Test
		void testAbsoluteURL_7() {
				assertFalse(Utils.absoluteURL("/ "));
		}
		
		/**
		 * Test case 8 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a tab.
		 */
		@Test
		void testAbsoluteURL_8() {
				assertFalse(Utils.absoluteURL("/\t"));
		}
		
		/**
		 * Test case 9 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a newline.
		 */
		@Test
		void testAbsoluteURL_9() {
				assertFalse(Utils.absoluteURL("/\n"));
		}
		
		/**
		 * Test case 10 for the {@link Utils#absoluteURL(String)} method.
		 * This test case tests the method with a string that starts with a slash and a carriage return.
		 */
		@Test
	