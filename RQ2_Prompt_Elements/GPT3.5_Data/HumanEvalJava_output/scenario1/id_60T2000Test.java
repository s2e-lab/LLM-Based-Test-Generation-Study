Here's the code for the SumToNTest class with ten unit test cases for the sumToN method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumToNTest {

    @Test
    void testSumToNWithZero() {
        assertEquals(0, SumToN.sumToN(0));
    }

    @Test
    void testSumToNWithOne() {
        assertEquals(1, SumToN.sumToN(1));
    }

    @Test
    void testSumToNWithTwo() {
        assertEquals(3, SumToN.sumToN(2));
    }

    @Test
    void testSumToNWithThree() {
        assertEquals(6, SumToN.sumToN(3));
    }

    @Test
    void testSumToNWithFour() {
        assertEquals(10, SumToN.sumToN(4));
    }

    @Test
    void testSumToNWithFive() {
        assertEquals(15, SumToN.sumToN(5));
    }

    @Test
    void testSumToNWithTen() {
        assertEquals(55, SumToN.sumToN(10));
    }

    @Test
    void testSumToNWithNegativeNumber() {
        assertEquals(0, SumToN.sumToN(-5));
    }

    @Test
    void testSumToNWithLargeNumber() {
        assertEquals(500500, SumToN.sumToN(1000));
    }

    @Test
    void testSumToNWithMaxValue() {
        assertEquals(2147483647, SumToN.sumToN(Integer.MAX_VALUE));
    }
}
```

This test class includes test cases for the following scenarios:

- When n is 0
- When n is 1
- When n is 2
- When n is 3
- When n is 4
- When n is 5
- When n is 10
- When n is a negative number
- When n is a large number (1000)
- When n is the maximum value for an integer (2147483647)