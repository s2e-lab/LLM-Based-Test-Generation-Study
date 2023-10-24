// SortedListSumTest.java
package scenario2;

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
     * Test case for the {@link SortedListSum#sortedListSum(List)} method.
     * It tests the case where the list is empty.
     */
    @Test
    void testSortedListSum_EmptyList() {
        List<String> lst = new ArrayList<String>();
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    /**
     * Test case for the {@link SortedListSum#sortedListSum(List)} method.
     * It tests the case where the list contains only even-length words.
     */
    @Test
    void testSortedListSum_EvenLengthWords() {
        List<String> lst = new ArrayList<String>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("durian");
        lst.add("eggplant");
        lst.add("fig");
        lst.add("grape");
        lst.add("honeydew");
        lst.add("kiwi");
        lst.add("lemon");
        lst.add("mango");
        lst.add("nectarine");
        lst.add("orange");
        lst.add("passionfruit");
        lst.add("peach");
        lst.add("pear");
        lst.add("pineapple");
        lst.add("plum");
        lst.add("quince");
        lst.add("raspberry");
        lst.add("strawberry");
        lst.add("tangerine");
        lst.add("watermelon");
        lst.add("yam");
        lst.add("zucchini");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(lst.size(), result.size());
        for (int i = 0; i < lst.size(); i++) {
            assertEquals(lst.get(i), result.get(i));
        }
    }

    /**
     * Test case for the {@link SortedListSum#sortedListSum(List)} method.
     * It tests the case where the list contains only odd-length words.
     */
    @Test
    void testSortedListSum_OddLengthWords() {
        List<String> lst = new ArrayList<String>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("durian");
        lst.add("eggplant");
        lst.add("fig");
        lst.add("grape");
        lst.add("honeydew");
        lst.add("kiwi");
        lst.add("lemon");
        lst.add("mango");
        lst.add("nectarine");
        lst.add("orange");
        lst.add("passionfruit");
        lst.add("peach");
        lst.add("pear");
        lst.add("pineapple");
        lst.add("plum");
        lst.add("quince");
        lst.add("raspberry");
        lst.add("strawberry");
        lst.add("tangerine");
        lst.add("watermelon");
        lst.add("yam");
        lst.add("zucchini");
        for (int i = 0; i < lst.size(); i++) {
            lst.set(i, lst.get(i) + "x");
        }
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    /**
     * Test case for the {@link SortedListSum#sortedListSum(List)} method.
     * It tests the case where the list contains both even-length and odd-length words.
     */
    @Test
    void testSortedListSum_MixedLengthWords() {
        List<String> lst = new ArrayList<String>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("durian");
        lst.add("eggplant");
        lst.add("fig");
        lst.add("grape");
        lst.add("honeydew");
        lst.add("kiwi");
        lst.add("lemon");
        lst.add("mango");
        lst.add("nectarine");
        lst.add("orange");
        lst.add("passionfruit");
        lst.add("peach");
        lst.add("pear");
        lst.add("pineapple");
        lst.add("plum");
        lst.add("quince");
        lst.add("raspberry");
        lst.add("strawberry");
        lst.add("tangerine");
        lst.add("watermelon");
        lst.add("yam");
        lst.add("zucchini");
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0) {
                lst.set(i, lst.get(i) + "x");
            }
        }
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(lst.size() / 2, result.size());
        for (int i = 0; i < lst.size() / 2; i++) {
            assertEquals(lst.get(i * 2), result.get(i));
        }
    }
}
