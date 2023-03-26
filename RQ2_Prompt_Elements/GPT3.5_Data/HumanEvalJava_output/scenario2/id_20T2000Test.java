Here's the source code for the FindClosestElementsTest class:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FindClosestElements}.
 * It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
 */
class FindClosestElementsTest {

    @Test
    void testFindClosestElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(4.0, 5.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithNegativeNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(-5.0, -4.0, -3.0, -2.0, -1.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(-2.0, -1.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithMixedNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(-5.0, -4.0, 3.0, 2.0, 1.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(1.0, 2.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithRepeatedNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(3.0, 3.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithTwoNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(1.0, 2.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithThreeNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(2.0, 3.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithFourNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(3.0, 4.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithFiveNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(4.0, 5.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithEmptyList() {
        List<Double> numbers = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithSingleNumber() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0));
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers));
    }
}
```

This test class contains ten unit test cases for the `findClosestElements` method of the `FindClosestElements` class. The test cases cover different scenarios, such as lists with positive and negative numbers, repeated numbers, and lists of different lengths. The last two test cases check for invalid input, such as an empty list or a list with only one number.