// SumSquares1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testSumSquaresWithEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        assertEquals(0, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing only one integer.
     */
    @Test
    void testSumSquaresWithOneInteger() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        assertEquals(1, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing two integers.
     */
    @Test
    void testSumSquaresWithTwoIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        assertEquals(5, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing three integers.
     */
    @Test
    void testSumSquaresWithThreeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        assertEquals(14, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing four integers.
     */
    @Test
    void testSumSquaresWithFourIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals(30, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing five integers.
     */
    @Test
    void testSumSquaresWithFiveIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        assertEquals(55, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing six integers.
     */
    @Test
    void testSumSquaresWithSixIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        assertEquals(91, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing seven integers.
     */
    @Test
    void testSumSquaresWithSevenIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        assertEquals(135, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing eight integers.
     */
    @Test
    void testSumSquaresWithEightIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        assertEquals(196, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing nine integers.
     */
    @Test
    void testSumSquaresWithNineIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        assertEquals(274, SumSquares1.sumSquares(lst));
    }

    /**
     * Test case for the {@link SumSquares1#sumSquares(List)} method.
     * It tests the method with a list containing ten integers.
     */
    @Test
    void testSumSquaresWithTenIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        assertEquals(370, SumSquares1.sumSquares(lst));
    }
}
