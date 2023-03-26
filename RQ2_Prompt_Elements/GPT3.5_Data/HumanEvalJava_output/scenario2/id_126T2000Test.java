Here's the code for the `IsSortedTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSortedTest {

    @Test
    void testEmptyList() {
        List<Object> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testTwoElementSortedList() {
        List<Object> lst = Arrays.asList(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testTwoElementUnsortedList() {
        List<Object> lst = Arrays.asList(2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testThreeElementSortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testThreeElementUnsortedList() {
        List<Object> lst = Arrays.asList(1, 3, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testDuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testMultipleDuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testLargeSortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testLargeUnsortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10, 9, 8);
        assertFalse(IsSorted.isSorted(lst));
    }
}
```

This test class contains ten unit test cases for the `IsSorted.isSorted()` method. The test cases cover various scenarios, including empty lists, single-element lists, sorted and unsorted lists of different sizes, and lists with duplicate elements. The `assertTrue()` and `assertFalse()` methods are used to assert the expected results of the `IsSorted.isSorted()` method.