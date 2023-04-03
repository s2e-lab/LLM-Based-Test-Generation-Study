// SearchTest.java
package original;


import java.util.Arrays;
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
        List<Integer> lst1 = Arrays.asList(4, 1, 2, 2, 3, 1);
        assertEquals(2, Search.search(lst1));

        List<Integer> lst2 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4);
        assertEquals(3, Search.search(lst2));

        List<Integer> lst3 = Arrays.asList(5, 5, 4, 4, 4);
        assertEquals(-1, Search.search(lst3));

        List<Integer> lst4 = Arrays.asList(5, 5, 5, 5, 1);
        assertEquals(1, Search.search(lst4));

        List<Integer> lst5 = Arrays.asList(4, 1, 4, 1, 4, 4);
        assertEquals(4, Search.search(lst5));

        List<Integer> lst6 = Arrays.asList(3, 3);
        assertEquals(-1, Search.search(lst6));

        List<Integer> lst7 = Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8);
        assertEquals(8, Search.search(lst7));

        List<Integer> lst8 = Arrays.asList(2, 3, 3, 2, 2);
        assertEquals(2, Search.search(lst8));

        List<Integer> lst9 = Arrays.asList(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1);
        assertEquals(1, Search.search(lst9));

        List<Integer> lst10 = Arrays.asList(3, 2, 8, 2);
        assertEquals(2, Search.search(lst10));
    }
}