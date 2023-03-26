Here's the code for the `IsPrimeTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsPrime}.
 * It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
 */
class IsPrimeTest {

    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-1));
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
    void testIsPrimeWithLargePrimeNumber() {
        assertTrue(IsPrime.isPrime(7919));
    }

    @Test
    void testIsPrimeWithLargeNonPrimeNumber() {
        assertFalse(IsPrime.isPrime(7918));
    }
}
```

This class contains ten test methods, each testing a different scenario for the `isPrime` method of the `IsPrime` class. The `@Test` annotation is used to mark each method as a test method. The `assertTrue` and `assertFalse` methods are used to assert the expected result of each test case.