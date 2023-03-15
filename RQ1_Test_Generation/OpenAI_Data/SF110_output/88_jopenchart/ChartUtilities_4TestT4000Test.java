// ChartUtilities_4Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#ceil(double, int)} method.
*/
class ChartUtilities_4Test {

		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a positive exponent.
		*/
		@Test
		void testCeil_PositiveDouble_PositiveExponent() {
				double d = 0.00337;
				int exp = 2;
				double expected = 0.01;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a negative exponent.
		*/
		@Test
		void testCeil_PositiveDouble_NegativeExponent() {
				double d = 0.00337;
				int exp = -2;
				double expected = 0.04;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a positive exponent.
		*/
		@Test
		void testCeil_NegativeDouble_PositiveExponent() {
				double d = -0.00337;
				int exp = 2;
				double expected = -0.01;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a negative exponent.
		*/
		@Test
		void testCeil_NegativeDouble_NegativeExponent() {
				double d = -0.00337;
				int exp = -2;
				double expected = -0.04;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a zero exponent.
		*/
		@Test
		void testCeil_PositiveDouble_ZeroExponent() {
				double d = 0.00337;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a zero exponent.
		*/
		@Test
		void testCeil_NegativeDouble_ZeroExponent() {
				double d = -0.00337;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a positive exponent.
		*/
		@Test
		void testCeil_PositiveDouble_PositiveExponent2() {
				double d = 0.00745;
				int exp = 2;
				double expected = 0.01;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a negative exponent.
		*/
		@Test
		void testCeil_PositiveDouble_NegativeExponent2() {
				double d = 0.00745;
				int exp = -2;
				double expected = 0.08;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a positive exponent.
		*/
		@Test
		void testCeil_NegativeDouble_PositiveExponent2() {
				double d = -0.00745;
				int exp = 2;
				double expected = -0.01;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a negative exponent.
		*/
		@Test
		void testCeil_NegativeDouble_NegativeExponent2() {
				double d = -0.00745;
				int exp = -2;
				double expected = -0.08;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a positive double value and a zero exponent.
		*/
		@Test
		void testCeil_PositiveDouble_ZeroExponent2() {
				double d = 0.00745;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#ceil(double, int)}.
		* It tests the method with a negative double value and a zero exponent.
		*/
		@Test
		void testCeil_NegativeDouble_ZeroExponent2() {
				double d = -0.00745;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.ceil(d, exp);
				assertEquals(expected, actual);
		}
}

// ChartUtilities_4Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#floor(double, int)} method.
*/
class ChartUtilities_4Test {
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a positive exponent.
		*/
		@Test
		void testFloor_PositiveDouble_PositiveExponent() {
				double d = 0.00337;
				int exp = 2;
				double expected = 0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a negative exponent.
		*/
		@Test
		void testFloor_PositiveDouble_NegativeExponent() {
				double d = 0.00337;
				int exp = -2;
				double expected = 0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a positive exponent.
		*/
		@Test
		void testFloor_NegativeDouble_PositiveExponent() {
				double d = -0.00337;
				int exp = 2;
				double expected = -0.01;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a negative exponent.
		*/
		@Test
		void testFloor_NegativeDouble_NegativeExponent() {
				double d = -0.00337;
				int exp = -2;
				double expected = -0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a zero exponent.
		*/
		@Test
		void testFloor_PositiveDouble_ZeroExponent() {
				double d = 0.00337;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a zero exponent.
		*/
		@Test
		void testFloor_NegativeDouble_ZeroExponent() {
				double d = -0.00337;
				int exp = 0;
				double expected = -0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a positive exponent.
		*/
		@Test
		void testFloor_PositiveDouble_PositiveExponent2() {
				double d = 0.00745;
				int exp = 2;
				double expected = 0.01;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a negative exponent.
		*/
		@Test
		void testFloor_PositiveDouble_NegativeExponent2() {
				double d = 0.00745;
				int exp = -2;
				double expected = 0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a positive exponent.
		*/
		@Test
		void testFloor_NegativeDouble_PositiveExponent2() {
				double d = -0.00745;
				int exp = 2;
				double expected = -0.01;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a negative exponent.
		*/
		@Test
		void testFloor_NegativeDouble_NegativeExponent2() {
				double d = -0.00745;
				int exp = -2;
				double expected = -0.08;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a positive double value and a zero exponent.
		*/
		@Test
		void testFloor_PositiveDouble_ZeroExponent2() {
				double d = 0.00745;
				int exp = 0;
				double expected = 0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#floor(double, int)}.
		* It tests the method with a negative double value and a zero exponent.
		*/
		@Test
		void testFloor_NegativeDouble_ZeroExponent2() {
				double d = -0.00745;
				int exp = 0;
				double expected = -0.0;
				double actual = ChartUtilities.floor(d, exp);
				assertEquals(expected, actual);
		}
}

// ChartUtilities_4Test.java
package de.progra.charting;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartUtilities}.
* It contains ten unit test cases for the {@link ChartUtilities#exp(double)} method.
*/
class ChartUtilities_4Test {
		
		/**
		* Test case for {@link ChartUtilities#exp(double)}.
		* It tests the method with a positive double value.
		*/
		@Test
		void testExp_PositiveDouble() {
				double d = 0.00337;
				int expected = -2;
				int actual = ChartUtilities.exp(d);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#exp(double)}.
		* It tests the method with a negative double value.
		*/
		@Test
		void testExp_NegativeDouble() {
				double d = -0.00337;
				int expected = -2;
				int actual = ChartUtilities.exp(d);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ChartUtilities#exp(double)}.
		* It tests the method with a positive double