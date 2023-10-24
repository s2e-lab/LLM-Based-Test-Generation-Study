// GetOddCollatzTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * Returns a sorted list that has the odd numbers in collatz sequence.
     */
    @Test
    void testGetOddCollatz() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        assertEquals(expected, GetOddCollatz.getOddCollatz(14));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(5));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(12));

        expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));
    }
}
