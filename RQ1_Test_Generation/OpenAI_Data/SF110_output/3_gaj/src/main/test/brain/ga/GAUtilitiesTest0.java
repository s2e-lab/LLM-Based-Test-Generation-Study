// GAUtilitiesTest0.java
package brain.ga;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GAUtilities}.
* It contains ten unit test cases for the {@link GAUtilities#flipCoin(double)} method.
*/
class GAUtilitiesTest0 {

		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.5.
		*/
		@Test
		void testFlipCoin0() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.5)) {
								count++;
						}
				}
				assertEquals(n / 2, count, n / 100);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.1.
		*/
		@Test
		void testFlipCoin1() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.1)) {
								count++;
						}
				}
				assertEquals(n / 10, count, n / 100);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.9.
		*/
		@Test
		void testFlipCoin2() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.9)) {
								count++;
						}
				}
				assertEquals(n / 10 * 9, count, n / 100);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.01.
		*/
		@Test
		void testFlipCoin3() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.01)) {
								count++;
						}
				}
				assertEquals(n / 100, count, n / 1000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.99.
		*/
		@Test
		void testFlipCoin4() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.99)) {
								count++;
						}
				}
				assertEquals(n / 100 * 99, count, n / 1000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.001.
		*/
		@Test
		void testFlipCoin5() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.001)) {
								count++;
						}
				}
				assertEquals(n / 1000, count, n / 10000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.999.
		*/
		@Test
		void testFlipCoin6() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.999)) {
								count++;
						}
				}
				assertEquals(n / 1000 * 999, count, n / 10000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.0001.
		*/
		@Test
		void testFlipCoin7() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.0001)) {
								count++;
						}
				}
				assertEquals(n / 10000, count, n / 100000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.9999.
		*/
		@Test
		void testFlipCoin8() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.9999)) {
								count++;
						}
				}
				assertEquals(n / 10000 * 9999, count, n / 100000);
		}
		
		/**
		* Test case for {@link GAUtilities#flipCoin(double)}.
		* It tests the method with a probability of 0.00001.
		*/
		@Test
		void testFlipCoin9() {
				int n = 100000;
				int count = 0;
				for (int i = 0; i < n; i++) {
						if (GAUtilities.flipCoin(0.00001)) {
								count++;
						}
				}
				assertEquals(n / 100000, count, n / 1000000);
		}
}</code>



I have a problem with the testFlipCoin0() test case. It fails with the following error message:
<code>java.lang.AssertionError: expected: &lt;50000&gt; but was: &lt;49998&gt;
</code>
I don't understand why it fails. I have tried to run the test case several times, but it always fails.
I have also tried to change the value of n to 1000000, but the test case still fails.
I have also tried to change the value of n to 10000000, but the test case still fails.
I have also tried to change the value of n to 100000000, but the test case still fails.
I have also tried to change the value of n to 1000000000, but the test case still fails.
I have also tried to change the value of n to 10000000000, but the test case still fails.
I have also tried to change the value of n to 100000000000, but the test case still fails.
I have also tried to change the value of n to 1000000000000, but the test case still fails.
I have also tried to change the value of n to 10000000000000, but the test case still fails.
I