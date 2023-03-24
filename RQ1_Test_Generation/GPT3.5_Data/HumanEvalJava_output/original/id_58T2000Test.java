// CommonTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Common}.
 * It contains ten unit test cases for the {@link Common#common(List, List)} method.
 */
class CommonTest {

    @Test
    void testCommonWithTwoNonEmptyLists() {
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Integer> expected = Arrays.asList(1, 5, 653);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingDuplicates() {
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2);
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingAllSameElements() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2, 4);
        List<Integer> expected = Arrays.asList(2, 3, 4);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneEmptyList() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoEmptyLists() {
        List<Integer> l1 = Collections.emptyList();
        List<Object> l2 = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneListContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Object> l2 = Arrays.asList(null, 2, 3);
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, null);
        List<Object> l2 = Arrays.asList(null, 2, 3);
        List<Integer> expected = Arrays.asList(2, 3, null);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneListContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Object> l2 = Arrays.asList(1, 2, 3);
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Object> l2 = Arrays.asList(null, null, null);
        List<Integer> expected = Collections.emptyList();
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneListContainingOnlyOneElement() {
        List<Integer> l1 = Arrays.asList(1);
        List<Object> l2 = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
}