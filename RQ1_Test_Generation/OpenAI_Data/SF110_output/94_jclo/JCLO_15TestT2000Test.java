// JCLO_15Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getFloats(String)} method.
*/
class JCLO_15Test {

		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetFloats_Valid() {
				JCLO_15 jclo = new JCLO_15();
				jclo.parse(new String[]{"-f", "1.0", "-f", "2.0", "-f", "3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};
				float[] actual = jclo.getFloats("f");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetFloats_Invalid() {
				JCLO_15 jclo = new JCLO_15();
				jclo.parse(new String[]{"-f", "1.0", "-f", "2.0", "-f", "3.0"});
				float[] actual = jclo.getFloats("g");
				assertNull(actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument and a prefix.
		*/
		@Test
		void testGetFloats_Valid_Prefix() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"-pf", "1.0", "-pf", "2.0", "-pf", "3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};
				float[] actual = jclo.getFloats("f");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with an invalid argument and a prefix.
		*/
		@Test
		void testGetFloats_Invalid_Prefix() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"-pf", "1.0", "-pf", "2.0", "-pf", "3.0"});
				float[] actual = jclo.getFloats("g");
				assertNull(actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument and a prefix.
		*/
		@Test
		void testGetFloats_Valid_Prefix_DoubleDash() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"--pf", "1.0", "--pf", "2.0", "--pf", "3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};
				float[] actual = jclo.getFloats("f");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with an invalid argument and a prefix.
		*/
		@Test
		void testGetFloats_Invalid_Prefix_DoubleDash() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"--pf", "1.0", "--pf", "2.0", "--pf", "3.0"});
				float[] actual = jclo.getFloats("g");
				assertNull(actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument and a prefix.
		*/
		@Test
		void testGetFloats_Valid_Prefix_Equals() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"-pf=1.0", "-pf=2.0", "-pf=3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};
				float[] actual = jclo.getFloats("f");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with an invalid argument and a prefix.
		*/
		@Test
		void testGetFloats_Invalid_Prefix_Equals() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"-pf=1.0", "-pf=2.0", "-pf=3.0"});
				float[] actual = jclo.getFloats("g");
				assertNull(actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument and a prefix.
		*/
		@Test
		void testGetFloats_Valid_Prefix_DoubleDash_Equals() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"--pf=1.0", "--pf=2.0", "--pf=3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};
				float[] actual = jclo.getFloats("f");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with an invalid argument and a prefix.
		*/
		@Test
		void testGetFloats_Invalid_Prefix_DoubleDash_Equals() {
				JCLO_15 jclo = new JCLO_15("p");
				jclo.parse(new String[]{"--pf=1.0", "--pf=2.0", "--pf=3.0"});
				float[] actual = jclo.getFloats("g");
				assertNull(actual);
		}
		
		/**
		* Test case for {@link JCLO#getFloats(String)} method.
		* It tests the method with a valid argument and a prefix.
		*/
		@Test
		void testGetFloats_Valid_Prefix_DoubleDash_Equals_Alias() {
				JCLO_15 jclo = new JCLO_15("p", null, new String[][]{{"f", "g"}});
				jclo.parse(new String[]{"--pg=1.0", "--pg=2.0", "--pg=3.0"});
				float[] expected = {1.0f, 2.0f, 3.0f};