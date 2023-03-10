package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solve1Test {
    @Test
	public void test1() throws Exception {
		assertEquals("1", scenario3.Solve1.solve(1000));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("110", scenario3.Solve1.solve(150));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("1100", scenario3.Solve1.solve(147));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("1001", scenario3.Solve1.solve(333));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("10010", scenario3.Solve1.solve(963));
	}

	
}