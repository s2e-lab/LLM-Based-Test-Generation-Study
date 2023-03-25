package scenario2;

import java.util.Arrays;
import original.SplitWords;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SplitWordsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("Hello", "world!"), scenario2.SplitWords.splitWords("Hello world!"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("Hello", "world!"), scenario2.SplitWords.splitWords("Hello,world!"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList("Hello", "world,!"), scenario2.SplitWords.splitWords("Hello world,!"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("Hello,Hello,world", "!"), scenario2.SplitWords.splitWords("Hello,Hello,world !"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(3, scenario2.SplitWords.splitWords("abcdef"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(2, scenario2.SplitWords.splitWords("aaabb"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(1, scenario2.SplitWords.splitWords("aaaBb"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(0, scenario2.SplitWords.splitWords(""));
	}

	
}