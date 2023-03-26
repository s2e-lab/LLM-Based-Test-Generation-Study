Here's the code for the Add1Test class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Add1}.
 * It contains ten unit test cases for the {@link Add1#add(List)} method.
 */
class Add1Test {

    @Test
    void testEmptyList() {
        List<Integer> lst = new ArrayList<>();
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testOddNumbers() {
        List<Integer> lst = Arrays.asList(1, 3, 5, 7, 9);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testEvenNumbers() {
        List<Integer> lst = Arrays.asList(2, 4, 6, 8, 10);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testMixedNumbers() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = Add1.add(lst);
        assertEquals(20, result);
    }

    @Test
    void testAllEvenNumbers() {
        List<Integer> lst = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        int result = Add1.add(lst);
        assertEquals(110, result);
    }

    @Test
    void testAllOddNumbers() {
        List<Integer> lst = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testMixedNumbersWithNegativeValues() {
        List<Integer> lst = Arrays.asList(-1, 2, -3, 4, -5, 6, -7, 8, -9, 10);
        int result = Add1.add(lst);
        assertEquals(12, result);
    }

    @Test
    void testMixedNumbersWithZero() {
        List<Integer> lst = Arrays.asList(1, 0, 3, 0, 5, 0, 7, 0, 9, 0);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testMixedNumbersWithNullValues() {
        List<Integer> lst = Arrays.asList(1, null, 3, null, 5, null, 7, null, 9, null);
        assertThrows(NullPointerException.class, () -> Add1.add(lst));
    }

    @Test
    void testLargeList() {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            lst.add(i);
        }
        int result = Add1.add(lst);
        assertEquals(250000000, result);
    }
}
```

This test class contains ten unit test cases for the `Add1.add(List)` method. The first five test cases cover different scenarios of input lists containing only odd numbers, only even numbers, mixed numbers, all even numbers, and all odd numbers. The next three test cases cover scenarios of input lists containing negative values, zero values, and null values. The last test case covers a scenario of a large input list containing one million numbers.