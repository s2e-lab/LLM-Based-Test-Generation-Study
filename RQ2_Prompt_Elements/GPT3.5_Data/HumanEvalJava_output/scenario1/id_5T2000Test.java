Here's the code for the `IntersperseTest` class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersperse}.
 * It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
 */
class IntersperseTest {

    @Test
    void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithSingleElementList() {
        List<Object> numbers = Arrays.asList(1);
        List<Object> expected = Arrays.asList(1);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithTwoElementList() {
        List<Object> numbers = Arrays.asList(1, 2);
        List<Object> expected = Arrays.asList(1, 0, 2);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithThreeElementList() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithFourElementList() {
        List<Object> numbers = Arrays.asList(1, 2, 3, 4);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3, 0, 4);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithDelimiterAtBeginning() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(0, 1, 0, 2, 0, 3);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithDelimiterAtEnd() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3, 0);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithNegativeDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, -1, 2, -1, 3);
        List<Object> actual = Intersperse.intersperse(numbers, -1);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithMixedTypes() {
        List<Object> numbers = Arrays.asList(1, "two", 3.0);
        List<Object> expected = Arrays.asList(1, 0, "two", 0, 3.0);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperseWithNullList() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> {
            Intersperse.intersperse(numbers, 0);
        });
    }

    @Test
    void testIntersperseWithNullDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        assertThrows(NullPointerException.class, () -> {
            Intersperse.intersperse(numbers, null);
        });
    }
}
```

This class contains ten test cases for the `Intersperse.intersperse()` method. The test cases cover different scenarios, such as empty list, single element list, list with multiple elements, list with negative delimiter, list with mixed types, and null list/delimiter. The `@Test` annotation is used to mark each test case method, and the `assertEquals()` method is used to compare the expected and actual results. The `assertThrows()` method is used to test for expected exceptions.