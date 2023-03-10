package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HowManyTimesTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0, scenario4.HowManyTimes.howManyTimes("", "a"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(3, scenario4.HowManyTimes.howManyTimes("aaa", "a"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(3, scenario4.HowManyTimes.howManyTimes("aaaa", "aa"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(0, scenario4.HowManyTimes.howManyTimes("", "x"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(4, scenario4.HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(4, scenario4.HowManyTimes.howManyTimes("cacacacac", "cac"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(1, scenario4.HowManyTimes.howManyTimes("john doe", "john"));
	}

	
}