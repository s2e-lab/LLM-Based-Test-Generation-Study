// FilterBySubstringTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

		/**
		* Test case 1.
		* Empty list of strings and empty substring.
		*/
		@Test
		public void testEmptyListEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* Non-empty list of strings and empty substring.
		*/
		@Test
		public void testNonEmptyListEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bacd");
				strings.add("cde");
				strings.add("array");
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* Empty list of strings and non-empty substring.
		*/
		@Test
		public void testEmptyListNonEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("abc");
				strings.add("bacd");
				strings.add("cde");
				strings.add("array");
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("bacd");
				expected.add("array");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring2() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("xxx");
				strings.add("asd");
				strings.add("xxy");
				strings.add("john doe");
				strings.add("xxxAAA");
				strings.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "xxx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring3() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("xxx");
				strings.add("asd");
				strings.add("aaaxxy");
				strings.add("john doe");
				strings.add("xxxAAA");
				strings.add("xxx");
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("aaaxxy");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "xx");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring4() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("grunt");
				strings.add("trumpet");
				strings.add("prune");
				strings.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "run");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring5() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("grunt");
				strings.add("trumpet");
				strings.add("prune");
				strings.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "run");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring6() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("grunt");
				strings.add("trumpet");
				strings.add("prune");
				strings.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "run");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* Non-empty list of strings and non-empty substring.
		*/
		@Test
		public void testNonEmptyListNonEmptySubstring7() {
				List<Object> strings = new ArrayList<Object>();
				strings.add("grunt");
				strings.add("trumpet");
				strings.add("prune");
				strings.add("gruesome");
				List<Object> expected = new ArrayList<Object>();
				expected.add("grunt");
				expected.add("prune");
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "run");
				assertEquals(expected, actual);
		}
}