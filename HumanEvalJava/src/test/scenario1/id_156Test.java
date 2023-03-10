package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntToMiniRomanTest {
    @Test
	public void test1() throws Exception {
		assertEquals("xix", scenario1.IntToMiniRoman.intToMiniRoman(19));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("clii", scenario1.IntToMiniRoman.intToMiniRoman(152));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("ccli", scenario1.IntToMiniRoman.intToMiniRoman(251));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("cdxxvi", scenario1.IntToMiniRoman.intToMiniRoman(426));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("d", scenario1.IntToMiniRoman.intToMiniRoman(500));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("i", scenario1.IntToMiniRoman.intToMiniRoman(1));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("iv", scenario1.IntToMiniRoman.intToMiniRoman(4));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("xliii", scenario1.IntToMiniRoman.intToMiniRoman(43));
	}

	@Test
	public void test9() throws Exception {
		assertEquals("xc", scenario1.IntToMiniRoman.intToMiniRoman(90));
	}

	@Test
	public void test10() throws Exception {
		assertEquals("xciv", scenario1.IntToMiniRoman.intToMiniRoman(94));
	}

	@Test
	public void test11() throws Exception {
		assertEquals("dxxxii", scenario1.IntToMiniRoman.intToMiniRoman(532));
	}

	@Test
	public void test12() throws Exception {
		assertEquals("cm", scenario1.IntToMiniRoman.intToMiniRoman(900));
	}

	@Test
	public void test13() throws Exception {
		assertEquals("cmxciv", scenario1.IntToMiniRoman.intToMiniRoman(994));
	}

	@Test
	public void test14() throws Exception {
		assertEquals("m", scenario1.IntToMiniRoman.intToMiniRoman(1000));
	}

	
}