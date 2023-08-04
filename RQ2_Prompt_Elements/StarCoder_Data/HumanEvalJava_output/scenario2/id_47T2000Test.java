// MedianTest.java
package scenario2;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

    /**
     * Test case for the {@link Median#median(List)} method.
     */
    @Test
    void testMedian() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        assertEquals(3, Median.median(l1));

        List<Integer> l2 = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(3.5, Median.median(l2));

        List<Integer> l3 = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(4, Median.median(l3));

        List<Integer> l4 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(4.5, Median.median(l4));

        List<Integer> l5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(5, Median.median(l5));

        List<Integer> l6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(5.5, Median.median(l6));

        List<Integer> l7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(6, Median.median(l7));

        List<Integer> l8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(6.5, Median.median(l8));

        List<Integer> l9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(7, Median.median(l9));

        List<Integer> l10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(7.5, Median.median(l10));
    }
}
