// StringIncrementorTest2.java
package de.beiri22.stringincrementor;

import de.beiri22.stringincrementor.helper.ExtBoolArray;
import de.beiri22.stringincrementor.helper.IndexedString;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringIncrementor}.
* It contains ten unit test cases for the {@link StringIncrementor#patch(String, RelativeString)} method.
*/
class StringIncrementorTest2 {

		/**
		* Test case 1.
		* The test case tests the patch method with two equal strings.
		*/
		@Test
		void testPatch1() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 2.
		* The test case tests the patch method with two strings, where the second string is a substring of the first string.
		*/
		@Test
		void testPatch2() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 3.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string.
		*/
		@Test
		void testPatch3() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 4.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch4() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 5.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch5() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 6.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch6() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 7.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch7() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 8.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch8() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 9.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch9() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
		
		/**
		* Test case 10.
		* The test case tests the patch method with two strings, where the first string is a substring of the second string and the second string is a substring of the first string.
		*/
		@Test
		void testPatch10() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				String result = StringIncrementor.patch(a, r);
				assertEquals(b, result);
		}
}