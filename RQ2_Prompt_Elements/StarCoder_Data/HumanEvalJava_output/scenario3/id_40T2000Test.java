// TriplesSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

    /**
     * Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
     * It checks if the method returns True if there are three distinct elements in the list that
     * sum to zero, and False otherwise.
     */
    @Test
    void testTriplesSumToZero() {
        List<Integer> l1 = List.of(1, 3, 5, 0);
        List<Integer> l2 = List.of(1, 3, 5, -1);
        List<Integer> l3 = List.of(1, 3, -2, 1);
        List<Integer> l4 = List.of(1, 2, 3, 7);
        List<Integer> l5 = List.of(1, 2, 5, 7);
        List<Integer> l6 = List.of(2, 4, -5, 3, 9, 7);
        List<Integer> l7 = List.of(1);
        List<Integer> l8 = List.of(1, 3, 5, -100);
        List<Integer> l9 = List.of(100, 3, 5, -100);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l1));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l2));
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l3));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l4));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l5));
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l6));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l7));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l8));
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l9));
    }
}
