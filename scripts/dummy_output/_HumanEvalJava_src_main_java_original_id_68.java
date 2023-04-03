// PluckTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link Pluck}.
 * It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
 */
class PluckTest {

    @Test
    void testPluckWithEvenValues() {
        List<Integer> arr = Arrays.asList(4, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithEvenValuesUnordered() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithEmptyList() {
        List<Integer> arr = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMultipleEvenValues() {
        List<Integer> arr = Arrays.asList(5, 0, 3, 0, 4, 2);
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMultipleEvenValuesUnordered() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 0, 5, 3);
        List<Integer> expected = Arrays.asList(0, 3);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithRepeatedEvenValues() {
        List<Integer> arr = Arrays.asList(5, 4, 8, 4, 8);
        List<Integer> expected = Arrays.asList(4, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithNoEvenValues() {
        List<Integer> arr = Arrays.asList(7, 6, 7, 1);
        List<Integer> expected = Arrays.asList(6, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithAllOddValues() {
        List<Integer> arr = Arrays.asList(7, 9, 7, 1);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMaxValues() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        List<Integer> expected = Arrays.asList(0, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluckWithMaxValuesAndNoEvenValues() {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i * 2 + 1);
        }
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(arr));
    }
}