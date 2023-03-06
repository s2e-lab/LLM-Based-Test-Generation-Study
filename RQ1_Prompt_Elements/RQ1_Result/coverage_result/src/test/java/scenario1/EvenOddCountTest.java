// EvenOddCountTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link EvenOddCount}.
 * It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
 */
class EvenOddCountTest {

    @Test
    void testEvenOddCount_1() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(0);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_2() {
        List<Integer> expected = Arrays.asList(1, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(1);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_3() {
        List<Integer> expected = Arrays.asList(2, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(10);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_4() {
        List<Integer> expected = Arrays.asList(2, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(11);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_5() {
        List<Integer> expected = Arrays.asList(3, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(100);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_6() {
        List<Integer> expected = Arrays.asList(3, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(101);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_7() {
        List<Integer> expected = Arrays.asList(4, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(1000);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_8() {
        List<Integer> expected = Arrays.asList(4, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(1001);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_9() {
        List<Integer> expected = Arrays.asList(5, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(10000);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCount_10() {
        List<Integer> expected = Arrays.asList(5, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(10001);
        assertEquals(expected, actual);
    }
}
