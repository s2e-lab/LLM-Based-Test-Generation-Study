// ChartUtilities_7Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#transformArray(double[][])} method.
*/
class ChartUtilities_7Test {

		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_1() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_2() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_3() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_4() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_5() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_6() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_7() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}, {22.0, 23.0, 24.0}};
				Number[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}, {22.0, 23.0, 24.0}};
				Number[][] actual = ChartUtilities.transformArray(data);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#transformArray(double[][])} method.
		* It tests if the method returns the correct result for a given input.
		*/
		@Test
		void testTransformArray_8() {
				double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}, {22.0,