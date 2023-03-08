package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortedListSumTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("aa"), scenario2.SortedListSum.sortedListSum(Arrays.asList("aa", "a", "aaa")));
        assertEquals(Arrays.asList("AI", "asdf", "school"), scenario2.SortedListSum.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
        assertEquals(Arrays.asList(), scenario2.SortedListSum.sortedListSum(Arrays.asList("d", "b", "c", "a")));
        assertEquals(Arrays.asList("abcd", "dcba"), scenario2.SortedListSum.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));
        assertEquals(Arrays.asList("AI", "ai", "au"), scenario2.SortedListSum.sortedListSum(Arrays.asList("AI", "ai", "au")));
        assertEquals(Arrays.asList(), scenario2.SortedListSum.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
        assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), scenario2.SortedListSum.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));

    }

}