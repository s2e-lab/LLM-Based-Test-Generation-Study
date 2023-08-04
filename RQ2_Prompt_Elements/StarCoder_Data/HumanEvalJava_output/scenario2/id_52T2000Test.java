// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list is empty.
    */
    @Test
    void testBelowThresholdEmptyList() {
        List<Integer> l = List.of();
        int t = 10;
        assertEquals(true, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains one element.
    */
    @Test
    void testBelowThresholdOneElement() {
        List<Integer> l = List.of(1);
        int t = 10;
        assertEquals(true, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains two elements.
    */
    @Test
    void testBelowThresholdTwoElements() {
        List<Integer> l = List.of(1, 2);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains three elements.
    */
    @Test
    void testBelowThresholdThreeElements() {
        List<Integer> l = List.of(1, 2, 3);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains four elements.
    */
    @Test
    void testBelowThresholdFourElements() {
        List<Integer> l = List.of(1, 2, 3, 4);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains five elements.
    */
    @Test
    void testBelowThresholdFiveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains six elements.
    */
    @Test
    void testBelowThresholdSixElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains seven elements.
    */
    @Test
    void testBelowThresholdSevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains eight elements.
    */
    @Test
    void testBelowThresholdEightElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains nine elements.
    */
    @Test
    void testBelowThresholdNineElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int t = 10;
        assertEquals(false, BelowThreshold.belowThreshold(l, t));
    }

    /**
    * Test case for {@link BelowThreshold#belowThreshold(List, int)} where the list contains ten elements.
    */
    @Test
    void testBelowThresholdTenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int t = 10;
        assertEquals(true, BelowThreshold.belowThreshold(l, t));
    }
}
