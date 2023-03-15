// JCLO_10Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getString(String)} method.
*/
class JCLO_10Test {

		/**
		* Test case 1 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString1() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test"});
				assertEquals("test", jclo.getString("string"));
		}
		
		/**
		* Test case 2 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString2() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2"});
				assertEquals("test2", jclo.getString("string"));
		}
		
		/**
		* Test case 3 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString3() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3"});
				assertEquals("test3", jclo.getString("string"));
		}
		
		/**
		* Test case 4 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString4() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4"});
				assertEquals("test4", jclo.getString("string"));
		}
		
		/**
		* Test case 5 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString5() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5"});
				assertEquals("test5", jclo.getString("string"));
		}
		
		/**
		* Test case 6 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString6() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5", "-string", "test6"});
				assertEquals("test6", jclo.getString("string"));
		}
		
		/**
		* Test case 7 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString7() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5", "-string", "test6", "-string", "test7"});
				assertEquals("test7", jclo.getString("string"));
		}
		
		/**
		* Test case 8 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString8() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5", "-string", "test6", "-string", "test7", "-string", "test8"});
				assertEquals("test8", jclo.getString("string"));
		}
		
		/**
		* Test case 9 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString9() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5", "-string", "test6", "-string", "test7", "-string", "test8", "-string", "test9"});
				assertEquals("test9", jclo.getString("string"));
		}
		
		/**
		* Test case 10 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString10() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				jclo.parse(new String[] {"-string", "test", "-string", "test2", "-string", "test3", "-string", "test4", "-string", "test5", "-string", "test6", "-string", "test7", "-string", "test8", "-string", "test9", "-string", "test10"});
				assertEquals("test10", jclo.getString("string"));
		}
}

// JCLO_11Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains eleven unit test cases for the {@link JCLO#getString(String)} method.
*/
class JCLO_11Test {
		
		/**
		* Test case 1 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString1() {
				JCLO jclo = new JCLO(new JCLO_11Test());
				jclo.parse(new String[] {"-string", "test"});
				assertEquals("test", jclo.getString("string"));
		}
		
		/**
		* Test case 2 for {@link JCLO#getString(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetString2() {
				JCLO jclo = new J