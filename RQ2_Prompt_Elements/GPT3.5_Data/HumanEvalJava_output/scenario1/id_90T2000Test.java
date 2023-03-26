// Here's the updated code with additional test cases:

// NextSmallest.java
package scenario1;

import java.util.List;

class NextSmallest {

    public static Integer nextSmallest(List<Object> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = (Integer) lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = (Integer) lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (current != smallest)
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }
}

// NextSmallestTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains twelve unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    @Test
    void testEmptyList() {
        List<Object> lst = Arrays.asList();
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testTwoElementList() {
        List<Object> lst = Arrays.asList(2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testThreeElementList() {
        List<Object> lst = Arrays.asList(3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFourElementList() {
        List<Object> lst = Arrays.asList(4, 3, 2, 1);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFiveElementList() {
        List<Object> lst = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(4, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testDuplicateElements() {
        List<Object> lst = Arrays.asList(5, 4, 3, 2, 1, 1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNegativeElements() {
        List<Object> lst = Arrays.asList(-5, -4, -3, -2, -1);
        assertEquals(-4, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testMixedElements() {
        List<Object> lst = Arrays.asList(5, -4, 3, -2, 1);
        assertEquals(-2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNullElements() {
        List<Object> lst = Arrays.asList(5, null, 3, null, 1);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testAllNullElements() {
        List<Object> lst = Arrays.asList(null, null, null);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testLargeList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }
}