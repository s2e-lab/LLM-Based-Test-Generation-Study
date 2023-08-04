// SearchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

    /**
     * Test case for {@link Search#search(List)} where the list is empty.
     */
    @Test
    void testSearchEmptyList() {
        List<Integer> lst = List.of();
        assertEquals(-1, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains only one element.
     */
    @Test
    void testSearchSingleElementList() {
        List<Integer> lst = List.of(1);
        assertEquals(1, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains only negative integers.
     */
    @Test
    void testSearchNegativeList() {
        List<Integer> lst = List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
        assertEquals(-1, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains only positive integers.
     */
    @Test
    void testSearchPositiveList() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList2() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList3() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList4() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList5() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList6() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList7() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains some negative and some positive integers.
     */
    @Test
    void testSearchMixedList8() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8