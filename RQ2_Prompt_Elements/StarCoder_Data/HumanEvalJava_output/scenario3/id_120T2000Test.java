// Maximum1Test.java
package scenario3;

import java.util.List;
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
        List<Integer> arr = List.of(-3, -4, 5);
        int k = 3;
        List<Integer> expected = List.of(-4, -3, 5);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 2
    * Test case values: [4, -4, 4], 2
    * Expected result: [4, 4]
    */
    @Test
    void testMaximum2() {
        List<Integer> arr = List.of(4, -4, 4);
        int k = 2;
        List<Integer> expected = List.of(4, 4);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 3
    * Test case values: [-3, 2, 1, 2, -1, -2, 1], 1
    * Expected result: [2]
    */
    @Test
    void testMaximum3() {
        List<Integer> arr = List.of(-3, 2, 1, 2, -1, -2, 1);
        int k = 1;
        List<Integer> expected = List.of(2);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 4
    * Test case values: [123, -123, 20, 0, 1, 2, -3], 3
    * Expected result: [2, 20, 123]
    */
    @Test
    void testMaximum4() {
        List<Integer> arr = List.of(123, -123, 20, 0, 1, 2, -3);
        int k = 3;
        List<Integer> expected = List.of(2, 20, 123);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 5
    * Test case values: [-123, 20, 0, 1, 2, -3], 4
    * Expected result: [0, 1, 2, 20]
    */
    @Test
    void testMaximum5() {
        List<Integer> arr = List.of(-123, 20, 0, 1, 2, -3);
        int k = 4;
        List<Integer> expected = List.of(0, 1, 2, 20);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 6
    * Test case values: [5, 15, 0, 3, -13, -8, 0], 7
    * Expected result: [-13, -8, 0, 0, 3, 5, 15]
    */
    @Test
    void testMaximum6() {
        List<Integer> arr = List.of(5, 15, 0, 3, -13, -8, 0);
        int k = 7;
        List<Integer> expected = List.of(-13, -8, 0, 0, 3, 5, 15);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 7
    * Test case values: [-1, 0, 2, 5, 3, -10], 2
    * Expected result: [3, 5]
    */
    @Test
    void testMaximum7() {
        List<Integer> arr = List.of(-1, 0, 2, 5, 3, -10);
        int k = 2;
        List<Integer> expected = List.of(3, 5);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 8
    * Test case values: [1, 0, 5, -7], 1
    * Expected result: [5]
    */
    @Test
    void testMaximum8() {
        List<Integer> arr = List.of(1, 0, 5, -7);
        int k = 1;
        List<Integer> expected = List.of(5);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 9
    * Test case values: [4, -4], 2
    * Expected result: [-4, 4]
    */
    @Test
    void testMaximum9() {
        List<Integer> arr = List.of(4, -4);
        int k = 2;
        List<Integer> expected = List.of(-4, 4);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 10
    * Test case values: [-10, 10], 2
    * Expected result: [-10, 10]
    */
    @Test
    void testMaximum10() {
        List<Integer> arr = List.of(-10, 10);
        int k = 2;
        List<Integer> expected = List.of(-10, 10);
        assertEquals(expected, Maximum1.maximum(arr, k));
    }

    /**
    * Test case number: 11
    * Test case values: [1, 2, 3, -23, 243, -400, 0], 0
    * Expected result: []
    */
    @Test
    void testMaximum11() {
        List<Integer> arr = List.of(1, 2, 3, -23, 243, -400, 0);
        int k = 0;
        List<Integer> expected = List.of();
        assertEquals(expected, Maximum1.maximum(arr, k));
    }
}
