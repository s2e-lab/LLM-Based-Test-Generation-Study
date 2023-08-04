// SortedListSumTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}.
     */
    @Test
    void testSortedListSum() {
        List<String> lst = List.of("aa", "a", "aaa");
        List<String> expected = List.of("aa");
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("school", "AI", "asdf", "b");
        expected = List.of("AI", "asdf", "school");
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("d", "b", "c", "a");
        expected = List.of();
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("d", "dcba", "abcd", "a");
        expected = List.of("abcd", "dcba");
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("AI", "ai", "au");
        expected = List.of("AI", "ai", "au");
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("a", "b", "b", "c", "c", "a");
        expected = List.of();
        assertEquals(expected, SortedListSum.sortedListSum(lst));

        lst = List.of("aaaa", "bbbb", "dd", "cc");
        expected = List.of("cc", "dd", "aaaa", "bbbb");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
}
