// BelowThresholdTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
    
    @Test
    void testAllNumbersBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        int t = 100;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testAllNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testAllNumbersEqualToThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        int t = 20;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testAllNumbersEqualToZero() {
        List<Integer> l = Arrays.asList(0, 0, 0, 0);
        int t = 1;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testAllNumbersNegative() {
        List<Integer> l = Arrays.asList(-1, -2, -4, -10);
        int t = -100;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testAllNumbersPositive() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        int t = 5;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testListWithOneElementBelowThreshold() {
        List<Integer> l = Arrays.asList(1);
        int t = 5;
        assertTrue(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testListWithOneElementAboveThreshold() {
        List<Integer> l = Arrays.asList(10);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
    
    @Test
    void testListWithOneElementEqualToThreshold() {
        List<Integer> l = Arrays.asList(5);
        int t = 5;
        assertFalse(BelowThreshold.belowThreshold(l, t));
    }
}