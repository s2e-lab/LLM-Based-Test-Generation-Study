// JCLO_14Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getInts(String)} method.
*/
class JCLO_14Test {

		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_1() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3"});
				int[] expected = {1, 2, 3};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_2() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5"});
				int[] expected = {1, 2, 3, 4, 5};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_3() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5", "-i", "6", "-i", "7", "-i", "8", "-i", "9", "-i", "10"});
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_4() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5", "-i", "6", "-i", "7", "-i", "8", "-i", "9", "-i", "10", "-i", "11", "-i", "12", "-i", "13", "-i", "14", "-i", "15", "-i", "16", "-i", "17", "-i", "18", "-i", "19", "-i", "20"});
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_5() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5", "-i", "6", "-i", "7", "-i", "8", "-i", "9", "-i", "10", "-i", "11", "-i", "12", "-i", "13", "-i", "14", "-i", "15", "-i", "16", "-i", "17", "-i", "18", "-i", "19", "-i", "20", "-i", "21", "-i", "22", "-i", "23", "-i", "24", "-i", "25", "-i", "26", "-i", "27", "-i", "28", "-i", "29", "-i", "30"});
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_6() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5", "-i", "6", "-i", "7", "-i", "8", "-i", "9", "-i", "10", "-i", "11", "-i", "12", "-i", "13", "-i", "14", "-i", "15", "-i", "16", "-i", "17", "-i", "18", "-i", "19", "-i", "20", "-i", "21", "-i", "22", "-i", "23", "-i", "24", "-i", "25", "-i", "26", "-i", "27", "-i", "28", "-i", "29", "-i", "30", "-i", "31", "-i", "32", "-i", "33", "-i", "34", "-i", "35", "-i", "36", "-i", "37", "-i", "38", "-i", "39", "-i", "40"});
				int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
				int[] actual = jclo.getInts("i");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link JCLO#getInts(String)} method.
		* It tests the case when the value of the variable is an array of integers.
		*/
		@Test
		void testGetInts_7() {
				JCLO_14 jclo = new JCLO_14();
				jclo.parse(new String[]{"-i", "1", "-i", "2", "-i", "3", "-i", "4", "-i", "5", "-i", "6", "-i", "7", "-i", "8", "-i", "9", "-i", "10", "-i", "11", "-i", "12", "-i", "13", "-i", "14", "-i", "15", "-i", "16", "-i", "17", "-i", "18", "-