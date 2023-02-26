package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.IsPalindrome.isPalindrome(""));
		assertEquals(true, scenario2.IsPalindrome.isPalindrome("aba"));
		assertEquals(true, scenario2.IsPalindrome.isPalindrome("aaaaa"));
		assertEquals(false, scenario2.IsPalindrome.isPalindrome("zbcd"));
		assertEquals(true, scenario2.IsPalindrome.isPalindrome("xywyx"));
		assertEquals(false, scenario2.IsPalindrome.isPalindrome("xywyz"));
		assertEquals(false, scenario2.IsPalindrome.isPalindrome("xywzx"));
		
    }

}