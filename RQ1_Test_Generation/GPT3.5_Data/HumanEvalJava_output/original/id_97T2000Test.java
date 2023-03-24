// Here's the generated code for the MultiplyTest class:

package generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import original.Multiply;

/**
 * Test class of {@link Multiply}.
 * It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
 */
class MultiplyTest {

    @Test
    void testMultiplyPositiveNumbers() {
        int result = Multiply.multiply(148, 412);
        assertEquals(16, result);
    }

    @Test
    void testMultiplyPositiveNumbers2() {
        int result = Multiply.multiply(19, 28);
        assertEquals(72, result);
    }

    @Test
    void testMultiplyPositiveNumbers3() {
        int result = Multiply.multiply(2020, 1851);
        assertEquals(0, result);
    }

    @Test
    void testMultiplyPositiveAndNegativeNumbers() {
        int result = Multiply.multiply(14, -15);
        assertEquals(20, result);
    }

    @Test
    void testMultiplyPositiveNumbers4() {
        int result = Multiply.multiply(76, 67);
        assertEquals(42, result);
    }

    @Test
    void testMultiplyPositiveNumbers5() {
        int result = Multiply.multiply(17, 27);
        assertEquals(49, result);
    }

    @Test
    void testMultiplyZeroAndPositiveNumber() {
        int result = Multiply.multiply(0, 1);
        assertEquals(0, result);
    }

    @Test
    void testMultiplyTwoZeros() {
        int result = Multiply.multiply(0, 0);
        assertEquals(0, result);
    }

    @Test
    void testMultiplyNegativeNumbers() {
        int result = Multiply.multiply(-14, -15);
        assertEquals(20, result);
    }

    @Test
    void testMultiplyNegativeAndPositiveNumbers() {
        int result = Multiply.multiply(-14, 15);
        assertEquals(0, result);
    }
}