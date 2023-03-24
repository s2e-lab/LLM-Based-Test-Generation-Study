Here's the source code for the IntersperseTest class:

```
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntersperseTest {

    @Test
    void testEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testSingleElementList() {
        List<Object> input = Arrays.asList(1);
        List<Object> expected = Arrays.asList(1);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testTwoElementList() {
        List<Object> input = Arrays.asList(1, 2);
        List<Object> expected = Arrays.asList(1, 4, 2);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testThreeElementList() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 4, 2, 4, 3);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testFourElementList() {
        List<Object> input = Arrays.asList(5, 6, 3, 2);
        List<Object> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        assertEquals(expected, Intersperse.intersperse(input, 8));
    }

    @Test
    void testAllSameElementList() {
        List<Object> input = Arrays.asList(2, 2, 2);
        List<Object> expected = Arrays.asList(2, 2, 2, 2, 2);
        assertEquals(expected, Intersperse.intersperse(input, 2));
    }

    @Test
    void testDelimiterAtBeginning() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(4, 1, 4, 2, 4, 3);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testDelimiterAtEnd() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 4, 2, 4, 3, 4);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testNegativeDelimiter() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, -4, 2, -4, 3);
        assertEquals(expected, Intersperse.intersperse(input, -4));
    }

    @Test
    void testZeroDelimiter() {
        List<Object> input = Arrays.asList(1, 2, 3);
        List<Object> expected = Arrays.asList(1, 0, 2, 0, 3);
        assertEquals(expected, Intersperse.intersperse(input, 0));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Intersperse.intersperse(null, 4));
    }
}
```

This test class contains ten test cases for the `intersperse` method of the `Intersperse` class. The test cases cover various scenarios, such as empty input list, single element list, list with all same elements, negative delimiter, zero delimiter, and null input. The expected output for each test case is compared with the actual output using the `assertEquals` method.