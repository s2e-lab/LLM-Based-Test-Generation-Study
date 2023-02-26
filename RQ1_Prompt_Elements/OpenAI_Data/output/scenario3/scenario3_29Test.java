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
		* Empty list and empty prefix.
		*/
		@Test
		public void testEmptyListEmptyPrefix() {
				List<Object> list = new ArrayList<Object>();
				String prefix = "";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* Empty list and non-empty prefix.
		*/
		@Test
		public void testEmptyListNonEmptyPrefix() {
				List<Object> list = new ArrayList<Object>();
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* Non-empty list and empty prefix.
		*/
		@Test
		public void testNonEmptyListEmptyPrefix() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "";
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("bcd");
				expected.add("cde");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "a";
				List<Object> expected = new ArrayList<Object>();
				expected.add("abc");
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix2() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "b";
				List<Object> expected = new ArrayList<Object>();
				expected.add("bcd");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix3() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "c";
				List<Object> expected = new ArrayList<Object>();
				expected.add("cde");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix4() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "d";
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix5() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "array";
				List<Object> expected = new ArrayList<Object>();
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix6() {
				List<Object> list = new ArrayList<Object>();
				list.add("abc");
				list.add("bcd");
				list.add("cde");
				list.add("array");
				String prefix = "arr";
				List<Object> expected = new ArrayList<Object>();
				expected.add("array");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* Non-empty list and non-empty prefix.
		*/
		@Test
		public void testNonEmptyListNonEmptyPrefix7() {
				List<Object> list = new ArrayList<Object>();
				list.add("xxx");
				list.add("asd");
				list.add("xxy");
				list.add("john doe");
				list.add("xxxAAA");
				list.add("xxx");
				String prefix = "xxx";
				List<Object> expected = new ArrayList<Object>();
				expected.add("xxx");
				expected.add("xxxAAA");
				expected.add("xxx");
				List<Object> actual = FilterByPrefix.filterByPrefix(list, prefix);
				assertEquals(expected, actual);
		}
}