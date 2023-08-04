// Maximum1Test.java
package original;

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
    * Test case values: [-3, -4, 5], 3
    * Expected result: [-4, -3, 5]
    */
    @Test
    void testMaximum1() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-3);
        arr.add(-4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(-3);
        expected.add(5);
        assertEquals(expected, Maximum1.maximum(arr, 3));
    }

    /**
    * Test case number: 2
    * Test case values: [4, -4, 4], 2
    * Expected result: [4, 4]
    */
    @Test
    void testMaximum2() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(-4);
        arr.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(4);
        assertEquals(expected, Maximum1.maximum(arr, 2));
    }

    /**
    * Test case number: 3
    * Test case values: [-3, 2, 1, 2, -1, -2, 1], 1
    * Expected result: [2]
    */
    @Test
    void testMaximum3() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-3);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(-1);
        arr.add(-2);
        arr.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        assertEquals(expected, Maximum1.maximum(arr, 1));
    }

    /**
    * Test case number: 4
    * Test case values: [123, -123, 20, 0, 1, 2, -3], 3
    * Expected result: [2, 20, 123]
    */
    @Test
    void testMaximum4() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(123);
        arr.add(-123);
        arr.add(20);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(20);
        expected.add(123);
        assertEquals(expected, Maximum1.maximum(arr, 3));
    }

    /**
    * Test case number: 5
    * Test case values: [-123, 20, 0, 1, 2, -3], 4
    * Expected result: [0, 1, 2, 20]
    */
    @Test
    void testMaximum5() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-123);
        arr.add(20);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(20);
        assertEquals(expected, Maximum1.maximum(arr, 4));
    }

    /**
    * Test case number: 6
    * Test case values: [5, 15, 0, 3, -13, -8, 0], 7
    * Expected result: [-13, -8, 0, 0, 3, 5, 15]
    */
    @Test
    void testMaximum6() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(15);
        arr.add(0);
        arr.add(3);
        arr.add(-13);
        arr.add(-8);
        arr.add(0);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-13);
        expected.add(-8);
        expected.add(0);
        expected.add(0);
        expected.add(3);
        expected.add(5);
        expected.add(15);
        assertEquals(expected, Maximum1.maximum(arr, 7));
    }

    /**
    * Test case number: 7
    * Test case values: [-1, 0, 2, 5, 3, -10], 2
    * Expected result: [3, 5]
    */
    @Test
    void testMaximum7() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-1);
        arr.add(0);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(-10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(5);
        assertEquals(expected, Maximum1.maximum(arr, 2));
    }

    /**
    * Test case number: 8
    * Test case values: [1, 0, 5, -7], 1
    * Expected result: [5]
    */
    @Test
    void testMaximum8() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(0);
        arr.add(5);
        arr.add(-7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        assertEquals(expected, Maximum1.maximum(arr, 1));
    }

    /**
    * Test case number: 9
    * Test case values: [4, -4], 2
    * Expected result: [-4, 4]
    */
    @Test
    void testMaximum9() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(-4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(4);
        assertEquals(expected, Maximum1.maximum(arr, 2));
    }

    /**
    * Test case number: 10
    * Test case values: [-10, 10], 2
    * Expected result: [-10, 10]
    */
    @Test
    void testMaximum10() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-10);
        arr.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-10);
        expected.add(10);
        assertEquals(expected, Maximum1.maximum(arr, 2));
    }

    /**
    * Test case number: 11
    * Test case values: [1, 2, 3, -23, 243, -400, 0], 0
    * Expected result: []
    */
    @Test
    void testMaximum11() {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(-23);
        arr.add(243);
        arr.add(-400);
        arr.add(0);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Maximum1.maximum(arr, 0));
    }
}
