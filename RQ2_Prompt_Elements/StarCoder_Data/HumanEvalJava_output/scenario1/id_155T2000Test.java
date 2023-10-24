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

    /**
    * Test case for {@link EvenOddCount#evenOddCount(int)}.
    */
    @Test
    void testEvenOddCount() {
        EvenOddCount evenOddCount = new EvenOddCount();
        List<Integer> expected = Arrays.asList(1, 1);
        assertEquals(expected, evenOddCount.evenOddCount(1));
        expected = Arrays.asList(1, 2);
        assertEquals(expected, evenOddCount.evenOddCount(12));
        expected = Arrays.asList(1, 3);
        assertEquals(expected, evenOddCount.evenOddCount(123));
        expected = Arrays.asList(1, 4);
        assertEquals(expected, evenOddCount.evenOddCount(1234));
        expected = Arrays.asList(1, 5);
        assertEquals(expected, evenOddCount.evenOddCount(12345));
        expected = Arrays.asList(1, 6);
        assertEquals(expected, evenOddCount.evenOddCount(123456));
        expected = Arrays.asList(1, 7);
        assertEquals(expected, evenOddCount.evenOddCount(1234567));
        expected = Arrays.asList(1, 8);
        assertEquals(expected, evenOddCount.evenOddCount(12345678));
        expected = Arrays.asList(1, 9);
        assertEquals(expected, evenOddCount.evenOddCount(123456789));
        expected = Arrays.asList(1, 10);
        assertEquals(expected, evenOddCount.evenOddCount(1234567890));
        expected = Arrays.asList(2, 1);
        assertEquals(expected, evenOddCount.evenOddCount(10));
        expected = Arrays.asList(2, 2);
        assertEquals(expected, evenOddCount.evenOddCount(100));
        expected = Arrays.asList(2, 3);
        assertEquals(expected, evenOddCount.evenOddCount(1000));
        expected = Arrays.asList(2, 4);
        assertEquals(expected, evenOddCount.evenOddCount(10000));
        expected = Arrays.asList(2, 5);
        assertEquals(expected, evenOddCount.evenOddCount(100000));
        expected = Arrays.asList(2, 6);
        assertEquals(expected, evenOddCount.evenOddCount(1000000));
        expected = Arrays.asList(2, 7);
        assertEquals(expected, evenOddCount.evenOddCount(10000000));
        expected = Arrays.asList(2, 8);
        assertEquals(expected, evenOddCount.evenOddCount(100000000));
        expected = Arrays.asList(2, 9);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000));
        expected = Arrays.asList(2, 10);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000));
        expected = Arrays.asList(3, 1);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000L));
        expected = Arrays.asList(3, 2);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000L));
        expected = Arrays.asList(3, 3);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000L));
        expected = Arrays.asList(3, 4);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000L));
        expected = Arrays.asList(3, 5);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000L));
        expected = Arrays.asList(3, 6);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000L));
        expected = Arrays.asList(3, 7);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000L));
        expected = Arrays.asList(3, 8);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000L));
        expected = Arrays.asList(3, 9);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000L));
        expected = Arrays.asList(3, 10);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000L));
        expected = Arrays.asList(4, 1);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000000L));
        expected = Arrays.asList(4, 2);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000000L));
        expected = Arrays.asList(4, 3);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000000L));
        expected = Arrays.asList(4, 4);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000000000L));
        expected = Arrays.asList(4, 5);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000000000L));
        expected = Arrays.asList(4, 6);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000000000L));
        expected = Arrays.asList(4, 7);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000000000000L));
        expected = Arrays.asList(4, 8);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000000000000L));
        expected = Arrays.asList(4, 9);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000000000000L));
        expected = Arrays.asList(4, 10);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000000000000000L));
        expected = Arrays.asList(5, 1);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000000000000000L));
        expected = Arrays.asList(5, 2);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000000000000000L));
        expected = Arrays.asList(5, 3);
        assertEquals(expected, evenOddCount.evenOddCount(1000000000000000000000000000000000L));
        expected = Arrays.asList(5, 4);
        assertEquals(expected, evenOddCount.evenOddCount(10000000000000000000000000000000000L));
        expected = Arrays.asList(5, 5);
        assertEquals(expected, evenOddCount.evenOddCount(100000000000000000000000000000000000L));
        expected = Arrays.asList(5, 6);
        assertEquals(expected, evenOddCount.evenOddCount(1000000