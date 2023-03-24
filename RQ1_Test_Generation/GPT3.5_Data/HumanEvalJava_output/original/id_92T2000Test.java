// AnyIntTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AnyInt}.
 * It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
 */
class AnyIntTest {

    @Test
    void testAnyInt1() {
        assertTrue(AnyInt.anyInt(5, 2, 7));
    }

    @Test
    void testAnyInt2() {
        assertFalse(AnyInt.anyInt(3, 2, 2));
    }

    @Test
    void testAnyInt3() {
        assertTrue(AnyInt.anyInt(3, -2, 1));
    }

    @Test
    void testAnyInt4() {
        assertFalse(AnyInt.anyInt(3.6, -2.2, 2));
    }

    @Test
    void testAnyInt5() {
        assertTrue(AnyInt.anyInt(2, 3, 1));
    }

    @Test
    void testAnyInt6() {
        assertFalse(AnyInt.anyInt(2.5, 2, 3));
    }

    @Test
    void testAnyInt7() {
        assertFalse(AnyInt.anyInt(1.5, 5, 3.5));
    }

    @Test
    void testAnyInt8() {
        assertFalse(AnyInt.anyInt(2, 6, 2));
    }

    @Test
    void testAnyInt9() {
        assertTrue(AnyInt.anyInt(4, 2, 2));
    }

    @Test
    void testAnyInt10() {
        assertFalse(AnyInt.anyInt(2.2, 2.2, 2.2));
    }

    @Test
    void testAnyInt11() {
        assertTrue(AnyInt.anyInt(-4, 6, 2));
    }

    @Test
    void testAnyInt12() {
        assertTrue(AnyInt.anyInt(2, 1, 1));
    }

    @Test
    void testAnyInt13() {
        assertTrue(AnyInt.anyInt(3, 4, 7));
    }

    @Test
    void testAnyInt14() {
        assertFalse(AnyInt.anyInt(3.0, 4, 7));
    }
}