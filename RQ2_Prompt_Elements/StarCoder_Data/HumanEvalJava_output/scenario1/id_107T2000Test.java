// EvenOddPalindromeTest.java
package scenario1;

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
    void testEvenOddPalindrome1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
    }

    @Test
    void testEvenOddPalindrome2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(11));
    }

    @Test
    void testEvenOddPalindrome3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(12));
    }

    @Test
    void testEvenOddPalindrome4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(13));
    }

    @Test
    void testEvenOddPalindrome5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(14));
    }

    @Test
    void testEvenOddPalindrome6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(15));
    }

    @Test
    void testEvenOddPalindrome7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(16));
    }

    @Test
    void testEvenOddPalindrome8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(17));
    }

    @Test
    void testEvenOddPalindrome9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(18));
    }

    @Test
    void testEvenOddPalindrome10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(19));
    }
}
