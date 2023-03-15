// ChartUtilities_2Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#interpolate(double[], double[], double)} method.
*/
class ChartUtilities_2Test {

	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-4.0, 0.0, 3.0}</li>
	* 	<li>ya = {64.0, 0.0, 36.0}</li>
	* 	<li>x = 1.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = 4.0</li>
	* </ul>
	*/
	@Test
	void testInterpolate_1() {
		double[] xa = {-4.0, 0.0, 3.0};
		double[] ya = {64.0, 0.0, 36.0};
		double x = 1.0;
		double y = 4.0;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-4.0, 0.0, 3.0}</li>
	* 	<li>ya = {64.0, 0.0, 36.0}</li>
	* 	<li>x = -4.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = 64.0</li>
	* </ul>
	*/
	@Test
	void testInterpolate_2() {
		double[] xa = {-4.0, 0.0, 3.0};
		double[] ya = {64.0, 0.0, 36.0};
		double x = -4.0;
		double y = 64.0;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-4.0, 0.0, 3.0}</li>
	* 	<li>ya = {64.0, 0.0, 36.0}</li>
	* 	<li>x = 3.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = 36.0</li>
	* </ul>
	*/
	@Test
	void testInterpolate_3() {
		double[] xa = {-4.0, 0.0, 3.0};
		double[] ya = {64.0, 0.0, 36.0};
		double x = 3.0;
		double y = 36.0;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-4.0, 0.0, 3.0}</li>
	* 	<li>ya = {64.0, 0.0, 36.0}</li>
	* 	<li>x = -5.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = Double.NaN</li>
	* </ul>
	*/
	@Test
	void testInterpolate_4() {
		double[] xa = {-4.0, 0.0, 3.0};
		double[] ya = {64.0, 0.0, 36.0};
		double x = -5.0;
		double y = Double.NaN;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-4.0, 0.0, 3.0}</li>
	* 	<li>ya = {64.0, 0.0, 36.0}</li>
	* 	<li>x = 4.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = Double.NaN</li>
	* </ul>
	*/
	@Test
	void testInterpolate_5() {
		double[] xa = {-4.0, 0.0, 3.0};
		double[] ya = {64.0, 0.0, 36.0};
		double x = 4.0;
		double y = Double.NaN;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-5.0, 0.0, 1.0, 5.0}</li>
	* 	<li>ya = {-740.0, -5.0, -2.0, 530.0}</li>
	* 	<li>x = -5.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = -740.0</li>
	* </ul>
	*/
	@Test
	void testInterpolate_6() {
		double[] xa = {-5.0, 0.0, 1.0, 5.0};
		double[] ya = {-740.0, -5.0, -2.0, 530.0};
		double x = -5.0;
		double y = -740.0;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-5.0, 0.0, 1.0, 5.0}</li>
	* 	<li>ya = {-740.0, -5.0, -2.0, 530.0}</li>
	* 	<li>x = 0.0</li>
	* </ul>
	* and the expected output:
	* <ul>
	* 	<li>y = -5.0</li>
	* </ul>
	*/
	@Test
	void testInterpolate_7() {
		double[] xa = {-5.0, 0.0, 1.0, 5.0};
		double[] ya = {-740.0, -5.0, -2.0, 530.0};
		double x = 0.0;
		double y = -5.0;
		assertEquals(y, ChartUtilities.interpolate(xa, ya, x));
	}
	
	/**
	* Test case for {@link ChartUtilities#interpolate(double[], double[], double)}
	* with the following input:
	* <ul>
	* 	<li>xa = {-5.0, 0.0, 1.0, 5.0}</li>
	* 	<li>ya = {-740.0, -5.0, -2.0, 530.0}</li>
	* 	<li>x