// MonotonicTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

    /**
    * Test case for the {@link Monotonic#monotonic(List)} method.
    * It tests the monotonicity of a list of integers.
    */
    @Test
    void testMonotonic() {
        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        assertTrue(Monotonic.monotonic(l1));
        List<Integer> l2 = List.of(1, 2, 3, 4, 5, 4);
        assertTrue(Monotonic.monotonic(l2));
        List<Integer> l3 = List.of(1, 2, 3, 4, 5, 4, 3);
        assertTrue(Monotonic.monotonic(l3));
        List<Integer> l4 = List.of(1, 2, 3, 4, 5, 4, 3, 2);
        assertTrue(Monotonic.monotonic(l4));
        List<Integer> l5 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1);
        assertTrue(Monotonic.monotonic(l5));
        List<Integer> l6 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0);
        assertTrue(Monotonic.monotonic(l6));
        List<Integer> l7 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1);
        assertTrue(Monotonic.monotonic(l7));
        List<Integer> l8 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2);
        assertTrue(Monotonic.monotonic(l8));
        List<Integer> l9 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3);
        assertTrue(Monotonic.monotonic(l9));
        List<Integer> l10 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4);
        assertTrue(Monotonic.monotonic(l10));
        List<Integer> l11 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5);
        assertTrue(Monotonic.monotonic(l11));
        List<Integer> l12 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6);
        assertTrue(Monotonic.monotonic(l12));
        List<Integer> l13 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7);
        assertTrue(Monotonic.monotonic(l13));
        List<Integer> l14 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8);
        assertTrue(Monotonic.monotonic(l14));
        List<Integer> l15 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9);
        assertTrue(Monotonic.monotonic(l15));
        List<Integer> l16 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
        assertTrue(Monotonic.monotonic(l16));
        List<Integer> l17 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11);
        assertTrue(Monotonic.monotonic(l17));
        List<Integer> l18 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12);
        assertTrue(Monotonic.monotonic(l18));
        List<Integer> l19 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13);
        assertTrue(Monotonic.monotonic(l19));
        List<Integer> l20 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14);
        assertTrue(Monotonic.monotonic(l20));
        List<Integer> l21 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15);
        assertTrue(Monotonic.monotonic(l21));
        List<Integer> l22 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16);
        assertTrue(Monotonic.monotonic(l22));
        List<Integer> l23 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17);
        assertTrue(Monotonic.monotonic(l23));
        List<Integer> l24 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18);
        assertTrue(Monotonic.monotonic(l24));
        List<Integer> l25 = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19);
        assertTrue(Monotonic.monotonic(l25));
        List<Integer> l26 = List.of(1, 2