// PluckTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

    @Test
    void testPluck1() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck4() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck5() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck6() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck7() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck8() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck9() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testPluck10() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(arr));
    }
}
