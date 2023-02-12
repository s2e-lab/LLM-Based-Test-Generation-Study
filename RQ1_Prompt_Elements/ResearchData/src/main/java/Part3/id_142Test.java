package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SumSquaresTest {
    @Test
    public void testSumSquares() {
        assertEquals(6, SumSquares1.sumSquares(Arrays.asList(1, 2, 3)));
        assertEquals(14, SumSquares1.sumSquares(Arrays.asList(1, 4, 9)));
        assertEquals(0, SumSquares1.sumSquares(Arrays.asList()));
        assertEquals(9, SumSquares1.sumSquares(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1)));
        assertEquals(-3, SumSquares1.sumSquares(Arrays.asList(-1, -1, -1, -1, -1, -1, -1, -1, -1)));
        assertEquals(0, SumSquares1.sumSquares(Arrays.asList(0)));
        assertEquals(-126, SumSquares1.sumSquares(Arrays.asList(-1, -5, 2, -1, -5)));
        assertEquals(3030, SumSquares1.sumSquares(Arrays.asList(-56, -99, 1, 0, -2)));
        assertEquals(0, SumSquares1.sumSquares(Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, -1)));
        assertEquals(-14196, SumSquares1.sumSquares(Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37)));
        assertEquals(-1448, SumSquares1.sumSquares(Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10)));
    }
}