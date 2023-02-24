// SortArray1Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SortArray1}.
 * It contains ten test cases for the {@link scenario1.SortArray1#compare()} method.
 */
class SortArray1Test {
		


    @Test
    void testSortArray1() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
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
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    @Test
    void testSortArray2() {
        List<Object> array = new ArrayList<Object>();
        array.add(10);
        array.add(9);
        array.add(8);
        array.add(7);
        array.add(6);
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
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
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    @Test
    void testSortArray3() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(10);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(6);
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    @Test
    void testSortArray4() {
        List<Object> array = new ArrayList<Object>();
        array.add(10);
        array.add(9);
        array.add(8);
        array.add(7);
        array.add(6);
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(10);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(6);
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    @Test
    void testSortArray5() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8