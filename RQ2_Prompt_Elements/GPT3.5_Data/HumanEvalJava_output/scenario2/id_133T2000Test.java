Here's the code for the SumSquaresTest class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSquaresTest {

    @Test
    void testSumSquaresEmptyList() {
        List<Number> lst = Arrays.asList();
        int expected = 0;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresSingleElement() {
        List<Number> lst = Arrays.asList(3);
        int expected = 9;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresMultipleElements() {
        List<Number> lst = Arrays.asList(2.5, 3.7, 4.2);
        int expected = 38;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresNegativeElements() {
        List<Number> lst = Arrays.asList(-2.5, -3.7, -4.2);
        int expected = 39;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresMixedElements() {
        List<Number> lst = Arrays.asList(-2.5, 3, 4.2);
        int expected = 26;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresAllZeroElements() {
        List<Number> lst = Arrays.asList(0, 0, 0);
        int expected = 0;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresAllOneElements() {
        List<Number> lst = Arrays.asList(1, 1, 1);
        int expected = 3;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresMixedIntAndDoubleElements() {
        List<Number> lst = Arrays.asList(2, 3.7, 4);
        int expected = 29;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresLargeElements() {
        List<Number> lst = Arrays.asList(1000000000, 2000000000);
        int expected = 500000000000000000;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSumSquaresMaxValueElements() {
        List<Number> lst = Arrays.asList(Double.MAX_VALUE, Integer.MAX_VALUE);
        int expected = 4611686014132420609;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
}
```

This class contains ten test methods that test different scenarios for the `sumSquares` method. Each test method creates a list of numbers, calls the `sumSquares` method with that list, and compares the expected result with the actual result using the `assertEquals` method from JUnit. The scenarios tested include empty lists, lists with single and multiple elements, lists with negative and mixed elements, lists with all zero and all one elements, lists with mixed int and double elements, and lists with large and maximum value elements.