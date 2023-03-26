Here's the code for the `DigitsTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Digits}.
 * It contains ten unit test cases for the {@link Digits#digits(int)} method.
 */
class DigitsTest {

    @Test
    void testDigitsWithNoOddDigits() {
        assertEquals(0, Digits.digits(2468));
    }

    @Test
    void testDigitsWithOneOddDigit() {
        assertEquals(5, Digits.digits(2465));
    }

    @Test
    void testDigitsWithTwoOddDigits() {
        assertEquals(15, Digits.digits(13579));
    }

    @Test
    void testDigitsWithAllOddDigits() {
        assertEquals(945, Digits.digits(13579));
    }

    @Test
    void testDigitsWithZero() {
        assertEquals(0, Digits.digits(0));
    }

    @Test
    void testDigitsWithNegativeNumber() {
        assertEquals(15, Digits.digits(-13579));
    }

    @Test
    void testDigitsWithMaxInt() {
        assertEquals(9, Digits.digits(Integer.MAX_VALUE));
    }

    @Test
    void testDigitsWithMinInt() {
        assertEquals(1, Digits.digits(Integer.MIN_VALUE));
    }

    @Test
    void testDigitsWithSingleDigit() {
        assertEquals(1, Digits.digits(5));
    }

    @Test
    void testDigitsWithRepeatedOddDigits() {
        assertEquals(27, Digits.digits(333555777));
    }
}
```

This test class contains ten test cases for the `Digits.digits(int)` method. Each test case tests a different scenario, such as when the input number has no odd digits, when it has one odd digit, when it has all odd digits, when it is negative, when it is the maximum or minimum integer value, and so on. The `assertEquals` method is used to check that the actual result of the method matches the expected result for each test case.