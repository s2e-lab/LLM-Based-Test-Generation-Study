Here's the completed code for the `AddTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Add}.
 * It contains ten unit test cases for the {@link Add#add(int, int)} method.
 */
class AddTest {

    @Test
    void testAddPositiveNumbers() {
        int result = Add.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAddNegativeNumbers() {
        int result = Add.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    void testAddZeroToPositiveNumber() {
        int result = Add.add(0, 5);
        assertEquals(5, result);
    }

    @Test
    void testAddZeroToNegativeNumber() {
        int result = Add.add(0, -5);
        assertEquals(-5, result);
    }

    @Test
    void testAddPositiveNumberToZero() {
        int result = Add.add(5, 0);
        assertEquals(5, result);
    }

    @Test
    void testAddNegativeNumberToZero() {
        int result = Add.add(-5, 0);
        assertEquals(-5, result);
    }

    @Test
    void testAddMaxValueToPositiveNumber() {
        int result = Add.add(Integer.MAX_VALUE, 5);
        assertEquals(Integer.MAX_VALUE + 5, result);
    }

    @Test
    void testAddMaxValueToNegativeNumber() {
        int result = Add.add(Integer.MAX_VALUE, -5);
        assertEquals(Integer.MAX_VALUE - 4, result);
    }

    @Test
    void testAddMinValueToPositiveNumber() {
        int result = Add.add(Integer.MIN_VALUE, 5);
        assertEquals(Integer.MIN_VALUE + 5, result);
    }

    @Test
    void testAddMinValueToNegativeNumber() {
        int result = Add.add(Integer.MIN_VALUE, -5);
        assertEquals(Integer.MIN_VALUE - 6, result);
    }
}
```

This class contains ten test methods that cover a variety of scenarios for the `Add.add()` method. Each test method uses the `assertEquals()` method to verify that the expected result is returned by the `Add.add()` method.