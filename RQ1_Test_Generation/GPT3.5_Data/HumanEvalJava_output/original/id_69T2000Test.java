// SearchTest.java
package updated;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Search}.
 * It contains ten unit test cases for the {@link Search#search(List)} method.
 */
class SearchTest {

    @Test
    void testSearch1() {
        List<Integer> lst = Arrays.asList(4, 1, 2, 2, 3, 1);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch2() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4);
        int expected = 3;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch3() {
        List<Integer> lst = Arrays.asList(5, 5, 4, 4, 4);
        int expected = -1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch4() {
        List<Integer> lst = Arrays.asList(5, 5, 5, 5, 1);
        int expected = 1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch5() {
        List<Integer> lst = Arrays.asList(4, 1, 4, 1, 4, 4);
        int expected = 4;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch6() {
        List<Integer> lst = Arrays.asList(3, 3);
        int expected = -1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch7() {
        List<Integer> lst = Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8);
        int expected = 8;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch8() {
        List<Integer> lst = Arrays.asList(2, 3, 3, 2, 2);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch9() {
        List<Integer> lst = Arrays.asList(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1);
        int expected = 1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch10() {
        List<Integer> lst = Arrays.asList(6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10);
        int expected = 5;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }
}