// UniqueTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique1() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique2() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique3() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique4() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique5() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique6() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique7() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique8() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique9() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }

    /**
     * Test case for unique([5, 3, 5, 2, 3, 3, 9, 0, 123])
     */
    @Test
    void testUnique10() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        assertEquals(expected, Unique.unique(l));
    }
}
