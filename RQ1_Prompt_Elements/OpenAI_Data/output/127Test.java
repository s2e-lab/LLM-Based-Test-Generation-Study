// IntersectionTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Intersection}.
 * It contains ten test cases for the {@link scenario1.Intersection#intersection()} method.
 */
class IntersectionTest {
		


    @Test
    void testIntersection() {
        List<Integer> interval1 = new ArrayList<>();
        List<Integer> interval2 = new ArrayList<>();
        interval1.add(1);
        interval1.add(5);
        interval2.add(2);
        interval2.add(3);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(6);
        interval2.add(10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(5);
        interval2.add(10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(1);
        interval2.add(5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(1);
        interval2.add(6);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(0);
        interval2.add(5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(0);
        interval2.add(4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(0);
        interval2.add(3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(2);
        interval2.add(4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
        interval1.clear();
        interval2.clear();
        interval1.add(1);
        interval1.add(5);
        interval2.add(2);
        interval2.add(5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
}