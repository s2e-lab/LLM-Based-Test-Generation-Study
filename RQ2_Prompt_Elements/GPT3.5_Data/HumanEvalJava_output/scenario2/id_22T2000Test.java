Here's the source code for the FilterIntegersTest class with ten unit test cases for the filterIntegers method:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterIntegersTest {

    @Test
    void testEmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithNoIntegers() {
        List<Object> values = Arrays.asList("hello", 3.14, true);
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithOneInteger() {
        List<Object> values = Arrays.asList(42);
        List<Object> expected = Arrays.asList(42);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithMultipleIntegers() {
        List<Object> values = Arrays.asList(1, "two", 3.0, 4, false, 5);
        List<Object> expected = Arrays.asList(1, 4, 5);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithAllIntegers() {
        List<Object> values = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithNullValues() {
        List<Object> values = Arrays.asList(null, 1, null, 2, null);
        List<Object> expected = Arrays.asList(1, 2);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithMixedTypes() {
        List<Object> values = Arrays.asList(1, "two", 3.0, true, false, 'c');
        List<Object> expected = Arrays.asList(1);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithLargeValues() {
        List<Object> values = Arrays.asList(Integer.MAX_VALUE, Long.MAX_VALUE, Double.MAX_VALUE);
        List<Object> expected = Arrays.asList(Integer.MAX_VALUE);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithNegativeValues() {
        List<Object> values = Arrays.asList(-1, -2, -3, -4, -5);
        List<Object> expected = Arrays.asList(-1, -2, -3, -4, -5);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }

    @Test
    void testListWithMixedSignValues() {
        List<Object> values = Arrays.asList(-1, 2, -3, 4, -5);
        List<Object> expected = Arrays.asList(-1, 2, -3, 4, -5);
        List<Object> actual = FilterIntegers.filterIntegers(values);
        assertEquals(expected, actual);
    }
}
```