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
* It contains ten test cases for the {@link RollingMax#rollingMax()} method.
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
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    void testRollingMax2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(5, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    void testRollingMax3() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(1, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(5, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(5, result.get(4));
    }

    @Test
    void testRollingMax4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(3, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(5, result.get(4));
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
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testRollingMax6() {
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
        List<Object> result = RollingMax