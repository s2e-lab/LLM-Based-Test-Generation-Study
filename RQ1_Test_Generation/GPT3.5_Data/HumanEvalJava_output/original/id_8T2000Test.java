// SumProductTest.java
package original;

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
    void testSumProductWithPositiveNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithSameNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithZero() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(100);
        expected.add(0);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithOddNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        List<Integer> expected = new ArrayList<>();
        expected.add(15);
        expected.add(105);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithSingleNumber() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(10);
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(10);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithNegativeNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        List<Integer> expected = new ArrayList<>();
        expected.add(-10);
        expected.add(-24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithMixedNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(4);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(24);
        assertEquals(expected, SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithDecimalNumbers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1.5);
        numbers.add(2.5);
        List<Integer> expected = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }
    
    @Test
    void testSumProductWithString() {
        List<Object> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        List<Integer> expected = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }
}