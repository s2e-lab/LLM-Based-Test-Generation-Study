// StringIncrementorTest3.java
package de.beiri22.stringincrementor;

import de.beiri22.stringincrementor.helper.ExtBoolArray;
import de.beiri22.stringincrementor.helper.IndexedString;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringIncrementor}.
* It contains ten unit test cases for the {@link StringIncrementor#patch(String, RelativeString, boolean)} method.
*/
class StringIncrementorTest3 {

		/**
		* Test case 1.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = false</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch1() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, false);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 2.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = true</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch2() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, true);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 3.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = false</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch3() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, false);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 4.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = true</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch4() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, true);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 5.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = false</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch5() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, false);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 6.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = true</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch6() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, true);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 7.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = false</li>
		* </ul>
		* The expected result is "abcdefghijklmnopqrstuvwxyz".
		*/
		@Test
		void testPatch7() {
				String a = "abcdefghijklmnopqrstuvwxyz";
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 26));
				r.setAbsolute("");
				String result = StringIncrementor.patch(a, r, false);
				assertEquals("abcdefghijklmnopqrstuvwxyz", result);
		}
		
		/**
		* Test case 8.
		* The test case tests the patch method with the following parameters:
		* <ul>
		* <li>a = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>r = "abcdefghijklmnopqrstuvwxyz"</li>
		* <li>verbose = true