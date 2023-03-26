Here's the code for the IsSimplePowerTest class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsSimplePower}.
 * It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
 */
class IsSimplePowerTest {

    @Test
    void testIsSimplePower1() {
        assertTrue(IsSimplePower.isSimplePower(1, 2));
    }

    @Test
    void testIsSimplePower2() {
        assertFalse(IsSimplePower.isSimplePower(2, 1));
    }

    @Test
    void testIsSimplePower3() {
        assertTrue(IsSimplePower.isSimplePower(16, 2));
    }

    @Test
    void testIsSimplePower4() {
        assertTrue(IsSimplePower.isSimplePower(27, 3));
    }

    @Test
    void testIsSimplePower5() {
        assertFalse(IsSimplePower.isSimplePower(10, 2));
    }

    @Test
    void testIsSimplePower6() {
        assertFalse(IsSimplePower.isSimplePower(15, 3));
    }

    @Test
    void testIsSimplePower7() {
        assertTrue(IsSimplePower.isSimplePower(1, 1));
    }

    @Test
    void testIsSimplePower8() {
        assertFalse(IsSimplePower.isSimplePower(0, 2));
    }

    @Test
    void testIsSimplePower9() {
        assertFalse(IsSimplePower.isSimplePower(2, 0));
    }

    @Test
    void testIsSimplePower10() {
        assertTrue(IsSimplePower.isSimplePower(256, 2));
    }
}
```

This test class contains ten unit test cases for the `isSimplePower` method of the `IsSimplePower` class. Each test case is annotated with the `@Test` annotation and contains an assertion using the `assertTrue` or `assertFalse` method to check the expected result of the `isSimplePower` method for a given input.