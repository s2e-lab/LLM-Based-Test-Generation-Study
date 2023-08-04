// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list is empty.
    */
    @Test
    void testMonotonicEmpty() {
        List<Integer> l = List.of();
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains one element.
    */
    @Test
    void testMonotonicOneElement() {
        List<Integer> l = List.of(1);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains two elements.
    */
    @Test
    void testMonotonicTwoElements() {
        List<Integer> l = List.of(1, 2);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains three elements.
    */
    @Test
    void testMonotonicThreeElements() {
        List<Integer> l = List.of(1, 2, 3);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains four elements.
    */
    @Test
    void testMonotonicFourElements() {
        List<Integer> l = List.of(1, 2, 3, 4);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains five elements.
    */
    @Test
    void testMonotonicFiveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains six elements.
    */
    @Test
    void testMonotonicSixElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains seven elements.
    */
    @Test
    void testMonotonicSevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains eight elements.
    */
    @Test
    void testMonotonicEightElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains nine elements.
    */
    @Test
    void testMonotonicNineElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains ten elements.
    */
    @Test
    void testMonotonicTenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains eleven elements.
    */
    @Test
    void testMonotonicElevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains twelve elements.
    */
    @Test
    void testMonotonicTwelveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains thirteen elements.
    */
    @Test
    void testMonotonicThirteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains fourteen elements.
    */
    @Test
    void testMonotonicFourteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains fifteen elements.
    */
    @Test
    void testMonotonicFifteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains sixteen elements.
    */
    @Test
    void testMonotonicSixteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains seventeen elements.
    */
    @Test
    void testMonotonicSeventeenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains eighteen elements.
    */
    @Test
    void testMonotonicEighteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains nineteen elements.
    */
    @Test
    void testMonotonicNineteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertFalse(Monotonic.monotonic(l));
    }

    /**
    * Test case for {@link Monotonic#monotonic(List)} where the list contains twenty elements.
    */
    @Test
    void testMonotonicTwentyElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertFalse