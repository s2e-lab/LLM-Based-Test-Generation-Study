// TriplesSumToZero.java
package scenario3;

import java.util.List;

class TriplesSumToZero {

    /**
     * triplesSumToZero takes a list of integers as an input.
     * it returns True if there are three distinct elements in the list that
     * sum to zero, and False otherwise.
     *
     * > triplesSumToZero([1, 3, 5, 0])
     * false
     * > triplesSumToZero([1, 3, 5, -1])
     * false
     * > triplesSumToZero([1, 3, -2, 1])
     * true
     * > triplesSumToZero([1, 2, 3, 7])
     * false
     * > triplesSumToZero([1, 2, 5, 7])
     * false
     * > triplesSumToZero([2, 4, -5, 3, 9, 7])
     * true
     * > triplesSumToZero([1])
     * false
     * > triplesSumToZero([1, 3, 5, -100])
     * false
     * > triplesSumToZero([100, 3, 5, -100])
     * false
     */
    public static Boolean triplesSumToZero(List<Integer> l) {
        int n = l.size();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l.get(i) + l.get(j) + l.get(k) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// TriplesSumToZeroTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero() {
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testAllElementsAreZero() {
        List<Integer> l = Arrays.asList(0, 0, 0);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testOnePositiveAndTwoNegativeElements() {
        List<Integer> l = Arrays.asList(1, -2, -1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testOneNegativeAndTwoPositiveElements() {
        List<Integer> l = Arrays.asList(-1, 2, -1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testTwoPositiveAndOneNegativeElements() {
        List<Integer> l = Arrays.asList(1, 2, -3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testTwoNegativeAndOnePositiveElements() {
        List<Integer> l = Arrays.asList(-1, -2, 3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testThreePositiveElements() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testThreeNegativeElements() {
        List<Integer> l = Arrays.asList(-1, -2, -3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
}