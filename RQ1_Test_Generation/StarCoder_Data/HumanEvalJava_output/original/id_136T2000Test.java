// LargestSmallestIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

    /**
    * Test case number: 1
    * Test case values: [2, 4, 1, 3, 5, 7]
    * Expected output (Post-state): [null, 1]
    */
    @Test
    void testLargestSmallestIntegers1() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(4);
        lst.add(1);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 2
    * Test case values: []
    * Expected output (Post-state): [null, null]
    */
    @Test
    void testLargestSmallestIntegers2() {
        List<Object> lst = new ArrayList<Object>();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 3
    * Test case values: [0]
    * Expected output (Post-state): [null, null]
    */
    @Test
    void testLargestSmallestIntegers3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 4
    * Test case values: [1, 3, 2, 4, 5, 6, -2]
    * Expected output (Post-state): [-2, 1]
    */
    @Test
    void testLargestSmallestIntegers4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(-2);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-2);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 5
    * Test case values: [4, 5, 3, 6, 2, 7, -7]
    * Expected output (Post-state): [-7, 2]
    */
    @Test
    void testLargestSmallestIntegers5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(4);
        lst.add(5);
        lst.add(3);
        lst.add(6);
        lst.add(2);
        lst.add(7);
        lst.add(-7);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-7);
        expected.add(2);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 6
    * Test case values: [7, 3, 8, 4, 9, 2, 5, -9]
    * Expected output (Post-state): [-9, 2]
    */
    @Test
    void testLargestSmallestIntegers6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(7);
        lst.add(3);
        lst.add(8);
        lst.add(4);
        lst.add(9);
        lst.add(2);
        lst.add(5);
        lst.add(-9);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-9);
        expected.add(2);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 7
    * Test case values: []
    * Expected output (Post-state): [null, null]
    */
    @Test
    void testLargestSmallestIntegers7() {
        List<Object> lst = new ArrayList<Object>();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 8
    * Test case values: [0]
    * Expected output (Post-state): [null, null]
    */
    @Test
    void testLargestSmallestIntegers8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 9
    * Test case values: [-1, -3, -5, -6]
    * Expected output (Post-state): [-1, null]
    */
    @Test
    void testLargestSmallestIntegers9() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-3);
        lst.add(-5);
        lst.add(-6);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-1);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 10
    * Test case values: [-1, -3, -5, -6, 0]
    * Expected output (Post-state): [-1, null]
    */
    @Test
    void testLargestSmallestIntegers10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-3);
        lst.add(-5);
        lst.add(-6);
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-1);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 11
    * Test case values: [-6, -4, -4, -3, 1]
    * Expected output (Post-state): [-3, 1]
    */
    @Test
    void testLargestSmallestIntegers11() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-6);
        lst.add(-4);
        lst.add(-4);
        lst.add(-3);
        lst.add(1);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-3);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    /**
    * Test case number: 12
    * Test case values: [-6, -4, -4, -3, -100, 1]
    * Expected output (Post-state): [-3, 1]
    */
    @Test
    void testLargestSmallestIntegers12() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-6);
        lst.add(-4);
        lst.add(-4);
        lst.add(-3);
        lst.add(-100);
        lst.add(1);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-3);
        expected.add(1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }
}
