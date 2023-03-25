package scenario3;

import java.util.ArrayList;
import java.util.List;
import original.SelectWords;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectWordsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("little"), scenario3.SelectWords.selectWords("Mary had a little lamb", 4));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("Mary", "lamb"), scenario3.SelectWords.selectWords("Mary had a little lamb", 3));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(), scenario3.SelectWords.selectWords("simple white space", 2));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("world"), scenario3.SelectWords.selectWords("Hello world", 4));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("Uncle"), scenario3.SelectWords.selectWords("Uncle sam", 3));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(), scenario3.SelectWords.selectWords("", 4));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList("b", "c", "d", "f"), scenario3.SelectWords.selectWords("a b c d e f", 1));
	}

	
}