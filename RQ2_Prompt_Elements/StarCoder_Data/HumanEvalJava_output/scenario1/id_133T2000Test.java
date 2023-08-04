// SumSquaresTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

    @Test
    void testSumSquares() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(385, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares2() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(406, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares3() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(427, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares4() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(448, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares5() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(469, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares6() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(490, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares7() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(511, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares8() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(532, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares9() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(553, SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquares10() {
        List<Number> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(574, SumSquares.sumSquares(lst));
    }
}
