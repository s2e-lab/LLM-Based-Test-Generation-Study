// Maximum1Test.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

    /**
    * Test case number: 1
    * Test case values: [[1, 2, 3, 4, 5], 3]
    * Expected result: [5, 4, 3]
    */
    @Test
    void testMaximum1() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, Maximum1.maximum(arr, 3));
    }

    /**
    * Test case number: 2
    * Test case values: [[1, 2, 3, 4, 5], 5]
    * Expected result: [5, 4, 3, 2, 1]
    */
    @Test
    void testMaximum2() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Maximum1.maximum(arr, 5));
    }

    /**
    * Test case number: 3
    * Test case values: [[1, 2, 3, 4, 5], 1]
    * Expected result: [5]
    */
    @Test
    void testMaximum3() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        assertEquals(expected, Maximum1.maximum(arr, 1));
    }

    /**
    * Test case number: 4
    * Test case values: [[1, 2, 3, 4, 5], 0]
    * Expected result: []
    */
    @Test
    void testMaximum4() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Maximum1.maximum(arr, 0));
    }

    /**
    * Test case number: 5
    * Test case values: [[1, 2, 3, 4, 5], 6]
    * Expected result: [5, 4, 3, 2, 1]
    */
    @Test
    void testMaximum5() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Maximum1.maximum(arr, 6));
    }

    /**
    * Test case number: 6
    * Test case values: [[1, 2, 3, 4, 5], 2]
    * Expected result: [5, 4]
    */
    @Test
    void testMaximum6() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        assertEquals(expected, Maximum1.maximum(arr, 2));
    }

    /**
    * Test case number: 7
    * Test case values: [[1, 2, 3, 4, 5], 4]
    * Expected result: [5, 4, 3, 2]
    */
    @Test
    void testMaximum7() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        assertEquals(expected, Maximum1.maximum(arr, 4));
    }

    /**
    * Test case number: 8
    * Test case values: [[1, 2, 3, 4, 5], 10]
    * Expected result: [5, 4, 3, 2, 1]
    */
    @Test
    void testMaximum8() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Maximum1.maximum(arr, 10));
    }

    /**
    * Test case number: 9
    * Test case values: [[1, 2, 3, 4, 5], 100]
    * Expected result: [5, 4, 3, 2, 1]
    */
    @Test
    void testMaximum9() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Maximum1.maximum(arr, 100));
    }

    /**
    * Test case number: 10
    * Test case values: [[1, 2, 3, 4, 5], 1000]
    * Expected result: [5, 4, 3, 2, 1]
    */
    @Test
    void testMaximum10() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, Maximum1.maximum(arr, 1000));
    }
}
