package scenario3;


import original.ChangeBase;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChangeBaseTest {
    @Test
	public void test1() throws Exception {
		assertEquals("22", scenario3.ChangeBase.changeBase(8, 3));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("1000", scenario3.ChangeBase.changeBase(8, 2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("111", scenario3.ChangeBase.changeBase(7, 2));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("22", scenario3.ChangeBase.changeBase(8, 3));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("100", scenario3.ChangeBase.changeBase(9, 3));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("11101010", scenario3.ChangeBase.changeBase(234, 2));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("10000", scenario3.ChangeBase.changeBase(16, 2));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("1000", scenario3.ChangeBase.changeBase(8, 2));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("111", scenario3.ChangeBase.changeBase(7, 2));
	}

	@Test
	public void test10() throws Exception {
		assertEquals("2", scenario3.ChangeBase.changeBase(2, 3));
	}

	@Test
	public void test11() throws Exception {
		assertEquals("3", scenario3.ChangeBase.changeBase(3, 4));
	}

	@Test
	public void test12() throws Exception {
		assertEquals("4", scenario3.ChangeBase.changeBase(4, 5));
	}

	@Test
	public void test13() throws Exception {
		assertEquals("5", scenario3.ChangeBase.changeBase(5, 6));
	}

	@Test
	public void test14() throws Exception {
		assertEquals("6", scenario3.ChangeBase.changeBase(6, 7));
	}

	@Test
	public void test15() throws Exception {
		assertEquals("7", scenario3.ChangeBase.changeBase(7, 8));
	}

	
}