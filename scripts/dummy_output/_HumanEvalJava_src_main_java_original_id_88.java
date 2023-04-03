// SortArray1Test.java
package original;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link SortArray1}.
 * It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
 */
class SortArray1Test {

    @Test
    void testSortArrayEmptyList() {
        List<Integer> array = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArraySingleElementList() {
        List<Integer> array = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayOddSum() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayEvenSum() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6);
        List<Integer> expected = Arrays.asList(6, 5, 4, 3, 2, 1, 0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayTwoElements() {
        List<Integer> array = Arrays.asList(2, 1);
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayDescendingOrder() {
        List<Integer> array = Arrays.asList(15, 42, 87, 32, 11, 0);
        List<Integer> expected = Arrays.asList(0, 11, 15, 32, 42, 87);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayAscendingOrder() {
        List<Integer> array = Arrays.asList(21, 14, 23, 11);
        List<Integer> expected = Arrays.asList(23, 21, 14, 11);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayRepeatedElements() {
        List<Integer> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6, 4, 5, 2);
        List<Integer> expected = Arrays.asList(6, 5, 5, 4, 4, 3, 2, 2, 1, 0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayAllEqualElements() {
        List<Integer> array = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayLargeList() {
        List<Integer> array = Arrays.asList(5, 2, 8, 3, 9, 1, 0, 4, 7, 6);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, SortArray1.sortArray(array));
    }
}