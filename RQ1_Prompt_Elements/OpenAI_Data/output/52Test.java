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
* It contains ten test cases for the {@link BelowThreshold#belowThreshold()} method.
*/
class BelowThresholdTest {


    @Test
    void testBelowThreshold() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        assertEquals(true, BelowThreshold.belowThreshold(l, 6));
        assertEquals(false, BelowThreshold.belowThreshold(l, 5));
        assertEquals(true, BelowThreshold.belowThreshold(l, 4));
        assertEquals(true, BelowThreshold.belowThreshold(l, 3));
        assertEquals(true, BelowThreshold.belowThreshold(l, 2));
        assertEquals(true, BelowThreshold.belowThreshold(l, 1));
        assertEquals(false, BelowThreshold.belowThreshold(l, 0));
        l.add(6);
        assertEquals(false, BelowThreshold.belowThreshold(l, 6));
        l.add(7);
        assertEquals(false, BelowThreshold.belowThreshold(l, 6));
        l.add(8);
        assertEquals(false, BelowThreshold.belowThreshold(l, 6));
    }
}