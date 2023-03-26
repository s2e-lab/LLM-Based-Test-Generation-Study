Here's the code for the `FilterBySubstringTest` class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FilterBySubstring}.
 * It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
 */
class FilterBySubstringTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }

    @Test
    void testNoMatch() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleMatch() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "orl");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleMatches() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "o");
        assertEquals(expected, actual);
    }

    @Test
    void testAllMatches() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("hello", "world", "foo");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "o");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsPrefix() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "wor");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsSuffix() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("hello");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "ell");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsEntireString() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = Arrays.asList("foo");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "foo");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsEmptyString() {
        List<Object> input = Arrays.asList("hello", "world", "foo", "bar");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "");
        assertEquals(expected, actual);
    }

    @Test
    void testNullInput() {
        List<Object> input = null;
        assertThrows(NullPointerException.class, () -> {
            FilterBySubstring.filterBySubstring(input, "test");
        });
    }
}
```

This class contains ten test cases for the `filterBySubstring` method. The test cases cover various scenarios, such as an empty input list, no matches, single match, multiple matches, all matches, substring as prefix, substring as suffix, substring as entire string, empty substring, and null input. The `assertEquals` method is used to compare the expected and actual results of the method. The `assertThrows` method is used to test for a `NullPointerException` when the input list is null.