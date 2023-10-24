// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 0.
     */
    @Test
    void testF0() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = F.f(0);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 1.
     */
    @Test
    void testF1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = F.f(1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 2.
     */
    @Test
    void testF2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        List<Integer> actual = F.f(2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 3.
     */
    @Test
    void testF3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Integer> actual = F.f(3);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 4.
     */
    @Test
    void testF4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Integer> actual = F.f(4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 5.
     */
    @Test
    void testF5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Integer> actual = F.f(5);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 6.
     */
    @Test
    void testF6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        List<Integer> actual = F.f(6);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 7.
     */
    @Test
    void testF7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        List<Integer> actual = F.f(7);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 8.
     */
    @Test
    void testF8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        List<Integer> actual = F.f(8);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link F#f(int)} method.
     * It tests the case when n is 9.
     */
    @Test
    void testF9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        List<Integer> actual = F.f(9);
        assertEquals(expected, actual);
    }
}
