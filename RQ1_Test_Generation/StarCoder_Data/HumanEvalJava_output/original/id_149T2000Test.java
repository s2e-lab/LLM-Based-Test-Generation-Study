// SortedListSumTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with an empty list.
     */
    @Test
    void testSortedListSumWithEmptyList() {
        List<String> lst = new ArrayList<String>();
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with even length.
     */
    @Test
    void testSortedListSumWithEvenLength() {
        List<String> lst = new ArrayList<String>();
        lst.add("aa");
        lst.add("a");
        lst.add("aaa");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(1, result.size());
        assertEquals("aa", result.get(0));
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with odd length.
     */
    @Test
    void testSortedListSumWithOddLength() {
        List<String> lst = new ArrayList<String>();
        lst.add("ab");
        lst.add("a");
        lst.add("aaa");
        lst.add("cd");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(2, result.size());
        assertEquals("ab", result.get(0));
        assertEquals("cd", result.get(1));
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with no odd length.
     */
    @Test
    void testSortedListSumWithNoOddLength() {
        List<String> lst = new ArrayList<String>();
        lst.add("d");
        lst.add("b");
        lst.add("c");
        lst.add("a");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with duplicates.
     */
    @Test
    void testSortedListSumWithDuplicates() {
        List<String> lst = new ArrayList<String>();
        lst.add("d");
        lst.add("dcba");
        lst.add("abcd");
        lst.add("a");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(2, result.size());
        assertEquals("abcd", result.get(0));
        assertEquals("dcba", result.get(1));
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with all the same length.
     */
    @Test
    void testSortedListSumWithAllSameLength() {
        List<String> lst = new ArrayList<String>();
        lst.add("AI");
        lst.add("ai");
        lst.add("au");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(3, result.size());
        assertEquals("AI", result.get(0));
        assertEquals("ai", result.get(1));
        assertEquals("au", result.get(2));
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with all the same length and duplicates.
     */
    @Test
    void testSortedListSumWithAllSameLengthAndDuplicates() {
        List<String> lst = new ArrayList<String>();
        lst.add("a");
        lst.add("b");
        lst.add("b");
        lst.add("c");
        lst.add("c");
        lst.add("a");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    /**
     * Test case for {@link SortedListSum#sortedListSum(List)}
     * with a list of strings with all the same length and duplicates.
     */
    @Test
    void testSortedListSumWithAllSameLengthAndDuplicates2() {
        List<String> lst = new ArrayList<String>();
        lst.add("aaaa");
        lst.add("bbbb");
        lst.add("dd");
        lst.add("cc");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(4, result.size());
        assertEquals("aaaa", result.get(0));
        assertEquals("bbbb", result.get(1));
        assertEquals("cc", result.get(2));
        assertEquals("dd", result.get(3));
    }
}
