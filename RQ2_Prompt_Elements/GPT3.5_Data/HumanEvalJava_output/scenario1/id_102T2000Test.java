Here's the completed code for the `ChooseNumTest` class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ChooseNum}.
 * It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
 */
class ChooseNumTest {

    @Test
    void testChooseNumWithEvenNumbers() {
        assertEquals(10, ChooseNum.chooseNum(1, 10));
    }

    @Test
    void testChooseNumWithOddNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(1, 9));
    }

    @Test
    void testChooseNumWithNegativeNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(-10, -1));
    }

    @Test
    void testChooseNumWithSameNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(5, 5));
    }

    @Test
    void testChooseNumWithDescendingNumbers() {
        assertEquals(-1, ChooseNum.chooseNum(10, 1));
    }

    @Test
    void testChooseNumWithLargeNumbers() {
        assertEquals(1000000, ChooseNum.chooseNum(1, 1000000));
    }

    @Test
    void testChooseNumWithZero() {
        assertEquals(-1, ChooseNum.chooseNum(0, 0));
    }

    @Test
    void testChooseNumWithMaxInt() {
        assertEquals(2147483646, ChooseNum.chooseNum(1, Integer.MAX_VALUE));
    }

    @Test
    void testChooseNumWithMinInt() {
        assertEquals(-1, ChooseNum.chooseNum(Integer.MIN_VALUE, 1));
    }

    @Test
    void testChooseNumWithMaxAndMinInt() {
        assertEquals(2147483646, ChooseNum.chooseNum(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `chooseNum` method. Each test case is annotated with the `@Test` annotation, which tells JUnit to run it as a test. The `assertEquals` method is used to check that the actual result of the method matches the expected result.