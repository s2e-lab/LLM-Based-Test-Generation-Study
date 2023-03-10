package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario4.GreatestCommonDivisor.greatestCommonDivisor(3, 5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(5, scenario4.GreatestCommonDivisor.greatestCommonDivisor(25, 15));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(1, scenario4.GreatestCommonDivisor.greatestCommonDivisor(3, 7));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(5, scenario4.GreatestCommonDivisor.greatestCommonDivisor(10, 15));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(7, scenario4.GreatestCommonDivisor.greatestCommonDivisor(49, 14));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(12, scenario4.GreatestCommonDivisor.greatestCommonDivisor(144, 60));
	}

	
}