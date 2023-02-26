// AddTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testAddPositivePositive() {
				assertEquals(5, Add.add(2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testAddNegativePositive() {
				assertEquals(-1, Add.add(-2, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testAddPositiveNegative() {
				assertEquals(-1, Add.add(2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testAddNegativeNegative() {
				assertEquals(-5, Add.add(-2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testAddZeroZero() {
				assertEquals(0, Add.add(0, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testAddZeroPositive() {
				assertEquals(3, Add.add(0, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testAddPositiveZero() {
				assertEquals(3, Add.add(3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testAddZeroNegative() {
				assertEquals(-3, Add.add(0, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testAddNegativeZero() {
				assertEquals(-3, Add.add(-3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the maximum integer value.
		*/
		@Test
		void testAddMaxMax() {
				assertEquals(-2, Add.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the minimum integer value.
		*/
		@Test
		void testAddMinMin() {
				assertEquals(0, Add.add(Integer.MIN_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testAddMaxPositive() {
				assertEquals(-2147483648, Add.add(Integer.MAX_VALUE, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testAddPositiveMax() {
				assertEquals(-2147483648, Add.add(1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testAddMinPositive() {
				assertEquals(-2147483647, Add.add(Integer.MIN_VALUE, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testAddPositiveMin() {
				assertEquals(-2147483647, Add.add(1, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testAddMaxNegative() {
				assertEquals(2147483647, Add.add(Integer.MAX_VALUE, -1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testAddNegativeMax() {
				assertEquals(2147483647, Add.add(-1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testAddMinNegative() {
				assertEquals(2147483646, Add.add(Integer.MIN_VALUE, -1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testAddNegativeMin() {
				assertEquals(2147483646, Add.add(-1, Integer.MIN_VALUE));
		}
}