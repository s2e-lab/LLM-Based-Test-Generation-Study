// SortThirdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The first test case tests the method with an empty list.
    */
    @Test
    void testSortThirdEmptyList() {
        List<Integer> l = List.of();
        List<Integer> lSorted = List.of();
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The second test case tests the method with a list that contains only one element.
    */
    @Test
    void testSortThirdSingleElementList() {
        List<Integer> l = List.of(1);
        List<Integer> lSorted = List.of(1);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The third test case tests the method with a list that contains two elements.
    */
    @Test
    void testSortThirdTwoElementList() {
        List<Integer> l = List.of(1, 2);
        List<Integer> lSorted = List.of(1, 2);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The fourth test case tests the method with a list that contains three elements.
    */
    @Test
    void testSortThirdThreeElementList() {
        List<Integer> l = List.of(1, 2, 3);
        List<Integer> lSorted = List.of(1, 2, 3);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The fifth test case tests the method with a list that contains four elements.
    */
    @Test
    void testSortThirdFourElementList() {
        List<Integer> l = List.of(1, 2, 3, 4);
        List<Integer> lSorted = List.of(1, 2, 3, 4);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The sixth test case tests the method with a list that contains five elements.
    */
    @Test
    void testSortThirdFiveElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The seventh test case tests the method with a list that contains six elements.
    */
    @Test
    void testSortThirdSixElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The eighth test case tests the method with a list that contains seven elements.
    */
    @Test
    void testSortThirdSevenElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The ninth test case tests the method with a list that contains eight elements.
    */
    @Test
    void testSortThirdEightElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The tenth test case tests the method with a list that contains nine elements.
    */
    @Test
    void testSortThirdNineElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The eleventh test case tests the method with a list that contains ten elements.
    */
    @Test
    void testSortThirdTenElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The twelfth test case tests the method with a list that contains eleven elements.
    */
    @Test
    void testSortThirdElevenElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The thirteenth test case tests the method with a list that contains twelve elements.
    */
    @Test
    void testSortThirdTwelveElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The fourteenth test case tests the method with a list that contains thirteen elements.
    */
    @Test
    void testSortThirdThirteenElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(List)}.
    * The fifteenth test case tests the method with a list that contains fourteen elements.
    */
    @Test
    void testSortThirdFourteenElementList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        List<Integer> lSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(lSorted, SortThird.sortThird(l));
    }

    /**
    * Test case for {@link SortThird#sortThird(