// RoundedAvgTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg1() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg2() {
        assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg3() {
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg4() {
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg5() {
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg6() {
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg7() {
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg8() {
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg9() {
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg10() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg11() {
        assertEquals(-1, RoundedAvg.roundedAvg(5, 1));
    }

    /** Test case for {@link RoundedAvg#roundedAvg(int, int)}. */
    @Test
    void testRoundedAvg12() {
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }
}
