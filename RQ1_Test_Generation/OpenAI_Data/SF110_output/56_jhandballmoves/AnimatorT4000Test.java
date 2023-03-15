// AnimatorTest.java
package visu.handball.moves.model.animation;

import visu.handball.moves.model.HandballModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Animator}.
* It contains ten unit test cases for the {@link Animator#getDelayUnits(int)} method.
*/
class AnimatorTest {

		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 0.
		*/
		@Test
		void testGetDelayUnits_0() {
				assertEquals(0, Animator.getDelayUnits(0));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 1.
		*/
		@Test
		void testGetDelayUnits_1() {
				assertEquals(10, Animator.getDelayUnits(1));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 2.
		*/
		@Test
		void testGetDelayUnits_2() {
				assertEquals(20, Animator.getDelayUnits(2));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 3.
		*/
		@Test
		void testGetDelayUnits_3() {
				assertEquals(30, Animator.getDelayUnits(3));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 4.
		*/
		@Test
		void testGetDelayUnits_4() {
				assertEquals(40, Animator.getDelayUnits(4));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 5.
		*/
		@Test
		void testGetDelayUnits_5() {
				assertEquals(50, Animator.getDelayUnits(5));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 6.
		*/
		@Test
		void testGetDelayUnits_6() {
				assertEquals(60, Animator.getDelayUnits(6));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 7.
		*/
		@Test
		void testGetDelayUnits_7() {
				assertEquals(70, Animator.getDelayUnits(7));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 8.
		*/
		@Test
		void testGetDelayUnits_8() {
				assertEquals(80, Animator.getDelayUnits(8));
		}
		
		/**
		* Test case for {@link Animator#getDelayUnits(int)} method.
		* The test case checks if the method returns the correct value for a delay of 9.
		*/
		@Test
		void testGetDelayUnits_9() {
				assertEquals(90, Animator.getDelayUnits(9));
		}
}</code>





A:

The problem is that you are using <code>assertEquals</code> with <code>int</code> values.
<code>assertEquals</code> is a method that takes two objects as parameters.
When you pass <code>int</code> values, the compiler will automatically convert them to <code>Integer</code> objects.
The problem is that <code>Integer</code> objects are cached for values between -128 and 127.
So, when you pass <code>0</code> as the expected value, you are actually passing the same <code>Integer</code> object for all the tests.
The solution is to use <code>assertEquals</code> with <code>long</code> values.
