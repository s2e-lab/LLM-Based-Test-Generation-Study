// DecimalToBinaryTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 0.
		*/
		@Test
		void testDecimalToBinary0() {
				assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 1.
		*/
		@Test
		void testDecimalToBinary1() {
				assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 2.
		*/
		@Test
		void testDecimalToBinary2() {
				assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 3.
		*/
		@Test
		void testDecimalToBinary3() {
				assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 4.
		*/
		@Test
		void testDecimalToBinary4() {
				assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 5.
		*/
		@Test
		void testDecimalToBinary5() {
				assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 6.
		*/
		@Test
		void testDecimalToBinary6() {
				assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 7.
		*/
		@Test
		void testDecimalToBinary7() {
				assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 8.
		*/
		@Test
		void testDecimalToBinary8() {
				assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
		}
		
		/**
		* Test case for {@link DecimalToBinary#decimalToBinary(int)} method.
		* It tests if the method returns the correct binary representation of the decimal number 9.
		*/
		@Test
		void testDecimalToBinary9() {
				assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
		}
}