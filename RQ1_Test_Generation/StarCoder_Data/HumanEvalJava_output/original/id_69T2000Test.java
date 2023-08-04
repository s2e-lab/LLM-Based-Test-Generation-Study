// SearchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

    /**
    * Test case for {@link Search#search(List)}.
    */
    @Test
    void testSearch() {
        List<Integer> lst1 = List.of(4, 1, 2, 2, 3, 1);
        assertEquals(2, Search.search(lst1));
        List<Integer> lst2 = List.of(1, 2, 2, 3, 3, 3, 4, 4, 4);
        assertEquals(3, Search.search(lst2));
        List<Integer> lst3 = List.of(5, 5, 4, 4, 4);
        assertEquals(-1, Search.search(lst3));
        List<Integer> lst4 = List.of(5, 5, 5, 5, 1);
        assertEquals(1, Search.search(lst4));
        List<Integer> lst5 = List.of(4, 1, 4, 1, 4, 4);
        assertEquals(4, Search.search(lst5));
        List<Integer> lst6 = List.of(3, 3);
        assertEquals(-1, Search.search(lst6));
        List<Integer> lst7 = List.of(8, 8, 8, 8, 8, 8, 8, 8);
        assertEquals(8, Search.search(lst7));
        List<Integer> lst8 = List.of(2, 3, 3, 2, 2);
        assertEquals(2, Search.search(lst8));
        List<Integer> lst9 = List.of(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1);
        assertEquals(1, Search.search(lst9));
        List<Integer> lst10 = List.of(3, 2, 8, 2);
        assertEquals(2, Search.search(lst10));
        List<Integer> lst11 = List.of(6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10);
        assertEquals(1, Search.search(lst11));
        List<Integer> lst12 = List.of(8, 8, 3, 6, 5, 6, 4);
        assertEquals(-1, Search.search(lst12));
        List<Integer> lst13 = List.of(6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9);
        assertEquals(1, Search.search(lst13));
        List<Integer> lst14 = List.of(1, 9, 10, 1, 3);
        assertEquals(1, Search.search(lst14));
        List<Integer> lst15 = List.of(6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10);
        assertEquals(5, Search.search(lst15));
        List<Integer> lst16 = List.of(1);
        assertEquals(1, Search.search(lst16));
        List<Integer> lst17 = List.of(8, 8, 10, 6, 4, 3, 5, 8, 2, 4, 2, 8, 4, 6, 10, 4, 2, 1, 10, 2, 1, 1, 5);
        assertEquals(4, Search.search(lst17));
        List<Integer> lst18 = List.of(2, 10, 4, 8, 2, 10, 5, 1, 2, 9, 5, 5, 6, 3, 8, 6, 4, 10);
        assertEquals(2, Search.search(lst18));
        List<Integer> lst19 = List.of(1, 6, 10, 1, 6, 9, 10, 8, 6, 8, 7, 3);
        assertEquals(1, Search.search(lst19));
        List<Integer> lst20 = List.of(9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4);
        assertEquals(4, Search.search(lst20));
        List<Integer> lst21 = List.of(2, 6, 4, 2, 8, 7, 5, 6, 4, 10, 4, 6, 3, 7, 8, 8, 3, 1, 4, 2, 2, 10, 7);
        assertEquals(4, Search.search(lst21));
        List<Integer> lst22 = List.of(9, 8, 6, 10, 2, 6, 10, 2, 7, 8, 10, 3, 8, 2, 6, 2, 3, 1);
        assertEquals(2, Search.search(lst22));
        List<Integer> lst23 = List.of(5, 5, 3, 9, 5, 6, 3, 2, 8, 5, 6, 10, 10, 6, 8, 4, 10, 7, 7, 10, 8);
        assertEquals(-1, Search.search(lst23));
        List<Integer> lst24 = List.of(10);
        assertEquals(-1, Search.search(lst24));
        List<Integer> lst25 = List.of(9, 7, 7, 2, 4, 7, 2, 10, 9, 7, 5, 7, 2);
        assertEquals(2, Search.search(lst25));
        List<Integer> lst26 = List.of(5, 4, 10, 2, 1, 1, 10, 3, 6, 1, 8);
        assertEquals(1, Search.search(lst26));
        List<Integer> lst27 = List.of(7, 9, 9, 9, 3, 4, 1, 5, 9, 1, 2, 1, 1, 10, 7, 5, 6, 7, 6, 7, 7, 6);
        assertEquals(1, Search.search(lst27));
        List<Integer> lst28 = List.of(3, 10, 10, 9, 2);
        assertEquals(-1, Search.search(lst28));
    }
}
