package scenario3;


import original.SameChars;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(false, scenario3.SameChars.sameChars("abcd", "dddddddabce"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario3.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, scenario3.SameChars.sameChars("abcd", "dddddddabc"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, scenario3.SameChars.sameChars("dddddddabc", "abcd"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, scenario3.SameChars.sameChars("eabcd", "dddddddabc"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario3.SameChars.sameChars("abcd", "dddddddabcf"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(false, scenario3.SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(false, scenario3.SameChars.sameChars("aabb", "aaccc"));
	}

	
}