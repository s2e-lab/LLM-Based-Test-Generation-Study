// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abc"
     */
    @Test
    void testPrimeLength1() {
        String string = "abc";
        assertTrue(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcd"
     */
    @Test
    void testPrimeLength2() {
        String string = "abcd";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcde"
     */
    @Test
    void testPrimeLength3() {
        String string = "abcde";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdef"
     */
    @Test
    void testPrimeLength4() {
        String string = "abcdef";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefg"
     */
    @Test
    void testPrimeLength5() {
        String string = "abcdefg";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefgh"
     */
    @Test
    void testPrimeLength6() {
        String string = "abcdefgh";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefghi"
     */
    @Test
    void testPrimeLength7() {
        String string = "abcdefghi";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefghij"
     */
    @Test
    void testPrimeLength8() {
        String string = "abcdefghij";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefghijk"
     */
    @Test
    void testPrimeLength9() {
        String string = "abcdefghijk";
        assertFalse(PrimeLength.primeLength(string));
    }

    /**
     * Test case for the {@link PrimeLength#primeLength(String)} method.
     * It tests the length of the string "abcdefghijkl"
     */
    @Test
    void testPrimeLength10() {
        String string = "abcdefghijkl";
        assertFalse(PrimeLength.primeLength(string));
    }
}
