package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {
    @Test
	public void test1() throws Exception {
		assertEquals("bcdf", scenario3.RemoveVowels.removeVowels("abcdef"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("", scenario3.RemoveVowels.removeVowels("aaaaa"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("B", scenario3.RemoveVowels.removeVowels("aaBAA"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("zbcd", scenario3.RemoveVowels.removeVowels("zbcd"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("", scenario3.RemoveVowels.removeVowels(""));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("bcdf\nghjklm", scenario3.RemoveVowels.removeVowels("abcdef\nghijklm"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("fdcb", scenario3.RemoveVowels.removeVowels("fedcba"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("", scenario3.RemoveVowels.removeVowels("eeeee"));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("cB", scenario3.RemoveVowels.removeVowels("acBAA"));
	}

	@Test
	public void test10() throws Exception {
		assertEquals("cB", scenario3.RemoveVowels.removeVowels("EcBOO"));
	}

	@Test
	public void test11() throws Exception {
		assertEquals("ybcd", scenario3.RemoveVowels.removeVowels("ybcd"));
	}

	
}