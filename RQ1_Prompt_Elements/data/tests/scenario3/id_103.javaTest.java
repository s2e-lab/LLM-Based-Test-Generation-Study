package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoundedAvgTest {

    @Test
    public void test() throws Exception{
        assertEquals("0b11", scenario3.RoundedAvg.roundedAvg(1, 5));
		assertEquals("0b1010", scenario3.RoundedAvg.roundedAvg(7, 13));
		assertEquals("0b1111001010", scenario3.RoundedAvg.roundedAvg(964, 977));
		assertEquals("0b1111100100", scenario3.RoundedAvg.roundedAvg(996, 997));
		assertEquals("0b1011000010", scenario3.RoundedAvg.roundedAvg(560, 851));
		assertEquals("0b101101110", scenario3.RoundedAvg.roundedAvg(185, 546));
		assertEquals("0b110101101", scenario3.RoundedAvg.roundedAvg(362, 496));
		assertEquals("0b1001110010", scenario3.RoundedAvg.roundedAvg(350, 902));
		assertEquals("0b11010111", scenario3.RoundedAvg.roundedAvg(197, 233));
		assertEquals(-1, scenario3.RoundedAvg.roundedAvg(7, 5));
		assertEquals(-1, scenario3.RoundedAvg.roundedAvg(5, 1));
		assertEquals("0b101", scenario3.RoundedAvg.roundedAvg(5, 5));
		assertEquals(public static Object roundedAvg(int n, int m) {, scenario3.RoundedAvg.*/);
		
    }

}