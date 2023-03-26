Here's the code for the test class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddCountTest {

    @Test
    void testEvenOddCount() {
        List<Integer> expected = Arrays.asList(3, 2);
        List<Integer> actual = EvenOddCount.evenOddCount(12345);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithZero() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(0);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithNegativeNumber() {
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = EvenOddCount.evenOddCount(-2468);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithSingleDigitNumber() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(7);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithAllEvenDigits() {
        List<Integer> expected = Arrays.asList(5, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(24680);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithAllOddDigits() {
        List<Integer> expected = Arrays.asList(0, 5);
        List<Integer> actual = EvenOddCount.evenOddCount(13579);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithMixedDigits() {
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = EvenOddCount.evenOddCount(12345);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithLargeNumber() {
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = EvenOddCount.evenOddCount(1234567890);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithMaxValue() {
        List<Integer> expected = Arrays.asList(10, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenOddCountWithMinValue() {
        List<Integer> expected = Arrays.asList(10, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(Integer.MIN_VALUE);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten unit test cases for the `evenOddCount` method of the `EvenOddCount` class. Each test case tests a different scenario, such as a number with all even digits, a number with all odd digits, a negative number, and so on. The `assertEquals` method is used to compare the expected output with the actual output of the method.