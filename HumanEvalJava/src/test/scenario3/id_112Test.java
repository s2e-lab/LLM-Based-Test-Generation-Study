package scenario3;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseDeleteTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("bcd", false), scenario3.ReverseDelete.reverseDelete("abcde", "ae"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("acdef", false), scenario3.ReverseDelete.reverseDelete("abcdef", "b"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList("cdedc", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", "ab"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("dik", false), scenario3.ReverseDelete.reverseDelete("dwik", "w"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("", true), scenario3.ReverseDelete.reverseDelete("a", "a"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList("abcdedcba", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", ""));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList("abcdedcba", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", "v"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(Arrays.asList("abba", true), scenario3.ReverseDelete.reverseDelete("vabba", "v"));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(Arrays.asList("", true), scenario3.ReverseDelete.reverseDelete("mamma", "mia"));
	}

	
}