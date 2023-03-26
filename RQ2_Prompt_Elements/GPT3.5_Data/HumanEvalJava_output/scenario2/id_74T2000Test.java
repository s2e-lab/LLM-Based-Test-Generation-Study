// TotalMatchTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TotalMatch}.
 * It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
 */
class TotalMatchTest {

    @Test
    void testTotalMatchWithEmptyLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithOneEmptyList() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> expected = lst2;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithEqualLengthLists() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("hi", "there");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithDifferentLengthLists() {
        List<Object> lst1 = Arrays.asList("hello", "world", "how", "are", "you");
        List<Object> lst2 = Arrays.asList("hi", "there", "i'm", "fine");
        List<Object> expected = lst2;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithNonStringValues() {
        List<Object> lst1 = Arrays.asList("hello", 123, "world");
        List<Object> lst2 = Arrays.asList("hi", "there", true);
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithNullValues() {
        List<Object> lst1 = Arrays.asList("hello", null, "world");
        List<Object> lst2 = Arrays.asList("hi", "there", null);
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithOnlyNullValues() {
        List<Object> lst1 = Arrays.asList(null, null, null);
        List<Object> lst2 = Arrays.asList(null, null);
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithLargeLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            lst1.add("hello");
            lst2.add("world");
        }
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithVeryLargeLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            lst1.add("hello");
            lst2.add("world");
        }
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingEmptyStrings() {
        List<Object> lst1 = Arrays.asList("", "hello", "", "world", "");
        List<Object> lst2 = Arrays.asList("hi", "", "there", "", "i'm", "fine");
        List<Object> expected = lst2;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }
}