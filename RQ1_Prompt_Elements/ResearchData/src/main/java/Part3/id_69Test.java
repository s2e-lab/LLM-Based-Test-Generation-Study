package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SearchTest {
    @Test
    public void testSearch() {
        assertEquals(2, Search.search(Arrays.asList(4, 1, 2, 2, 3, 1)));
        assertEquals(3, Search.search(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4)));
        assertEquals(-1, Search.search(Arrays.asList(5, 5, 4, 4, 4)));
        assertEquals(1, Search.search(Arrays.asList(5, 5, 5, 5, 1)));
        assertEquals(4, Search.search(Arrays.asList(4, 1, 4, 1, 4, 4)));
        assertEquals(-1, Search.search(Arrays.asList(3, 3)));
        assertEquals(8, Search.search(Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8)));
        assertEquals(2, Search.search(Arrays.asList(2, 3, 3, 2, 2)));
        assertEquals(1, Search.search(Arrays.asList(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1)));
        assertEquals(2, Search.search(Arrays.asList(3, 2, 8, 2)));
        assertEquals(1, Search.search(Arrays.asList(6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10)));
        assertEquals(-1, Search.search(Arrays.asList(8, 8, 3, 6, 5, 6, 4)));
        assertEquals(1, Search.search(Arrays.asList(6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9)));
        assertEquals(1, Search.search(Arrays.asList(1, 9, 10, 1, 3)));
        assertEquals(5, Search.search(Arrays.asList(6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10)));
        assertEquals(1, Search.search(Arrays.asList(1)));
        assertEquals(4, Search.search(Arrays.asList(8, 8, 10, 6, 4, 3, 5, 8, 2, 4, 2, 8, 4, 6, 10, 4, 2, 1, 10, 2, 1, 1, 5)));
        assertEquals(2, Search.search(Arrays.asList(2, 10, 4, 8, 2, 10, 5, 1, 2, 9, 5, 5, 6, 3, 8, 6, 4, 10)));
        assertEquals(1, Search.search(Arrays.asList(1, 6, 10, 1, 6, 9, 10, 8, 6, 8, 7, 3)));
        assertEquals(4, Search.search(Arrays.asList(9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4)));
        assertEquals(4, Search.search(Arrays.asList(2, 6, 4, 2, 8, 7, 5, 6, 4, 10, 4, 6, 3, 7, 8, 8, 3, 1, 4, 2, 2, 10, 7)));
        assertEquals(2, Search.search(Arrays.asList(9, 8, 6, 10, 2, 6, 10, 2, 7, 8, 10, 3, 8, 2, 6, 2, 3, 1)));
        assertEquals(-1, Search.search(Arrays.asList(5, 5, 3, 9, 5, 6, 3, 2, 8, 5, 6, 10, 10, 6, 8, 4, 10, 7, 7, 10, 8)));
        assertEquals(-1, Search.search(Arrays.asList(10)));
        assertEquals(2, Search.search(Arrays.asList(9, 7, 7, 2, 4, 7, 2, 10, 9, 7, 5, 7, 2)));
        assertEquals(1, Search.search(Arrays.asList(5, 4, 10, 2, 1, 1, 10, 3, 6, 1, 8)));
        assertEquals(1, Search.search(Arrays.asList(7, 9, 9, 9, 3, 4, 1, 5, 9, 1, 2, 1, 1, 10, 7, 5, 6, 7, 6, 7, 7, 6)));
        assertEquals(-1, Search.search(Arrays.asList(3, 10, 10, 9, 2)));
    }
}