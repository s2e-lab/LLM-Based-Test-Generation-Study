// EvenOddPalindromeTest.java
package original;

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
    * Test case number: 1
    * Test case values: 3
    * Expected output (Post-state): [1, 2]
    */
    @Test
    void test1() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(3));
    }

    /**
    * Test case number: 2
    * Test case values: 12
    * Expected output (Post-state): [4, 6]
    */
    @Test
    void test2() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(12));
    }

    /**
    * Test case number: 3
    * Test case values: 3
    * Expected output (Post-state): [1, 2]
    */
    @Test
    void test3() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(3));
    }

    /**
    * Test case number: 4
    * Test case values: 63
    * Expected output (Post-state): [6, 8]
    */
    @Test
    void test4() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(63));
    }

    /**
    * Test case number: 5
    * Test case values: 25
    * Expected output (Post-state): [5, 6]
    */
    @Test
    void test5() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(6);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(25));
    }

    /**
    * Test case number: 6
    * Test case values: 19
    * Expected output (Post-state): [4, 6]
    */
    @Test
    void test6() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(19));
    }

    /**
    * Test case number: 7
    * Test case values: 9
    * Expected output (Post-state): [4, 5]
    */
    @Test
    void test7() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(9));
    }

    /**
    * Test case number: 8
    * Test case values: 1
    * Expected output (Post-state): [0, 1]
    */
    @Test
    void test8() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(1));
    }

    /**
    * Test case number: 9
    * Test case values: 123
    * Expected output (Post-state): [8, 13]
    */
    @Test
    void test9() {
        EvenOddPalindrome evenOddPalindrome = new EvenOddPalindrome();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(13);
        assertEquals(expected, evenOddPalindrome.evenOddPalindrome(123));
    }
}
