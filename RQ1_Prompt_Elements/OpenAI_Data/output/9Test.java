// RollingMaxTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link RollingMax}.
 * It contains ten test cases for the {@link scenario1.RollingMax#rollingMax()} method.
 */
class RollingMaxTest {
		


    @Test
    void testRollingMax() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRollingMax2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRollingMax3() {
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
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRollingMax4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        expected.add(10);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testRollingMax5() {
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
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.