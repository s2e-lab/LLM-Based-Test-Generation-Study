Here's an example of how you can write unit tests for the `SumSquares` class:

```
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SumSquaresTest {

    @Test
    void testSumSquaresWithEmptyList() {
        List<Number> lst = Arrays.asList();
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    @Test
    void testSumSquaresWithPositiveNumbers() {
        List<Number> lst = Arrays.asList(2, 3.5, 4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(30, result);
    }

    @Test
    void testSumSquaresWithNegativeNumbers() {
        List<Number> lst = Arrays.asList(-2, -3.5, -4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(30, result);
    }

    @Test
    void testSumSquaresWithMixedNumbers() {
        List<Number> lst = Arrays.asList(-2, 3.5, 4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(23, result);
    }

    @Test
    void testSumSquaresWithZero() {
        List<Number> lst = Arrays.asList(0);
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    @Test
    void testSumSquaresWithLargeNumbers() {
        List<Number> lst = Arrays.asList(1000000000, 2000000000);
        int result = SumSquares.sumSquares(lst);
        assertEquals(5000000000000000000L, result);
    }

    @Test
    void testSumSquaresWithDecimalNumbers() {
        List<Number> lst = Arrays.asList(1.5, 2.7, 3.9);
        int result = SumSquares.sumSquares(lst);
        assertEquals(20, result);
    }

    @Test
    void testSumSquaresWithNegativeDecimalNumbers() {
        List<Number> lst = Arrays.asList(-1.5, -2.7, -3.9);
        int result = SumSquares.sumSquares(lst);
        assertEquals(20, result);
    }

    @Test
    void testSumSquaresWithMixedDecimalNumbers() {
        List<Number> lst = Arrays.asList(-1.5, 2.7, 3.9);
        int result = SumSquares.sumSquares(lst);
        assertEquals(20, result);
    }

    @Test
    void testSumSquaresWithMaxValue() {
        List<Number> lst = Arrays.asList(Integer.MAX_VALUE, Long.MAX_VALUE);
        int result = SumSquares.sumSquares(lst);
        assertEquals(4611686018427387903L, result);
    }
}
```

These tests cover a variety of scenarios, including empty lists, positive and negative numbers, zero, large numbers, decimal numbers, and the maximum value of `int` and `long`.