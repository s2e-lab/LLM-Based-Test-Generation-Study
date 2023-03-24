Here's the source code for the `LargestDivisorTest` class:

```
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestDivisorTest {

    @Test
    void testLargestDivisor() {
        assertEquals(5, LargestDivisor.largestDivisor(15));
        assertEquals(1, LargestDivisor.largestDivisor(3));
        assertEquals(1, LargestDivisor.largestDivisor(7));
        assertEquals(5, LargestDivisor.largestDivisor(10));
        assertEquals(50, LargestDivisor.largestDivisor(100));
        assertEquals(7, LargestDivisor.largestDivisor(49));
        assertEquals(1, LargestDivisor.largestDivisor(1));
        assertEquals(1, LargestDivisor.largestDivisor(2));
        assertEquals(2, LargestDivisor.largestDivisor(4));
        assertEquals(3, LargestDivisor.largestDivisor(9));
    }
}
```

This test class contains a single test method `testLargestDivisor()` which contains ten test cases that verify the correctness of the `largestDivisor()` method for different input values. The `assertEquals()` method is used to compare the expected output with the actual output of the `largestDivisor()` method.