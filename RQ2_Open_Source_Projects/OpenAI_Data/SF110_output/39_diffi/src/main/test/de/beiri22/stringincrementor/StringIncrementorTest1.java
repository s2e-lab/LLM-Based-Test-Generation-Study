// StringIncrementorTest1.java
package de.beiri22.stringincrementor;

import de.beiri22.stringincrementor.helper.ExtBoolArray;
import de.beiri22.stringincrementor.helper.IndexedString;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringIncrementor}.
* It contains ten unit test cases for the {@link StringIncrementor#diff(String, String, boolean)} method.
*/
class StringIncrementorTest1 {

		/**
		* Test case 1.
		* The test case tests the diff method with two equal strings.
		*/
		@Test
		void testDiff1() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(0, r.linksCount());
				assertEquals(a, r.getAbsolute());
		}
		
		/**
		* Test case 2.
		* The test case tests the diff method with two strings, where the second string is a substring of the first string.
		*/
		@Test
		void testDiff2() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				String b = "abcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(1, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 3.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string.
		*/
		@Test
		void testDiff3() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(1, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 4.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff4() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(2, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals(new StringLink(0, 25, 25), r.getLink(1));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 5.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff5() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(2, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals(new StringLink(0, 25, 25), r.getLink(1));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 6.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff6() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(3, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals(new StringLink(0, 25, 25), r.getLink(1));
				assertEquals(new StringLink(0, 50, 25), r.getLink(2));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 7.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff7() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(3, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals(new StringLink(0, 25, 25), r.getLink(1));
				assertEquals(new StringLink(0, 50, 25), r.getLink(2));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 8.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff8() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy";
				RelativeString r = StringIncrementor.diff(a, b);
				assertEquals(4, r.linksCount());
				assertEquals(new StringLink(0, 0, 25), r.getLink(0));
				assertEquals(new StringLink(0, 25, 25), r.getLink(1));
				assertEquals(new StringLink(0, 50, 25), r.getLink(2));
				assertEquals(new StringLink(0, 75, 25), r.getLink(3));
				assertEquals("z", r.getAbsolute());
		}
		
		/**
		* Test case 9.
		* The test case tests the diff method with two strings, where the first string is a substring of the second string and the second string contains a substring of the first string.
		*/
		@Test
		void testDiff9() {
				String a = "abcdefghijklmnopqrstuvwxy";
				String b = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef