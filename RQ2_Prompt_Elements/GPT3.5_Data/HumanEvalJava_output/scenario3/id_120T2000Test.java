// Maximum1.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Maximum1 {

    /**
     * * Given an array arr of integers and a positive integer k, return a sorted list
     * of length k with the maximum k numbers in arr.
     *
     * Example 1:
     *
     * Input: arr = [-3, -4, 5], k = 3
     * Output: [-4, -3, 5]
     *
     * Example 2:
     *
     * Input: arr = [4, -4, 4], k = 2
     * Output: [4, 4]
     *
     * Example 3:
     *
     * Input: arr = [-3, 2, 1, 2, -1, -2, 1], k = 1
     * Output: [2]
     *
     * Note:
     * 1. The length of the array will be in the range of [1, 1000].
     * 2. The elements in the array will be in the range of [-1000, 1000].
     * 3. 0 <= k <= len(arr)
     *
     * > maximum([-3, -4, 5], 3)
     * [-4, -3, 5]
     * > maximum([4, -4, 4], 2)
     * [4, 4]
     * > maximum([-3, 2, 1, 2, -1, -2, 1], 1)
     * [2]
     * > maximum([123, -123, 20, 0, 1, 2, -3], 3)
     * [2, 20, 123]
     * > maximum([-123, 20, 0, 1, 2, -3], 4)
     * [0, 1, 2, 20]
     * > maximum([5, 15, 0, 3, -13, -8, 0], 7)
     * [-13, -8, 0, 0, 3, 5, 15]
     * > maximum([-1, 0, 2, 5, 3, -10], 2)
     * [3, 5]
     * > maximum([1, 0, 5, -7], 1)
     * [5]
     * > maximum([4, -4], 2)
     * [-4, 4]
     * > maximum([-10, 10], 2)
     * [-10, 10]
     * > maximum([1, 2, 3, -23, 243, -400, 0], 0)
     * []
     */
    public static List<Integer> maximum(List<Integer> arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (k == 0) {
            return result;
        }
        Collections.sort(arr);
        for (int i = arr.size() - 1; i >= arr.size() - k; i--) {
            result.add(arr.get(i));
        }
        return result;
    }
}

// Maximum1Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

    @Test
    void testMaximum1() {
        List<Integer> arr = Arrays.asList(-3, -4, 5);
        List<Integer> expected = Arrays.asList(-4, -3, 5);
        List<Integer> result = Maximum1.maximum(arr, 3);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum2() {
        List<Integer> arr = Arrays.asList(4, -4, 4);
        List<Integer> expected = Arrays.asList(4, 4);
        List<Integer> result = Maximum1.maximum(arr, 2);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum3() {
        List<Integer> arr = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result = Maximum1.maximum(arr, 1);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum4() {
        List<Integer> arr = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
        List<Integer> expected = Arrays.asList(2, 20, 123);
        List<Integer> result = Maximum1.maximum(arr, 3);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum5() {
        List<Integer> arr = Arrays.asList(-123, 20, 0, 1, 2, -3);
        List<Integer> expected = Arrays.asList(0, 1, 2, 20);
        List<Integer> result = Maximum1.maximum(arr, 4);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum6() {
        List<Integer> arr = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
        List<Integer> expected = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
        List<Integer> result = Maximum1.maximum(arr, 7);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum7() {
        List<Integer> arr = Arrays.asList(-1, 0, 2, 5, 3, -10);
        List<Integer> expected = Arrays.asList(3, 5);
        List<Integer> result = Maximum1.maximum(arr, 2);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum8() {
        List<Integer> arr = Arrays.asList(1, 0, 5, -7);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> result = Maximum1.maximum(arr, 1);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum9() {
        List<Integer> arr = Arrays.asList(4, -4);
        List<Integer> expected = Arrays.asList(-4, 4);
        List<Integer> result = Maximum1.maximum(arr, 2);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum10() {
        List<Integer> arr = Arrays.asList(-10, 10);
        List<Integer> expected = Arrays.asList(-10, 10);
        List<Integer> result = Maximum1.maximum(arr, 2);
        assertEquals(expected, result);
    }

    @Test
    void testMaximum11() {
        List<Integer> arr = Arrays.asList(1, 2, 3, -23, 243, -400, 0);
        List<Integer> expected = Arrays.asList();
        List<Integer> result = Maximum1.maximum(arr, 0);
        assertEquals(expected, result);
    }
}