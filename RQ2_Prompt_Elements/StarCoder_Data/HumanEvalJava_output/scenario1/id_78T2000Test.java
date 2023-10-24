// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a String.
    */
    @Test
    void testHexKeyString() {
        assertEquals(1, HexKey.hexKey("2"));
        assertEquals(1, HexKey.hexKey("3"));
        assertEquals(1, HexKey.hexKey("5"));
        assertEquals(1, HexKey.hexKey("7"));
        assertEquals(1, HexKey.hexKey("B"));
        assertEquals(1, HexKey.hexKey("D"));
        assertEquals(0, HexKey.hexKey("1"));
        assertEquals(0, HexKey.hexKey("4"));
        assertEquals(0, HexKey.hexKey("6"));
        assertEquals(0, HexKey.hexKey("8"));
        assertEquals(0, HexKey.hexKey("A"));
        assertEquals(0, HexKey.hexKey("C"));
        assertEquals(0, HexKey.hexKey("E"));
        assertEquals(0, HexKey.hexKey("F"));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is an Integer.
    */
    @Test
    void testHexKeyInteger() {
        assertEquals(1, HexKey.hexKey(2));
        assertEquals(1, HexKey.hexKey(3));
        assertEquals(1, HexKey.hexKey(5));
        assertEquals(1, HexKey.hexKey(7));
        assertEquals(1, HexKey.hexKey(11));
        assertEquals(1, HexKey.hexKey(13));
        assertEquals(0, HexKey.hexKey(1));
        assertEquals(0, HexKey.hexKey(4));
        assertEquals(0, HexKey.hexKey(6));
        assertEquals(0, HexKey.hexKey(8));
        assertEquals(0, HexKey.hexKey(10));
        assertEquals(0, HexKey.hexKey(12));
        assertEquals(0, HexKey.hexKey(14));
        assertEquals(0, HexKey.hexKey(15));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Long.
    */
    @Test
    void testHexKeyLong() {
        assertEquals(1, HexKey.hexKey(2L));
        assertEquals(1, HexKey.hexKey(3L));
        assertEquals(1, HexKey.hexKey(5L));
        assertEquals(1, HexKey.hexKey(7L));
        assertEquals(1, HexKey.hexKey(11L));
        assertEquals(1, HexKey.hexKey(13L));
        assertEquals(0, HexKey.hexKey(1L));
        assertEquals(0, HexKey.hexKey(4L));
        assertEquals(0, HexKey.hexKey(6L));
        assertEquals(0, HexKey.hexKey(8L));
        assertEquals(0, HexKey.hexKey(10L));
        assertEquals(0, HexKey.hexKey(12L));
        assertEquals(0, HexKey.hexKey(14L));
        assertEquals(0, HexKey.hexKey(15L));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Float.
    */
    @Test
    void testHexKeyFloat() {
        assertEquals(1, HexKey.hexKey(2.0f));
        assertEquals(1, HexKey.hexKey(3.0f));
        assertEquals(1, HexKey.hexKey(5.0f));
        assertEquals(1, HexKey.hexKey(7.0f));
        assertEquals(1, HexKey.hexKey(11.0f));
        assertEquals(1, HexKey.hexKey(13.0f));
        assertEquals(0, HexKey.hexKey(1.0f));
        assertEquals(0, HexKey.hexKey(4.0f));
        assertEquals(0, HexKey.hexKey(6.0f));
        assertEquals(0, HexKey.hexKey(8.0f));
        assertEquals(0, HexKey.hexKey(10.0f));
        assertEquals(0, HexKey.hexKey(12.0f));
        assertEquals(0, HexKey.hexKey(14.0f));
        assertEquals(0, HexKey.hexKey(15.0f));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Double.
    */
    @Test
    void testHexKeyDouble() {
        assertEquals(1, HexKey.hexKey(2.0));
        assertEquals(1, HexKey.hexKey(3.0));
        assertEquals(1, HexKey.hexKey(5.0));
        assertEquals(1, HexKey.hexKey(7.0));
        assertEquals(1, HexKey.hexKey(11.0));
        assertEquals(1, HexKey.hexKey(13.0));
        assertEquals(0, HexKey.hexKey(1.0));
        assertEquals(0, HexKey.hexKey(4.0));
        assertEquals(0, HexKey.hexKey(6.0));
        assertEquals(0, HexKey.hexKey(8.0));
        assertEquals(0, HexKey.hexKey(10.0));
        assertEquals(0, HexKey.hexKey(12.0));
        assertEquals(0, HexKey.hexKey(14.0));
        assertEquals(0, HexKey.hexKey(15.0));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Character.
    */
    @Test
    void testHexKeyCharacter() {
        assertEquals(1, HexKey.hexKey('2'));
        assertEquals(1, HexKey.hexKey('3'));
        assertEquals(1, HexKey.hexKey('5'));
        assertEquals(1, HexKey.hexKey('7'));
        assertEquals(1, HexKey.hexKey('B'));
        assertEquals(1, HexKey.hexKey('D'));
        assertEquals(0, HexKey.hexKey('1'));
        assertEquals(0, HexKey.hexKey('4'));
        assertEquals(0, HexKey.hexKey('6'));
        assertEquals(0, HexKey.hexKey('8'));
        assertEquals(0, HexKey.hexKey('A'));
        assertEquals(0, HexKey.hexKey('C'));
        assertEquals(0, HexKey.hexKey('E'));
        assertEquals(0, HexKey.hexKey('F'));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Boolean.
    */
    @Test
    void testHexKeyBoolean() {
        assertEquals(1, HexKey.hexKey(true));
        assertEquals(0, HexKey.hexKey(false));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Byte.
    */
    @Test
    void testHexKeyByte() {
        assertEquals(1, HexKey.hexKey((byte) 2));
        assertEquals(1, HexKey.hexKey((byte) 3));
        assertEquals(1, HexKey.hexKey((byte) 5));
        assertEquals(1, HexKey.hexKey((byte) 7));
        assertEquals(1, HexKey.hexKey((byte) 11));
        assertEquals(1, HexKey.hexKey((byte) 13));
        assertEquals(0, HexKey.hexKey((byte) 1));
        assertEquals(0, HexKey.hexKey((byte) 4));
        assertEquals(0, HexKey.hexKey((byte) 6));
        assertEquals(0, HexKey.hexKey((byte) 8));
        assertEquals(0, HexKey.hexKey((byte) 10));
        assertEquals(0, HexKey.hexKey((byte) 12));
        assertEquals(0, HexKey.hexKey((byte) 14));
        assertEquals(0, HexKey.hexKey((byte) 15));
    }

    /**
    * Test case for {@link HexKey#hexKey(Object)} where the parameter is a Short.
    */
    @Test
    void testHexKeyShort() {
        assertEquals(1, HexKey.hexKey((short) 2));
        assertEquals(1, HexKey.hexKey((short) 3));
        assertEquals(1, HexKey.hexKey((short) 5));
        assertEquals(1, HexKey.hexKey((short) 7));
        assertEquals(1, HexKey.hexKey((short) 11));
        assertEquals(1, HexKey.hexKey((short) 13));
        assertEquals(0, HexKey.hexKey((short) 1));
        assertEquals(0, HexKey.hexKey((short) 4));
        assertEquals(0, HexKey.hexKey((short) 6));
        assertEquals(0, HexKey.hexKey((short) 8));
        assertEquals(0, HexKey.hexKey((short) 10));
        assertEquals(0, HexKey.hexKey((short) 12