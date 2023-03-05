// FruitDistributionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {

		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero.
		*/
		@Test
		void testFruitDistribution_ZeroFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 0 oranges 0", 0);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive.
		*/
		@Test
		void testFruitDistribution_PositiveFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges 3", 5);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is negative.
		*/
		@Test
		void testFruitDistribution_NegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples -2 oranges -3", -5);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive and negative.
		*/
		@Test
		void testFruitDistribution_PositiveAndNegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges -3", -1);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero and negative.
		*/
		@Test
		void testFruitDistribution_ZeroAndNegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 0 oranges -3", -3);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero and positive.
		*/
		@Test
		void testFruitDistribution_ZeroAndPositiveFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 0 oranges 3", 3);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive and zero.
		*/
		@Test
		void testFruitDistribution_PositiveAndZeroFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges 0", 2);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is negative and zero.
		*/
		@Test
		void testFruitDistribution_NegativeAndZeroFruits() {
				int actual = FruitDistribution.fruitDistribution("apples -2 oranges 0", -2);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive and positive.
		*/
		@Test
		void testFruitDistribution_PositiveAndPositiveFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges 3", 5);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is negative and negative.
		*/
		@Test
		void testFruitDistribution_NegativeAndNegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples -2 oranges -3", -5);
				int expected = 0;
				assertEquals(expected, actual);
		}
}

// FruitDistributionTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FruitDistribution}.
* It contains ten unit test cases for the {@link FruitDistribution#fruitDistribution(String, int)} method.
*/
class FruitDistributionTest {
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero.
		*/
		@Test
		void testFruitDistribution_ZeroFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 0 oranges 0", 0);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive.
		*/
		@Test
		void testFruitDistribution_PositiveFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges 3", 5);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is negative.
		*/
		@Test
		void testFruitDistribution_NegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples -2 oranges -3", -5);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is positive and negative.
		*/
		@Test
		void testFruitDistribution_PositiveAndNegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 2 oranges -3", -1);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero and negative.
		*/
		@Test
		void testFruitDistribution_ZeroAndNegativeFruits() {
				int actual = FruitDistribution.fruitDistribution("apples 0 oranges -3", -3);
				int expected = 0;
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FruitDistribution#fruitDistribution(String, int)} method.
		* It tests the case when the number of fruits is zero and positive.