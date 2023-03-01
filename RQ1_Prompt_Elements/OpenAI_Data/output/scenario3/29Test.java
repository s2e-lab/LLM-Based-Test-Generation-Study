// FilterByPrefixTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

		/**
		* Test case 1.
		* Empty input list.
		*/
		@Test
		public void testEmptyList() {
				List<Object> input = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* Input list with one element.
		*/
		@Test
		public void testOneElementList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* Input list with two elements.
		*/
		@Test
		public void testTwoElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* Input list with three elements.
		*/
		@Test
		public void testThreeElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* Input list with four elements.
		*/
		@Test
		public void testFourElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* Input list with five elements.
		*/
		@Test
		public void testFiveElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				input.add("john");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* Input list with six elements.
		*/
		@Test
		public void testSixElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				input.add("john");
				input.add("john doe");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* Input list with seven elements.
		*/
		@Test
		public void testSevenElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				input.add("john");
				input.add("john doe");
				input.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* Input list with eight elements.
		*/
		@Test
		public void testEightElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				input.add("john");
				input.add("john doe");
				input.add("xxx");
				input.add("asd");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* Input list with nine elements.
		*/
		@Test
		public void testNineElementsList() {
				List<Object> input = new ArrayList<Object>();
				input.add("abc");
				input.add("bcd");
				input.add("cde");
				input.add("array");
				input.add("john");
				input.add("john doe");
				input.add("xxx");
				input.add("asd");
				input.add("xxy");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(input, "a");
				assertEquals(expected, actual);
		}
}