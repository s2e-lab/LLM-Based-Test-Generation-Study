// IsSortedTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    @Test
    void testEmptyList() {
        List<Integer> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSingleElementList() {
        List<Integer> lst = Arrays.asList(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedAscendingList() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testUnsortedList() {
        List<Integer> lst = Arrays.asList(1, 3, 2, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicates() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 2, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicates2() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 3, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedDescendingList() {
        List<Integer> lst = Arrays.asList(5, 4, 3, 2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithOneDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithOneDuplicate2() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }
}