package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSquares1Test {

    @Test
    public void test() throws Exception{
        assertEquals(6, scenario1.SumSquares1.sumSquares(Arrays.asList(1, 2, 3)));
		assertEquals(14, scenario1.SumSquares1.sumSquares(Arrays.asList(1, 4, 9)));
		assertEquals(0, scenario1.SumSquares1.sumSquares(Arrays.asList()));
		assertEquals(9, scenario1.SumSquares1.sumSquares(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1)));
		assertEquals(-3, scenario1.SumSquares1.sumSquares(Arrays.asList(-1, -1, -1, -1, -1, -1, -1, -1, -1)));
		assertEquals(0, scenario1.SumSquares1.sumSquares(Arrays.asList(0)));
		assertEquals(-126, scenario1.SumSquares1.sumSquares(Arrays.asList(-1, -5, 2, -1, -5)));
		assertEquals(3030, scenario1.SumSquares1.sumSquares(Arrays.asList(-56, -99, 1, 0, -2)));
		assertEquals(0, scenario1.SumSquares1.sumSquares(Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, -1)));
		assertEquals(-14196, scenario1.SumSquares1.sumSquares(Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37)));
		assertEquals(-1448, scenario1.SumSquares1.sumSquares(Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10)));
		assertEquals(public static int sumSquares(List<Object> lst) {, scenario1.SumSquares1.*/);
		
    }

}