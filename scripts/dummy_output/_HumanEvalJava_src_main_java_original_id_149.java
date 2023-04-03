// SortedListSumTest.java
package original;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    @Test
    void testEmptyList() {
        List<String> lst = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testAllOddLengthStrings() {
        List<String> lst = Arrays.asList("a", "bc", "def");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testAllEvenLengthStrings() {
        List<String> lst = Arrays.asList("aa", "bb", "cc");
        List<String> expected = Arrays.asList("aa", "bb", "cc");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testMixedLengthStrings() {
        List<String> lst = Arrays.asList("a", "bb", "ccc", "dddd");
        List<String> expected = Arrays.asList("bb", "dddd");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testDuplicateStrings() {
        List<String> lst = Arrays.asList("aa", "bb", "aa", "cc");
        List<String> expected = Arrays.asList("aa", "aa", "bb");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testMixedCaseStrings() {
        List<String> lst = Arrays.asList("school", "AI", "asdf", "b");
        List<String> expected = Arrays.asList("AI", "asdf", "school");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testDescendingOrderStrings() {
        List<String> lst = Arrays.asList("d", "c", "b", "a");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testMixedLengthAndCaseStrings() {
        List<String> lst = Arrays.asList("d", "dcba", "abcd", "a");
        List<String> expected = Arrays.asList("abcd", "dcba");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testMixedLengthAndDuplicateStrings() {
        List<String> lst = Arrays.asList("AI", "ai", "au");
        List<String> expected = Arrays.asList("AI", "ai", "au");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testDuplicateEvenLengthStrings() {
        List<String> lst = Arrays.asList("a", "b", "b", "c", "c", "a");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }

    @Test
    void testMixedLengthAndDuplicateEvenLengthStrings() {
        List<String> lst = Arrays.asList("aaaa", "bbbb", "dd", "cc");
        List<String> expected = Arrays.asList("cc", "dd", "aaaa", "bbbb");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
}