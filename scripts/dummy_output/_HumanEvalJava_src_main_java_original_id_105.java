// ByLengthTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link ByLength}.
 * It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
 */
class ByLengthTest {

    @Test
    void testEmptyArray() {
        List<Integer> arr = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithStrangeNumbers() {
        List<Integer> arr = Arrays.asList(1, -1, 55);
        List<String> expected = Arrays.asList("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersBetweenOneAndNine() {
        List<Integer> arr = Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3);
        List<String> expected = Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersGreaterThanNine() {
        List<Integer> arr = Arrays.asList(10, 11, 12);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithAllNumbersLessThanOne() {
        List<Integer> arr = Arrays.asList(-1, 0);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberBetweenOneAndNine() {
        List<Integer> arr = Arrays.asList(3);
        List<String> expected = Arrays.asList("Three");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberLessThanOne() {
        List<Integer> arr = Arrays.asList(0);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithOneNumberGreaterThanNine() {
        List<Integer> arr = Arrays.asList(10);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithRepeatedNumbers() {
        List<Integer> arr = Arrays.asList(2, 2, 2, 1, 1, 1, 3, 3, 3);
        List<String> expected = Arrays.asList("Three", "Three", "Three", "Two", "Two", "Two", "One", "One", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testArrayWithNumbersInDescendingOrder() {
        List<Integer> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }
}