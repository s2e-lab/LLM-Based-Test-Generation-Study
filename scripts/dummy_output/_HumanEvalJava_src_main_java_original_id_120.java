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
    @Test
    void test1() {
        List<Integer> arr = Arrays.asList(-3, -4, 5);
        List<Integer> expected = Arrays.asList(-4, -3, 5);
        List<Integer> actual = Maximum1.maximum(arr, 3);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        List<Integer> arr = Arrays.asList(4, -4, 4);
        List<Integer> expected = Arrays.asList(4, 4);
        List<Integer> actual = Maximum1.maximum(arr, 2);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        List<Integer> arr = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = Maximum1.maximum(arr, 1);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        List<Integer> arr = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
        List<Integer> expected = Arrays.asList(2, 20, 123);
        List<Integer> actual = Maximum1.maximum(arr, 3);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        List<Integer> arr = Arrays.asList(-123, 20, 0, 1, 2, -3);
        List<Integer> expected = Arrays.asList(0, 1, 2, 20);
        List<Integer> actual = Maximum1.maximum(arr, 4);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        List<Integer> arr = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
        List<Integer> expected = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
        List<Integer> actual = Maximum1.maximum(arr, 7);
        assertEquals(expected, actual);
    }

    @Test
    void test7() {
        List<Integer> arr = Arrays.asList(-1, 0, 2, 5, 3, -10);
        List<Integer> expected = Arrays.asList(3, 5);
        List<Integer> actual = Maximum1.maximum(arr, 2);
        assertEquals(expected, actual);
    }

    @Test
    void test8() {
        List<Integer> arr = Arrays.asList(1, 0, 5, -7);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = Maximum1.maximum(arr, 1);
        assertEquals(expected, actual);
    }

    @Test
    void test9() {
        List<Integer> arr = Arrays.asList(4, -4);
        List<Integer> expected = Arrays.asList(-4, 4);
        List<Integer> actual = Maximum1.maximum(arr, 2);
        assertEquals(expected, actual);
    }

    @Test
    void test10() {
        List<Integer> arr = Arrays.asList(-10, 10);
        List<Integer> expected = Arrays.asList(-10, 10);
        List<Integer> actual = Maximum1.maximum(arr, 2);
        assertEquals(expected, actual);
    }

    @Test
    void test11() {
        List<Integer> arr = Arrays.asList(1, 2, 3, -23, 243, -400, 0);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = Maximum1.maximum(arr, 0);
        assertEquals(expected, actual);
    }
}