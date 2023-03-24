Here's the source code for the DigitsTest class:

```
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testDigitsWithOne() {
        assertEquals(1, Digits.digits(1));
    }

    @Test
    void testDigitsWithEvenNumber() {
        assertEquals(0, Digits.digits(4));
    }

    @Test
    void testDigitsWithOddNumber() {
        assertEquals(15, Digits.digits(235));
    }

    @Test
    void testDigitsWithSingleOddDigit() {
        assertEquals(5, Digits.digits(5));
    }

    @Test
    void testDigitsWithTwoDigitsOneOdd() {
        assertEquals(5, Digits.digits(54));
    }

    @Test
    void testDigitsWithTwoDigitsAllEven() {
        assertEquals(0, Digits.digits(12));
    }

    @Test
    void testDigitsWithThreeDigitsOneOdd() {
        assertEquals(1, Digits.digits(120));
    }

    @Test
    void testDigitsWithFourDigitsOneOdd() {
        assertEquals(5, Digits.digits(5014));
    }

    @Test
    void testDigitsWithFiveDigitsAllOdd() {
        assertEquals(315, Digits.digits(98765));
    }

    @Test
    void testDigitsWithSevenDigitsAllOdd() {
        assertEquals(2625, Digits.digits(5576543));
    }
}
```

This class contains ten test methods, each testing a different scenario for the `Digits.digits(int)` method. The `@Test` annotation is used to mark each method as a test method. The `assertEquals` method is used to compare the expected result with the actual result of calling the `Digits.digits(int)` method with a specific input.