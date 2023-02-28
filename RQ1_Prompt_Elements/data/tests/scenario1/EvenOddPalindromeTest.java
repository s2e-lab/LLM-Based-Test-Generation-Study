package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddPalindromeTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(8, 13), scenario1.EvenOddPalindrome.evenOddPalindrome(123));
		assertEquals(Arrays.asList(4, 6), scenario1.EvenOddPalindrome.evenOddPalindrome(12));
		assertEquals(Arrays.asList(1, 2), scenario1.EvenOddPalindrome.evenOddPalindrome(3));
		assertEquals(Arrays.asList(6, 8), scenario1.EvenOddPalindrome.evenOddPalindrome(63));
		assertEquals(Arrays.asList(5, 6), scenario1.EvenOddPalindrome.evenOddPalindrome(25));
		assertEquals(Arrays.asList(4, 6), scenario1.EvenOddPalindrome.evenOddPalindrome(19));
		assertEquals(Arrays.asList(4, 5), scenario1.EvenOddPalindrome.evenOddPalindrome(9));
		assertEquals(Arrays.asList(0, 1), scenario1.EvenOddPalindrome.evenOddPalindrome(1));
		
    }

}