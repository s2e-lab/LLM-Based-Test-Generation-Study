Here's the code for the MaxElementTest class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MaxElement}.
 * It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
 */
class MaxElementTest {

    @Test
    void testMaxElementWithEmptyList() {
        List<Integer> l = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithOneElement() {
        List<Integer> l = Arrays.asList(5);
        assertEquals(5, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithTwoElements() {
        List<Integer> l = Arrays.asList(5, 10);
        assertEquals(10, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithMultipleElements() {
        List<Integer> l = Arrays.asList(5, 10, 15, 20, 25);
        assertEquals(25, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithNegativeElements() {
        List<Integer> l = Arrays.asList(-5, -10, -15, -20, -25);
        assertEquals(-5, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithDuplicateElements() {
        List<Integer> l = Arrays.asList(5, 10, 15, 20, 25, 25);
        assertEquals(25, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithNullList() {
        assertThrows(NullPointerException.class, () -> MaxElement.maxElement(null));
    }

    @Test
    void testMaxElementWithLargeList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(20, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithRandomElements() {
        List<Integer> l = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        assertEquals(50, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElementWithMaxValue() {
        List<Integer> l = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, MaxElement.maxElement(l));
    }
}
```

This test class contains ten unit test cases for the `MaxElement.maxElement(List)` method. Each test case tests a different scenario, such as an empty list, a list with one element, a list with multiple elements, a list with negative elements, a list with duplicate elements, a null list, a large list, a list with random elements, and a list with the maximum and minimum integer values.