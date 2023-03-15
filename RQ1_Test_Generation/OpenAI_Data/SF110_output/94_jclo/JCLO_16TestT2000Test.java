// JCLO_16Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getDoubles(String)} method.
*/
class JCLO_16Test {

		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array.
		*/
		@Test
		void testGetDoubles_ValidDoubleArray() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0,2.0,3.0"});
				double[] expected = {1.0, 2.0, 3.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValue() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpaces() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray= 1.0 "});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndComma() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray= 1.0 , "});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEquals() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashes() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashesAndPrefix() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashesAndPrefixAndAliases() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashesAndPrefixAndAliasesAndObject() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashesAndPrefixAndAliasesAndObjectAndFields() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getDoubles(String)} method.
		* It tests the method with a valid double array with a single value.
		*/
		@Test
		void testGetDoubles_ValidDoubleArrayWithSingleValueAndSpacesAndCommaAndEqualsAndDoubleDashesAndPrefixAndAliasesAndObjectAndFieldsAndGetObject() {
				JCLO_16 jclo = new JCLO_16();
				jclo.parse(new String[]{"--doubleArray=1.0"});
				double[] expected = {1.0};
				double[] actual = jclo.getDoubles("doubleArray");
		