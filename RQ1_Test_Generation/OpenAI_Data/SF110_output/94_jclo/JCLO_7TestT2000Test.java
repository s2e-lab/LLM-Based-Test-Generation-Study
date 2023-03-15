// JCLO_7Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getFloat(String)} method.
*/
class JCLO_7Test {

		/**
		* Test case 1 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat1() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0"});
				assertEquals(1.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 2 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat2() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1"});
				assertEquals(1.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 3 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat3() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0f"});
				assertEquals(1.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 4 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat4() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0F"});
				assertEquals(1.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 5 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat5() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0e1"});
				assertEquals(10.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 6 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat6() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0E1"});
				assertEquals(10.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 7 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat7() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0e-1"});
				assertEquals(0.1f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 8 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat8() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0E-1"});
				assertEquals(0.1f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 9 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat9() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0e+1"});
				assertEquals(10.0f, jclo.getFloat("float"));
		}
		
		/**
		* Test case 10 for {@link JCLO#getFloat(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloat10() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				jclo.parse(new String[]{"-float", "1.0E+1"});
				assertEquals(10.0f, jclo.getFloat("float"));
		}
}

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
		* Test case 1 for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble1() {
				JCLO jclo = new JCLO(new JCLO_8Test());
				jclo.parse(new String[]{"-double", "1.0"});
				assertEquals(1.0, jclo.getDouble("double"));
		}
		
		/**
		* Test case 2 for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble2() {
				JCLO jclo = new JCLO(new JCLO_8Test());
				jclo.parse(new String[]{"-double", "1"});
				assertEquals(1.0, jclo.getDouble("double"));
		}
		
		/**
		* Test case 3 for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetDouble3() {
				JCLO jclo = new JCLO(new JCLO_8Test());
				jclo.parse(new String[]{"-double", "1.0d"});
				assertEquals(1.0, jclo.getDouble("double"));
		}
		
		/**
		* Test case 4 for {@link JCLO#getDouble(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void test