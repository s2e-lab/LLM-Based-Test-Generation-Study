// Common.java
package scenario3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Common {

    /**
     * Return sorted unique common elements for two lists.
     *
     * > common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121])
     * [1, 5, 653]
     * > common([5, 3, 2, 8], [3, 2])
     * [2, 3]
     * > common([4, 3, 2, 8], [3, 2, 4])
     * [2, 3, 4]
     * > common([4, 3, 2, 8], [])
     * []
     */
    public static List<Integer> common(List<Integer> l1, List<Integer> l2) {
        Set<Integer> set1 = new HashSet<>(l1);
        Set<Integer> set2 = new HashSet<>(l2);
        set1.retainAll(set2);
        List<Integer> result = new ArrayList<>(set1);
        result.sort(null);
        return result;
    }
}

// CommonTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
    
    @Test
    void testEmptyLists() {
        List<Integer> l1 = Arrays.asList();
        List<Integer> l2 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testOneEmptyList() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNoCommonElements() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testOneCommonElement() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(3, 4, 5);
        List<Integer> expected = Arrays.asList(3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleCommonElements() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> expected = Arrays.asList(3, 4, 5);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testDuplicateElements() {
        List<Integer> l1 = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> l2 = Arrays.asList(2, 2, 3, 3, 3, 4);
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testDifferentDataTypes() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Object> l2 = Arrays.asList("1", 2, 3.0);
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testLargeLists() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> l2 = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        List<Integer> expected = Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNullLists() {
        List<Integer> l1 = null;
        List<Integer> l2 = null;
        assertThrows(NullPointerException.class, () -> Common.common(l1, l2));
    }
    
    @Test
    void testNullElement() {
        List<Integer> l1 = Arrays.asList(1, 2, null, 3);
        List<Integer> l2 = Arrays.asList(2, null, 3, 4);
        List<Integer> expected = Arrays.asList(null, 2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
}