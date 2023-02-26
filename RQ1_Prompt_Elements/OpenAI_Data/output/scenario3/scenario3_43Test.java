// PairsSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

		/**
		* Test case 1.
		* The input list contains two distinct elements that sum to zero.
		* The expected result is true.
		*/
		@Test
		void test1() {
				List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
				assertTrue(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 2.
		* The input list contains two distinct elements that sum to zero.
		* The expected result is true.
		*/
		@Test
		void test2() {
				List<Integer> l = List.of(-3, 9, -1, 3, 2, 30);
				assertTrue(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 3.
		* The input list contains two distinct elements that sum to zero.
		* The expected result is true.
		*/
		@Test
		void test3() {
				List<Integer> l = List.of(-3, 9, -1, 3, 2, 31);
				assertTrue(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 4.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test4() {
				List<Integer> l = List.of(1, 3, 5, 0);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 5.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test5() {
				List<Integer> l = List.of(1, 3, -2, 1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 6.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test6() {
				List<Integer> l = List.of(1, 2, 3, 7);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 7.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test7() {
				List<Integer> l = List.of(1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 8.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test8() {
				List<Integer> l = List.of(-3, 9, -1, 4, 2, 30);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 9.
		* The input list does not contain two distinct elements that sum to zero.
		* The expected result is false.
		*/
		@Test
		void test9() {
				List<Integer> l = List.of(-3, 9, -1, 4, 2, 31);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 10.
		* The input list is empty.
		* The expected result is false.
		*/
		@Test
		void test10() {
				List<Integer> l = List.of();
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
}