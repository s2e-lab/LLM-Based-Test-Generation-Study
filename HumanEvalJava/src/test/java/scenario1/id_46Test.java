package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Fib4Test {
    @Test
	public void test1() throws Exception {
		assertEquals(4, scenario1.Fib4.fib4(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(8, scenario1.Fib4.fib4(6));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(14, scenario1.Fib4.fib4(7));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(4, scenario1.Fib4.fib4(5));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(28, scenario1.Fib4.fib4(8));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(104, scenario1.Fib4.fib4(10));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(386, scenario1.Fib4.fib4(12));
	}

	
}