// IntersperseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Intersperse}.
 * It contains ten test cases for the {@link scenario1.Intersperse#intersperse()} method.
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
        List<Object> expected = new Array