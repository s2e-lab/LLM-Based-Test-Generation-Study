package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RoundedAvgTest {
    @Test
    public void testRoundedAvg() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
        assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
        assertEquals(-1, RoundedAvg.roundedAvg(5, 1));
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }
}