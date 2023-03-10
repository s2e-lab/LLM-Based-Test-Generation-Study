package scenario4;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PairsSumToZeroTest {
    @Test
	public void test1() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, 5, 0)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, -2, 1)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 2, 3, 7)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1)));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, 5, 0)));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, -2, 1)));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 2, 3, 7)));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(true, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7)));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(1)));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(true, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 3, 2, 30)));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(true, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 3, 2, 31)));
	}

	@Test
	public void test13() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 4, 2, 30)));
	}

	@Test
	public void test14() throws Exception {
		assertEquals(false, scenario4.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 4, 2, 31)));
	}

	
}