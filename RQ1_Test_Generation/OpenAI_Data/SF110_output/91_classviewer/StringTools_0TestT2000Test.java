// StringTools_0Test.java
package com.jstevh.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringTools}.
* It contains ten unit test cases for the {@link StringTools#searchStrings(String[], String)} method.
*/
class StringTools_0Test {

		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is null.
		*/
		@Test
		void testSearchStrings_0() {
				String[] strings = null;
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is empty.
		*/
		@Test
		void testSearchStrings_1() {
				String[] strings = new String[0];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string fragment is null.
		*/
		@Test
		void testSearchStrings_2() {
				String[] strings = new String[1];
				String fragment = null;
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string fragment is empty.
		*/
		@Test
		void testSearchStrings_3() {
				String[] strings = new String[1];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains null.
		*/
		@Test
		void testSearchStrings_4() {
				String[] strings = new String[1];
				strings[0] = null;
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains empty string.
		*/
		@Test
		void testSearchStrings_5() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains string that does not contain the given string fragment.
		*/
		@Test
		void testSearchStrings_6() {
				String[] strings = new String[1];
				strings[0] = "abc";
				String fragment = "def";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains string that contains the given string fragment.
		*/
		@Test
		void testSearchStrings_7() {
				String[] strings = new String[1];
				strings[0] = "abc";
				String fragment = "a";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertEquals(1, result.length);
				assertEquals("abc", result[0]);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains string that contains the given string fragment.
		*/
		@Test
		void testSearchStrings_8() {
				String[] strings = new String[2];
				strings[0] = "abc";
				strings[1] = "def";
				String fragment = "a";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertEquals(1, result.length);
				assertEquals("abc", result[0]);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array contains string that contains the given string fragment.
		*/
		@Test
		void testSearchStrings_9() {
				String[] strings = new String[2];
				strings[0] = "abc";
				strings[1] = "def";
				String fragment = "d";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertEquals(1, result.length);
				assertEquals("def", result[0]);
		}
		
}

// StringTools_1Test.java
package com.jstevh.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringTools}.
* It contains ten unit test cases for the {@link StringTools#searchStrings(String[], String[], String)} method.
*/
class StringTools_1Test {
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is null.
		*/
		@Test
		void testSearchStrings_0() {
				String[] strings = null;
				String[] index = new String[1];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is empty.
		*/
		@Test
		void testSearchStrings_1() {
				String[] strings = new String[0];
				String[] index = new String[1];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given index string array is null.
		*/
		@Test
		void testSearchStrings_2() {
				String[] strings = new String[1];
				String[] index = null;
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		