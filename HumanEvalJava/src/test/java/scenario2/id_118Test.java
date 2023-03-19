package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetClosestVowelTest {
    @Test
	public void test1() throws Exception {
		assertEquals("u", scenario2.GetClosestVowel.getClosestVowel("yogurt"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("u", scenario2.GetClosestVowel.getClosestVowel("full"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("easy"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("eAsy"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ali"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("a", scenario2.GetClosestVowel.getClosestVowel("bad"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("o", scenario2.GetClosestVowel.getClosestVowel("most"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ab"));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("ba"));
	}

	@Test
	public void test10() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("quick"));
	}

	@Test
	public void test11() throws Exception {
		assertEquals("i", scenario2.GetClosestVowel.getClosestVowel("anime"));
	}

	@Test
	public void test12() throws Exception {
		assertEquals("", scenario2.GetClosestVowel.getClosestVowel("Asia"));
	}

	@Test
	public void test13() throws Exception {
		assertEquals("o", scenario2.GetClosestVowel.getClosestVowel("Above"));
	}

	
}