// SortedListSum.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedListSum {

    /**
     * Write a function that accepts a list of strings as a parameter,
     * deletes the strings that have odd lengths from it,
     * and returns the resulted list with a sorted order,
     * The list is always a list of strings and never an array of numbers,
     * and it may contain duplicates.
     * The order of the list should be ascending by length of each word, and you
     * should return the list sorted by that rule.
     * If two words have the same length, sort the list alphabetically.
     * The function should return a list of strings in sorted order.
     * You may assume that all words will have the same length.
     * For example:
     * assert sortedListSum(["aa", "a", "aaa"]) => ["aa"]
     * assert sortedListSum(["ab", "a", "aaa", "cd"]) => ["ab", "cd"]
     *
     * > sortedListSum(["aa", "a", "aaa"])
     * ["aa"]
     * > sortedListSum(["school", "AI", "asdf", "b"])
     * ["AI", "asdf", "school"]
     * > sortedListSum(["d", "b", "c", "a"])
     * []
     * > sortedListSum(["d", "dcba", "abcd", "a"])
     * ["abcd", "dcba"]
     * > sortedListSum(["AI", "ai", "au"])
     * ["AI", "ai", "au"]
     * > sortedListSum(["a", "b", "b", "c", "c", "a"])
     * []
     * > sortedListSum(["aaaa", "bbbb", "dd", "cc"])
     * ["cc", "dd", "aaaa", "bbbb"]
     */
    public static List<String> sortedListSum(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).length() % 2 == 0) {
                result.add(lst.get(i));
            }
        }
        Collections.sort(result, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        return result;
    }
}

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
        List<String> lst = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testNoEvenLengthStrings() {
        List<String> lst = Arrays.asList("a", "bb", "ccc", "dddd");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testAllEvenLengthStrings() {
        List<String> lst = Arrays.asList("aa", "bb", "cc", "dd");
        List<String> expected = Arrays.asList("aa", "bb", "cc", "dd");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testMixedLengthStrings() {
        List<String> lst = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
        List<String> expected = Arrays.asList("bb", "dddd");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testDuplicateStrings() {
        List<String> lst = Arrays.asList("aa", "bb", "cc", "bb", "aa");
        List<String> expected = Arrays.asList("aa", "aa", "bb", "bb");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testMixedCaseStrings() {
        List<String> lst = Arrays.asList("school", "AI", "asdf", "b");
        List<String> expected = Arrays.asList("AI", "asdf", "school");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testSameLengthDifferentOrder() {
        List<String> lst = Arrays.asList("d", "dcba", "abcd", "a");
        List<String> expected = Arrays.asList("abcd", "dcba");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testSameLengthSameOrder() {
        List<String> lst = Arrays.asList("AI", "ai", "au");
        List<String> expected = Arrays.asList("AI", "ai", "au");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testAllSameString() {
        List<String> lst = Arrays.asList("aaaa", "aaaa", "aaaa", "aaaa");
        List<String> expected = Arrays.asList("aaaa", "aaaa", "aaaa", "aaaa");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testMixedStrings() {
        List<String> lst = Arrays.asList("a", "b", "b", "c", "c", "a");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
}