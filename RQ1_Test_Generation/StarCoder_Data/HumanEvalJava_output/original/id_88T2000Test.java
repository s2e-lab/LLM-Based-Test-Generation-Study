// SortArray1Test.java
package original;

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

    /**
    * Test case number: 1
    * Test case values: []
    * Expected test result: []
    */
    @Test
    void test1() {
        List<Object> array = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 2
    * Test case values: [5]
    * Expected test result: [5]
    */
    @Test
    void test2() {
        List<Object> array = new ArrayList<Object>();
        array.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 3
    * Test case values: [2, 4, 3, 0, 1, 5]
    * Expected test result: [0, 1, 2, 3, 4, 5]
    */
    @Test
    void test3() {
        List<Object> array = new ArrayList<Object>();
        array.add(2);
        array.add(4);
        array.add(3);
        array.add(0);
        array.add(1);
        array.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 4
    * Test case values: [2, 4, 3, 0, 1, 5, 6]
    * Expected test result: [6, 5, 4, 3, 2, 1, 0]
    */
    @Test
    void test4() {
        List<Object> array = new ArrayList<Object>();
        array.add(2);
        array.add(4);
        array.add(3);
        array.add(0);
        array.add(1);
        array.add(5);
        array.add(6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 5
    * Test case values: [2, 1]
    * Expected test result: [1, 2]
    */
    @Test
    void test5() {
        List<Object> array = new ArrayList<Object>();
        array.add(2);
        array.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 6
    * Test case values: [15, 42, 87, 32, 11, 0]
    * Expected test result: [0, 11, 15, 32, 42, 87]
    */
    @Test
    void test6() {
        List<Object> array = new ArrayList<Object>();
        array.add(15);
        array.add(42);
        array.add(87);
        array.add(32);
        array.add(11);
        array.add(0);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(11);
        expected.add(15);
        expected.add(32);
        expected.add(42);
        expected.add(87);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case number: 7
    * Test case values: [21, 14, 23, 11]
    * Expected test result: [23, 21, 14, 11]
    */
    @Test
    void test7() {
        List<Object> array = new ArrayList<Object>();
        array.add(21);
        array.add(14);
        array.add(23);
        array.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(23);
        expected.add(21);
        expected.add(14);
        expected.add(11);
        assertEquals(expected, SortArray1.sortArray(array));
    }
}
