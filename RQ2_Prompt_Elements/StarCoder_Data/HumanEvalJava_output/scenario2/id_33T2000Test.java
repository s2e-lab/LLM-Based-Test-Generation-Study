// SortThirdTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list is empty.
     */
    @Test
    void testSortThirdEmpty() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains one element.
     */
    @Test
    void testSortThirdOneElement() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testSortThirdTwoElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains three elements.
     */
    @Test
    void testSortThirdThreeElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains four elements.
     */
    @Test
    void testSortThirdFourElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testSortThirdFiveElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains six elements.
     */
    @Test
    void testSortThirdSixElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains seven elements.
     */
    @Test
    void testSortThirdSevenElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains eight elements.
     */
    @Test
    void testSortThirdEightElements() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains nine elements.
     */
    @Test
    void testSortThirdNineElements() {
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
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        assertEquals(l2, SortThird.sortThird(l));
    }

    /**
     * Test case for the {@link SortThird#sortThird(List)} method.
     * It tests the case where the list contains ten elements.
     */
    @Test
    void testSortThirdTenElements() {
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
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        assertEquals(l2, SortThird.sortThird(l));
    }
}
