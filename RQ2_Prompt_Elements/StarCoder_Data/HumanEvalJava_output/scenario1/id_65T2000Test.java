// CircularShiftTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {

    @Test
    void testCircularShift1() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 0));
    }

    @Test
    void testCircularShift2() {
        assertEquals("987654321", CircularShift.circularShift(123456789, 8));
    }

    @Test
    void testCircularShift3() {
        assertEquals("345678912", CircularShift.circularShift(123456789, 2));
    }

    @Test
    void testCircularShift4() {
        assertEquals("678912345", CircularShift.circularShift(123456789, 5));
    }

    @Test
    void testCircularShift5() {
        assertEquals("912345678", CircularShift.circularShift(123456789, 8));
    }

    @Test
    void testCircularShift6() {
        assertEquals("234567891", CircularShift.circularShift(123456789, 1));
    }

    @Test
    void testCircularShift7() {
        assertEquals("567891234", CircularShift.circularShift(123456789, 4));
    }

    @Test
    void testCircularShift8() {
        assertEquals("891234567", CircularShift.circularShift(123456789, 7));
    }

    @Test
    void testCircularShift9() {
        assertEquals("123456789", CircularShift.circularShift(123456789, 0));
    }

    @Test
    void testCircularShift10() {
        assertEquals("987654321", CircularShift.circularShift(123456789, 8));
    }
}
