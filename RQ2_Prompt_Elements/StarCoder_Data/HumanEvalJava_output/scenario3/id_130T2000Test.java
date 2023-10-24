// TriTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(3) = [1, 3, 2, 8]
     */
    @Test
    void testTri3() {
        List<Number> expected = List.of(1, 3, 2, 8);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(4) = [1, 3, 2, 8, 3]
     */
    @Test
    void testTri4() {
        List<Number> expected = List.of(1, 3, 2, 8, 3);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(5) = [1, 3, 2, 8, 3, 15]
     */
    @Test
    void testTri5() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(6) = [1, 3, 2, 8, 3, 15, 4]
     */
    @Test
    void testTri6() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15, 4);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(7) = [1, 3, 2, 8, 3, 15, 4, 24]
     */
    @Test
    void testTri7() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15, 4, 24);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(8) = [1, 3, 2, 8, 3, 15, 4, 24, 5]
     */
    @Test
    void testTri8() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15, 4, 24, 5);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(9) = [1, 3, 2, 8, 3, 15, 4, 24, 5, 35]
     */
    @Test
    void testTri9() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15, 4, 24, 5, 35);
        List<Number> actual = Tri.tri(9);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(20) = [1, 3, 2, 8, 3, 15, 4, 24, 5, 35, 6, 48, 7, 63, 8, 80, 9, 99, 10, 120, 11]
     */
    @Test
    void testTri20() {
        List<Number> expected = List.of(1, 3, 2, 8, 3, 15, 4, 24, 5, 35, 6, 48, 7, 63, 8, 80, 9, 99, 10, 120, 11);
        List<Number> actual = Tri.tri(20);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(0) = [1]
     */
    @Test
    void testTri0() {
        List<Number> expected = List.of(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the following scenario:
     * tri(1) = [1, 3]
     */
    @Test
    void testTri1() {
        List<Number> expected = List.of(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }
}
