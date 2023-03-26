// LargestSmallestIntegersTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

    @Test
    void testLargestSmallestIntegers1() {
        List<Object> lst = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 7));
        List<Integer> expected = new ArrayList<>(Arrays.asList(null, 1));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers2() {
        List<Object> lst = new ArrayList<>();
        List<Integer> expected = new ArrayList<>(Arrays.asList(null, null));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers3() {
        List<Object> lst = new ArrayList<>(Arrays.asList(0));
        List<Integer> expected = new ArrayList<>(Arrays.asList(null, null));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers4() {
        List<Object> lst = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 5, 7, 0));
        List<Integer> expected = new ArrayList<>(Arrays.asList(null, 1));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers5() {
        List<Object> lst = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5, 6, -2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-2, 1));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers6() {
        List<Object> lst = new ArrayList<>(Arrays.asList(4, 5, 3, 6, 2, 7, -7));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-7, 2));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers7() {
        List<Object> lst = new ArrayList<>(Arrays.asList(7, 3, 8, 4, 9, 2, 5, -9));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-9, 2));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers8() {
        List<Object> lst = new ArrayList<>(Arrays.asList(-1, -3, -5, -6));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, null));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers9() {
        List<Object> lst = new ArrayList<>(Arrays.asList(-1, -3, -5, -6, 0));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, null));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers10() {
        List<Object> lst = new ArrayList<>(Arrays.asList(-6, -4, -4, -3, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-3, 1));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testLargestSmallestIntegers11() {
        List<Object> lst = new ArrayList<>(Arrays.asList(-6, -4, -4, -3, -100, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-3, 1));
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }
}