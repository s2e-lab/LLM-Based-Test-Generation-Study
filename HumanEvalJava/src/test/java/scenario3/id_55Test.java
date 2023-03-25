package scenario3;


import original.Fib;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibTest {
    @Test
	public void test1() throws Exception {
		assertEquals(55, scenario3.Fib.fib(10));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(1, scenario3.Fib.fib(1));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(21, scenario3.Fib.fib(8));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(89, scenario3.Fib.fib(11));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(144, scenario3.Fib.fib(12));
	}

	
}