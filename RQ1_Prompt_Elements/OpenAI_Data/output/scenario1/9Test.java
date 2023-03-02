// RollingMaxTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {
/**
		* Test case 1.
		* The input list is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input list contains one element.
		* The expected result is a list containing the same element.
		*/
		@Test
		void testCase2() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input list contains two elements.
		* The expected result is a list containing the maximum of the two elements.
		*/
		@Test
		void testCase3() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input list contains three elements.
		* The expected result is a list containing the maximum of the three elements.
		*/
		@Test
		void testCase4() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input list contains four elements.
		* The expected result is a list containing the maximum of the four elements.
		*/
		@Test
		void testCase5() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input list contains five elements.
		* The expected result is a list containing the maximum of the five elements.
		*/
		@Test
		void testCase6() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input list contains six elements.
		* The expected result is a list containing the maximum of the six elements.
		*/
		@Test
		void testCase7() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input list contains seven elements.
		* The expected result is a list containing the maximum of the seven elements.
		*/
		@Test
		void testCase8() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input list contains eight elements.
		* The expected result is a list containing the maximum of the eight elements.
		*/
		@Test
		void testCase9() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input list contains nine elements.
		* The expected result is a list containing the maximum of the nine elements.
		*/
		@Test
		void testCase10() {
				List<Object> input = new ArrayList<Object>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(5);
				input.add(6);
				input.add(7);
				input.add(8);
				input.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				expected.add(9);
				List<Object> actual = RollingMax.rollingMax(input);
				assertEquals(expected, actual);
		}
}