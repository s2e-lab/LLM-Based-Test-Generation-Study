// SumProductTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

    /**
     * Test case for the {@link SumProduct#sumProduct(List)} method.
     */
    @Test
    void testSumProduct() {
        List<Integer> numbers1 = List.of(1, 2, 3, 4);
        List<Integer> numbers2 = List.of();
        List<Integer> numbers3 = List.of(1, 1, 1);
        List<Integer> numbers4 = List.of(100, 0);
        List<Integer> numbers5 = List.of(3, 5, 7);
        List<Integer> numbers6 = List.of(10);
        List<Integer> expected1 = List.of(10, 24);
        List<Integer> expected2 = List.of(0, 1);
        List<Integer> expected3 = List.of(3, 1);
        List<Integer> expected4 = List.of(100, 0);
        List<Integer> expected5 = List.of(15, 105);
        List<Integer> expected6 = List.of(10, 10);
        assertEquals(expected1, SumProduct.sumProduct(numbers1));
        assertEquals(expected2, SumProduct.sumProduct(numbers2));
        assertEquals(expected3, SumProduct.sumProduct(numbers3));
        assertEquals(expected4, SumProduct.sumProduct(numbers4));
        assertEquals(expected5, SumProduct.sumProduct(numbers5));
        assertEquals(expected6, SumProduct.sumProduct(numbers6));
    }
}
