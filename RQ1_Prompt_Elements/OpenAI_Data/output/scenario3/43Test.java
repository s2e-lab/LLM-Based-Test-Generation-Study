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
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_1() {
				List<Integer> l = List.of(1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 2.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_2() {
				List<Integer> l = List.of(1, 3, 5, 0);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 3.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_3() {
				List<Integer> l = List.of(1, 3, -2, 1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 4.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_4() {
				List<Integer> l = List.of(1, 2, 3, 7);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 5.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_5() {
				List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
				assertTrue(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 6.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_6() {
				List<Integer> l = List.of(1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 7.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_7() {
				List<Integer> l = List.of(1, 3, 5, 0);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 8.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_8() {
				List<Integer> l = List.of(1, 3, -2, 1);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 9.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_9() {
				List<Integer> l = List.of(1, 2, 3, 7);
				assertFalse(PairsSumToZero.pairsSumToZero(l));
		}
		
		/**
		* Test case 10.
		* It tests the {@link PairsSumToZero#pairsSumToZero(List)} method.
		* It checks if the method returns false when the list contains only one element.
		*/
		@Test
		void testPairsSumToZero_10() {
				List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
				assertTrue(PairsSumToZero.pairsSumToZero(l));
		}
}