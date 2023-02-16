package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class EvenOddPalindromeTest {
    @Test
    void testEvenOddPalindrome() {
        assertEquals(EvenOddPalindrome.evenOddPalindrome(123), Arrays.asList(8, 13));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(12), Arrays.asList(4, 6));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(3), Arrays.asList(1, 2));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(63), Arrays.asList(6, 8));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(25), Arrays.asList(5, 6));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(19), Arrays.asList(4, 6));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(9), Arrays.asList(4, 5));
        assertEquals(EvenOddPalindrome.evenOddPalindrome(1), Arrays.asList(0, 1));
    }
}