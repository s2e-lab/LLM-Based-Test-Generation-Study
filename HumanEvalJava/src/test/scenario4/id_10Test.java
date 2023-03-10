package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakePalindromeTest {
    @Test
	public void test1() throws Exception {
		assertEquals("", scenario4.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("catac", scenario4.MakePalindrome.makePalindrome("cat"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("catac", scenario4.MakePalindrome.makePalindrome("cata"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("", scenario4.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("x", scenario4.MakePalindrome.makePalindrome("x"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("xyzyx", scenario4.MakePalindrome.makePalindrome("xyz"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("xyx", scenario4.MakePalindrome.makePalindrome("xyx"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("jerryrrej", scenario4.MakePalindrome.makePalindrome("jerry"));
	}

	
}