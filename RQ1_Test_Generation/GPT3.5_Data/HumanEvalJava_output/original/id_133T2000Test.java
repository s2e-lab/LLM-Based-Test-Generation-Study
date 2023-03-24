// SumSquaresTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SumSquares}.
 * It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
 */
class SumSquaresTest {

    @Test
    void testSumSquaresWithPositiveIntegers() {
        List<Number> lst = Arrays.asList(1, 2, 3);
        int expected = 14;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithPositiveAndNegativeIntegers() {
        List<Number> lst = Arrays.asList(-1, 1, 0);
        int expected = 2;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithPositiveDoubles() {
        List<Number> lst = Arrays.asList(1.0, 2, 3);
        int expected = 14;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithPositiveAndNegativeDoubles() {
        List<Number> lst = Arrays.asList(-1.4, 4.6, 6.3);
        int expected = 75;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithZeros() {
        List<Number> lst = Arrays.asList(0);
        int expected = 0;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithNegativeIntegers() {
        List<Number> lst = Arrays.asList(-1);
        int expected = 1;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithTwoEqualPositiveIntegers() {
        List<Number> lst = Arrays.asList(10000, 10000);
        int expected = 200000000;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithPositiveIntegersAndDoubles() {
        List<Number> lst = Arrays.asList(100, 1, 15, 2);
        int expected = 10230;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithPositiveAndNegativeIntegersAndDoubles() {
        List<Number> lst = Arrays.asList(-2.4, 1, 1);
        int expected = 6;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresWithOddPositiveIntegers() {
        List<Number> lst = Arrays.asList(1, 3, 5, 7);
        int expected = 84;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
}