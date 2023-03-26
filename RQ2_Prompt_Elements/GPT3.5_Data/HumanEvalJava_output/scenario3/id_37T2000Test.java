// SortEven.java
package scenario3;

import java.util.Collections;
import java.util.List;

class SortEven {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indices, while its values at the even indices are equal
     * to the values of the even indices of l, but sorted.
     *
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 6, 3, 4])
     * [3, 6, 5, 4]
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123]
     * > sortEven([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
     * [-12, 8, 3, 4, 5, 2, 12, 11, 23, -10]
     */
    public static List<Integer> sortEven(List<Integer> l) {
        for (int i = 0; i < l.size(); i += 2) {
            if (i + 2 > l.size()) {
                break;
            }
            List<Integer> sublist = l.subList(i, i + 2);
            Collections.sort(sublist);
            l.set(i, sublist.get(0));
            l.set(i + 1, sublist.get(1));
        }
        return l;
    }
}

// SortEvenTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

    @Test
    void testSortEven() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(5, 6, 3, 4);
        List<Integer> l3 = Arrays.asList(1, 2, 3);
        List<Integer> l4 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> l5 = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> l6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> l7 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<Integer> l8 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        List<Integer> l9 = Arrays.asList(2, 4, 6, 8, 10, 1, 3, 5, 7, 9);
        List<Integer> l10 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 11);

        assertEquals(Arrays.asList(1, 2, 3), SortEven.sortEven(l1));
        assertEquals(Arrays.asList(3, 6, 5, 4), SortEven.sortEven(l2));
        assertEquals(Arrays.asList(1, 2, 3), SortEven.sortEven(l3));
        assertEquals(Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123), SortEven.sortEven(l4));
        assertEquals(Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10), SortEven.sortEven(l5));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), SortEven.sortEven(l6));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), SortEven.sortEven(l7));
        assertEquals(Arrays.asList(1, 3, 2, 7, 5, 4, 9, 6, 10, 8), SortEven.sortEven(l8));
        assertEquals(Arrays.asList(2, 3, 4, 7, 6, 5, 8, 9, 10, 1), SortEven.sortEven(l9));
        assertEquals(Arrays.asList(1, 3, 2, 7, 5, 4, 9, 6, 10, 8, 11), SortEven.sortEven(l10));
    }
}