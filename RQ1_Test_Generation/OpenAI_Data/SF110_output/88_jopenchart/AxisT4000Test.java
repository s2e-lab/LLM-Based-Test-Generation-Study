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
		* Test case for {@link Axis#getPixelForValue(double)} with a vertical axis.
		*/
		@Test
		void testGetPixelForValueVertical() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumValue(new Double(0));
				constraints.setMaximumValue(new Double(100));
				Axis axis = new Axis(Axis.VERTICAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(0), 0.001);
				assertEquals(50, axis.getPixelForValue(50), 0.001);
				assertEquals(100, axis.getPixelForValue(100), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a horizontal axis.
		*/
		@Test
		void testGetPixelForValueHorizontal() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumColumnValue(0);
				constraints.setMaximumColumnValue(100);
				Axis axis = new Axis(Axis.HORIZONTAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(0), 0.001);
				assertEquals(50, axis.getPixelForValue(50), 0.001);
				assertEquals(100, axis.getPixelForValue(100), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a vertical axis and a minimum value of -50.
		*/
		@Test
		void testGetPixelForValueVerticalMinus50() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumValue(new Double(-50));
				constraints.setMaximumValue(new Double(100));
				Axis axis = new Axis(Axis.VERTICAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(50, axis.getPixelForValue(25), 0.001);
				assertEquals(100, axis.getPixelForValue(100), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a horizontal axis and a minimum value of -50.
		*/
		@Test
		void testGetPixelForValueHorizontalMinus50() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumColumnValue(-50);
				constraints.setMaximumColumnValue(100);
				Axis axis = new Axis(Axis.HORIZONTAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(50, axis.getPixelForValue(25), 0.001);
				assertEquals(100, axis.getPixelForValue(100), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a vertical axis and a minimum value of -50 and a maximum value of 150.
		*/
		@Test
		void testGetPixelForValueVerticalMinus50Max150() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumValue(new Double(-50));
				constraints.setMaximumValue(new Double(150));
				Axis axis = new Axis(Axis.VERTICAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(50, axis.getPixelForValue(25), 0.001);
				assertEquals(100, axis.getPixelForValue(150), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a horizontal axis and a minimum value of -50 and a maximum value of 150.
		*/
		@Test
		void testGetPixelForValueHorizontalMinus50Max150() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumColumnValue(-50);
				constraints.setMaximumColumnValue(150);
				Axis axis = new Axis(Axis.HORIZONTAL, constraints);
				axis.setLength(100);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(50, axis.getPixelForValue(25), 0.001);
				assertEquals(100, axis.getPixelForValue(150), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a vertical axis and a minimum value of -50 and a maximum value of 150 and a length of 200.
		*/
		@Test
		void testGetPixelForValueVerticalMinus50Max150Length200() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumValue(new Double(-50));
				constraints.setMaximumValue(new Double(150));
				Axis axis = new Axis(Axis.VERTICAL, constraints);
				axis.setLength(200);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(100, axis.getPixelForValue(25), 0.001);
				assertEquals(200, axis.getPixelForValue(150), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a horizontal axis and a minimum value of -50 and a maximum value of 150 and a length of 200.
		*/
		@Test
		void testGetPixelForValueHorizontalMinus50Max150Length200() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumColumnValue(-50);
				constraints.setMaximumColumnValue(150);
				Axis axis = new Axis(Axis.HORIZONTAL, constraints);
				axis.setLength(200);
				assertEquals(0, axis.getPixelForValue(-50), 0.001);
				assertEquals(100, axis.getPixelForValue(25), 0.001);
				assertEquals(200, axis.getPixelForValue(150), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a vertical axis and a minimum value of -50 and a maximum value of 150 and a length of 200 and a minimum value of -100.
		*/
		@Test
		void testGetPixelForValueVerticalMinus50Max150Length200Minus100() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumValue(new Double(-100));
				constraints.setMaximumValue(new Double(150));
				Axis axis = new Axis(Axis.VERTICAL, constraints);
				axis.setLength(200);
				assertEquals(0, axis.getPixelForValue(-100), 0.001);
				assertEquals(100, axis.getPixelForValue(25), 0.001);
				assertEquals(200, axis.getPixelForValue(150), 0.001);
		}
		
		/**
		* Test case for {@link Axis#getPixelForValue(double)} with a horizontal axis and a minimum value of -50 and a maximum value of 150 and a length of 200 and a minimum value of -100.
		*/
		@Test
		void testGetPixelForValueHorizontalMinus50Max150Length200Minus100() {
				ChartDataModelConstraints constraints = new ChartDataModelConstraints();
				constraints.setMinimumColumnValue(-100);
				constraints.setMaximumColumnValue(150);
				Axis axis = new Axis(Axis.HORIZONTAL, constraints);
				axis.setLength(200);
				assertEquals(0, axis.getPixelForValue(-100), 0.001);
				assertEquals(100, axis.getPixelForValue(25), 0.001);
				assertEquals(200, axis.getPixelForValue(150), 0.001);
		}
}