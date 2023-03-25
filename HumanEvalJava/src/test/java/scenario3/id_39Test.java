package scenario3;


import original.PrimeFib;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFibTest {
    @Test
	public void test1() throws Exception {
		assertEquals(2, scenario3.PrimeFib.primeFib(1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(3, scenario3.PrimeFib.primeFib(2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(5, scenario3.PrimeFib.primeFib(3));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(13, scenario3.PrimeFib.primeFib(4));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(89, scenario3.PrimeFib.primeFib(5));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(2, scenario3.PrimeFib.primeFib(1));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(3, scenario3.PrimeFib.primeFib(2));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(5, scenario3.PrimeFib.primeFib(3));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(13, scenario3.PrimeFib.primeFib(4));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(89, scenario3.PrimeFib.primeFib(5));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(233, scenario3.PrimeFib.primeFib(6));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(1597, scenario3.PrimeFib.primeFib(7));
	}

	@Test
	public void test13() throws Exception {
		assertEquals(28657, scenario3.PrimeFib.primeFib(8));
	}

	@Test
	public void test14() throws Exception {
		assertEquals(514229, scenario3.PrimeFib.primeFib(9));
	}

	@Test
	public void test15() throws Exception {
		assertEquals(433494437, scenario3.PrimeFib.primeFib(10));
	}

	
}