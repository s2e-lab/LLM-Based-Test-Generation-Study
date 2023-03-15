// JCLO_3Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getByte(String)} method.
*/
class JCLO_3Test {

		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is positive.
		*/
		@Test
		void testGetByte_Positive() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b", "127"});
				assertEquals(127, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is negative.
		*/
		@Test
		void testGetByte_Negative() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b", "-128"});
				assertEquals(-128, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is zero.
		*/
		@Test
		void testGetByte_Zero() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b", "0"});
				assertEquals(0, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is positive and
		* the value is specified using the equals sign.
		*/
		@Test
		void testGetByte_Positive_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b=127"});
				assertEquals(127, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is negative and
		* the value is specified using the equals sign.
		*/
		@Test
		void testGetByte_Negative_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b=-128"});
				assertEquals(-128, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is zero and
		* the value is specified using the equals sign.
		*/
		@Test
		void testGetByte_Zero_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"-b=0"});
				assertEquals(0, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is positive and
		* the value is specified using the double dash.
		*/
		@Test
		void testGetByte_Positive_DoubleDash() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b", "127"});
				assertEquals(127, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is negative and
		* the value is specified using the double dash.
		*/
		@Test
		void testGetByte_Negative_DoubleDash() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b", "-128"});
				assertEquals(-128, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is zero and
		* the value is specified using the double dash.
		*/
		@Test
		void testGetByte_Zero_DoubleDash() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b", "0"});
				assertEquals(0, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is positive and
		* the value is specified using the double dash and the equals sign.
		*/
		@Test
		void testGetByte_Positive_DoubleDash_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b=127"});
				assertEquals(127, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is negative and
		* the value is specified using the double dash and the equals sign.
		*/
		@Test
		void testGetByte_Negative_DoubleDash_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b=-128"});
				assertEquals(-128, jclo.getByte("b"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the case when the value of the byte variable is zero and
		* the value is specified using the double dash and the equals sign.
		*/
		@Test
		void testGetByte_Zero_DoubleDash_Equals() {
				JCLO_3 jclo = new JCLO_3();
				jclo.parse(new String[]{"--b=0"});
				assertEquals(0, jclo.getByte("b"));
		}
}

// JCLO_3.java
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
 * include a String