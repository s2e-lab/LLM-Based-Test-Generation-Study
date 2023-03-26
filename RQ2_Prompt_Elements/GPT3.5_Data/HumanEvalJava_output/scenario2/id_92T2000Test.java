// AnyIntTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AnyInt}.
 * It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
 */
class AnyIntTest {

    @Test
    void testAllIntegers() {
        assertTrue(AnyInt.anyInt(1, 2, 3));
        assertTrue(AnyInt.anyInt(2, 1, 3));
        assertTrue(AnyInt.anyInt(3, 1, 2));
        assertFalse(AnyInt.anyInt(1, 2, 4));
    }

    @Test
    void testAllDoubles() {
        assertFalse(AnyInt.anyInt(1.0, 2.0, 3.0));
        assertFalse(AnyInt.anyInt(2.0, 1.0, 3.0));
        assertFalse(AnyInt.anyInt(3.0, 1.0, 2.0));
        assertFalse(AnyInt.anyInt(1.0, 2.0, 4.0));
    }

    @Test
    void testOneDouble() {
        assertFalse(AnyInt.anyInt(1, 2, 3.0));
        assertFalse(AnyInt.anyInt(2, 1.0, 3));
        assertFalse(AnyInt.anyInt(3.0, 1, 2));
        assertFalse(AnyInt.anyInt(1, 2.0, 4));
    }

    @Test
    void testOneString() {
        assertFalse(AnyInt.anyInt(1, 2, "3"));
        assertFalse(AnyInt.anyInt(2, "1", 3));
        assertFalse(AnyInt.anyInt("3", 1, 2));
        assertFalse(AnyInt.anyInt(1, "2", 4));
    }

    @Test
    void testOneNull() {
        assertFalse(AnyInt.anyInt(1, 2, null));
        assertFalse(AnyInt.anyInt(2, null, 3));
        assertFalse(AnyInt.anyInt(null, 1, 2));
        assertFalse(AnyInt.anyInt(1, null, null));
    }

    @Test
    void testAllNull() {
        assertFalse(AnyInt.anyInt(null, null, null));
    }

    @Test
    void testMaxInt() {
        assertTrue(AnyInt.anyInt(Integer.MAX_VALUE, 0, Integer.MAX_VALUE));
        assertTrue(AnyInt.anyInt(0, Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertFalse(AnyInt.anyInt(Integer.MAX_VALUE, 0, Integer.MAX_VALUE - 1));
    }

    @Test
    void testMinInt() {
        assertTrue(AnyInt.anyInt(Integer.MIN_VALUE, 0, Integer.MIN_VALUE));
        assertTrue(AnyInt.anyInt(0, Integer.MIN_VALUE, Integer.MIN_VALUE));
        assertFalse(AnyInt.anyInt(Integer.MIN_VALUE, 0, Integer.MIN_VALUE + 1));
    }

    @Test
    void testZero() {
        assertTrue(AnyInt.anyInt(0, 0, 0));
        assertFalse(AnyInt.anyInt(0, 0, 1));
    }
}