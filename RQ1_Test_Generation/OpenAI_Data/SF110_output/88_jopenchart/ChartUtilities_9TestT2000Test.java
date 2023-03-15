// ChartUtilities_9Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#transformArray(int[])} method.
*/
class ChartUtilities_9Test {

		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_1() {
				int[] data = {};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(0, n.length);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_2() {
				int[] data = {1};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(1, n.length);
				assertEquals(1, n[0]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_3() {
				int[] data = {1, 2, 3};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(1, n[0]);
				assertEquals(2, n[1]);
				assertEquals(3, n[2]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_4() {
				int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(10, n.length);
				assertEquals(1, n[0]);
				assertEquals(2, n[1]);
				assertEquals(3, n[2]);
				assertEquals(4, n[3]);
				assertEquals(5, n[4]);
				assertEquals(6, n[5]);
				assertEquals(7, n[6]);
				assertEquals(8, n[7]);
				assertEquals(9, n[8]);
				assertEquals(10, n[9]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_5() {
				int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(20, n.length);
				assertEquals(1, n[0]);
				assertEquals(2, n[1]);
				assertEquals(3, n[2]);
				assertEquals(4, n[3]);
				assertEquals(5, n[4]);
				assertEquals(6, n[5]);
				assertEquals(7, n[6]);
				assertEquals(8, n[7]);
				assertEquals(9, n[8]);
				assertEquals(10, n[9]);
				assertEquals(11, n[10]);
				assertEquals(12, n[11]);
				assertEquals(13, n[12]);
				assertEquals(14, n[13]);
				assertEquals(15, n[14]);
				assertEquals(16, n[15]);
				assertEquals(17, n[16]);
				assertEquals(18, n[17]);
				assertEquals(19, n[18]);
				assertEquals(20, n[19]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_6() {
				int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(30, n.length);
				assertEquals(1, n[0]);
				assertEquals(2, n[1]);
				assertEquals(3, n[2]);
				assertEquals(4, n[3]);
				assertEquals(5, n[4]);
				assertEquals(6, n[5]);
				assertEquals(7, n[6]);
				assertEquals(8, n[7]);
				assertEquals(9, n[8]);
				assertEquals(10, n[9]);
				assertEquals(11, n[10]);
				assertEquals(12, n[11]);
				assertEquals(13, n[12]);
				assertEquals(14, n[13]);
				assertEquals(15, n[14]);
				assertEquals(16, n[15]);
				assertEquals(17, n[16]);
				assertEquals(18, n[17]);
				assertEquals(19, n[18]);
				assertEquals(20, n[19]);
				assertEquals(21, n[20]);
				assertEquals(22, n[21]);
				assertEquals(23, n[22]);
				assertEquals(24, n[23]);
				assertEquals(25, n[24]);
				assertEquals(26, n[25]);
				assertEquals(27, n[26]);
				assertEquals(28, n[27]);
				assertEquals(29, n[28]);
				assertEquals(30, n[29]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_7() {
				int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(40, n.length);
				assertEquals(1, n[0]);
				assertEquals(2, n[1]);
				assertEquals(3, n[2]);
				assertEquals(4, n[3]);
				assertEquals(5, n[4]);
				assertEquals(6, n[5]);
				assertEquals(7, n[6]);
				assertEquals(8, n[7]);
				assertEquals(9, n[8]);
				assertEquals(10, n[9]);
				assertEquals(11, n[10]);
				assertEquals