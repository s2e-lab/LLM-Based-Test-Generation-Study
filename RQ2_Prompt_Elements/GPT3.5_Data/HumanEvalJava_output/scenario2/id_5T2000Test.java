Here's the code for the `IntersperseTest` class:

```
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Intersperse}.
 * It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
 */
class IntersperseTest {

    @Test
    void testIntersperseWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        int delimiter = 1;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithSingleElementList() {
        List<Object> input = Arrays.asList(1);
        List<Object> expectedOutput = Arrays.asList(1);
        int delimiter = 2;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithTwoElementList() {
        List<Object> input = Arrays.asList(1, 2);
        List<Object> expectedOutput = Arrays.asList(1, 2);
        int delimiter = 3;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithThreeElementList() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expectedOutput = Arrays.asList(1, 4, 2, 4, 3);
        int delimiter = 4;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithFourElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4);
        List<Object> expectedOutput = Arrays.asList(1, 5, 2, 5, 3, 5, 4);
        int delimiter = 5;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithFiveElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expectedOutput = Arrays.asList(1, 6, 2, 6, 3, 6, 4, 6, 5);
        int delimiter = 6;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithSixElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Object> expectedOutput = Arrays.asList(1, 7, 2, 7, 3, 7, 4, 7, 5, 7, 6);
        int delimiter = 7;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithSevenElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Object> expectedOutput = Arrays.asList(1, 8, 2, 8, 3, 8, 4, 8, 5, 8, 6, 8, 7);
        int delimiter = 8;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithEightElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expectedOutput = Arrays.asList(1, 9, 2, 9, 3, 9, 4, 9, 5, 9, 6, 9, 7, 9, 8);
        int delimiter = 9;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testIntersperseWithNineElementList() {
        List<Object> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Object> expectedOutput = Arrays.asList(1, 10, 2, 10, 3, 10, 4, 10, 5, 10, 6, 10, 7, 10, 8, 10, 9);
        int delimiter = 10;
        List<Object> actualOutput = Intersperse.intersperse(input, delimiter);
        assertEquals(expectedOutput, actualOutput);
    }
}
```

This test class contains ten test cases for the `intersperse` method of the `Intersperse` class. The test cases cover different scenarios, such as empty list, single element list, two element list, etc. The expected output for each test case is calculated manually and compared with the actual output returned by the `intersperse` method. If the expected and actual outputs match, the test case passes, otherwise it fails.