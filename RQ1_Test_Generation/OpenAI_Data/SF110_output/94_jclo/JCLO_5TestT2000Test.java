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
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "1"});
				assertEquals(1, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid2() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "2"});
				assertEquals(2, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid3() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "3"});
				assertEquals(3, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid4() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "4"});
				assertEquals(4, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid5() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "5"});
				assertEquals(5, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid6() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "6"});
				assertEquals(6, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid7() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "7"});
				assertEquals(7, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid8() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "8"});
				assertEquals(8, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid9() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "9"});
				assertEquals(9, jclo.getShort("s"));
		}
		
		/**
		* Test case for {@link JCLO#getShort(String)} method.
		* It tests the method with a valid short value.
		*/
		@Test
		void testGetShort_Valid10() {
				JCLO_5 jclo = new JCLO_5();
				jclo.parse(new String[]{"-s", "10"});
				assertEquals(10, jclo.getShort("s"));
		}
}

// JCLO_4Test.java
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
class JCLO_4Test {
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the method with a valid int value.
		*/
		@Test
		void testGetInt_Valid() {
				JCLO_4 jclo = new JCLO_4();
				jclo.parse(new String[]{"-i", "1"});
				assertEquals(1, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the method with a valid int value.
		*/
		@Test
		void testGetInt_Valid2() {
				JCLO_4 jclo = new JCLO_4();
				jclo.parse(new String[]{"-i", "2"});
				assertEquals(2, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the method with a valid int value.
		*/
		@Test
		void testGetInt_Valid3() {
				JCLO_4 jclo = new JCLO_4();
				jclo.parse(new String[]{"-i", "3"});
				assertEquals(3, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
		* It tests the method with a valid int value.
		*/
		@Test
		void testGetInt_Valid4() {
				JCLO_4 jclo = new JCLO_4();
				jclo.parse(new String[]{"-i", "4"});
				assertEquals(4, jclo.getInt("i"));
		}
		
		/**
		* Test case for {@link JCLO#getInt(String)} method.
	