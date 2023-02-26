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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with an empty list and an empty substring.
		*/
		@Test
		void testFilterBySubstring_EmptyListEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with an empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_EmptyListNonEmptySubstring() {
				List<Object> strings = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterBySubstring.filterBySubstring(strings, "a");
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and an empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListEmptySubstring() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring2() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring3() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring4() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring5() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.
		* It tests the method with a non-empty list and a non-empty substring.
		*/
		@Test
		void testFilterBySubstring_NonEmptyListNonEmptySubstring6() {
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
		* Test case for {@link FilterBySubstring#filterBySubstring(List, String)} method.