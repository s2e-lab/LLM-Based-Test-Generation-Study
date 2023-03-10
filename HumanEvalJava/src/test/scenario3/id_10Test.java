package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakePalindromeTest {
    @Test
	public void test1() throws Exception {
		assertEquals("", scenario3.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("catac", scenario3.MakePalindrome.makePalindrome("cat"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("catac", scenario3.MakePalindrome.makePalindrome("cata"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("", scenario3.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("x", scenario3.MakePalindrome.makePalindrome("x"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("xyzyx", scenario3.MakePalindrome.makePalindrome("xyz"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("xyx", scenario3.MakePalindrome.makePalindrome("xyx"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("jerryrrej", scenario3.MakePalindrome.makePalindrome("jerry"));
	}

	
}