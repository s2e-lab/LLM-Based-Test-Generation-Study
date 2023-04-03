// SumSquaresTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains twelve unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
    
    @Test
    void testSumSquaresWithPositiveIntegers() {
        List<Number> lst = Arrays.asList(1, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithPositiveIntegersAndDouble() {
        List<Number> lst = Arrays.asList(1.0, 2, 3);
        assertEquals(14, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithOddIntegers() {
        List<Number> lst = Arrays.asList(1, 3, 5, 7);
        assertEquals(84, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithPositiveDoubles() {
        List<Number> lst = Arrays.asList(1.4, 4.2, 0);
        assertEquals(29, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeDoublesAndIntegers() {
        List<Number> lst = Arrays.asList(-2.4, 1, 1);
        assertEquals(6, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithLargeIntegers() {
        List<Number> lst = Arrays.asList(100, 1, 15, 2);
        assertEquals(10230, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithSameLargeIntegers() {
        List<Number> lst = Arrays.asList(10000, 10000);
        assertEquals(200000000, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveDoubles() {
        List<Number> lst = Arrays.asList(-1.4, 4.6, 6.3);
        assertEquals(75, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveDoublesGreaterThan10() {
        List<Number> lst = Arrays.asList(-1.4, 17.9, 18.9, 19.9);
        assertEquals(1086, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithZero() {
        List<Number> lst = Arrays.asList(0);
        assertEquals(0, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeInteger() {
        List<Number> lst = Arrays.asList(-1);
        assertEquals(1, SumSquares.sumSquares(lst));
    }
    
    @Test
    void testSumSquaresWithNegativeAndPositiveIntegers() {
        List<Number> lst = Arrays.asList(-1, 1, 0);
        assertEquals(2, SumSquares.sumSquares(lst));
    }
}