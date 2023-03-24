// FilterByPrefixTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FilterByPrefix}.
 * It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
 */
class FilterByPrefixTest {

    @Test
    void testEmptyList() {
        List<Object> strings = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(expected, actual);
    }

    @Test
    void testNoMatch() {
        List<Object> strings = Arrays.asList("bcd", "cde", "array");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleMatch() {
        List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
        List<Object> expected = Arrays.asList("abc");
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleMatches() {
        List<Object> strings = Arrays.asList("abc", "bcd", "cde", "array");
        List<Object> expected = Arrays.asList("abc", "array");
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(expected, actual);
    }

    @Test
    void testNoMatchLongPrefix() {
        List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "john");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleMatchLongPrefix() {
        List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<Object> expected = Arrays.asList("john doe");
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "john ");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleMatchesLongPrefix() {
        List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx", "john smith", "johnny");
        List<Object> expected = Arrays.asList("john doe", "john smith", "johnny");
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "john");
        assertEquals(expected, actual);
    }

    @Test
    void testNoMatchEmptyPrefix() {
        List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "");
        assertEquals(expected, actual);
    }

    @Test
    void testAllMatchEmptyPrefix() {
        List<Object> strings = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<Object> expected = Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx");
        List<Object> actual = FilterByPrefix.filterByPrefix(strings, "");
        assertEquals(expected, actual);
    }
}