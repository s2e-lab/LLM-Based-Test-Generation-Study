// Here's the generated code for the Maximum1Test class:

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Maximum1Test {

    @Test
    void testEmptyArray() {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testKZero() {
        List<Integer> arr = Arrays.asList(-3, -4, 5);
        int k = 0;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testKGreaterThanArraySize() {
        List<Integer> arr = Arrays.asList(-3, -4, 5);
        int k = 4;
        List<Object> expected = Arrays.asList(-4, -3, 5);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testKEqualToArraySize() {
        List<Integer> arr = Arrays.asList(-3, -4, 5);
        int k = 3;
        List<Object> expected = Arrays.asList(-4, -3, 5);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testPositiveNumbers() {
        List<Integer> arr = Arrays.asList(4, -4, 4);
        int k = 2;
        List<Object> expected = Arrays.asList(4, 4);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
        int k = 1;
        List<Object> expected = Arrays.asList(2);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers() {
        List<Integer> arr = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
        int k = 3;
        List<Object> expected = Arrays.asList(20, 123, 2);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers2() {
        List<Integer> arr = Arrays.asList(-123, 20, 0, 1, 2, -3);
        int k = 4;
        List<Object> expected = Arrays.asList(0, 1, 2, 20);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers3() {
        List<Integer> arr = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
        int k = 7;
        List<Object> expected = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers4() {
        List<Integer> arr = Arrays.asList(-1, 0, 2, 5, 3, -10);
        int k = 2;
        List<Object> expected = Arrays.asList(3, 5);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers5() {
        List<Integer> arr = Arrays.asList(1, 0, 5, -7);
        int k = 1;
        List<Object> expected = Arrays.asList(5);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers6() {
        List<Integer> arr = Arrays.asList(4, -4);
        int k = 2;
        List<Object> expected = Arrays.asList(-4, 4);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testMixedNumbers7() {
        List<Integer> arr = Arrays.asList(-10, 10);
        int k = 2;
        List<Object> expected = Arrays.asList(-10, 10);
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }

    @Test
    void testKZero2() {
        List<Integer> arr = Arrays.asList(1, 2, 3, -23, 243, -400, 0);
        int k = 0;
        List<Object> expected = new ArrayList<>();
        List<Object> result = Maximum1.maximum(arr, k);
        assertEquals(expected, result);
    }
}