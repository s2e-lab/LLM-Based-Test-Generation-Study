Here's the code for the `ProdSignsTest` class:

```
package scenario1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Collections.emptyList();
        assertNull(ProdSigns.prodSigns(arr));
    }

    @Test
    void testAllPositiveNumbers() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4);
        assertEquals(24, ProdSigns.prodSigns(arr));
    }

    @Test
    void testAllNegativeNumbers() {
        List<Object> arr = Arrays.asList(-1, -2, -3, -4);
        assertEquals(-24, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixedNumbers() {
        List<Object> arr = Arrays.asList(-1, 2, -3, 4);
        assertEquals(24, ProdSigns.prodSigns(arr));
    }

    @Test
    void testZero() {
        List<Object> arr = Arrays.asList(1, 2, 0, 4);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testOnlyZero() {
        List<Object> arr = Arrays.asList(0, 0, 0, 0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixedNumbersWithZero() {
        List<Object> arr = Arrays.asList(-1, 2, 0, -4);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixedNumbersWithNonInteger() {
        List<Object> arr = Arrays.asList(-1, 2, "3", -4);
        assertEquals(-4, ProdSigns.prodSigns(arr));
    }

    @Test
    void testOnlyNonInteger() {
        List<Object> arr = Arrays.asList("1", "2", "3", "4");
        assertNull(ProdSigns.prodSigns(arr));
    }

    @Test
    void testNull() {
        assertNull(ProdSigns.prodSigns(null));
    }

    @Test
    void testLargeNumbers() {
        List<Object> arr = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE, 1, -1);
        assertEquals(-1, ProdSigns.prodSigns(arr));
    }
}
```

This test class contains ten unit test cases for the `ProdSigns` class. The test cases cover different scenarios such as an empty list, all positive numbers, all negative numbers, mixed numbers, zero, only zero, mixed numbers with zero, mixed numbers with non-integer, only non-integer, null, and large numbers. Each test case has a descriptive name and uses the `assertEquals` and `assertNull` methods to check the expected output of the `ProdSigns.prodSigns` method.