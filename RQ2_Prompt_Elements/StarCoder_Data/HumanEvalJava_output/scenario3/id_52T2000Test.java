// BelowThresholdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)}.
    */
    @Test
    void testBelowThreshold() {
        List<Integer> l1 = List.of(1, 2, 4, 10);
        int t1 = 100;
        assertTrue(BelowThreshold.belowThreshold(l1, t1));

        List<Integer> l2 = List.of(1, 20, 4, 10);
        int t2 = 5;
        assertFalse(BelowThreshold.belowThreshold(l2, t2));

        List<Integer> l3 = List.of(1, 20, 4, 10);
        int t3 = 21;
        assertTrue(BelowThreshold.belowThreshold(l3, t3));

        List<Integer> l4 = List.of(1, 20, 4, 10);
        int t4 = 22;
        assertTrue(BelowThreshold.belowThreshold(l4, t4));

        List<Integer> l5 = List.of(1, 8, 4, 10);
        int t5 = 11;
        assertTrue(BelowThreshold.belowThreshold(l5, t5));

        List<Integer> l6 = List.of(1, 8, 4, 10);
        int t6 = 10;
        assertFalse(BelowThreshold.belowThreshold(l6, t6));
    }
}
