// SearchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

    @Test
    void testSearch() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch2() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch3() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch4() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch5() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch6() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch7() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch8() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch9() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }

    @Test
    void testSearch10() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(10, Search.search(lst));
    }
}
