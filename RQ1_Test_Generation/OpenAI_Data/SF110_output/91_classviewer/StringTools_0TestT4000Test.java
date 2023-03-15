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
				String[] strings = new String[0];
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
				String[] strings = new String[0];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_4() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
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
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_6() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_7() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_8() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_9() {
				String[] strings = new String[1];
				strings[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, fragment);
				assertNull(result);
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
				String[] index = null;
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
				String[] index = new String[0];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string fragment is null.
		*/
		@Test
		void testSearchStrings_2() {
				String[] strings = new String[0];
				String[] index = new String[0];
				String fragment = null;
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string fragment is empty.
		*/
		@Test
		void testSearchStrings_3() {
				String[] strings = new String[0];
				String[] index = new String[0];
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_4() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_5() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_6() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_7() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_8() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#searchStrings(String[], String[], String)} method.
		* It tests the case when the given string array is not empty and the given string fragment is not empty.
		*/
		@Test
		void testSearchStrings_9() {
				String[] strings = new String[1];
				strings[0] = "";
				String[] index = new String[1];
				index[0] = "";
				String fragment = "";
				String[] result = StringTools.searchStrings(strings, index, fragment);
				assertNull(result);
		}
		
}

// StringTools_2Test.java
package com.jstevh.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringTools}.
* It contains ten unit test cases for the {@link StringTools#removeStrings(String, String[])} method.
*/
class StringTools_2Test {
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string is null.
		*/
		@Test
		void testRemoveStrings_0() {
				String in = null;
				String[] strings = null;
				String result = StringTools.removeStrings(in, strings);
				assertNull(result);
		}
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string is empty.
		*/
		@Test
		void testRemoveStrings_1() {
				String in = "";
				String[] strings = new String[0];
				String result = StringTools.removeStrings(in, strings);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string array is null.
		*/
		@Test
		void testRemoveStrings_2() {
				String in = "";
				String[] strings = null;
				String result = StringTools.removeStrings(in, strings);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string array is empty.
		*/
		@Test
		void testRemoveStrings_3() {
				String in = "";
				String[] strings = new String[0];
				String result = StringTools.removeStrings(in, strings);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string is not empty and the given string array is not empty.
		*/
		@Test
		void testRemoveStrings_4() {
				String in = "";
				String[] strings = new String[1];
				strings[0] = "";
				String result = StringTools.removeStrings(in, strings);
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link StringTools#removeStrings(String, String[])} method.
		* It tests the case when the given string is not empty and the given string array is not empty.
		*/
		@Test
		void testRemoveStrings_5() {
				String in = "";
				String[] strings = new String[1];
		