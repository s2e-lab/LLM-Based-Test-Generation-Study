package scenario1;

import java.util.List;
import original.SumSquares;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSquaresTest {
    @Test
	public void test1() throws Exception {
		assertEquals(14, scenario1.SumSquares.sumSquares(Arrays.asList(1, 2, 3)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(14, scenario1.SumSquares.sumSquares(Arrays.asList(1.0, 2, 3)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(84, scenario1.SumSquares.sumSquares(Arrays.asList(1, 3, 5, 7)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(29, scenario1.SumSquares.sumSquares(Arrays.asList(1.4, 4.2, 0)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(6, scenario1.SumSquares.sumSquares(Arrays.asList(-2.4, 1, 1)));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(10230, scenario1.SumSquares.sumSquares(Arrays.asList(100, 1, 15, 2)));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(200000000, scenario1.SumSquares.sumSquares(Arrays.asList(10000, 10000)));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(75, scenario1.SumSquares.sumSquares(Arrays.asList(-1.4, 4.6, 6.3)));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(1086, scenario1.SumSquares.sumSquares(Arrays.asList(-1.4, 17.9, 18.9, 19.9)));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(0, scenario1.SumSquares.sumSquares(Arrays.asList(0)));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(1, scenario1.SumSquares.sumSquares(Arrays.asList(-1)));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(2, scenario1.SumSquares.sumSquares(Arrays.asList(-1, 1, 0)));
	}

	
}