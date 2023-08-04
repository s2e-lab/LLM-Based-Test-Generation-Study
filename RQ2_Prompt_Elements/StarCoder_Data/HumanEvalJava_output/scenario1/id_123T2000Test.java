// GetOddCollatzTest.java
package scenario1;

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

    @Test
    void testGetOddCollatz() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        assertEquals(expected, GetOddCollatz.getOddCollatz(3));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, GetOddCollatz.getOddCollatz(5));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        assertEquals(expected, GetOddCollatz.getOddCollatz(15));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        assertEquals(expected, GetOddCollatz.getOddCollatz(35));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        expected.add(75);
        assertEquals(expected, GetOddCollatz.getOddCollatz(75));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        expected.add(75);
        expected.add(155);
        assertEquals(expected, GetOddCollatz.getOddCollatz(155));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        expected.add(75);
        expected.add(155);
        expected.add(315);
        assertEquals(expected, GetOddCollatz.getOddCollatz(315));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        expected.add(75);
        expected.add(155);
        expected.add(315);
        expected.add(635);
        assertEquals(expected, GetOddCollatz.getOddCollatz(635));

        expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(35);
        expected.add(75);
        expected.add(155);
        expected.add(315);
        expected.add(635);
        expected.add(1275);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1275));
    }
}
