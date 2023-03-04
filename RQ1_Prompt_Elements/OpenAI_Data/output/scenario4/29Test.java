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

	@Test
	void testFilterByPrefix_emptyList() {
		List<Object> input = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
	}
	
	@Test
	void testFilterByPrefix_emptyPrefix() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, ""));
	}
	
	@Test
	void testFilterByPrefix_noMatch() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "john"));
	}
	
	@Test
	void testFilterByPrefix_oneMatch() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		expected.add("abc");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bcd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		expected.add("abc");
		expected.add("array");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "a"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xxx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "XXX"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_2() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "XxX"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_3() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_4() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_5() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_6() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_7() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_8() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_9() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
	
	@Test
	void testFilterByPrefix_multipleMatches_samePrefix_caseSensitive_10() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("xxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("xxxAAA");
		expected.add("xxx");
		assertEquals(expected, FilterByPrefix.filterByPrefix(input, "xXx"));
	}
}