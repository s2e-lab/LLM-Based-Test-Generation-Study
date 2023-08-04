// DigitsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains ten unit test cases for the {@link Digits#digits(int)} method.
*/
class DigitsTest {

    @Test
    void testDigits1() {
        assertEquals(0, Digits.digits(0));
    }

    @Test
    void testDigits2() {
        assertEquals(1, Digits.digits(1));
    }

    @Test
    void testDigits3() {
        assertEquals(1, Digits.digits(10));
    }

    @Test
    void testDigits4() {
        assertEquals(1, Digits.digits(100));
    }

    @Test
    void testDigits5() {
        assertEquals(1, Digits.digits(1000));
    }

    @Test
    void testDigits6() {
        assertEquals(1, Digits.digits(10000));
    }

    @Test
    void testDigits7() {
        assertEquals(1, Digits.digits(100000));
    }

    @Test
    void testDigits8() {
        assertEquals(1, Digits.digits(1000000));
    }

    @Test
    void testDigits9() {
        assertEquals(1, Digits.digits(10000000));
    }

    @Test
    void testDigits10() {
        assertEquals(1, Digits.digits(100000000));
    }
}
