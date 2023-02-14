package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SumProductTest {
    @Test
    void testSumProduct() {
        List<Object> numbers = new ArrayList<Object>();
        assertEquals(Arrays.asList(0, 1), SumProduct.sumProduct(numbers));
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        assertEquals(Arrays.asList(10, 24), SumProduct.sumProduct(numbers));
        numbers.clear();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        assertEquals(Arrays.asList(3, 1), SumProduct.sumProduct(numbers));
        numbers.clear();
        numbers.add(100);
        numbers.add(0);
        assertEquals(Arrays.asList(100, 0), SumProduct.sumProduct(numbers));
        numbers.clear();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        assertEquals(Arrays.asList(15, 105), SumProduct.sumProduct(numbers));
        numbers.clear();
        numbers.add(10);
        assertEquals(Arrays.asList(10, 10), SumProduct.sumProduct(numbers));
    }
}