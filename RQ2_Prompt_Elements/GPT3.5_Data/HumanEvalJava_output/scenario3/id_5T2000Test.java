// IntersperseTest.java
package scenario3;

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
    void testEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithOneElement() {
        List<Object> numbers = Arrays.asList(1);
        List<Object> expected = Arrays.asList(1);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithTwoElements() {
        List<Object> numbers = Arrays.asList(1, 2);
        List<Object> expected = Arrays.asList(1, 4, 2);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithThreeElements() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 4, 2, 4, 3);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithFourElements() {
        List<Object> numbers = Arrays.asList(5, 6, 3, 2);
        List<Object> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        assertEquals(expected, Intersperse.intersperse(numbers, 8));
    }

    @Test
    void testListWithSameElements() {
        List<Object> numbers = Arrays.asList(2, 2, 2);
        List<Object> expected = Arrays.asList(2, 2, 2, 2, 2);
        assertEquals(expected, Intersperse.intersperse(numbers, 2));
    }

    @Test
    void testListWithNegativeDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, -4, 2, -4, 3);
        assertEquals(expected, Intersperse.intersperse(numbers, -4));
    }

    @Test
    void testListWithZeroDelimiter() {
        List<Object> numbers = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3);
        assertEquals(expected, Intersperse.intersperse(numbers, 0));
    }

    @Test
    void testListWithNullElements() {
        List<Object> numbers = Arrays.asList(1, null, 3);
        List<Object> expected = Arrays.asList(1, 4, null, 4, 3);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithDifferentTypes() {
        List<Object> numbers = Arrays.asList(1, "two", 3.0);
        List<Object> expected = Arrays.asList(1, 4, "two", 4, 3.0);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }

    @Test
    void testListWithLargeNumbers() {
        List<Object> numbers = Arrays.asList(Integer.MAX_VALUE, Long.MAX_VALUE, Double.MAX_VALUE);
        List<Object> expected = Arrays.asList(Integer.MAX_VALUE, 4, Long.MAX_VALUE, 4, Double.MAX_VALUE);
        assertEquals(expected, Intersperse.intersperse(numbers, 4));
    }
}