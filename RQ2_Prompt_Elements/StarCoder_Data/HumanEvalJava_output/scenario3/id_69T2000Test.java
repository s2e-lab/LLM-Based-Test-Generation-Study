// SearchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

    /**
     * Test case for {@link Search#search(List)} where the list contains a single element.
     */
    @Test
    void testSearchSingleElement() {
        List<Integer> lst = List.of(1);
        assertEquals(1, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains two elements.
     */
    @Test
    void testSearchTwoElements() {
        List<Integer> lst = List.of(1, 2);
        assertEquals(2, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains three elements.
     */
    @Test
    void testSearchThreeElements() {
        List<Integer> lst = List.of(1, 2, 3);
        assertEquals(3, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains four elements.
     */
    @Test
    void testSearchFourElements() {
        List<Integer> lst = List.of(1, 2, 3, 4);
        assertEquals(4, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains five elements.
     */
    @Test
    void testSearchFiveElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5);
        assertEquals(5, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains six elements.
     */
    @Test
    void testSearchSixElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(6, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains seven elements.
     */
    @Test
    void testSearchSevenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains eight elements.
     */
    @Test
    void testSearchEightElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(8, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains nine elements.
     */
    @Test
    void testSearchNineElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(9, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains ten elements.
     */
    @Test
    void testSearchTenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains eleven elements.
     */
    @Test
    void testSearchElevenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains twelve elements.
     */
    @Test
    void testSearchTwelveElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(12, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains thirteen elements.
     */
    @Test
    void testSearchThirteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(13, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains fourteen elements.
     */
    @Test
    void testSearchFourteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(14, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains fifteen elements.
     */
    @Test
    void testSearchFifteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(15, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains sixteen elements.
     */
    @Test
    void testSearchSixteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(16, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains seventeen elements.
     */
    @Test
    void testSearchSeventeenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(17, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains eighteen elements.
     */
    @Test
    void testSearchEighteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(18, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains nineteen elements.
     */
    @Test
    void testSearchNineteenElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(19, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains twenty elements.
     */
    @Test
    void testSearchTwentyElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(20, Search.search(lst));
    }

    /**
     * Test case for {@link Search#search(List)} where the list contains twenty-one elements.
     */
    @Test
    void testSearchTwentyOneElements() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,