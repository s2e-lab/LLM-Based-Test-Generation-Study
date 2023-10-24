// TriTest.java
package scenario1;

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

    @Test
    void testTri0() {
        List<Number> expected = Arrays.asList(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }

    @Test
    void testTri1() {
        List<Number> expected = Arrays.asList(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }

    @Test
    void testTri2() {
        List<Number> expected = Arrays.asList(1, 3, 5);
        List<Number> actual = Tri.tri(2);
        assertEquals(expected, actual);
    }

    @Test
    void testTri3() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }

    @Test
    void testTri4() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }

    @Test
    void testTri5() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }

    @Test
    void testTri6() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }

    @Test
    void testTri7() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }

    @Test
    void testTri8() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }

    @Test
    void testTri9() {
        List<Number> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
        List<Number> actual = Tri.tri(9);
        assertEquals(expected, actual);
    }
}
