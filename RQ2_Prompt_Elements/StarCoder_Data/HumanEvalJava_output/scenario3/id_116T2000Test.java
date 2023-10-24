// SortArrayTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

    /**
    * Test case for {@link SortArray#sortArray(List)}.
    */
    @Test
    void testSortArray() {
        List<Object> arr1 = List.of(1, 5, 2, 3, 4);
        List<Object> arr2 = List.of(1, 0, 2, 3, 4);
        List<Object> arr3 = List.of();
        List<Object> arr4 = List.of(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4);
        List<Object> arr5 = List.of(3, 6, 44, 12, 32, 5);
        List<Object> arr6 = List.of(2, 4, 8, 16, 32);
        List<Object> arr7 = List.of(2, 4, 8, 16, 32);
        assertEquals(List.of(1, 2, 3, 4, 5), SortArray.sortArray(arr1));
        assertEquals(List.of(0, 1, 2, 3, 4), SortArray.sortArray(arr2));
        assertEquals(List.of(), SortArray.sortArray(arr3));
        assertEquals(List.of(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77), SortArray.sortArray(arr4));
        assertEquals(List.of(32, 3, 5, 6, 12, 44), SortArray.sortArray(arr5));
        assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(arr6));
        assertEquals(List.of(2, 4, 8, 16, 32), SortArray.sortArray(arr7));
    }
}
