Here's the source code for the SumProductTest class with ten unit test cases for the SumProduct.sumProduct() method:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumProductTest {

    @Test
    void testEmptyList() {
        List<Object> numbers = new ArrayList<>();
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNumber() {
        List<Object> numbers = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleNumbers() {
        List<Object> numbers = Arrays.asList(2, 3, 4);
        List<Integer> expected = Arrays.asList(9, 24);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumbers() {
        List<Object> numbers = Arrays.asList(-2, 3, -4);
        List<Integer> expected = Arrays.asList(-3, 24);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testZero() {
        List<Object> numbers = Arrays.asList(2, 0, 4);
        List<Integer> expected = Arrays.asList(6, 0);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumbers() {
        List<Object> numbers = Arrays.asList(1000000, 2000000, 3000000);
        List<Integer> expected = Arrays.asList(6000000, 6000000000000000);
        List<Integer> actual = SumProduct.sumProduct(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testDecimalNumbers() {
        List<Object> numbers = Arrays.asList(2.5, 3.5, 4.5);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testStringNumbers() {
        List<Object> numbers = Arrays.asList("2", "3", "4");
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testNullList() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(numbers));
    }

    @Test
    void testMixedList() {
        List<Object> numbers = Arrays.asList(2, "3", 4);
        assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
    }
}
```