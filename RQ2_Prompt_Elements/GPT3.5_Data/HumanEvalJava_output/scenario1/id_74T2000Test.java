Here's the code for the TotalMatchTest class:

```
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TotalMatchTest {

    @Test
    void testTotalMatchWithEmptyLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertTrue(result.isEmpty());
    }

    @Test
    void testTotalMatchWithOneEmptyList() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testTotalMatchWithEqualStringSum() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("foo", "bar");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testTotalMatchWithLargerStringSum() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("foo", "bar", "baz");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testTotalMatchWithSmallerStringSum() {
        List<Object> lst1 = Arrays.asList("hello", "world", "foo");
        List<Object> lst2 = Arrays.asList("bar", "baz");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testTotalMatchWithMixedTypes() {
        List<Object> lst1 = Arrays.asList("hello", 42, "world");
        List<Object> lst2 = Arrays.asList("foo", "bar");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testTotalMatchWithNullLists() {
        List<Object> result = TotalMatch.totalMatch(null, null);
        assertNull(result);
    }

    @Test
    void testTotalMatchWithNullList1() {
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> result = TotalMatch.totalMatch(null, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testTotalMatchWithNullList2() {
        List<Object> lst1 = Arrays.asList("foo", "bar");
        List<Object> result = TotalMatch.totalMatch(lst1, null);
        assertEquals(lst1, result);
    }

    @Test
    void testTotalMatchWithNonStringValues() {
        List<Object> lst1 = Arrays.asList(1, 2, 3);
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
}
```

This test class contains ten unit test cases for the `totalMatch` method of the `TotalMatch` class. The test cases cover various scenarios, including empty lists, lists with different string sums, mixed types, and null lists. Each test case uses the `assertEquals` or `assertNull` method to verify that the expected result is returned by the `totalMatch` method.