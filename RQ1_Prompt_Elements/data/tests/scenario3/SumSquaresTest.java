package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSquaresTest {

    @Test
    public void test() throws Exception {

        assertEquals(14, scenario3.SumSquares.sumSquares(Arrays.asList(1, 2, 3)));
        assertEquals(14, scenario3.SumSquares.sumSquares(Arrays.asList(1.0, 2, 3)));
        assertEquals(84, scenario3.SumSquares.sumSquares(Arrays.asList(1, 3, 5, 7)));
        assertEquals(29, scenario3.SumSquares.sumSquares(Arrays.asList(1.4, 4.2, 0)));
        assertEquals(6, scenario3.SumSquares.sumSquares(Arrays.asList(-2.4, 1, 1)));
        assertEquals(10230, scenario3.SumSquares.sumSquares(Arrays.asList(100, 1, 15, 2)));
        assertEquals(200000000, scenario3.SumSquares.sumSquares(Arrays.asList(10000, 10000)));
        assertEquals(75, scenario3.SumSquares.sumSquares(Arrays.asList(-1.4, 4.6, 6.3)));
        assertEquals(1086, scenario3.SumSquares.sumSquares(Arrays.asList(-1.4, 17.9, 18.9, 19.9)));
        assertEquals(0, scenario3.SumSquares.sumSquares(Arrays.asList(0)));
        assertEquals(1, scenario3.SumSquares.sumSquares(Arrays.asList(-1)));
        assertEquals(2, scenario3.SumSquares.sumSquares(Arrays.asList(-1, 1, 0)));

    }

}