package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketing1Test {
    @Test
	public void test1() throws Exception {
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("(()())"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()()(()())()"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("((()())))"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing(")(()"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("("));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("(((("));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing(")"));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("(()"));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("()()(()())())(()"));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("()()(()())()))()"));
	}

	
}