// MaxFillTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    @Test
    void testMaxFill() {
        List<List<Integer>> grid1 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(2, MaxFill.maxFill(grid1, 1));
        List<List<Integer>> grid2 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(3, MaxFill.maxFill(grid2, 2));
        List<List<Integer>> grid3 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(3, MaxFill.maxFill(grid3, 3));
        List<List<Integer>> grid4 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid4, 4));
        List<List<Integer>> grid5 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid5, 5));
        List<List<Integer>> grid6 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid6, 6));
        List<List<Integer>> grid7 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid7, 7));
        List<List<Integer>> grid8 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid8, 8));
        List<List<Integer>> grid9 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid9, 9));
        List<List<Integer>> grid10 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        assertEquals(4, MaxFill.maxFill(grid10, 10));
    }
}
