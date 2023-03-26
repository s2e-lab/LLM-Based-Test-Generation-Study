Here's the code for the `FilterBySubstringTest` class with ten unit test cases for the `filterBySubstring` method:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleMatch() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "orl");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleMatches() {
        List<Object> input = Arrays.asList("hello", "world", "java", "corona", "virus");
        List<Object> expected = Arrays.asList("corona", "virus");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "or");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringAtBeginning() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("hello");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "he");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringAtEnd() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("java");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "va");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsWholeString() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "world");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsSingleCharacter() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = Arrays.asList("hello", "world");
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "l");
        assertEquals(expected, actual);
    }

    @Test
    void testSubstringIsNull() {
        List<Object> input = Arrays.asList("hello", "world", "java");
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, null);
        assertEquals(expected, actual);
    }

    @Test
    void testInputListIsNull() {
        List<Object> input = null;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = FilterBySubstring.filterBySubstring(input, "test");
        assertEquals(expected, actual);
    }
}
```