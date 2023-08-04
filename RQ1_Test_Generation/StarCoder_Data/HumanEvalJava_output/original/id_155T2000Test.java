// EvenOddCountTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {

    /**
     * Test case for {@link EvenOddCount#evenOddCount(int)}.
     */
    @Test
    void testEvenOddCount() {
        List<Integer> expected;
        List<Integer> actual;
        expected = Arrays.asList(1, 1);
        actual = EvenOddCount.evenOddCount(-12);
        assertEquals(expected, actual);
        expected = Arrays.asList(1, 2);
        actual = EvenOddCount.evenOddCount(123);
        assertEquals(expected, actual);
        expected = Arrays.asList(0, 1);
        actual = EvenOddCount.evenOddCount(7);
        assertEquals(expected, actual);
        expected = Arrays.asList(1, 1);
        actual = EvenOddCount.evenOddCount(-78);
        assertEquals(expected, actual);
        expected = Arrays.asList(2, 2);
        actual = EvenOddCount.evenOddCount(3452);
        assertEquals(expected, actual);
        expected = Arrays.asList(3, 3);
        actual = EvenOddCount.evenOddCount(346211);
        assertEquals(expected, actual);
        expected = Arrays.asList(3, 3);
        actual = EvenOddCount.evenOddCount(-345821);
        assertEquals(expected, actual);
        expected = Arrays.asList(1, 0);
        actual = EvenOddCount.evenOddCount(-2);
        assertEquals(expected, actual);
        expected = Arrays.asList(2, 3);
        actual = EvenOddCount.evenOddCount(-45347);
        assertEquals(expected, actual);
        expected = Arrays.asList(1, 0);
        actual = EvenOddCount.evenOddCount(0);
        assertEquals(expected, actual);
    }
}
