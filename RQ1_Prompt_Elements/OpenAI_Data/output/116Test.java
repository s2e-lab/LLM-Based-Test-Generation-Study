// SortArrayTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link SortArray}.
* It contains ten test cases for the {@link SortArray#compare()} method.
*/
class SortArrayTest {


    @Test
    void test1() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(6));
        arr.add(new Integer(7));
        arr.add(new Integer(8));
        arr.add(new Integer(9));
        arr.add(new Integer(10));
        List<Object> expected = new ArrayList<Object>();
        expected.add(new Integer(1));
        expected.add(new Integer(2));
        expected.add(new Integer(4));
        expected.add(new Integer(8));
        expected.add(new Integer(3));
        expected.add(new Integer(5));
        expected.add(new Integer(6));
        expected.add(new Integer(9));
        expected.add(new Integer(10));
        expected.add(new Integer(7));
        List<Object> actual = SortArray.sortArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(6));
        arr.add(new Integer(7));
        arr.add(new Integer(8));
        arr.add(new Integer(9));
        arr.add(new Integer(10));
        List<Object> expected = new ArrayList<Object>();
        expected.add(new Integer(1));
        expected.add(new Integer(2));
        expected.add(new Integer(4));
        expected.add(new Integer(8));
        expected.add(new Integer(3));
        expected.add(new Integer(5));
        expected.add(new Integer(6));
        expected.add(new Integer(9));
        expected.add(new Integer(10));
        expected.add(new Integer(7));
        List<Object> actual = SortArray.sortArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(6));
        arr.add(new Integer(7));
        arr.add(new Integer(8));
        arr.add(new Integer(9));
        arr.add(new Integer(10));
        List<Object> expected = new ArrayList<Object>();
        expected.add(new Integer(1));
        expected.add(new Integer(2));
        expected.add(new Integer(4));
        expected.add(new Integer(8));
        expected.add(new Integer(3));
        expected.add(new Integer(5));
        expected.add(new Integer(6));
        expected.add(new Integer(9));
        expected.add(new Integer(10));
        expected.add(new Integer(7));
        List<Object> actual = SortArray.sortArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(6));
        arr.add(new Integer(7));
        arr.add(new Integer(8));
        arr.add(new Integer(9));
        arr.add(new Integer(10));
        List<Object> expected = new ArrayList<Object>();
       