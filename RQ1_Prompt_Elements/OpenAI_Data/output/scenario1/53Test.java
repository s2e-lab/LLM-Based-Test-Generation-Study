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
		void testAdd_PositivePositive_CorrectValue() {
				int expected = 30;
				int actual = Add.add(10, 20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testAdd_NegativePositive_CorrectValue() {
				int expected = -10;
				int actual = Add.add(-20, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testAdd_PositiveNegative_CorrectValue() {
				int expected = -10;
				int actual = Add.add(20, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testAdd_NegativeNegative_CorrectValue() {
				int expected = -30;
				int actual = Add.add(-10, -20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testAdd_ZeroZero_CorrectValue() {
				int expected = 0;
				int actual = Add.add(0, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testAdd_ZeroPositive_CorrectValue() {
				int expected = 10;
				int actual = Add.add(0, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testAdd_PositiveZero_CorrectValue() {
				int expected = 10;
				int actual = Add.add(10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second parameter is negative.
		*/
		@Test
		void testAdd_ZeroNegative_CorrectValue() {
				int expected = -10;
				int actual = Add.add(0, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second parameter is zero.
		*/
		@Test
		void testAdd_NegativeZero_CorrectValue() {
				int expected = -10;
				int actual = Add.add(-10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value and the second parameter is one.
		*/
		@Test
		void testAdd_MaxIntOne_CorrectValue() {
				int expected = Integer.MAX_VALUE;
				int actual = Add.add(Integer.MAX_VALUE, 1);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value and the second parameter is negative one.
		*/
		@Test
		void testAdd_MinIntNegativeOne_CorrectValue() {
				int expected = Integer.MIN_VALUE;
				int actual = Add.add(Integer.MIN_VALUE, -1);
				assertEquals(expected, actual);
		}
}

// Sub.java
package scenario1;

class Sub {

    public static int sub(int x, int y) {
        return x - y;
    }
}

// SubTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Sub}.
* It contains ten unit test cases for the {@link Sub#sub(int, int)} method.
*/
class SubTest {
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testSub_PositivePositive_CorrectValue() {
				int expected = -10;
				int actual = Sub.sub(10, 20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testSub_NegativePositive_CorrectValue() {
				int expected = -30;
				int actual = Sub.sub(-20, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testSub_PositiveNegative_CorrectValue() {
				int expected = 30;
				int actual = Sub.sub(20, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testSub_NegativeNegative_CorrectValue() {
				int expected = 10;
				int actual = Sub.sub(-10, -20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testSub_ZeroZero_CorrectValue() {
				int expected = 0;
				int actual = Sub.sub(0, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testSub_ZeroPositive_CorrectValue() {
				int expected = -10;
				int actual = Sub.sub(0, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testSub_PositiveZero_CorrectValue() {
				int expected = 10;
				int actual = Sub.sub(10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second parameter is negative.
		*/
		@Test
		void testSub_ZeroNegative_CorrectValue() {
				int expected = 10;
				int actual = Sub.sub(0, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second parameter is zero.
		*/
		@Test
		void testSub_NegativeZero_CorrectValue() {
				int expected = -10;
				int actual = Sub.sub(-10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value and the second parameter is one.
		*/
		@Test
		void testSub_MaxIntOne_CorrectValue() {
				int expected = Integer.MAX_VALUE - 1;
				int actual = Sub.sub(Integer.MAX_VALUE, 1);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value and the second parameter is negative one.
		*/
		@Test
		void testSub_MinIntNegativeOne_CorrectValue() {
				int expected = Integer.MIN_VALUE + 1;
				int actual = Sub.sub(Integer.MIN_VALUE, -1);
				assertEquals(expected, actual);
		}
}

// Mul.java
package scenario1;

class Mul {

    public static int mul(int x, int y) {
        return x * y;
    }
}

// MulTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Mul}.
* It contains ten unit test cases for the {@link Mul#mul(int, int)} method.
*/
class MulTest {
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testMul_PositivePositive_CorrectValue() {
				int expected = 200;
				int actual = Mul.mul(10, 20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testMul_NegativePositive_CorrectValue() {
				int expected = -200;
				int actual = Mul.mul(-20, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testMul_PositiveNegative_CorrectValue() {
				int expected = -200;
				int actual = Mul.mul(20, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testMul_NegativeNegative_CorrectValue() {
				int expected = 200;
				int actual = Mul.mul(-10, -20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testMul_ZeroZero_CorrectValue() {
				int expected = 0;
				int actual = Mul.mul(0, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testMul_ZeroPositive_CorrectValue() {
				int expected = 0;
				int actual = Mul.mul(0, 10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testMul_PositiveZero_CorrectValue() {
				int expected = 0;
				int actual = Mul.mul(10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second parameter is negative.
		*/
		@Test
		void testMul_ZeroNegative_CorrectValue() {
				int expected = 0;
				int actual = Mul.mul(0, -10);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second parameter is zero.
		*/
		@Test
		void testMul_NegativeZero_CorrectValue() {
				int expected = 0;
				int actual = Mul.mul(-10, 0);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		*