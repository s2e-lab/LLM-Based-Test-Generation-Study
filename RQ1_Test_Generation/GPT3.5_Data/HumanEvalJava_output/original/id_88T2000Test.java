// SortArray1Test.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {
    
    @Test
    void testSortArrayEmptyList() {
        List<Object> array = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArraySingleElementList() {
        List<Object> array = Arrays.asList(5);
        List<Object> expected = Arrays.asList(5);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayAscendingOrder() {
        List<Object> array = Arrays.asList(2, 4, 3, 0, 1, 5);
        List<Object> expected = Arrays.asList(0, 1, 2, 3, 4, 5);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayDescendingOrder() {
        List<Object> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6);
        List<Object> expected = Arrays.asList(6, 5, 4, 3, 2, 1, 0);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayAscendingOrderWithTwoElements() {
        List<Object> array = Arrays.asList(2, 1);
        List<Object> expected = Arrays.asList(1, 2);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayAscendingOrderWithNonZeroFirstAndLastElements() {
        List<Object> array = Arrays.asList(15, 42, 87, 32, 11, 0);
        List<Object> expected = Arrays.asList(0, 11, 15, 32, 42, 87);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayDescendingOrderWithNonZeroFirstAndLastElements() {
        List<Object> array = Arrays.asList(21, 14, 23, 11);
        List<Object> expected = Arrays.asList(23, 21, 14, 11);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithDuplicateElements() {
        List<Object> array = Arrays.asList(2, 4, 3, 0, 1, 5, 6, 4);
        List<Object> expected = Arrays.asList(6, 5, 4, 4, 3, 2, 1, 0);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithNegativeElements() {
        List<Object> array = Arrays.asList(-2, 4, 3, 0, -1, 5, 6, -4);
        List<Object> expected = Arrays.asList(6, 5, 4, 3, 0, -1, -2, -4);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithMixedElements() {
        List<Object> array = Arrays.asList(-2, 4, 3, 0, -1, 5, 6, -4, 2.5, 7.8);
        List<Object> expected = Arrays.asList(7.8, 6, 5, 4, 3, 2.5, 0, -1, -2, -4);
        List<Object> result = SortArray1.sortArray(array);
        assertEquals(expected, result);
    }
}