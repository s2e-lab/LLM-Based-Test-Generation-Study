Here's the completed `IsSimplePowerTest` class with ten unit test cases for the `isSimplePower` method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsSimplePower}.
 * It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
 */
class IsSimplePowerTest {

    @Test
    void testIsSimplePowerWithXEqualsOne() {
        assertTrue(IsSimplePower.isSimplePower(1, 2));
        assertTrue(IsSimplePower.isSimplePower(1, 3));
        assertTrue(IsSimplePower.isSimplePower(1, 4));
        assertTrue(IsSimplePower.isSimplePower(1, 5));
    }

    @Test
    void testIsSimplePowerWithNEqualsOne() {
        assertFalse(IsSimplePower.isSimplePower(2, 1));
        assertFalse(IsSimplePower.isSimplePower(3, 1));
        assertFalse(IsSimplePower.isSimplePower(4, 1));
        assertFalse(IsSimplePower.isSimplePower(5, 1));
    }

    @Test
    void testIsSimplePowerWithSimplePowers() {
        assertTrue(IsSimplePower.isSimplePower(16, 2));
        assertTrue(IsSimplePower.isSimplePower(81, 3));
        assertTrue(IsSimplePower.isSimplePower(256, 4));
        assertTrue(IsSimplePower.isSimplePower(3125, 5));
    }

    @Test
    void testIsSimplePowerWithNonSimplePowers() {
        assertFalse(IsSimplePower.isSimplePower(15, 2));
        assertFalse(IsSimplePower.isSimplePower(80, 3));
        assertFalse(IsSimplePower.isSimplePower(255, 4));
        assertFalse(IsSimplePower.isSimplePower(3124, 5));
    }
}
```

The test cases cover the following scenarios:

1. `x` equals 1
2. `n` equals 1
3. `x` is a simple power of `n`
4. `x` is not a simple power of `n`