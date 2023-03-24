// Unique.java
package revised;

import java.util.*;

class Unique {

    /**
     * Return sorted unique elements in a list
     *
     * > unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [0, 2, 3, 5, 9, 123]
     * > unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [0, 2, 3, 5, 9, 123]
     */
    public static List<Integer> unique(List<Integer> l) {
        if (l == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : l) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        return result;
    }
}

// UniqueTest.java
package revised;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

    @Test
    void testUniqueWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> Unique.unique(null));
    }

    @Test
    void testUniqueWithEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> result = Unique.unique(l);
        assertEquals(0, result.size());
    }

    @Test
    void testUniqueWithOneElementList() {
        List<Integer> l = Arrays.asList(1);
        List<Integer> result = Unique.unique(l);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    @Test
    void testUniqueWithRepeatedElements() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> result = Unique.unique(l);
        assertEquals(6, result.size());
        assertEquals(0, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(9, result.get(4));
        assertEquals(123, result.get(5));
    }

    @Test
    void testUniqueWithSortedElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Unique.unique(l);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    void testUniqueWithUnsortedElements() {
        List<Integer> l = Arrays.asList(5, 3, 2, 4, 1);
        List<Integer> result = Unique.unique(l);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    void testUniqueWithNegativeElements() {
        List<Integer> l = Arrays.asList(-5, -3, -2, -4, -1);
        List<Integer> result = Unique.unique(l);
        assertEquals(5, result.size());
        assertEquals(-5, result.get(0));
        assertEquals(-4, result.get(1));
        assertEquals(-3, result.get(2));
        assertEquals(-2, result.get(3));
        assertEquals(-1, result.get(4));
    }

    @Test
    void testUniqueWithMixedElements() {
        List<Integer> l = Arrays.asList(-5, 3, 0, -2, 3, 3, 9, 0, 123);
        List<Integer> result = Unique.unique(l);
        assertEquals(6, result.size());
        assertEquals(-5, result.get(0));
        assertEquals(-2, result.get(1));
        assertEquals(0, result.get(2));
        assertEquals(3, result.get(3));
        assertEquals(9, result.get(4));
        assertEquals(123, result.get(5));
    }

    @Test
    void testUniqueWithLargeList() {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            l.add(i % 100);
        }
        List<Integer> result = Unique.unique(l);
        assertEquals(100, result.size());
        for (int i = 0; i < 100; i++) {
            assertEquals(i, result.get(i));
        }
    }
}