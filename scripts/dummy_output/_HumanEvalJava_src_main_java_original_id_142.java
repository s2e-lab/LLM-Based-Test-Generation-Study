// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
    @Test
    void testSumSquares1() {
        List<Integer> lst = Arrays.asList(1, 2, 3);
        int expected = 6;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares2() {
        List<Integer> lst = new ArrayList<Integer>();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares3() {
        List<Integer> lst = Arrays.asList(-1, -5, 2, -1, -5);
        int expected = -126;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares4() {
        List<Integer> lst = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1);
        int expected = 9;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares5() {
        List<Integer> lst = Arrays.asList(-1, -1, -1, -1, -1, -1, -1, -1, -1);
        int expected = -3;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares6() {
        List<Integer> lst = Arrays.asList(0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares7() {
        List<Integer> lst = Arrays.asList(-56, -99, 1, 0, -2);
        int expected = 3030;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares8() {
        List<Integer> lst = Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, -1);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares9() {
        List<Integer> lst = Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
        int expected = -14196;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquares10() {
        List<Integer> lst = Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10);
        int expected = -1448;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}