// AxisTest.java
package de.progra.charting;

import de.progra.charting.model.ChartDataModelConstraints;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Axis}.
* It contains ten unit test cases for the {@link Axis#getPixelForValue(double)} method.
*/
class AxisTest {

		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a linear scale.
		*/
		@Test
		void testGetPixelForValueLinear() {
				ChartDataModelConstraints c = new ChartDataModelConstraints(0, 10, 0, 10);
				Axis a = new Axis(Axis.VERTICAL, c);
				a.setLength(100);
				assertEquals(0, a.getPixelForValue(0), 0.001);
				assertEquals(10, a.getPixelForValue(1), 0.001);
				assertEquals(20, a.getPixelForValue(2), 0.001);
				assertEquals(30, a.getPixelForValue(3), 0.001);
				assertEquals(40, a.getPixelForValue(4), 0.001);
				assertEquals(50, a.getPixelForValue(5), 0.001);
				assertEquals(60, a.getPixelForValue(6), 0.001);
				assertEquals(70, a.getPixelForValue(7), 0.001);
				assertEquals(80, a.getPixelForValue(8), 0.001);
				assertEquals(90, a.getPixelForValue(9), 0.001);
				assertEquals(100, a.getPixelForValue(10), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a logarithmic scale.
		*/
		@Test
		void testGetPixelForValueLogarithmic() {
				ChartDataModelConstraints c = new ChartDataModelConstraints(0, 10, 0, 10);
				Axis a = new Axis(Axis.VERTICAL, c);
				a.setLength(100);
				assertEquals(0, a.getPixelForValue(0), 0.001);
				assertEquals(10, a.getPixelForValue(1), 0.001);
				assertEquals(20, a.getPixelForValue(2), 0.001);
				assertEquals(30, a.getPixelForValue(3), 0.001);
				assertEquals(40, a.getPixelForValue(4), 0.001);
				assertEquals(50, a.getPixelForValue(5), 0.001);
				assertEquals(60, a.getPixelForValue(6), 0.001);
				assertEquals(70, a.getPixelForValue(7), 0.001);
				assertEquals(80, a.getPixelForValue(8), 0.001);
				assertEquals(90, a.getPixelForValue(9), 0.001);
				assertEquals(100, a.getPixelForValue(10), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a linear scale and a negative minimum value.
		*/
		@Test
		void testGetPixelForValueLinearNegative() {
				ChartDataModelConstraints c = new ChartDataModelConstraints(-10, 10, -10, 10);
				Axis a = new Axis(Axis.VERTICAL, c);
				a.setLength(100);
				assertEquals(0, a.getPixelForValue(-10), 0.001);
				assertEquals(10, a.getPixelForValue(-9), 0.001);
				assertEquals(20, a.getPixelForValue(-8), 0.001);
				assertEquals(30, a.getPixelForValue(-7), 0.001);
				assertEquals(40, a.getPixelForValue(-6), 0.001);
				assertEquals(50, a.getPixelForValue(-5), 0.001);
				assertEquals(60, a.getPixelForValue(-4), 0.001);
				assertEquals(70, a.getPixelForValue(-3), 0.001);
				assertEquals(80, a.getPixelForValue(-2), 0.001);
				assertEquals(90, a.getPixelForValue(-1), 0.001);
				assertEquals(100, a.getPixelForValue(0), 0.001);
				assertEquals(90, a.getPixelForValue(1), 0.001);
				assertEquals(80, a.getPixelForValue(2), 0.001);
				assertEquals(70, a.getPixelForValue(3), 0.001);
				assertEquals(60, a.getPixelForValue(4), 0.001);
				assertEquals(50, a.getPixelForValue(5), 0.001);
				assertEquals(40, a.getPixelForValue(6), 0.001);
				assertEquals(30, a.getPixelForValue(7), 0.001);
				assertEquals(20, a.getPixelForValue(8), 0.001);
				assertEquals(10, a.getPixelForValue(9), 0.001);
				assertEquals(0, a.getPixelForValue(10), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a logarithmic scale and a negative minimum value.
		*/
		@Test
		void testGetPixelForValueLogarithmicNegative() {
				ChartDataModelConstraints c = new ChartDataModelConstraints(-10, 10, -10, 10);
				Axis a = new Axis(Axis.VERTICAL, c);
				a.setLength(100);
				assertEquals(0, a.getPixelForValue(-10), 0.001);
				assertEquals(10, a.getPixelForValue(-9), 0.001);
				assertEquals(20, a.getPixelForValue(-8), 0.001);
				assertEquals(30, a.getPixelForValue(-7), 0.001);
				assertEquals(40, a.getPixelForValue(-6), 0.001);
				assertEquals(50, a.getPixelForValue(-5), 0.001);
				assertEquals(60, a.getPixelForValue(-4), 0.001);
				assertEquals(70, a.getPixelForValue(-3), 0.001);
				assertEquals(80, a.getPixelForValue(-2), 0.001);
				assertEquals(90, a.getPixelForValue(-1), 0.001);
				assertEquals(100, a.getPixelForValue(0), 0.001);
				assertEquals(90, a.getPixelForValue(1), 0.001);
				assertEquals(80, a.getPixelForValue(2), 0.001);
				assertEquals(70, a.getPixelForValue(3), 0.001);
				assertEquals(60, a.getPixelForValue(4), 0.001);
				assertEquals(50, a.getPixelForValue(5), 0.001);
				assertEquals(40, a.getPixelForValue(6), 0.001);
				assertEquals(30, a.getPixelForValue(7), 0.001);
				assertEquals(20, a.getPixelForValue(8), 0.001);
				assertEquals(10, a.getPixelForValue(9), 0