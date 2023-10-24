// MakeAPileTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

    @Test
    void testMakeAPile1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, MakeAPile.makeAPile(1));
    }

    @Test
    void testMakeAPile2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        assertEquals(expected, MakeAPile.makeAPile(2));
    }

    @Test
    void testMakeAPile3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, MakeAPile.makeAPile(3));
    }

    @Test
    void testMakeAPile4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, MakeAPile.makeAPile(4));
    }

    @Test
    void testMakeAPile5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        assertEquals(expected, MakeAPile.makeAPile(5));
    }

    @Test
    void testMakeAPile6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        assertEquals(expected, MakeAPile.makeAPile(6));
    }

    @Test
    void testMakeAPile7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        assertEquals(expected, MakeAPile.makeAPile(7));
    }

    @Test
    void testMakeAPile8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        expected.add(15);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }

    @Test
    void testMakeAPile9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        expected.add(15);
        expected.add(17);
        assertEquals(expected, MakeAPile.makeAPile(9));
    }

    @Test
    void testMakeAPile10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        expected.add(15);
        expected.add(17);
        expected.add(19);
        assertEquals(expected, MakeAPile.makeAPile(10));
    }
}
