// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

    @Test
    void testTriplesSumToZero() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(TriplesSumToZero.triplesSumToZero(l1));

        List<Integer> l2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertFalse(TriplesSumToZero.triplesSumToZero(l2));

        List<Integer> l3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertFalse(TriplesSumToZero.triplesSumToZero(l3));

        List<Integer> l4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertFalse(TriplesSumToZero.triplesSumToZero(l4));

        List<Integer> l5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertFalse(TriplesSumToZero.triplesSumToZero(l5));

        List<Integer> l6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertFalse(TriplesSumToZero.triplesSumToZero(l6));

        List<Integer> l7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertFalse(TriplesSumToZero.triplesSumToZero(l7));

        List<Integer> l8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertFalse(TriplesSumToZero.triplesSumToZero(l8));

        List<Integer> l9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertFalse(TriplesSumToZero.triplesSumToZero(l9));

        List<Integer> l10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertFalse(TriplesSumToZero.triplesSumToZero(l10));
    }
}
