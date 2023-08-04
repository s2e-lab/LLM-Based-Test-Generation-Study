// FilterByPrefixTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

    /**
     * Test case for {@link FilterByPrefix#filterByPrefix(List, String)} where the input list is empty.
     */
    @Test
    void testFilterByPrefix_emptyList() {
        List<Object> strings = List.of();
        String prefix = "a";
        List<Object> expected = List.of();
        assertEquals(expected, FilterByPrefix.filterByPrefix(strings, prefix));
    }

    /**
     * Test case for {@link FilterByPrefix#filterByPrefix(List, String)} where the input list contains only
     * elements that do not start with the given prefix.
     */
    @Test
    void testFilterByPrefix_noMatch() {
        List<Object> strings = List.of("abc", "bcd", "cde", "array");
        String prefix = "a";
        List<Object> expected = List.of();
        assertEquals(expected, FilterByPrefix.filterByPrefix(strings, prefix));
    }

    /**
     * Test case for {@link FilterByPrefix#filterByPrefix(List, String)} where the input list contains only
     * elements that start with the given prefix.
     */
    @Test
    void testFilterByPrefix_match() {
        List<Object> strings = List.of("abc", "array");
        String prefix = "a";
        List<Object> expected = List.of("abc", "array");
        assertEquals(expected, FilterByPrefix.filterByPrefix(strings, prefix));
    }

    /**
     * Test case for {@link FilterByPrefix#filterByPrefix(List, String)} where the input list contains only
     * elements that do not start with the given prefix.
     */
    @Test
    void testFilterByPrefix_noMatch2() {
        List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        String prefix = "john";
        List<Object> expected = List.of();
        assertEquals(expected, FilterByPrefix.filterByPrefix(strings, prefix));
    }

    /**
     * Test case for {@link FilterByPrefix#filterByPrefix(List, String)} where the input list contains only
     * elements that start with the given prefix.
     */
    @Test
    void testFilterByPrefix_match2() {
        List<Object> strings = List.of("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        String prefix = "xxx";
        List<Object> expected = List.of("xxx", "xxxAAA", "xxx");
        assertEquals(expected, FilterByPrefix.filterByPrefix(strings, prefix));
    }
}
