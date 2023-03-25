package scenario1;

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
		assertEquals(Arrays.asList("little"), scenario1.SelectWords.selectWords("Mary had a little lamb", 4));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("Mary", "lamb"), scenario1.SelectWords.selectWords("Mary had a little lamb", 3));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(), scenario1.SelectWords.selectWords("simple white space", 2));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("world"), scenario1.SelectWords.selectWords("Hello world", 4));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("Uncle"), scenario1.SelectWords.selectWords("Uncle sam", 3));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(), scenario1.SelectWords.selectWords("", 4));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList("b", "c", "d", "f"), scenario1.SelectWords.selectWords("a b c d e f", 1));
	}

	
}