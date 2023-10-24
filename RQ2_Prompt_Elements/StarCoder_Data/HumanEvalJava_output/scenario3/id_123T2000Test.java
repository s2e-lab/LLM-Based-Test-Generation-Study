// GetOddCollatzTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz5() {
        List<Integer> expected = List.of(1, 5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(5));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 14 is [14, 42, 21, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1], so the odd numbers are 1, 5, 7, 11, 13, 17.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz14() {
        List<Integer> expected = List.of(1, 5, 7, 11, 13, 17);
        assertEquals(expected, GetOddCollatz.getOddCollatz(14));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz12() {
        List<Integer> expected = List.of(1, 3, 5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(12));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 1 is [1], so the odd numbers are only 1.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz1() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 2 is [2], so the odd numbers are only 2.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz2() {
        List<Integer> expected = List.of(2);
        assertEquals(expected, GetOddCollatz.getOddCollatz(2));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 3 is [3], so the odd numbers are only 3.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz3() {
        List<Integer> expected = List.of(3);
        assertEquals(expected, GetOddCollatz.getOddCollatz(3));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 4 is [4], so the odd numbers are only 4.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz4() {
        List<Integer> expected = List.of(4);
        assertEquals(expected, GetOddCollatz.getOddCollatz(4));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 6 is [6], so the odd numbers are only 6.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz6() {
        List<Integer> expected = List.of(6);
        assertEquals(expected, GetOddCollatz.getOddCollatz(6));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 7 is [7], so the odd numbers are only 7.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz7() {
        List<Integer> expected = List.of(7);
        assertEquals(expected, GetOddCollatz.getOddCollatz(7));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 8 is [8], so the odd numbers are only 8.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz8() {
        List<Integer> expected = List.of(8);
        assertEquals(expected, GetOddCollatz.getOddCollatz(8));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 9 is [9], so the odd numbers are only 9.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz9() {
        List<Integer> expected = List.of(9);
        assertEquals(expected, GetOddCollatz.getOddCollatz(9));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 10 is [10], so the odd numbers are only 10.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz10() {
        List<Integer> expected = List.of(10);
        assertEquals(expected, GetOddCollatz.getOddCollatz(10));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It tests the following scenario:
     * <ul>
     * <li>The collatz sequence for 11 is [11], so the odd numbers are only 11.</li>
     * </ul>
     */
    @Test
    void testGetOddCollatz11() {
        List<Integer> expected = List.of(11);
        assertEquals(expected, GetOddCollatz.getOddCollatz(11));
    }
}
