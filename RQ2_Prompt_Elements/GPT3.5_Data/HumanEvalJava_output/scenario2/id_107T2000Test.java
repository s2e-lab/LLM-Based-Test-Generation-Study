// EvenOddPalindromeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {

    @Test
    void testEvenOddPalindromeWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }

    @Test
    void testEvenOddPalindromeWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(2));
    }

    @Test
    void testEvenOddPalindromeWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
    }

    @Test
    void testEvenOddPalindromeWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(4));
    }

    @Test
    void testEvenOddPalindromeWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(5));
    }

    @Test
    void testEvenOddPalindromeWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(3);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(6));
    }

    @Test
    void testEvenOddPalindromeWithSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(4);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(7));
    }

    @Test
    void testEvenOddPalindromeWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(4);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(8));
    }

    @Test
    void testEvenOddPalindromeWithNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
    }

    @Test
    void testEvenOddPalindromeWithTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(5);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
    }
}