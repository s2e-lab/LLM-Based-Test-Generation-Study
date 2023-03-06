// IndexedStringTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexedString}.
* It contains ten unit test cases for the {@link IndexedString#indexOf(char[])} method.
*/
class IndexedStringTest {

		/**
		* Test case 1.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf1() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(0, is.indexOf("abc".toCharArray()));
		}
		
		/**
		* Test case 2.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf2() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(1, is.indexOf("bcd".toCharArray()));
		}
		
		/**
		* Test case 3.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf3() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(2, is.indexOf("cde".toCharArray()));
		}
		
		/**
		* Test case 4.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf4() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(3, is.indexOf("def".toCharArray()));
		}
		
		/**
		* Test case 5.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf5() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(4, is.indexOf("efg".toCharArray()));
		}
		
		/**
		* Test case 6.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf6() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(5, is.indexOf("fgh".toCharArray()));
		}
		
		/**
		* Test case 7.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf7() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(6, is.indexOf("ghi".toCharArray()));
		}
		
		/**
		* Test case 8.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf8() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(7, is.indexOf("hij".toCharArray()));
		}
		
		/**
		* Test case 9.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf9() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(8, is.indexOf("ijk".toCharArray()));
		}
		
		/**
		* Test case 10.
		* The test case tests the {@link IndexedString#indexOf(char[])} method with a string
		* that contains the searched string.
		*/
		@Test
		void testIndexOf10() {
				IndexedString is = new IndexedString("abcdefghijklmnopqrstuvwxyz");
				assertEquals(9, is.indexOf("jkl".toCharArray()));
		}
		
}