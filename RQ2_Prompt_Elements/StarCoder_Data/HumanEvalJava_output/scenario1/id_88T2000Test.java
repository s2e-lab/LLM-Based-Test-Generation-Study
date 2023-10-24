// SortArray1Test.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
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
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
    }

    @Test
    void testSortArray2() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
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
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
    }

    @Test
    void testSortArray4() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
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
        array.add(8);
        array.add(9);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
        assertEquals(9, sortedArray.get(8));
    }

    @Test
    void testSortArray6() {
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
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
        assertEquals(9, sortedArray.get(8));
        assertEquals(10, sortedArray.get(9));
    }

    @Test
    void testSortArray7() {
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
        array.add(11);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
        assertEquals(9, sortedArray.get(8));
        assertEquals(10, sortedArray.get(9));
        assertEquals(11, sortedArray.get(10));
    }

    @Test
    void testSortArray8() {
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
        array.add(11);
        array.add(12);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
        assertEquals(9, sortedArray.get(8));
        assertEquals(10, sortedArray.get(9));
        assertEquals(11, sortedArray.get(10));
        assertEquals(12, sortedArray.get(11));
    }

    @Test
    void testSortArray9() {
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
        array.add(11);
        array.add(12);
        array.add(13);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(5, sortedArray.get(0));
        assertEquals(4, sortedArray.get(1));
        assertEquals(3, sortedArray.get(2));
        assertEquals(2, sortedArray.get(3));
        assertEquals(1, sortedArray.get(4));
        assertEquals(6, sortedArray.get(5));
        assertEquals(7, sortedArray.get(6));
        assertEquals(8, sortedArray.get(7));
        assertEquals(9, sortedArray.get(8));
        assertEquals(10, sortedArray.get(9));
        assertEquals(11, sortedArray.get(10));
        assertEquals(12, sortedArray.get(11));
        assertEquals(13, sortedArray.get(12));
    }

    @Test
    void testSortArray10() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(