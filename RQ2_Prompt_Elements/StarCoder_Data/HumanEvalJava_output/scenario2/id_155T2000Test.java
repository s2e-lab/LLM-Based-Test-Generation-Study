// EvenOddCountTest.java
package scenario2;

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
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, EvenOddCount.evenOddCount(123));
        expected = Arrays.asList(1, 1);
        assertEquals(expected, EvenOddCount.evenOddCount(11));
        expected = Arrays.asList(1, 0);
        assertEquals(expected, EvenOddCount.evenOddCount(1));
        expected = Arrays.asList(0, 1);
        assertEquals(expected, EvenOddCount.evenOddCount(10));
        expected = Arrays.asList(0, 0);
        assertEquals(expected, EvenOddCount.evenOddCount(0));
    }
}
