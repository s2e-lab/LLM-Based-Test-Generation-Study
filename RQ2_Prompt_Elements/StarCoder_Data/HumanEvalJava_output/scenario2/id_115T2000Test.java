// MaxFillTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    /**
    * Test case for {@link MaxFill#maxFill(List, int)}.
    */
    @Test
    void testMaxFill() {
        List<List<Integer>> grid1 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid1, 5));

        List<List<Integer>> grid2 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid2, 1));

        List<List<Integer>> grid3 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid3, 2));

        List<List<Integer>> grid4 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid4, 3));

        List<List<Integer>> grid5 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid5, 4));

        List<List<Integer>> grid6 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid6, 5));

        List<List<Integer>> grid7 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid7, 6));

        List<List<Integer>> grid8 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid8, 7));

        List<List<Integer>> grid9 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid9, 8));

        List<List<Integer>> grid10 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid10, 9));

        List<List<Integer>> grid11 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid11, 10));

        List<List<Integer>> grid12 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid12, 11));

        List<List<Integer>> grid13 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid13, 12));

        List<List<Integer>> grid14 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid14, 13));

        List<List<Integer>> grid15 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid15, 14));

        List<List<Integer>> grid16 = List.of(List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1));
        assertEquals(1, MaxFill.maxFill(grid16, 15));

        List<List<Integer>> grid17 = List.