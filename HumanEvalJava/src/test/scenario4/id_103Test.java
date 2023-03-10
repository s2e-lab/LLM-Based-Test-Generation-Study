package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoundedAvgTest {
    @Test
	public void test1() throws Exception {
		assertEquals("0b11", scenario4.RoundedAvg.roundedAvg(1, 5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("0b1010", scenario4.RoundedAvg.roundedAvg(7, 13));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("0b1111001010", scenario4.RoundedAvg.roundedAvg(964, 977));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("0b1111100100", scenario4.RoundedAvg.roundedAvg(996, 997));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("0b1011000010", scenario4.RoundedAvg.roundedAvg(560, 851));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("0b101101110", scenario4.RoundedAvg.roundedAvg(185, 546));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("0b110101101", scenario4.RoundedAvg.roundedAvg(362, 496));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("0b1001110010", scenario4.RoundedAvg.roundedAvg(350, 902));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("0b11010111", scenario4.RoundedAvg.roundedAvg(197, 233));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(-1, scenario4.RoundedAvg.roundedAvg(7, 5));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(-1, scenario4.RoundedAvg.roundedAvg(5, 1));
	}

	@Test
	public void test12() throws Exception {
		assertEquals("0b101", scenario4.RoundedAvg.roundedAvg(5, 5));
	}

	
}