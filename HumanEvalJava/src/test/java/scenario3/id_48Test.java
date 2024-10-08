package scenario3;


import original.IsPalindrome;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {
    @Test
	public void test1() throws Exception {
		assertEquals(true, scenario3.IsPalindrome.isPalindrome(""));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario3.IsPalindrome.isPalindrome("aba"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, scenario3.IsPalindrome.isPalindrome("aaaaa"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(false, scenario3.IsPalindrome.isPalindrome("zbcd"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(true, scenario3.IsPalindrome.isPalindrome("xywyx"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario3.IsPalindrome.isPalindrome("xywyz"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(false, scenario3.IsPalindrome.isPalindrome("xywzx"));
	}

	
}