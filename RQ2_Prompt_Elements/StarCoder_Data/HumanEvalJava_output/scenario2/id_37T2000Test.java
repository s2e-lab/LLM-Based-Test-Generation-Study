// SortEvenTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains one element.
     */
    @Test
    void testSortEvenOneElement() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testSortEvenTwoElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains three elements.
     */
    @Test
    void testSortEvenThreeElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains four elements.
     */
    @Test
    void testSortEvenFourElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testSortEvenFiveElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains six elements.
     */
    @Test
    void testSortEvenSixElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains seven elements.
     */
    @Test
    void testSortEvenSevenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains eight elements.
     */
    @Test
    void testSortEvenEightElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains nine elements.
     */
    @Test
    void testSortEvenNineElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains ten elements.
     */
    @Test
    void testSortEvenTenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains eleven elements.
     */
    @Test
    void testSortEvenElevenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains twelve elements.
     */
    @Test
    void testSortEvenTwelveElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains thirteen elements.
     */
    @Test
    void testSortEvenThirteenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for the {@link SortEven#sortEven(List)} method.
     * It tests the case where the list contains fourteen elements.
     */
    @Test
    void testSortEvenFourteenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.