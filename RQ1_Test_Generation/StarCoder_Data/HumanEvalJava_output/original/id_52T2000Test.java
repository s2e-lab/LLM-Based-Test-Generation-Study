// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

    @Test
    void testBelowThreshold() {
        List<Integer> l1 = List.of(1, 2, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l1, 100));
        List<Integer> l2 = List.of(1, 20, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l2, 5));
        List<Integer> l3 = List.of(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l3, 21));
        List<Integer> l4 = List.of(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l4, 22));
        List<Integer> l5 = List.of(1, 8, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l5, 11));
        List<Integer> l6 = List.of(1, 8, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l6, 10));
    }
}
