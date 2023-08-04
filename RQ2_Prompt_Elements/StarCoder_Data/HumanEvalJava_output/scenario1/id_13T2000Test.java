// GreatestCommonDivisorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {

    @Test
    void testGreatestCommonDivisor1() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 1));
    }

    @Test
    void testGreatestCommonDivisor2() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 2));
    }

    @Test
    void testGreatestCommonDivisor3() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(2, 1));
    }

    @Test
    void testGreatestCommonDivisor4() {
        assertEquals(2, GreatestCommonDivisor.greatestCommonDivisor(2, 2));
    }

    @Test
    void testGreatestCommonDivisor5() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 3));
    }

    @Test
    void testGreatestCommonDivisor6() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(3, 1));
    }

    @Test
    void testGreatestCommonDivisor7() {
        assertEquals(3, GreatestCommonDivisor.greatestCommonDivisor(3, 3));
    }

    @Test
    void testGreatestCommonDivisor8() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 4));
    }

    @Test
    void testGreatestCommonDivisor9() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(4, 1));
    }

    @Test
    void testGreatestCommonDivisor10() {
        assertEquals(4, GreatestCommonDivisor.greatestCommonDivisor(4, 4));
    }
}
