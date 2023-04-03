// GetRowTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link GetRow}.
 * It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
 */
class GetRowTest {

    @Test
    void testEmptyList() {
        List<List<Integer>> lst = new ArrayList<>();
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testSingleElementList() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1));
        List<List<Integer>> result = GetRow.getRow(lst, 2);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testListWithEmptyRow() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(Arrays.asList(1));
        lst.add(Arrays.asList(1, 2, 3));
        List<List<Integer>> result = GetRow.getRow(lst, 3);
        assertEquals(Arrays.asList(Arrays.asList(2, 2)), result);
    }

    @Test
    void testListWithMultipleRows() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithMultipleOccurrences() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 4);
        assertEquals(Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 3), Arrays.asList(2, 3)), result);
    }

    @Test
    void testListWithNegativeNumbers() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -1, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -1));
        List<List<Integer>> result = GetRow.getRow(lst, -3);
        assertEquals(Arrays.asList(Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(2, 2)), result);
    }

    @Test
    void testListWithDuplicates() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0), Arrays.asList(3, 4), Arrays.asList(3, 0)), result);
    }

    @Test
    void testListWithNullValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, null, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, null));
        List<List<Integer>> result = GetRow.getRow(lst, null);
        assertEquals(Arrays.asList(Arrays.asList(0, 3), Arrays.asList(2, 5), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithAllNullValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(null, null, null, null, null, null));
        lst.add(Arrays.asList(null, null, null, null, null, null));
        lst.add(Arrays.asList(null, null, null, null, null, null));
        List<List<Integer>> result = GetRow.getRow(lst, null);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    void testListWithAllSameValues() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        lst.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(Arrays.asList(Arrays.asList(0, 5), Arrays.asList(1, 5), Arrays.asList(2, 5), Arrays.asList(0, 4), Arrays.asList(1, 4), Arrays.asList(2, 4), Arrays.asList(0, 3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(0, 2), Arrays.asList(1, 2), Arrays.asList(2, 2), Arrays.asList(0, 1), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(0, 0), Arrays.asList(1, 0), Arrays.asList(2, 0)), result);
    }

    @Test
    void testListWithDifferentDataTypes() {
        List<List<Object>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3,