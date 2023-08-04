// IsSortedTest.java
package scenario2;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    /**
     * Test case for an empty list.
     */
    @Test
    void testEmptyList() {
        List<Object> lst = List.of();
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with one element.
     */
    @Test
    void testSingleElementList() {
        List<Object> lst = List.of(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with two elements.
     */
    @Test
    void testTwoElementList() {
        List<Object> lst = List.of(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with three elements.
     */
    @Test
    void testThreeElementList() {
        List<Object> lst = List.of(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with four elements.
     */
    @Test
    void testFourElementList() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with five elements.
     */
    @Test
    void testFiveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with six elements.
     */
    @Test
    void testSixElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with seven elements.
     */
    @Test
    void testSevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with eight elements.
     */
    @Test
    void testEightElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with nine elements.
     */
    @Test
    void testNineElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with ten elements.
     */
    @Test
    void testTenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with eleven elements.
     */
    @Test
    void testElevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with twelve elements.
     */
    @Test
    void testTwelveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with thirteen elements.
     */
    @Test
    void testThirteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with fourteen elements.
     */
    @Test
    void testFourteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with fifteen elements.
     */
    @Test
    void testFifteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with sixteen elements.
     */
    @Test
    void testSixteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with seventeen elements.
     */
    @Test
    void testSeventeenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with eighteen elements.
     */
    @Test
    void testEighteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with nineteen elements.
     */
    @Test
    void testNineteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with twenty elements.
     */
    @Test
    void testTwentyElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with twenty-one elements.
     */
    @Test
    void testTwentyOneElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
     * Test case for a list with twenty-two elements.
     */
    @Test
    void testTwentyTwoElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 