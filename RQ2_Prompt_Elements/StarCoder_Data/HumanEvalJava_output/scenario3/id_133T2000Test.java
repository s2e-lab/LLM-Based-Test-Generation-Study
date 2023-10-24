// SumSquaresTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

    /**
    * Test case for {@link SumSquares#sumSquares(List)}.
    */
    @Test
    void testSumSquares() {
        List<Number> lst1 = List.of(1, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst1));

        List<Number> lst2 = List.of(1.0, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst2));

        List<Number> lst3 = List.of(1, 3, 5, 7);
        assertEquals(84, SumSquares.sumSquares(lst3));

        List<Number> lst4 = List.of(1.4, 4.2, 0);
        assertEquals(29, SumSquares.sumSquares(lst4));

        List<Number> lst5 = List.of(-2.4, 1, 1);
        assertEquals(6, SumSquares.sumSquares(lst5));

        List<Number> lst6 = List.of(100, 1, 15, 2);
        assertEquals(10230, SumSquares.sumSquares(lst6));

        List<Number> lst7 = List.of(10000, 10000);
        assertEquals(200000000, SumSquares.sumSquares(lst7));

        List<Number> lst8 = List.of(-1.4, 4.6, 6.3);
        assertEquals(75, SumSquares.sumSquares(lst8));

        List<Number> lst9 = List.of(-1.4, 17.9, 18.9, 19.9);
        assertEquals(1086, SumSquares.sumSquares(lst9));

        List<Number> lst10 = List.of(0);
        assertEquals(0, SumSquares.sumSquares(lst10));

        List<Number> lst11 = List.of(-1);
        assertEquals(1, SumSquares.sumSquares(lst11));

        List<Number> lst12 = List.of(-1, 1, 0);
        assertEquals(2, SumSquares.sumSquares(lst12));
    }
}
