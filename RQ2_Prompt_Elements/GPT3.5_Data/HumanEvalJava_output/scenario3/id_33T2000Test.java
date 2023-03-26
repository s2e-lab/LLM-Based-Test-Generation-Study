// SortThird.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortThird {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the indices that are not divisible by three, while its values at the indicies that are divisible by three are equal
     * to the values of the corresponding indices of l, but sorted.
     * > sortThird([1, 2, 3])
     * [1, 2, 3]
     * > sortThird([5, 6, 3, 4, 8, 9, 2])
     * [2, 6, 3, 4, 8, 9, 5]
     * > sortThird([1, 2, 3])
     * [1, 2, 3]
     * > sortThird([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10]
     * > sortThird([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
     * [-10, 8, -12, 3, 23, 2, 4, 11, 12, 5]
     * > sortThird([5, 6, 3, 4, 8, 9, 2])
     * [2, 6, 3, 4, 8, 9, 5]
     * > sortThird([5, 8, 3, 4, 6, 9, 2])
     * [2, 8, 3, 4, 6, 9, 5]
     * > sortThird([5, 6, 9, 4, 8, 3, 2])
     * [2, 6, 9, 4, 8, 3, 5]
     * > sortThird([5, 6, 3, 4, 8, 9, 2, 1])
     * [2, 6, 3, 4, 8, 9, 5, 1]
     */
    public static List<Integer> sortThird(List<Integer> l) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (i % 3 == 0) {
                temp.add(l.get(i));
            } else {
                result.add(l.get(i));
            }
        }
        Collections.sort(temp);
        int tempIndex = 0;
        for (int i = 0; i < l.size(); i++) {
            if (i % 3 == 0) {
                result.add(i, temp.get(tempIndex));
                tempIndex++;
            }
        }
        return result;
    }
}

// SortThirdTest.java
package scenario3;

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
    void testSortThird1() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird2() {
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird3() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird4() {
        List<Integer> l = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> expected = Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird5() {
        List<Integer> l = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> expected = Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird6() {
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird7() {
        List<Integer> l = Arrays.asList(5, 8, 3, 4, 6, 9, 2);
        List<Integer> expected = Arrays.asList(2, 8, 3, 4, 6, 9, 5);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird8() {
        List<Integer> l = Arrays.asList(5, 6, 9, 4, 8, 3, 2);
        List<Integer> expected = Arrays.asList(2, 6, 9, 4, 8, 3, 5);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird9() {
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }

    @Test
    void testSortThird10() {
        List<Integer> l = Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1, 0);
        List<Integer> expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1, 0);
        List<Integer> result = SortThird.sortThird(l);
        assertEquals(expected, result);
    }
}