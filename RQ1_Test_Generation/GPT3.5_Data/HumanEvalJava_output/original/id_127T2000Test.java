// IntersectionTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
    
    @Test
    void testIntersectionNoOverlap() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(3, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionSameInterval() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(1, 2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionNegativeIntervals() {
        List<Integer> interval1 = Arrays.asList(-2, 2);
        List<Integer> interval2 = Arrays.asList(-4, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionNegativeAndPositiveIntervals() {
        List<Integer> interval1 = Arrays.asList(-11, 2);
        List<Integer> interval2 = Arrays.asList(-1, -1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionOverlap() {
        List<Integer> interval1 = Arrays.asList(-3, -1);
        List<Integer> interval2 = Arrays.asList(-5, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionNoOverlap2() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(2, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionNoOverlap3() {
        List<Integer> interval1 = Arrays.asList(-2, -2);
        List<Integer> interval2 = Arrays.asList(-3, -2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionNoOverlap4() {
        List<Integer> interval1 = Arrays.asList(-1, 1);
        List<Integer> interval2 = Arrays.asList(0, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionPrime() {
        List<Integer> interval1 = Arrays.asList(-3, 3);
        List<Integer> interval2 = Arrays.asList(0, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
    
    @Test
    void testIntersectionPrime2() {
        List<Integer> interval1 = Arrays.asList(1, 3);
        List<Integer> interval2 = Arrays.asList(2, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}