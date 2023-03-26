Here's the code for the IsPrimeTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-5));
    }

    @Test
    void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0));
    }

    @Test
    void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1));
    }

    @Test
    void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2));
    }

    @Test
    void testIsPrimeWithThree() {
        assertTrue(IsPrime.isPrime(3));
    }

    @Test
    void testIsPrimeWithFour() {
        assertFalse(IsPrime.isPrime(4));
    }

    @Test
    void testIsPrimeWithFive() {
        assertTrue(IsPrime.isPrime(5));
    }

    @Test
    void testIsPrimeWithSix() {
        assertFalse(IsPrime.isPrime(6));
    }

    @Test
    void testIsPrimeWithLargeNumber() {
        assertFalse(IsPrime.isPrime(1000000));
    }

    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(IsPrime.isPrime(17));
    }
}
```

This test class contains ten unit test cases for the `IsPrime.isPrime(int)` method. The test cases cover a range of scenarios, including negative numbers, zero, one, small prime numbers, small composite numbers, large composite numbers, and large prime numbers. The `@Test` annotation is used to mark each test method, and the `assertTrue` and `assertFalse` methods are used to check the expected results.