// SumProductTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

    /**
     * Test case for a list of integers.
     */
    @Test
    void testSumProduct() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(15, result.get(0));
        assertEquals(120, result.get(1));
    }

    /**
     * Test case for a list of integers with a null element.
     */
    @Test
    void testSumProductWithNullElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(null);
        numbers.add(4);
        numbers.add(5);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(15, result.get(0));
        assertEquals(120, result.get(1));
    }

    /**
     * Test case for a list of integers with a non-integer element.
     */
    @Test
    void testSumProductWithNonIntegerElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add("3");
        numbers.add(4);
        numbers.add(5);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    /**
     * Test case for an empty list.
     */
    @Test
    void testSumProductWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }
}
