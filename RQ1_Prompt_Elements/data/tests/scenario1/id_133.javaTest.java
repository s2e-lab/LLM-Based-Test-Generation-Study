package scenario1;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSquaresTest {

    @Test
    public void test() throws Exception{
        assertEquals(14, scenario1.SumSquares.sumSquares(Arrays.asList(1, 2, 3)));
		assertEquals(14, scenario1.SumSquares.sumSquares(Arrays.asList(1.0, 2, 3)));
		assertEquals(84, scenario1.SumSquares.sumSquares(Arrays.asList(1, 3, 5, 7)));
		assertEquals(29, scenario1.SumSquares.sumSquares(Arrays.asList(1.4, 4.2, 0)));
		assertEquals(6, scenario1.SumSquares.sumSquares(Arrays.asList(-2.4, 1, 1)));
		assertEquals(10230, scenario1.SumSquares.sumSquares(Arrays.asList(100, 1, 15, 2)));
		assertEquals(200000000, scenario1.SumSquares.sumSquares(Arrays.asList(10000, 10000)));
		assertEquals(75, scenario1.SumSquares.sumSquares(Arrays.asList(-1.4, 4.6, 6.3)));
		assertEquals(1086, scenario1.SumSquares.sumSquares(Arrays.asList(-1.4, 17.9, 18.9, 19.9)));
		assertEquals(0, scenario1.SumSquares.sumSquares(Arrays.asList(0)));
		assertEquals(1, scenario1.SumSquares.sumSquares(Arrays.asList(-1)));
		assertEquals(2, scenario1.SumSquares.sumSquares(Arrays.asList(-1, 1, 0)));
		assertEquals(public static int sumSquares(List<Number> lst) {, scenario1.SumSquares.*/);
		
    }

}