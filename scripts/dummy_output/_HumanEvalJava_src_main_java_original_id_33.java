// SortThirdTest.java
package original;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
    
    @Test
    void testSortThird() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> l5 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> l6 = new ArrayList<>(Arrays.asList(5, 8, 3, 4, 6, 9, 2));
        List<Integer> l7 = new ArrayList<>(Arrays.asList(5, 6, 9, 4, 8, 3, 2));
        List<Integer> l8 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1));
        List<Integer> l9 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> l10 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5));
        List<Integer> expected5 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        List<Integer> expected6 = new ArrayList<>(Arrays.asList(2, 8, 3, 4, 6, 9, 5));
        List<Integer> expected7 = new ArrayList<>(Arrays.asList(2, 6, 9, 4, 8, 3, 5));
        List<Integer> expected8 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1));
        List<Integer> expected9 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> expected10 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        assertEquals(expected1, SortThird.sortThird(l1));
        assertEquals(expected2, SortThird.sortThird(l2));
        assertEquals(expected3, SortThird.sortThird(l3));
        assertEquals(expected4, SortThird.sortThird(l4));
        assertEquals(expected5, SortThird.sortThird(l5));
        assertEquals(expected6, SortThird.sortThird(l6));
        assertEquals(expected7, SortThird.sortThird(l7));
        assertEquals(expected8, SortThird.sortThird(l8));
        assertEquals(expected9, SortThird.sortThird(l9));
        assertEquals(expected10, SortThird.sortThird(l10));
    }
}