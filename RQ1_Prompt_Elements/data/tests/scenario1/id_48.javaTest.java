package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario1.IsPalindrome.isPalindrome(""));
		assertEquals(true, scenario1.IsPalindrome.isPalindrome("aba"));
		assertEquals(true, scenario1.IsPalindrome.isPalindrome("aaaaa"));
		assertEquals(false, scenario1.IsPalindrome.isPalindrome("zbcd"));
		assertEquals(true, scenario1.IsPalindrome.isPalindrome("xywyx"));
		assertEquals(false, scenario1.IsPalindrome.isPalindrome("xywyz"));
		assertEquals(false, scenario1.IsPalindrome.isPalindrome("xywzx"));
		
    }

}