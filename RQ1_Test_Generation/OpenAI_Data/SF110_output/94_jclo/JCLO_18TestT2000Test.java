// JCLO_18Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getStrings(String)} method.
*/
class JCLO_18Test {

		/**
		* Test case for {@link JCLO#getStrings(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetStrings_ValidKey() {
				JCLO jclo = new JCLO(new JCLO_18Test_Object());
				jclo.parse(new String[]{"-s", "a", "-s", "b", "-s", "c"});
				String[] expected = {"a", "b", "c"};
				String[] actual = jclo.getStrings("s");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getStrings(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetStrings_ValidKey_2() {
				JCLO jclo = new JCLO(new JCLO_18Test_Object());
				jclo.parse(new String[]{"-s", "a", "-s", "b", "-s", "c", "-s", "d", "-s", "e", "-s", "f"});
				String[] expected = {"a", "b", "c", "d", "e", "f"};
				String[] actual = jclo.getStrings("s");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getStrings(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetStrings_ValidKey_3() {
				JCLO jclo = new JCLO(new JCLO_18Test_Object());
				jclo.parse(new String[]{"-s", "a", "-s", "b", "-s", "c", "-s", "d", "-s", "e", "-s", "f", "-s", "g", "-s", "h", "-s", "i", "-s", "j", "-s", "k", "-s", "l", "-s", "m", "-s", "n", "-s", "o", "-s", "p", "-s", "q", "-s", "r", "-s", "s", "-s", "t", "-s", "u", "-s", "v", "-s", "w", "-s", "x", "-s", "y", "-s", "z"});
				String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
				String[] actual = jclo.getStrings("s");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getStrings(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetStrings_ValidKey_4() {
				JCLO jclo = new JCLO(new JCLO_18Test_Object());
				jclo.parse(new String[]{"-s", "a", "-s", "b", "-s", "c", "-s", "d", "-s", "e", "-s", "f", "-s", "g", "-s", "h", "-s", "i", "-s", "j", "-s", "k", "-s", "l", "-s", "m", "-s", "n", "-s", "o", "-s", "p", "-s", "q", "-s", "r", "-s", "s", "-s", "t", "-s", "u", "-s", "v", "-s", "w", "-s", "x", "-s", "y", "-s", "z", "-s", "A", "-s", "B", "-s", "C", "-s", "D", "-s", "E", "-s", "F", "-s", "G", "-s", "H", "-s", "I", "-s", "J", "-s", "K", "-s", "L", "-s", "M", "-s", "N", "-s", "O", "-s", "P", "-s", "Q", "-s", "R", "-s", "S", "-s", "T", "-s", "U", "-s", "V", "-s", "W", "-s", "X", "-s", "Y", "-s", "Z"});
				String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
				String[] actual = jclo.getStrings("s");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getStrings(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetStrings_ValidKey_5() {
				JCLO jclo = new JCLO(new JCLO_18Test_Object());
				jclo.parse(new String[]{"-s", "a", "-s", "b", "-s", "c", "-s", "d", "-s", "e", "-s", "f", "-s", "g", "-s", "h", "-s", "i", "-s", "j", "-s", "k", "-s", "l", "-s", "m", "-s", "n", "-s", "o", "-s", "p", "-s", "q", "-s", "r", "-s", "s", "-s", "t", "-s", "u", "-s", "v", "-s", "w", "-s", "x", "-s", "y", "-s", "z", "-s", "A", "-s", "B", "-s", "C", "-s", "D", "-s", "E", "-s", "F", "-s", "G", "-s", "H", "-s", "I", "-s", "J", "-s", "K", "-s", "L", "-s", "M", "-s", "N", "-s", "O", "-s", "P", "-s", "Q", "-s", "R", "-s", "S", "-s", "T", "-s", "U", "-s", "V", "-s", "W", "-s", "X", "-s", "Y", "-s", "Z", "-s", "0", "-s", "1", "-s", "2", "-s", "3", "-s", "4", "-s", "5", "-s", "6", "-s", "7", "-s", "8", "-s", "9"});
				String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",