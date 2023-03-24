// HexKeyTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HexKey}.
 * It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
 */
class HexKeyTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HexKey.hexKey(""));
    }

    @Test
    void testSingleDigit() {
        assertEquals(0, HexKey.hexKey("0"));
        assertEquals(0, HexKey.hexKey("1"));
        assertEquals(1, HexKey.hexKey("2"));
        assertEquals(1, HexKey.hexKey("3"));
        assertEquals(0, HexKey.hexKey("4"));
        assertEquals(1, HexKey.hexKey("5"));
        assertEquals(0, HexKey.hexKey("6"));
        assertEquals(1, HexKey.hexKey("7"));
        assertEquals(0, HexKey.hexKey("8"));
        assertEquals(0, HexKey.hexKey("9"));
        assertEquals(1, HexKey.hexKey("A"));
        assertEquals(1, HexKey.hexKey("B"));
        assertEquals(0, HexKey.hexKey("C"));
        assertEquals(1, HexKey.hexKey("D"));
        assertEquals(0, HexKey.hexKey("E"));
        assertEquals(0, HexKey.hexKey("F"));
    }

    @Test
    void testMultipleDigits() {
        assertEquals(1, HexKey.hexKey("AB"));
        assertEquals(2, HexKey.hexKey("1077E"));
        assertEquals(4, HexKey.hexKey("ABED1A33"));
        assertEquals(6, HexKey.hexKey("123456789ABCDEF0"));
        assertEquals(2, HexKey.hexKey("2020"));
        assertEquals(12, HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
    }

    @Test
    void testInvalidInput() {
        assertThrows(NullPointerException.class, () -> HexKey.hexKey(null));
        assertThrows(NumberFormatException.class, () -> HexKey.hexKey("G"));
        assertThrows(NumberFormatException.class, () -> HexKey.hexKey("10G"));
    }
}