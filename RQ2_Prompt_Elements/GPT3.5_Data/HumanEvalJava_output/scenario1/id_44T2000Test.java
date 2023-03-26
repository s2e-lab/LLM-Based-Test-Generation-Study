Here's the completed code for the `ChangeBaseTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChangeBase}.
 * It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
 */
class ChangeBaseTest {

    @Test
    void testChangeBaseBinary() {
        assertEquals("1010", ChangeBase.changeBase(10, 2));
    }

    @Test
    void testChangeBaseOctal() {
        assertEquals("12", ChangeBase.changeBase(10, 8));
    }

    @Test
    void testChangeBaseHexadecimal() {
        assertEquals("A", ChangeBase.changeBase(10, 16));
    }

    @Test
    void testChangeBaseBase10() {
        assertEquals("10", ChangeBase.changeBase(10, 10));
    }

    @Test
    void testChangeBaseBase2() {
        assertEquals("11111111", ChangeBase.changeBase(255, 2));
    }

    @Test
    void testChangeBaseBase8() {
        assertEquals("377", ChangeBase.changeBase(255, 8));
    }

    @Test
    void testChangeBaseBase16() {
        assertEquals("FF", ChangeBase.changeBase(255, 16));
    }

    @Test
    void testChangeBaseBase3() {
        assertEquals("1010101", ChangeBase.changeBase(2187, 3));
    }

    @Test
    void testChangeBaseBase5() {
        assertEquals("1234", ChangeBase.changeBase(194, 5));
    }

    @Test
    void testChangeBaseBase7() {
        assertEquals("321", ChangeBase.changeBase(123, 7));
    }
}
```

This class contains ten test methods, each of which tests the `changeBase` method with different input values and expected output values. The `assertEquals` method is used to compare the actual output of the `changeBase` method with the expected output. If the two values are not equal, the test fails.