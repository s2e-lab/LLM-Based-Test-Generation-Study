// TriTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
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
     * It tests the case when n = 0.
     */
    @Test
    void testTri0() {
        List<Number> expected = Arrays.asList(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 1.
     */
    @Test
    void testTri1() {
        List<Number> expected = Arrays.asList(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 2.
     */
    @Test
    void testTri2() {
        List<Number> expected = Arrays.asList(1, 3, 2);
        List<Number> actual = Tri.tri(2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 3.
     */
    @Test
    void testTri3() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 4.
     */
    @Test
    void testTri4() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 5.
     */
    @Test
    void testTri5() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10, 14);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 6.
     */
    @Test
    void testTri6() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10, 14, 15);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 7.
     */
    @Test
    void testTri7() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10, 14, 15, 23);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 8.
     */
    @Test
    void testTri8() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10, 14, 15, 23, 18);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Tri#tri(int)} method.
     * It tests the case when n = 9.
     */
    @Test
    void testTri9() {
        List<Number> expected = Arrays.asList(1, 3, 2, 8, 10, 14, 15, 23, 18, 21);
        List<Number> actual = Tri.tri(9);
        assertEquals(expected, actual);
    }
}
