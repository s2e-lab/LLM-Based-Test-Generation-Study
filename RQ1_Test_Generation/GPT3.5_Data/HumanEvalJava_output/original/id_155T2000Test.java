Here's the code for the test class:

```
package original;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddCountTest {

    @Test
    void testEvenOddCount() {
        List<Integer> expected1 = Arrays.asList(1, 1);
        List<Integer> expected2 = Arrays.asList(1, 2);
        List<Integer> expected3 = Arrays.asList(0, 1);
        List<Integer> expected4 = Arrays.asList(1, 1);
        List<Integer> expected5 = Arrays.asList(2, 2);
        List<Integer> expected6 = Arrays.asList(3, 3);
        List<Integer> expected7 = Arrays.asList(1, 0);
        List<Integer> expected8 = Arrays.asList(2, 3);
        List<Integer> expected9 = Arrays.asList(1, 0);
        List<Integer> expected10 = Arrays.asList(0, 1);

        assertEquals(expected1, EvenOddCount.evenOddCount(-12));
        assertEquals(expected2, EvenOddCount.evenOddCount(123));
        assertEquals(expected3, EvenOddCount.evenOddCount(7));
        assertEquals(expected4, EvenOddCount.evenOddCount(-78));
        assertEquals(expected5, EvenOddCount.evenOddCount(3452));
        assertEquals(expected6, EvenOddCount.evenOddCount(346211));
        assertEquals(expected7, EvenOddCount.evenOddCount(-2));
        assertEquals(expected8, EvenOddCount.evenOddCount(-45347));
        assertEquals(expected9, EvenOddCount.evenOddCount(0));
        assertEquals(expected10, EvenOddCount.evenOddCount(101));
    }
}
```

This test class contains ten test cases for the `evenOddCount` method. Each test case has an expected result, which is compared to the actual result returned by the method using the `assertEquals` method.