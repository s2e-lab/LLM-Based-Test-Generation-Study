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
		* Test case 1 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a null string and a null array.
		*/
		@Test
		void testRemoveStrings_1() {
				StringTools st = new StringTools();
				String in = null;
				String[] strings = null;
				String expected = null;
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_2() {
				StringTools st = new StringTools();
				String in = null;
				String[] strings = {"a", "b", "c"};
				String expected = null;
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a null array.
		*/
		@Test
		void testRemoveStrings_3() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = null;
				String expected = "abc";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_4() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_5() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b"};
				String expected = "c";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_6() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c", "d"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_7() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c", "d", "e"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_8() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c", "d", "e", "f"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_9() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c", "d", "e", "f", "g"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link StringTools#removeStrings(String, String[])}.
		* It tests the method with a non-null string and a non-null array.
		*/
		@Test
		void testRemoveStrings_10() {
				StringTools st = new StringTools();
				String in = "abc";
				String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h"};
				String expected = "";
				String actual = st.removeStrings(in, strings);
				assertEquals(expected, actual);
		}
}</code>





A:

The problem is that you are not using the <code>StringTools</code> class correctly.
You are creating a new instance of <code>StringTools</code> in each test method, but you are not using that instance.
Instead, you are calling the <code>removeStrings</code> method on the <code>StringToolsTest</code> class itself.
You should be calling the <code>removeStrings</code> method on the <code>StringTools</code> instance that you created.
