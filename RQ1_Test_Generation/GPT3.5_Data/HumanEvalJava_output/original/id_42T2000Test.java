Here's the source code for the IncrListTest class:

```
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncrListTest {

    @Test
    void testIncrList() {
        List<Object> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123));
        expected = new ArrayList<>(Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>();
        expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(3, 2, 1));
        expected = new ArrayList<>(Arrays.asList(4, 3, 2));
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123));
        expected = new ArrayList<>(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(1, "two", 3));
        expected = new ArrayList<>(Arrays.asList(2, 4));
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList("hello", "world"));
        expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
        expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));

        input = new ArrayList<>(Arrays.asList(null, 2, 3));
        expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));

        input = null;
        assertThrows(NullPointerException.class, () -> IncrList.incrList(input));
    }
}
```

This test class contains ten unit test cases for the `incrList` method of the `IncrList` class. The test cases cover various scenarios, including empty lists, lists with only non-integer elements, and null input. The `assertEquals` method is used to compare the expected output with the actual output of the `incrList` method. The `assertThrows` method is used to test for a `NullPointerException` when the input list is null.