package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SortedListSumTest {
    @Test
    void sortedListSumTest() {
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("aa", "a", "aaa")), Arrays.asList("aa"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("ab", "a", "aaa", "cd")), Arrays.asList("ab", "cd"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("d", "b", "c", "a")), Arrays.asList());
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")), Arrays.asList("abcd", "dcba"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("AI", "ai", "au")), Arrays.asList("AI", "ai", "au"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")), Arrays.asList());
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")), Arrays.asList("cc", "dd", "aaaa", "bbbb"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("a", "b", "c", "d")), Arrays.asList("a", "b", "c", "d"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("a", "b", "c", "d", "e")), Arrays.asList("a", "b", "c", "d", "e"));
        assertEquals(SortedListSum.sortedListSum(Arrays.asList("a", "b", "c", "d", "e", "f")), Arrays.asList("a", "b", "c", "d", "e", "f"));
    }
}