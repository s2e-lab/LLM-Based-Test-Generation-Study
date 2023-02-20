package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MaximumTest {
    @Test
    public void testMaximum() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-3);
        arr.add(-4);
        arr.add(5);
        List<Object> res = Maximum1.maximum(arr, 3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(-3);
        expected.add(5);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(-4);
        arr.add(4);
        res = Maximum1.maximum(arr, 2);
        expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(4);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(-3);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(-1);
        arr.add(-2);
        arr.add(1);
        res = Maximum1.maximum(arr, 1);
        expected = new ArrayList<Object>();
        expected.add(2);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(123);
        arr.add(-123);
        arr.add(20);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        res = Maximum1.maximum(arr, 3);
        expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(20);
        expected.add(123);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(-123);
        arr.add(20);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        res = Maximum1.maximum(arr, 4);
        expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(20);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(15);
        arr.add(0);
        arr.add(3);
        arr.add(-13);
        arr.add(-8);
        arr.add(0);
        res = Maximum1.maximum(arr, 7);
        expected = new ArrayList<Object>();
        expected.add(-13);
        expected.add(-8);
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(-1);
        arr.add(0);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(-10);
        res = Maximum1.maximum(arr, 2);
        expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(5);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(0);
        arr.add(5);
        arr.add(-7);
        res = Maximum1.maximum(arr, 1);
        expected = new ArrayList<Object>();
        expected.add(5);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(-4);
        res = Maximum1.maximum(arr, 2);
        expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(4);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(-10);
        arr.add(10);
        res = Maximum1.maximum(arr, 2);
        expected = new ArrayList<Object>();
        expected.add(-10);
        expected.add(10);
        assertEquals(expected, res);

        arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(-23);
        arr.add(243);
        arr.add(-400);
        arr.add(0);
        res = Maximum1.maximum(arr, 0);
        expected = new ArrayList<Object>();
        assertEquals(expected, res);
    }
}