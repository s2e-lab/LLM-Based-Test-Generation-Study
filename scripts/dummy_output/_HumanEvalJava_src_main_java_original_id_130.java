// TriTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class of {@link Tri}.
 * It contains ten unit test cases for the {@link Tri#tri(int)} method.
 */
class TriTest {

    @Test
    void testTriWithZero() {
        List<Number> expected = Arrays.asList(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithOne() {
        List<Number> expected = Arrays.asList(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithTwo() {
        List<Number> expected = Arrays.asList(1, 3, 2.0);
        List<Number> actual = Tri.tri(2);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithThree() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithFour() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithFive() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithSix() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithSeven() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithEight() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }

    @Test
    void testTriWithTwenty() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0);
        List<Number> actual = Tri.tri(20);
        assertEquals(expected, actual);
    }
}