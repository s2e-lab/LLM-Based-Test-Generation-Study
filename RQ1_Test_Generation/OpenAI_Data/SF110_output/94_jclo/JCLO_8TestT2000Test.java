// JCLO_8Test.java
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
class JCLO_8Test {

		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_1() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0"});
				assertEquals(1.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_2() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0"});
				assertEquals(2.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_3() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0"});
				assertEquals(3.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_4() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0"});
				assertEquals(4.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_5() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0"});
				assertEquals(5.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_6() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0"});
				assertEquals(6.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_7() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0", "-d", "7.0"});
				assertEquals(7.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_8() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0", "-d", "7.0", "-d", "8.0"});
				assertEquals(8.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_9() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0", "-d", "7.0", "-d", "8.0", "-d", "9.0"});
				assertEquals(9.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_10() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0", "-d", "7.0", "-d", "8.0", "-d", "9.0", "-d", "10.0"});
				assertEquals(10.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble_11() {
				JCLO jclo = new JCLO(new JCLO_8Test_1());
				jclo.parse(new String[]{"-d", "1.0", "-d", "2.0", "-d", "3.0", "-d", "4.0", "-d", "5.0", "-d", "6.0", "-d", "7.0", "-d", "8.0", "-d", "9.0", "-d", "10.0", "-d", "11.0"});
				assertEquals(11.0, jclo.getDouble("d"));
		}
		
		/**
		* Test case for {@link JCLO#getDouble(String)} method.
		* It tests