// Maximum1Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Maximum1}.
 * It contains ten test cases for the {@link scenario1.Maximum1#compare()} method.
 */
class Maximum1Test {
		


    @Test
    void test1() {
        List<Integer> arr = new ArrayList<Integer>();
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
        List<Object> res = Maximum1.maximum(arr, 3);
        assertEquals(res.size(), 3);
        assertEquals(res.get(0), 8);
        assertEquals(res.get(1), 9);
        assertEquals(res.get(2), 10);
    }

    @Test
    void test2() {
        List<Integer> arr = new ArrayList<Integer>();
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
        List<Object> res = Maximum1.maximum(arr, 0);
        assertEquals(res.size(), 0);
    }

    @Test
    void test3() {
        List<Integer> arr = new ArrayList<Integer>();
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
        List<Object> res = Maximum1.maximum(arr, 10);
        assertEquals(res.size(), 10);
        assertEquals(res.get(0), 1);
        assertEquals(res.get(1), 2);
        assertEquals(res.get(2), 3);
        assertEquals(res.get(3), 4);
        assertEquals(res.get(4), 5);
        assertEquals(res.get(5), 6);
        assertEquals(res.get(6), 7);
        assertEquals(res.get(7), 8);
        assertEquals(res.get(8), 9);
        assertEquals(res.get(9), 10);
    }

    @Test
    void test4() {
        List<Integer> arr = new ArrayList<Integer>();
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
        List<Object> res = Maximum1.maximum(arr, 11);
        assertEquals(res.size(), 10);
        assertEquals(res.get(0), 1);
        assertEquals(res.get(1), 2);
        assertEquals(res.get(2), 3);
        assertEquals(res.get(3), 4);
        assertEquals(res.get(4), 5);
        assertEquals(res.get(5), 6);
        assertEquals(res.get(6), 7);
        assertEquals(res.get(7), 8);
        assertEquals(res.get(8), 9);
        assertEquals(res.get(9), 10);
    }

    @Test
    void test5() {
        List<Integer> arr = new ArrayList<Integer>();
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
        List<Object> res = Maximum1.maximum(arr, 5);
        assertEquals(res.size(), 5);
        assertEquals(res.get(0), 6);