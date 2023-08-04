// RoundedAvgTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 10.
     */
    @Test
    void testRoundedAvg1() {
        assertEquals("0b1010", RoundedAvg.roundedAvg(1, 10));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 1.
     */
    @Test
    void testRoundedAvg2() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 1));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 2.
     */
    @Test
    void testRoundedAvg3() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 2));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 3.
     */
    @Test
    void testRoundedAvg4() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 3));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 4.
     */
    @Test
    void testRoundedAvg5() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 4));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 5.
     */
    @Test
    void testRoundedAvg6() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 5));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 6.
     */
    @Test
    void testRoundedAvg7() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 6));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 7.
     */
    @Test
    void testRoundedAvg8() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 7));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 8.
     */
    @Test
    void testRoundedAvg9() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 8));
    }

    /**
     * Test case for {@link RoundedAvg#roundedAvg(int, int)} with n = 1, m = 9.
     */
    @Test
    void testRoundedAvg10() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 9));
    }
}
