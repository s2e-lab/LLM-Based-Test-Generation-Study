// ChartUtilities_8Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#transformArray(double[])} method.
*/
class ChartUtilities_8Test {

		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_1() {
				double[] data = {};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(0, n.length);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_2() {
				double[] data = {0.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(1, n.length);
				assertEquals(0.0, n[0]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_3() {
				double[] data = {0.0, 1.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(2, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_4() {
				double[] data = {0.0, 1.0, 2.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_5() {
				double[] data = {0.0, 1.0, 2.0, 3.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(4, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_6() {
				double[] data = {0.0, 1.0, 2.0, 3.0, 4.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(5, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
				assertEquals(4.0, n[4]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_7() {
				double[] data = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(6, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
				assertEquals(4.0, n[4]);
				assertEquals(5.0, n[5]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_8() {
				double[] data = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(7, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
				assertEquals(4.0, n[4]);
				assertEquals(5.0, n[5]);
				assertEquals(6.0, n[6]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_9() {
				double[] data = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(8, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
				assertEquals(4.0, n[4]);
				assertEquals(5.0, n[5]);
				assertEquals(6.0, n[6]);
				assertEquals(7.0, n[7]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[])}.
		*/
		@Test
		void testTransformArray_10() {
				double[] data = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(9, n.length);
				assertEquals(0.0, n[0]);
				assertEquals(1.0, n[1]);
				assertEquals(2.0, n[2]);
				assertEquals(3.0, n[3]);
				assertEquals(4.0, n[4]);
				assertEquals(5.0, n[5]);
				assertEquals(6.0, n[6]);
				assertEquals(7.0, n[7]);
				assertEquals(8.0, n[8]);
		}
}

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
				int[] data = {0};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(1, n.length);
				assertEquals(0, n[0]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_3() {
				int[] data = {0, 1};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(2, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_4() {
				int[] data = {0, 1, 2};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(3, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_5() {
				int[] data = {0, 1, 2, 3};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(4, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_6() {
				int[] data = {0, 1, 2, 3, 4};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(5, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
				assertEquals(4, n[4]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_7() {
				int[] data = {0, 1, 2, 3, 4, 5};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(6, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
				assertEquals(4, n[4]);
				assertEquals(5, n[5]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_8() {
				int[] data = {0, 1, 2, 3, 4, 5, 6};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(7, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
				assertEquals(4, n[4]);
				assertEquals(5, n[5]);
				assertEquals(6, n[6]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_9() {
				int[] data = {0, 1, 2, 3, 4, 5, 6, 7};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(8, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
				assertEquals(4, n[4]);
				assertEquals(5, n[5]);
				assertEquals(6, n[6]);
				assertEquals(7, n[7]);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(int[])}.
		*/
		@Test
		void testTransformArray_10() {
				int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8};
				Number[] n = ChartUtilities.transformArray(data);
				assertEquals(9, n.length);
				assertEquals(0, n[0]);
				assertEquals(1, n[1]);
				assertEquals(2, n[2]);
				assertEquals(3, n[3]);
				assertEquals(4, n[4]);
				assertEquals(5, n[5]);
				assertEquals(6, n[6]);
				assertEquals(7, n[7]);
				assertEquals(8, n[8]);
		}
}

// ChartUtilities_10Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#transformArray(double[][])} method.
*/
class ChartUtilities_10Test {
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])}.
		*/
		@Test
		void testTransformArray_1() {
				double[][] data = {};
				Number[][] n = ChartUtilities.transformArray(data);
				assertEquals(0, n.length);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])}.
		*/
		@Test
		void testTransformArray_2() {
				double[][] data