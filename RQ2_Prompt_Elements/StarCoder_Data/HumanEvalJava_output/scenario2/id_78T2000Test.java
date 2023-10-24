// HexKeyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with an empty string.
     */
    @Test
    void testHexKeyEmptyString() {
        assertEquals(0, HexKey.hexKey(""));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only digits.
     */
    @Test
    void testHexKeyOnlyDigits() {
        assertEquals(0, HexKey.hexKey("1234567890"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits.
     */
    @Test
    void testHexKeyOnlyHexDigits() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols2() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols3() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols4() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols5() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols6() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols7() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols8() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols9() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols10() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols11() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols12() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols13() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols14() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols15() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols16() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols17() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols18() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

    /**
     * Test case for the {@link HexKey#hexKey(Object)} method.
     * It tests the method with a string that contains only hexadecimal digits
     * and some other symbols.
     */
    @Test
    void testHexKeyOnlyHexDigitsAndSymbols19() {
        assertEquals(10, HexKey.hexKey("0123456789ABCDEF!@#$%^&*()_+"));
    }

   