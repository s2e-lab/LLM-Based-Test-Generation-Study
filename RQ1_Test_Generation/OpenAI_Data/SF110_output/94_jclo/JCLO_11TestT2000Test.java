// JCLO_11Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getBytes(String)} method.
*/
class JCLO_11Test {

		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetBytes_Valid() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1"});
				byte[] expected = {1};
				byte[] actual = jclo.getBytes("b");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetBytes_Invalid() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1"});
				byte[] expected = {1};
				byte[] actual = jclo.getBytes("c");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetBytes_Null() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1"});
				byte[] expected = {1};
				byte[] actual = jclo.getBytes(null);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetBytes_Empty() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1"});
				byte[] expected = {1};
				byte[] actual = jclo.getBytes("");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetBytes_Valid_2() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2"});
				byte[] expected = {1, 2};
				byte[] actual = jclo.getBytes("b");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetBytes_Invalid_2() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2"});
				byte[] expected = {1, 2};
				byte[] actual = jclo.getBytes("c");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetBytes_Null_2() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2"});
				byte[] expected = {1, 2};
				byte[] actual = jclo.getBytes(null);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetBytes_Empty_2() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2"});
				byte[] expected = {1, 2};
				byte[] actual = jclo.getBytes("");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetBytes_Valid_3() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2", "3"});
				byte[] expected = {1, 2, 3};
				byte[] actual = jclo.getBytes("b");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an invalid argument.
		*/
		@Test
		void testGetBytes_Invalid_3() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2", "3"});
				byte[] expected = {1, 2, 3};
				byte[] actual = jclo.getBytes("c");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a null argument.
		*/
		@Test
		void testGetBytes_Null_3() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2", "3"});
				byte[] expected = {1, 2, 3};
				byte[] actual = jclo.getBytes(null);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with an empty argument.
		*/
		@Test
		void testGetBytes_Empty_3() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "2", "3"});
				byte[] expected = {1, 2, 3};
				byte[] actual = jclo.getBytes("");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getBytes(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetBytes_Valid_4() {
				JCLO_11 jclo = new JCLO_11();
				jclo.parse(new String[]{"-b", "1", "