// CircularShiftTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 0.
     */
    @Test
    void testCircularShift0() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 0));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 1.
     */
    @Test
    void testCircularShift1() {
        assertEquals("234567891", CircularShift.circularShift(123456789, 1));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 2.
     */
    @Test
    void testCircularShift2() {
        assertEquals("345678912", CircularShift.circularShift(123456789, 2));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 3.
     */
    @Test
    void testCircularShift3() {
        assertEquals("456789123", CircularShift.circularShift(123456789, 3));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 4.
     */
    @Test
    void testCircularShift4() {
        assertEquals("567891234", CircularShift.circularShift(123456789, 4));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 5.
     */
    @Test
    void testCircularShift5() {
        assertEquals("678912345", CircularShift.circularShift(123456789, 5));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 6.
     */
    @Test
    void testCircularShift6() {
        assertEquals("789123456", CircularShift.circularShift(123456789, 6));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 7.
     */
    @Test
    void testCircularShift7() {
        assertEquals("891234567", CircularShift.circularShift(123456789, 7));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 8.
     */
    @Test
    void testCircularShift8() {
        assertEquals("912345678", CircularShift.circularShift(123456789, 8));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 9.
     */
    @Test
    void testCircularShift9() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 9));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 10.
     */
    @Test
    void testCircularShift10() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 10));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 11.
     */
    @Test
    void testCircularShift11() {
        assertEquals("234567891", CircularShift.circularShift(123456789, 11));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 12.
     */
    @Test
    void testCircularShift12() {
        assertEquals("345678912", CircularShift.circularShift(123456789, 12));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 13.
     */
    @Test
    void testCircularShift13() {
        assertEquals("456789123", CircularShift.circularShift(123456789, 13));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 14.
     */
    @Test
    void testCircularShift14() {
        assertEquals("567891234", CircularShift.circularShift(123456789, 14));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 15.
     */
    @Test
    void testCircularShift15() {
        assertEquals("678912345", CircularShift.circularShift(123456789, 15));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 16.
     */
    @Test
    void testCircularShift16() {
        assertEquals("789123456", CircularShift.circularShift(123456789, 16));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 17.
     */
    @Test
    void testCircularShift17() {
        assertEquals("891234567", CircularShift.circularShift(123456789, 17));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 18.
     */
    @Test
    void testCircularShift18() {
        assertEquals("912345678", CircularShift.circularShift(123456789, 18));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 19.
     */
    @Test
    void testCircularShift19() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 19));
    }

    /**
     * Test case for {@link CircularShift#circularShift(int, int)} with shift = 20.
     */
    @Test
    void testCircularShift20() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 20));
    }
}
