// DigitsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains ten unit test cases for the {@link Digits#digits(int)} method.
*/
class DigitsTest {

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits1() {
        assertEquals(1, Digits.digits(1));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits2() {
        assertEquals(0, Digits.digits(4));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits3() {
        assertEquals(15, Digits.digits(235));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits4() {
        assertEquals(5, Digits.digits(5));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits5() {
        assertEquals(5, Digits.digits(54));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits6() {
        assertEquals(1, Digits.digits(120));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits7() {
        assertEquals(5, Digits.digits(5014));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits8() {
        assertEquals(315, Digits.digits(98765));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits9() {
        assertEquals(2625, Digits.digits(5576543));
    }

    /** Test case for {@link Digits#digits(int)}. */
    @Test
    void testDigits10() {
        assertEquals(0, Digits.digits(2468));
    }
}
