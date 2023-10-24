// MultiplyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {

    /**
     * Test case for the {@link Multiply#multiply(int, int)} method.
     */
    @Test
    void testMultiply() {
        assertEquals(0, Multiply.multiply(0, 0));
        assertEquals(0, Multiply.multiply(0, 1));
        assertEquals(0, Multiply.multiply(1, 0));
        assertEquals(1, Multiply.multiply(1, 1));
        assertEquals(2, Multiply.multiply(1, 2));
        assertEquals(2, Multiply.multiply(2, 1));
        assertEquals(12, Multiply.multiply(1, 12));
        assertEquals(12, Multiply.multiply(12, 1));
        assertEquals(12, Multiply.multiply(2, 6));
        assertEquals(12, Multiply.multiply(6, 2));
        assertEquals(12, Multiply.multiply(3, 4));
        assertEquals(12, Multiply.multiply(4, 3));
    }
}
