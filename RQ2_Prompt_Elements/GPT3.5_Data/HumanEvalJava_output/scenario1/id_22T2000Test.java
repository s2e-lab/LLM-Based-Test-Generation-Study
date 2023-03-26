Here's an example implementation of the `FilterIntegersTest` class with ten unit test cases for the `filterIntegers` method:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FilterIntegers}.
 * It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
 */
class FilterIntegersTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithNoIntegers() {
        List<Object> input = Arrays.asList("hello", 3.14, true);
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithOneInteger() {
        List<Object> input = Arrays.asList(42);
        List<Object> expectedOutput = Arrays.asList(42);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithMultipleIntegers() {
        List<Object> input = Arrays.asList(1, "hello", 2, 3.14, 4, true, 5);
        List<Object> expectedOutput = Arrays.asList(1, 2, 4, 5);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithAllIntegers() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expectedOutput = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithNullValues() {
        List<Object> input = Arrays.asList(null, 1, null, 2, null);
        List<Object> expectedOutput = Arrays.asList(1, 2);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithNegativeIntegers() {
        List<Object> input = Arrays.asList(-5, -4, -3, -2, -1);
        List<Object> expectedOutput = Arrays.asList(-5, -4, -3, -2, -1);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithMixedTypes() {
        List<Object> input = Arrays.asList(1, "hello", 2, 3.14, 4, true, 5, 'a');
        List<Object> expectedOutput = Arrays.asList(1, 2, 4, 5);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithLargeIntegers() {
        List<Object> input = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        List<Object> expectedOutput = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }

    @Test
    void testListWithRepeatedIntegers() {
        List<Object> input = Arrays.asList(1, 2, 3, 2, 1);
        List<Object> expectedOutput = Arrays.asList(1, 2, 3, 2, 1);
        assertEquals(expectedOutput, FilterIntegers.filterIntegers(input));
    }
}
```