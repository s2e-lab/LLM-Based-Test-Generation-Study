package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakePalindromeTest {

    @Test
    public void test() throws Exception{

        assertEquals("", scenario3.MakePalindrome.makePalindrome(""));
		assertEquals("catac", scenario3.MakePalindrome.makePalindrome("cat"));
		assertEquals("catac", scenario3.MakePalindrome.makePalindrome("cata"));
		assertEquals("", scenario3.MakePalindrome.makePalindrome(""));
		assertEquals("x", scenario3.MakePalindrome.makePalindrome("x"));
		assertEquals("xyzyx", scenario3.MakePalindrome.makePalindrome("xyz"));
		assertEquals("xyx", scenario3.MakePalindrome.makePalindrome("xyx"));
		assertEquals("jerryrrej", scenario3.MakePalindrome.makePalindrome("jerry"));
		
    }

}