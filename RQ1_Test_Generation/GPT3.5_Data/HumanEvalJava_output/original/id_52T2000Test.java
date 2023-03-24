// BelowThresholdTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BelowThresholdTest {

    /**
     * Test case for empty list.
     */
    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertTrue(BelowThreshold.belowThreshold(l, 10));
    }

    /**
     * Test case for all numbers below threshold.
     */
    @Test
    void testAllNumbersBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 100));
    }

    /**
     * Test case for all numbers above threshold.
     */
    @Test
    void testAllNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l, 5));
    }

    /**
     * Test case for some numbers above threshold.
     */
    @Test
    void testSomeNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 21));
    }

    /**
     * Test case for all numbers just above threshold.
     */
    @Test
    void testAllNumbersJustAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 22));
    }

    /**
     * Test case for all numbers just below threshold.
     */
    @Test
    void testAllNumbersJustBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 11));
    }

    /**
     * Test case for all numbers equal to threshold.
     */
    @Test
    void testAllNumbersEqualToThreshold() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l, 10));
    }

    /**
     * Test case for list with one element.
     */
    @Test
    void testListWithOneElement() {
        List<Integer> l = Arrays.asList(5);
        assertTrue(BelowThreshold.belowThreshold(l, 10));
    }

    /**
     * Test case for list with negative numbers.
     */
    @Test
    void testListWithNegativeNumbers() {
        List<Integer> l = Arrays.asList(-1, -2, -4, -10);
        assertTrue(BelowThreshold.belowThreshold(l, -100));
    }

    /**
     * Test case for list with mixed positive and negative numbers.
     */
    @Test
    void testListWithMixedNumbers() {
        List<Integer> l = Arrays.asList(-1, 2, -4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 100));
    }
}