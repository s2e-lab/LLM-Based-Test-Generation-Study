// SortArrayTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
    
    @Test
    void testSortArray() {
        List<Integer> arr1 = Arrays.asList(1, 5, 2, 3, 4);
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected1, SortArray.sortArray(arr1));
        
        List<Integer> arr2 = Arrays.asList(1, 0, 2, 3, 4);
        List<Integer> expected2 = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected2, SortArray.sortArray(arr2));
        
        List<Integer> arr3 = new ArrayList<>();
        List<Integer> expected3 = new ArrayList<>();
        assertEquals(expected3, SortArray.sortArray(arr3));
        
        List<Integer> arr4 = Arrays.asList(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4);
        List<Integer> expected4 = Arrays.asList(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77);
        assertEquals(expected4, SortArray.sortArray(arr4));
        
        List<Integer> arr5 = Arrays.asList(3, 6, 44, 12, 32, 5);
        List<Integer> expected5 = Arrays.asList(32, 3, 5, 6, 12, 44);
        assertEquals(expected5, SortArray.sortArray(arr5));
        
        List<Integer> arr6 = Arrays.asList(2, 4, 8, 16, 32);
        List<Integer> expected6 = Arrays.asList(2, 4, 8, 16, 32);
        assertEquals(expected6, SortArray.sortArray(arr6));
        
        List<Integer> arr7 = Arrays.asList(2, 4, 8, 16, 32);
        List<Integer> expected7 = Arrays.asList(2, 4, 8, 16, 32);
        assertEquals(expected7, SortArray.sortArray(arr7));
        
        List<Integer> arr8 = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> expected8 = Arrays.asList(0, 0, 0, 0, 0);
        assertEquals(expected8, SortArray.sortArray(arr8));
        
        List<Integer> arr9 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expected9 = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(expected9, SortArray.sortArray(arr9));
        
        List<Integer> arr10 = Arrays.asList(10, 100, 1000, 10000, 100000);
        List<Integer> expected10 = Arrays.asList(10, 100, 1000, 10000, 100000);
        assertEquals(expected10, SortArray.sortArray(arr10));
    }
}