// RoundedAvgTest.java
package original;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
    @Test
    void testRoundedAvg1() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
    }

    @Test
    void testRoundedAvg2() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvg3() {
        assertEquals("0b1111", RoundedAvg.roundedAvg(10, 20));
    }

    @Test
    void testRoundedAvg4() {
        assertEquals("0b11010", RoundedAvg.roundedAvg(20, 33));
    }

    @Test
    void testRoundedAvg5() {
        assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
    }

    @Test
    void testRoundedAvg6() {
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
    }

    @Test
    void testRoundedAvg7() {
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
    }

    @Test
    void testRoundedAvg8() {
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
    }

    @Test
    void testRoundedAvg9() {
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
    }

    @Test
    void testRoundedAvg10() {
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
    }

    @Test
    void testRoundedAvg11() {
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
    }

    @Test
    void testRoundedAvg12() {
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
    }

    @Test
    void testRoundedAvg13() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvg14() {
        assertEquals(-1, RoundedAvg.roundedAvg(5, 1));
    }

    @Test
    void testRoundedAvg15() {
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }
}