package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolveTest {
    @Test
	public void test1() throws Exception {
		assertEquals("aSdF", scenario1.Solve.solve("AsDf"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("4321", scenario1.Solve.solve("1234"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("AB", scenario1.Solve.solve("ab"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("#A@c", scenario1.Solve.solve("#a@C"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("#aSDFw^45", scenario1.Solve.solve("#AsdfW^45"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("2@6#", scenario1.Solve.solve("#6@2"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("#$A^d", scenario1.Solve.solve("#$a^D"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("#CCC", scenario1.Solve.solve("#ccc"));
	}

	
}