Here's the code for the IsMultiplyPrimeTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsMultiplyPrimeTest {

    @Test
    void testIsMultiplyPrimeWithValidInput() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 7 * 11));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(3 * 5 * 13));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 2 * 17));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(3 * 7 * 19));
    }

    @Test
    void testIsMultiplyPrimeWithInvalidInput() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 4));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 2 * 2));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(3 * 7 * 11 * 13));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(1));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(0));
    }

    @Test
    void testIsMultiplyPrimeWithEdgeCases() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(-1));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(101));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(Integer.MAX_VALUE));
    }
}
```

This test class contains three test methods:

1. `testIsMultiplyPrimeWithValidInput`: This method tests the `isMultiplyPrime` method with valid input values that are the multiplication of 3 prime numbers. It expects the method to return `true` for all test cases.
2. `testIsMultiplyPrimeWithInvalidInput`: This method tests the `isMultiplyPrime` method with invalid input values that are not the multiplication of 3 prime numbers. It expects the method to return `false` for all test cases.
3. `testIsMultiplyPrimeWithEdgeCases`: This method tests the `isMultiplyPrime` method with edge cases such as negative input values, input values greater than 100, and the maximum integer value. It expects the method to return `false` for all test cases.