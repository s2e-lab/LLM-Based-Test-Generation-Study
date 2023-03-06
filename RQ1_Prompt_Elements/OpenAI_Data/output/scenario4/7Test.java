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

	@Test
	void testFilterBySubstring_EmptyList_EmptySubstring() {
		List<Object> input = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_EmptyList_NonEmptySubstring() {
		List<Object> input = new ArrayList<>();
		List<Object> expected = new ArrayList<>();
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_EmptySubstring() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bacd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_NoMatch() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bacd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "john");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_OneMatch() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bacd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		expected.add("abc");
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "abc");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_MultipleMatches() {
		List<Object> input = new ArrayList<>();
		input.add("abc");
		input.add("bacd");
		input.add("cde");
		input.add("array");
		List<Object> expected = new ArrayList<>();
		expected.add("abc");
		expected.add("bacd");
		expected.add("array");
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "a");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_MultipleMatches_MultipleOccurrences() {
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
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "xxx");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_MultipleMatches_MultipleOccurrences_SubstringLongerThanMatch() {
		List<Object> input = new ArrayList<>();
		input.add("xxx");
		input.add("asd");
		input.add("aaaxxy");
		input.add("john doe");
		input.add("xxxAAA");
		input.add("xxx");
		List<Object> expected = new ArrayList<>();
		expected.add("xxx");
		expected.add("aaaxxy");
		expected.add("xxxAAA");
		expected.add("xxx");
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "xx");
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterBySubstring_NonEmptyList_NonEmptySubstring_MultipleMatches_MultipleOccurrences_SubstringLongerThanMatch_SubstringNotAtBeginning() {
		List<Object> input = new ArrayList<>();
		input.add("grunt");
		input.add("trumpet");
		input.add("prune");
		input.add("gruesome");
		List<Object> expected = new ArrayList<>();
		expected.add("grunt");
		expected.add("prune");
		List<Object> actual = FilterBySubstring.filterBySubstring(input, "run");
		assertEquals(expected, actual);
	}
}