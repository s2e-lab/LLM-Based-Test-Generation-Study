// FilterBySubstringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list is empty.
     */
    @Test
    void testFilterBySubstring_emptyList() {
        List<Object> strings = List.of();
        String substring = "a";
        List<Object> expected = List.of();
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that do not contain the given substring.
     */
    @Test
    void testFilterBySubstring_noMatch() {
        List<Object> strings = List.of("abc", "bacd", "cde", "array");
        String substring = "a";
        List<Object> expected = List.of();
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that contain the given substring.
     */
    @Test
    void testFilterBySubstring_match() {
        List<Object> strings = List.of("abc", "bacd", "cde", "array");
        String substring = "a";
        List<Object> expected = List.of("abc", "bacd", "array");
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that do not contain the given substring.
     */
    @Test
    void testFilterBySubstring_noMatch2() {
        List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        String substring = "john";
        List<Object> expected = List.of();
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that contain the given substring.
     */
    @Test
    void testFilterBySubstring_match2() {
        List<Object> strings = List.of("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
        String substring = "xxx";
        List<Object> expected = List.of("xxx", "xxxAAA", "xxx");
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that contain the given substring.
     */
    @Test
    void testFilterBySubstring_match3() {
        List<Object> strings = List.of("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx");
        String substring = "xx";
        List<Object> expected = List.of("xxx", "aaaxxy", "xxxAAA", "xxx");
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }

    /**
     * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains
     * only strings that contain the given substring.
     */
    @Test
    void testFilterBySubstring_match4() {
        List<Object> strings = List.of("grunt", "trumpet", "prune", "gruesome");
        String substring = "run";
        List<Object> expected = List.of("grunt", "prune");
        assertEquals(expected, FilterBySubstring.filterBySubstring(strings, substring));
    }
}
