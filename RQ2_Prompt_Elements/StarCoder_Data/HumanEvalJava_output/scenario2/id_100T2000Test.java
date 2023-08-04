// MakeAPileTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

    /**
    * Test case for {@link MakeAPile#makeAPile(int)}.
    * The first level has n stones.
    * The number of stones in the next level is:
    * - the next odd number if n is odd.
    * - the next even number if n is even.
    */
    @Test
    void testMakeAPile() {
        List<Integer> result = MakeAPile.makeAPile(1);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(2);
        expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(3);
        expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(1);
        expected.add(2);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(4);
        expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(1);
        expected.add(3);
        expected.add(2);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(5);
        expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(6);
        expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(7);
        expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(1);
        expected.add(6);
        expected.add(2);
        expected.add(5);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(8);
        expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(1);
        expected.add(7);
        expected.add(2);
        expected.add(6);
        expected.add(3);
        expected.add(5);
        expected.add(4);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(9);
        expected = new ArrayList<Integer>();
        expected.add(9);
        expected.add(1);
        expected.add(8);
        expected.add(2);
        expected.add(7);
        expected.add(3);
        expected.add(6);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, result);

        result = MakeAPile.makeAPile(10);
        expected = new ArrayList<Integer>();
        expected.add(10);
        expected.add(1);
        expected.add(9);
        expected.add(2);
        expected.add(8);
        expected.add(3);
        expected.add(7);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, result);
    }
}
