// BelowThresholdTest.java
package scenario1;

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
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 3;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold2() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 4;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold3() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold4() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 6;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold5() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 7;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold6() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 8;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold7() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 9;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold8() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 10;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold9() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 11;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }

    @Test
    void testBelowThreshold10() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 12;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
}
