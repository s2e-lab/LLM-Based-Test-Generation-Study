// JCLO_6Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getInt(String)} method.
*/
class JCLO_6Test {

		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is an integer.
		*/
		@Test
		void testGetInt_1() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "1"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a negative integer.
		*/
		@Test
		void testGetInt_2() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "-1"});
				assertEquals(-1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a float.
		*/
		@Test
		void testGetInt_3() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "1.0"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a negative float.
		*/
		@Test
		void testGetInt_4() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "-1.0"});
				assertEquals(-1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a double.
		*/
		@Test
		void testGetInt_5() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "1.0"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a negative double.
		*/
		@Test
		void testGetInt_6() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "-1.0"});
				assertEquals(-1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a long.
		*/
		@Test
		void testGetInt_7() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "1"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a negative long.
		*/
		@Test
		void testGetInt_8() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "-1"});
				assertEquals(-1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a String.
		*/
		@Test
		void testGetInt_9() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "1"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the case when the value of the variable is a negative String.
		*/
		@Test
		void testGetInt_10() {
				JCLO_6 jclo = new JCLO_6();
				jclo.parse(new String[]{"-i", "-1"});
				assertEquals(-1, jclo.getInt("i"));
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
* It contains ten unit test cases for the {@link JCLO#getDouble(String)} method.
*/
class JCLO_5Test {
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the case when the value of the variable is an integer.
		*/
		@Test
		void testGetDouble_1() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-d", "1"});
				assertEquals(1.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the case when the value of the variable is a negative integer.
		*/
		@Test
		void testGetDouble_2() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-d", "-1"});
				assertEquals(-1.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the case when the value of the variable is a float.
		*/
		@Test
		void testGetDouble_3() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-d", "1.0"});
				assertEquals(1.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the case when the value of the variable is a negative float.
		*/
		@Test
		void testGetDouble_4() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse