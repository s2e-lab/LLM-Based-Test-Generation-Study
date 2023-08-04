// NextSmallestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest2() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest3() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(4, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest4() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(5, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest5() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(6, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest6() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(7, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest7() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(8, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest8() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(9, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest9() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(10, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest10() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(11, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest11() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(12, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest12() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
        assertEquals(13, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest13() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        assertEquals(14, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest14() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
        assertEquals(15, NextSmallest.nextSmallest(lst));
    }

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testNextSmallest15() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,