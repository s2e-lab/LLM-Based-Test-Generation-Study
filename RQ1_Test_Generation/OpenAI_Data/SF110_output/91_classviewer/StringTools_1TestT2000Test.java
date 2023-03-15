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
		* Test case 1 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is null.
		*/
		@Test
		void testSearchStrings_1() {
				String[] strings = null;
				String[] index = null;
				String fragment = null;
				String[] expected = null;
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is empty.
		*/
		@Test
		void testSearchStrings_2() {
				String[] strings = new String[0];
				String[] index = new String[0];
				String fragment = "";
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is null.
		*/
		@Test
		void testSearchStrings_3() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = null;
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is empty.
		*/
		@Test
		void testSearchStrings_4() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "";
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_5() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "a";
				String[] expected = new String[]{"a"};
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_6() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "b";
				String[] expected = new String[]{"b"};
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_7() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "c";
				String[] expected = new String[]{"c"};
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_8() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "d";
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_9() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "ab";
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link StringTools#searchStrings(String[], String[], String)}.
		* It tests the case where the input array is not empty and the fragment is not empty.
		*/
		@Test
		void testSearchStrings_10() {
				String[] strings = new String[]{"a", "b", "c"};
				String[] index = new String[]{"a", "b", "c"};
				String fragment = "abc";
				String[] expected = new String[0];
				String[] actual = StringTools.searchStrings(strings, index, fragment);
				assertArrayEquals(expected, actual);
		}
}