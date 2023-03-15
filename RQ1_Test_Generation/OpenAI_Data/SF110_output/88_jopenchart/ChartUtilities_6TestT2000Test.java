// ChartUtilities_6Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#transformArray(int[][])} method.
*/
class ChartUtilities_6Test {

		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_1() {
				int[][] data = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(2, n.length);
				assertEquals(3, n[0].length);
				assertEquals(3, n[1].length);
				assertEquals(1, n[0][0]);
				assertEquals(2, n[0][1]);
				assertEquals(3, n[0][2]);
				assertEquals(4, n[1][0]);
				assertEquals(5, n[1][1]);
				assertEquals(6, n[1][2]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_2() {
				int[][] data = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(3, n[0].length);
				assertEquals(3, n[1].length);
				assertEquals(3, n[2].length);
				assertEquals(1, n[0][0]);
				assertEquals(2, n[0][1]);
				assertEquals(3, n[0][2]);
				assertEquals(4, n[1][0]);
				assertEquals(5, n[1][1]);
				assertEquals(6, n[1][2]);
				assertEquals(7, n[2][0]);
				assertEquals(8, n[2][1]);
				assertEquals(9, n[2][2]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_3() {
				int[][] data = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(4, n[0].length);
				assertEquals(4, n[1].length);
				assertEquals(4, n[2].length);
				assertEquals(1, n[0][0]);
				assertEquals(2, n[0][1]);
				assertEquals(3, n[0][2]);
				assertEquals(4, n[0][3]);
				assertEquals(5, n[1][0]);
				assertEquals(6, n[1][1]);
				assertEquals(7, n[1][2]);
				assertEquals(8, n[1][3]);
				assertEquals(9, n[2][0]);
				assertEquals(10, n[2][1]);
				assertEquals(11, n[2][2]);
				assertEquals(12, n[2][3]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_4() {
				int[][] data = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(5, n[0].length);
				assertEquals(5, n[1].length);
				assertEquals(5, n[2].length);
				assertEquals(1, n[0][0]);
				assertEquals(2, n[0][1]);
				assertEquals(3, n[0][2]);
				assertEquals(4, n[0][3]);
				assertEquals(5, n[0][4]);
				assertEquals(6, n[1][0]);
				assertEquals(7, n[1][1]);
				assertEquals(8, n[1][2]);
				assertEquals(9, n[1][3]);
				assertEquals(10, n[1][4]);
				assertEquals(11, n[2][0]);
				assertEquals(12, n[2][1]);
				assertEquals(13, n[2][2]);
				assertEquals(14, n[2][3]);
				assertEquals(15, n[2][4]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_5() {
				int[][] data = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(6, n[0].length);
				assertEquals(6, n[1].length);
				assertEquals(6, n[2].length);
				assertEquals(1, n[0][0]);
				assertEquals(2, n[0][1]);
				assertEquals(3, n[0][2]);
				assertEquals(4, n[0][3]);
				assertEquals(5, n[0][4]);
				assertEquals(6, n[0][5]);
				assertEquals(7, n[1][0]);
				assertEquals(8, n[1][1]);
				assertEquals(9, n[1][2]);
				assertEquals(10, n[1][3]);
				assertEquals(11, n[1][4]);
				assertEquals(12, n[1][5]);
				assertEquals(13, n[2][0]);
				assertEquals(14, n[2][1]);
				assertEquals(15, n[2][2]);
				assertEquals(16, n[2][3]);
				assertEquals(17, n[2][4]);
				assertEquals(18, n[2][5]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[][])}.
		*/
		@Test
		void testTransformArray_6() {
				int[][] data = new int[][] { { 1, 2, 3, 4, 5, 6, 7 },