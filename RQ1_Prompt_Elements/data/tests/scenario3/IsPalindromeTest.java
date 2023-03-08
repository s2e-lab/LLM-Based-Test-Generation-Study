package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsPalindromeTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.IsPalindrome.isPalindrome(""));
        assertEquals(true, scenario3.IsPalindrome.isPalindrome("aba"));
        assertEquals(true, scenario3.IsPalindrome.isPalindrome("aaaaa"));
        assertEquals(false, scenario3.IsPalindrome.isPalindrome("zbcd"));
        assertEquals(true, scenario3.IsPalindrome.isPalindrome("xywyx"));
        assertEquals(false, scenario3.IsPalindrome.isPalindrome("xywyz"));
        assertEquals(false, scenario3.IsPalindrome.isPalindrome("xywzx"));

    }

}