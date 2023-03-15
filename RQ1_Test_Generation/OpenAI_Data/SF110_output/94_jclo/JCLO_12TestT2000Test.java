// JCLO_12Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getChars(String)} method.
*/
class JCLO_12Test {

		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetChars_ValidKey() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertEquals('a', jclo.getChars("c"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with an invalid key.
		*/
		@Test
		void testGetChars_InvalidKey() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("d"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("a"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar2() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("b"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar3() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("d"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar4() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("e"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar5() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("f"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar6() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("g"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar7() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("h"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar8() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("i"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar9() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("j"));
		}
		
		/**
		* Test case for {@link JCLO#getChars(String)} method.
		* It tests the method with a key that is not a char.
		*/
		@Test
		void testGetChars_KeyNotChar10() {
				JCLO_12 jclo = new JCLO_12();
				jclo.parse(new String[]{"-c", "a"});
				assertThrows(IllegalArgumentException.class, () -> jclo.getChars("k"));
		}
}

// JCLO_12.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* This class is used to parse command-line arguments based on a the
* variables with an object.  Each variable in the class specifies a
* command-line argument that can be accepted; the name of the variable
* becomes the name of the command-line argument.  As Java does not allow
* dashes '-' in variables, use two underscores '__' if you want a dash in
* an argument.  Also, if you want to have a numeric argument (e.g.: '-1'),
* start the variable name with a single underscore.  JCLO uses reflection
* to determine the type of each variable in the passed object and sets the
* values in the object passed to it via parsing the command line.  If you
* include a String array named "additional", all non-dashed arguments will
* be placed in it.
*
* @author		Steve Beaty (