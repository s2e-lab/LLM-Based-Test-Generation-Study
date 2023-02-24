// EvenOddPalindromeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link EvenOddPalindrome}.
 * It contains ten test cases for the {@link scenario1.EvenOddPalindrome#evenOddPalindrome()} method.
 */
class EvenOddPalindromeTest {
		


    @Test
    void testEvenOddPalindrome() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(5));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(6));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(7));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(8));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(9));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(10));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(11));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(12));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(13));
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2)), EvenOddPalindrome.evenOddPalindrome(14));
    }
}