// F.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * f(5) == [1, 2, 6, 24, 15]
     *
     * > f(5)
     * [1, 2, 6, 24, 15]
     * > f(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > f(1)
     * [1]
     * > f(3)
     * [1, 2, 6]
     */
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                factorial *= i;
                result.add(factorial);
            } else {
                sum += i;
                result.add(sum);
            }
        }
        return result;
    }
}

// FTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

    @Test
    void testFWithNEqual1() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = F.f(1);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual2() {
        List<Integer> expected = Arrays.asList(1, 2);
        List<Integer> actual = F.f(2);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual3() {
        List<Integer> expected = Arrays.asList(1, 2, 6);
        List<Integer> actual = F.f(3);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual4() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24);
        List<Integer> actual = F.f(4);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual5() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15);
        List<Integer> actual = F.f(5);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual6() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720);
        List<Integer> actual = F.f(6);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual7() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720, 28);
        List<Integer> actual = F.f(7);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual8() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320);
        List<Integer> actual = F.f(8);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual9() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 36);
        List<Integer> actual = F.f(9);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNEqual10() {
        List<Integer> expected = Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 36, 362880);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }
}