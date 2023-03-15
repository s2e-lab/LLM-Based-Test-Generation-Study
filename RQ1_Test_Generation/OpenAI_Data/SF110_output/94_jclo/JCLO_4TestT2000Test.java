// JCLO_4Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getChar(String)} method.
*/
class JCLO_4Test {

		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetChar_ValidArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertEquals('a', jclo.getChar("c"));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetChar_InvalidArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar("d"));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetChar_NullArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(NullPointerException.class, () -> jclo.getChar(null));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetChar_EmptyArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar(""));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a blank argument.
		*/
		@Test
		void testGetChar_BlankArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar(" "));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetChar_ValidArgument_2() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertEquals('a', jclo.getChar("c"));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetChar_InvalidArgument_2() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar("d"));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetChar_NullArgument_2() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(NullPointerException.class, () -> jclo.getChar(null));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetChar_EmptyArgument_2() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar(""));
		}
		
		/**
		* Test case for {@link JCLO#getChar(String)} method.
		* It tests the method with a blank argument.
		*/
		@Test
		void testGetChar_BlankArgument_2() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChar(" "));
		}
}

// JCLO_5Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getShort(String)} method.
*/
class JCLO_5Test {
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetShort_ValidArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-s", "1"});
				assertEquals(1, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetShort_InvalidArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-s", "1"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getShort("t"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetShort_NullArgument() {
				JCLO jclo = new JCLO(new TestClass());
				jclo.parse(new String[]{"-s", "1"});
				assertThrows(NullPointerException.class, () -> jclo.getShort(null));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetShort_EmptyArgument() {
				JCLO jclo = new J