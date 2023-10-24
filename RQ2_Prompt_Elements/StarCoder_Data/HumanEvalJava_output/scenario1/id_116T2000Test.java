// SortArrayTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

    @Test
    void testSortArray() {
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
        assertEquals(expected, SortArray.sortArray(arr));
    }

    @Test
    void testSortArray2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
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
        assertEquals(expected, SortArray.sortArray(arr));
    }

    @Test
    void testSortArray3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
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
        assertEquals(expected, SortArray.sortArray(arr));
    }

    @Test
    void testSortArray4() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
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
        assertEquals(expected, SortArray.sortArray(arr));
    }

    @Test
    void testSortArray5() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
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
        assertEquals(expected, SortArray.sortArray(arr));
    }

    @Test
    void testSortArray6() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr