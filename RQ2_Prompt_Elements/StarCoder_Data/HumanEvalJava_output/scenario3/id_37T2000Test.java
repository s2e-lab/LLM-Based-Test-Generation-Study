// SortEvenTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list is empty.
     */
    @Test
    void testSortEvenEmpty() {
        List<Integer> l = List.of();
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(l, lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains only one element.
     */
    @Test
    void testSortEvenOneElement() {
        List<Integer> l = List.of(1);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(l, lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testSortEvenTwoElements() {
        List<Integer> l = List.of(1, 2);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(l, lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains three elements.
     */
    @Test
    void testSortEvenThreeElements() {
        List<Integer> l = List.of(1, 2, 3);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(l, lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains four elements.
     */
    @Test
    void testSortEvenFourElements() {
        List<Integer> l = List.of(1, 2, 3, 4);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testSortEvenFiveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains six elements.
     */
    @Test
    void testSortEvenSixElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains seven elements.
     */
    @Test
    void testSortEvenSevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains eight elements.
     */
    @Test
    void testSortEvenEightElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains nine elements.
     */
    @Test
    void testSortEvenNineElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains ten elements.
     */
    @Test
    void testSortEvenTenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9, 10), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains eleven elements.
     */
    @Test
    void testSortEvenElevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9, 10, 11), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains twelve elements.
     */
    @Test
    void testSortEvenTwelveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains thirteen elements.
     */
    @Test
    void testSortEvenThirteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains fourteen elements.
     */
    @Test
    void testSortEvenFourteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        List<Integer> lSorted = SortEven.sortEven(l);
        assertEquals(List.of(2, 4, 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), lSorted);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains fifteen elements.
     */
    @Test
    void testSortEvenFifteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 