// BelowThresholdTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link BelowThreshold}.
 * It contains ten test cases for the {@link scenario1.BelowThreshold#belowThreshold()} method.
 */
class BelowThresholdTest {
		


    @Test
    void testBelowThreshold() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, 4));
    }

    @Test
    void testBelowThreshold2() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(false, BelowThreshold.belowThreshold(l, 2));
    }

    @Test
    void testBelowThreshold3() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, 1));
    }

    @Test
    void testBelowThreshold4() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(false, BelowThreshold.belowThreshold(l, 0));
    }

    @Test
    void testBelowThreshold5() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -1));
    }

    @Test
    void testBelowThreshold6() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -2));
    }

    @Test
    void testBelowThreshold7() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -3));
    }

    @Test
    void testBelowThreshold8() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -4));
    }

    @Test
    void testBelowThreshold9() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -5));
    }

    @Test
    void testBelowThreshold10() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(true, BelowThreshold.belowThreshold(l, -6));
    }
}