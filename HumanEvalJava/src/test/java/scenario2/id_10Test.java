package scenario2;


import original.MakePalindrome;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakePalindromeTest {
    @Test
	public void test1() throws Exception {
		assertEquals("", scenario2.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("catac", scenario2.MakePalindrome.makePalindrome("cat"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("catac", scenario2.MakePalindrome.makePalindrome("cata"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("", scenario2.MakePalindrome.makePalindrome(""));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("x", scenario2.MakePalindrome.makePalindrome("x"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("xyzyx", scenario2.MakePalindrome.makePalindrome("xyz"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("xyx", scenario2.MakePalindrome.makePalindrome("xyx"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("jerryrrej", scenario2.MakePalindrome.makePalindrome("jerry"));
	}

	
}