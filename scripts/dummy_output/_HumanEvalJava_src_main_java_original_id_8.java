// SumProductTest.java
package original;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

    @Test
    void testSumProductWithValidInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedOutput = Arrays.asList(10, 24);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithEmptyInput() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expectedOutput = Arrays.asList(0, 1);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithSameNumbers() {
        List<Integer> input = Arrays.asList(1, 1, 1);
        List<Integer> expectedOutput = Arrays.asList(3, 1);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithZero() {
        List<Integer> input = Arrays.asList(100, 0);
        List<Integer> expectedOutput = Arrays.asList(100, 0);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithOddNumbers() {
        List<Integer> input = Arrays.asList(3, 5, 7);
        List<Integer> expectedOutput = Arrays.asList(15, 105);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithSingleNumber() {
        List<Integer> input = Arrays.asList(10);
        List<Integer> expectedOutput = Arrays.asList(10, 10);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithNullInput() {
        assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(null));
    }

    @Test
    void testSumProductWithNonIntegerInput() {
        List<Object> input = Arrays.asList(1, 2, "3", 4);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -3, 4);
        List<Integer> expectedOutput = Arrays.asList(2, 24);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }

    @Test
    void testSumProductWithLargeNumbers() {
        List<Integer> input = Arrays.asList(1000000, 2000000, 3000000);
        List<Integer> expectedOutput = Arrays.asList(6000000, 6000000000000000);
        assertEquals(expectedOutput, SumProduct.sumProduct(input));
    }
}