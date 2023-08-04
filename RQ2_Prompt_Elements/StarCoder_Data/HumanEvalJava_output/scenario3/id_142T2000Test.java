// SumSquares1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list is empty.
    */
    @Test
    void testSumSquaresEmptyList() {
        List<Object> lst = List.of();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only one element.
    */
    @Test
    void testSumSquaresSingleElementList() {
        List<Object> lst = List.of(1);
        int expected = 1;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only negative elements.
    */
    @Test
    void testSumSquaresNegativeList() {
        List<Object> lst = List.of(-1, -5, -10);
        int expected = -126;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only zero elements.
    */
    @Test
    void testSumSquaresZeroList() {
        List<Object> lst = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive elements.
    */
    @Test
    void testSumSquaresPositiveList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expected = 55;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive and negative elements.
    */
    @Test
    void testSumSquaresMixedList() {
        List<Object> lst = List.of(-1, -5, 2, -1, -5);
        int expected = -126;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive and negative elements.
    */
    @Test
    void testSumSquaresMixedList2() {
        List<Object> lst = List.of(-56, -99, 1, 0, -2);
        int expected = 3030;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive and negative elements.
    */
    @Test
    void testSumSquaresMixedList3() {
        List<Object> lst = List.of(-1, 0, 0, 0, 0, 0, 0, 0, -1);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive and negative elements.
    */
    @Test
    void testSumSquaresMixedList4() {
        List<Object> lst = List.of(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
        int expected = -14196;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    * The list contains only positive and negative elements.
    */
    @Test
    void testSumSquaresMixedList5() {
        List<Object> lst = List.of(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10);
        int expected = -1448;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}
