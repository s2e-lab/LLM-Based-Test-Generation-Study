// FTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15);
        assertEquals(expected, F.f(5));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF2() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28);
        assertEquals(expected, F.f(7));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF3() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, F.f(1));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF4() {
        List<Integer> expected = List.of(1, 2, 6);
        assertEquals(expected, F.f(3));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF5() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60);
        assertEquals(expected, F.f(9));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF6() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60, 2520, 120);
        assertEquals(expected, F.f(11));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF7() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60, 2520, 120, 40320, 240);
        assertEquals(expected, F.f(13));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF8() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60, 2520, 120, 40320, 240, 100800, 720);
        assertEquals(expected, F.f(15));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF9() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60, 2520, 120, 40320, 240, 100800, 720, 362880, 2880);
        assertEquals(expected, F.f(17));
    }

    /**
     * Test case for {@link F#f(int)}.
     */
    @Test
    void testF10() {
        List<Integer> expected = List.of(1, 2, 6, 24, 15, 720, 28, 1440, 60, 2520, 120, 40320, 240, 100800, 720, 362880, 2880, 1555200, 16800);
        assertEquals(expected, F.f(19));
    }
}
