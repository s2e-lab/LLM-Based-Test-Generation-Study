Here's the code for the test class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestChangeTest {

    @Test
    void testEmptyList() {
        List<Integer> arr = Arrays.asList();
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleElementList() {
        List<Integer> arr = Arrays.asList(1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testTwoElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testThreeElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int expected = 2;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFourElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFourElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        int expected = 3;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFiveElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testFiveElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 4;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten test cases for the `smallestChange` method of the `SmallestChange` class. The test cases cover different scenarios, including empty lists, single-element lists, palindromic lists, non-palindromic lists, and lists of different sizes. Each test case compares the expected result with the actual result obtained from calling the `smallestChange` method with the input list. If the expected and actual results are not equal, the test case fails.