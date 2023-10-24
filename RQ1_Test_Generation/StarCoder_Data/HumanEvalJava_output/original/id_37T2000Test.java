// SortEvenTest.java
package original;

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
     * Test case for {@link SortEven#sortEven(List)} where the input list is empty.
     */
    @Test
    void testSortEvenEmpty() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for {@link SortEven#sortEven(List)} where the input list has one element.
     */
    @Test
    void testSortEvenOneElement() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    /**
     * Test case for {@link SortEven#sortEven(List)} where the input list has two elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has three elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has four elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has five elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has six elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has seven elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has eight elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has nine elements.
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
     * Test case for {@link SortEven#sortEven(List)} where the input list has ten elements.
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
}
