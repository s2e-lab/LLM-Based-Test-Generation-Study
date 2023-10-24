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

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [1, 1].
    */
    @Test
    void testEvenOddPalindrome1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [1, 2].
    */
    @Test
    void testEvenOddPalindrome2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(2));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [2, 1].
    */
    @Test
    void testEvenOddPalindrome3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [2, 2].
    */
    @Test
    void testEvenOddPalindrome4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(4));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [3, 1].
    */
    @Test
    void testEvenOddPalindrome5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(5));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [3, 2].
    */
    @Test
    void testEvenOddPalindrome6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(6));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [4, 1].
    */
    @Test
    void testEvenOddPalindrome7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(7));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [4, 2].
    */
    @Test
    void testEvenOddPalindrome8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(8));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [5, 1].
    */
    @Test
    void testEvenOddPalindrome9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
    }

    /**
    * Test case for {@link EvenOddPalindrome#evenOddPalindrome(int)}.
    * The expected result is [5, 2].
    */
    @Test
    void testEvenOddPalindrome10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
    }
}
