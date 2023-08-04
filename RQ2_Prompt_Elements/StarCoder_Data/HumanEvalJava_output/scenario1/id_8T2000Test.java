// SumProductTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

    @Test
    void testSumProduct() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(6, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testSumProductWithNegativeNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(-6, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testSumProductWithMixedNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(-2, result.get(0));
        assertEquals(-6, result.get(1));
    }

    @Test
    void testSumProductWithNull() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(4, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testSumProductWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testSumProductWithNullList() {
        List<Integer> result = SumProduct.sumProduct(null);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testSumProductWithNonIntegerNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add("2");
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(6, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testSumProductWithNonIntegerNumbersAndNull() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add("2");
        numbers.add(null);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(6, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testSumProductWithNonIntegerNumbersAndEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add("2");
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testSumProductWithNonIntegerNumbersAndNullList() {
        List<Integer> result = SumProduct.sumProduct(null);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }
}
