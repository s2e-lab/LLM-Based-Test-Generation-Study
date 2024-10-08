// MakeAPileTest.java
package original;

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
     */
    @Test
    void testMakeAPile() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, MakeAPile.makeAPile(3));

        expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        assertEquals(expected, MakeAPile.makeAPile(4));

        expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        assertEquals(expected, MakeAPile.makeAPile(5));

        expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        assertEquals(expected, MakeAPile.makeAPile(6));

        expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(22);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }
}
