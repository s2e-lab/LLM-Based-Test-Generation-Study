package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class IsPalindromeTest {
    @Test
    void testIsPalindrome() {
        assertEquals(true, IsPalindrome.isPalindrome(""));
        assertEquals(true, IsPalindrome.isPalindrome("aba"));
        assertEquals(true, IsPalindrome.isPalindrome("aaaaa"));
        assertEquals(false, IsPalindrome.isPalindrome("zbcd"));
        assertEquals(true, IsPalindrome.isPalindrome("xywyx"));
        assertEquals(false, IsPalindrome.isPalindrome("xywyz"));
        assertEquals(false, IsPalindrome.isPalindrome("xywzx"));
        assertEquals(true, IsPalindrome.isPalindrome("xywzy"));
        assertEquals(true, IsPalindrome.isPalindrome("xywzz"));
        assertEquals(false, IsPalindrome.isPalindrome("xywzzz"));
    }
}