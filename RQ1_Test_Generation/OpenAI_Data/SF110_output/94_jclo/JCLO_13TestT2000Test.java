// JCLO_13Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getShorts(String)} method.
*/
class JCLO_13Test {

		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array.
		*/
		@Test
		void testGetShorts_ValidShortArray() {
				JCLO_13 jclo = new JCLO_13();
				jclo.parse(new String[]{"-short", "1", "-short", "2", "-short", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with double dashes.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithDoubleDashes() {
				JCLO_13 jclo = new JCLO_13();
				jclo.parse(new String[]{"--short", "1", "--short", "2", "--short", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with equals.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithEquals() {
				JCLO_13 jclo = new JCLO_13();
				jclo.parse(new String[]{"-short=1", "-short=2", "-short=3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with double dashes and equals.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithDoubleDashesAndEquals() {
				JCLO_13 jclo = new JCLO_13();
				jclo.parse(new String[]{"--short=1", "--short=2", "--short=3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with a prefix.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithPrefix() {
				JCLO_13 jclo = new JCLO_13("prefix");
				jclo.parse(new String[]{"-prefixshort", "1", "-prefixshort", "2", "-prefixshort", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with a prefix and double dashes.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithPrefixAndDoubleDashes() {
				JCLO_13 jclo = new JCLO_13("prefix");
				jclo.parse(new String[]{"--prefixshort", "1", "--prefixshort", "2", "--prefixshort", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with a prefix and equals.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithPrefixAndEquals() {
				JCLO_13 jclo = new JCLO_13("prefix");
				jclo.parse(new String[]{"-prefixshort=1", "-prefixshort=2", "-prefixshort=3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with a prefix, double dashes, and equals.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithPrefixAndDoubleDashesAndEquals() {
				JCLO_13 jclo = new JCLO_13("prefix");
				jclo.parse(new String[]{"--prefixshort=1", "--prefixshort=2", "--prefixshort=3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with an alias.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithAlias() {
				JCLO_13 jclo = new JCLO_13(null, null, new String[][]{{"alias", "short"}});
				jclo.parse(new String[]{"-alias", "1", "-alias", "2", "-alias", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with an alias and double dashes.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithAliasAndDoubleDashes() {
				JCLO_13 jclo = new JCLO_13(null, null, new String[][]{{"alias", "short"}});
				jclo.parse(new String[]{"--alias", "1", "--alias", "2", "--alias", "3"});
				short[] expected = {1, 2, 3};
				short[] actual = jclo.getShorts("short");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getShorts(String)} method.
		* It tests the method with a valid short array with an alias and equals.
		*/
		@Test
		void testGetShorts_ValidShortArrayWithAliasAndEquals() {
				JCLO_13 jclo = new JCLO_13(null, null, new String[][]{{"alias", "short"}}