// IntersperseTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

    @Test
    void testIntersperse() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        expected.add(0);
        expected.add(6);
        expected.add(0);
        expected.add(7);
        expected.add(0);
        expected.add(8);
        expected.add(0);
        expected.add(9);
        expected.add(0);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse3() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        expected.add(0);
        expected.add(6);
        expected.add(0);
        expected.add(7);
        expected.add(0);
        expected.add(8);
        expected.add(0);
        expected.add(9);
        expected.add(0);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse5() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse6() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        expected.add(0);
        expected.add(6);
        expected.add(0);
        expected.add(7);
        expected.add(0);
        expected.add(8);
        expected.add(0);
        expected.add(9);
        expected.add(0);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse7() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse8() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        expected.add(0);
        expected.add(6);
        expected.add(0);
        expected.add(7);
        expected.add(0);
        expected.add(8);
        expected.add(0);
        expected.add(9);
        expected.add(0);
        expected.add(10);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse9() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(1