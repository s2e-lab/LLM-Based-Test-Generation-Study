// SortArray1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [].
    */
    @Test
    void test_for_sortArray_001() {
        List<Object> array = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [5].
    */
    @Test
    void test_for_sortArray_002() {
        List<Object> array = List.of(5);
        List<Object> expected = List.of(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [0, 1, 2, 3, 4, 5].
    */
    @Test
    void test_for_sortArray_003() {
        List<Object> array = List.of(2, 4, 3, 0, 1, 5);
        List<Object> expected = List.of(0, 1, 2, 3, 4, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [6, 5, 4, 3, 2, 1, 0].
    */
    @Test
    void test_for_sortArray_004() {
        List<Object> array = List.of(2, 4, 3, 0, 1, 5, 6);
        List<Object> expected = List.of(6, 5, 4, 3, 2, 1, 0);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [1, 2].
    */
    @Test
    void test_for_sortArray_005() {
        List<Object> array = List.of(2, 1);
        List<Object> expected = List.of(1, 2);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [0, 11, 15, 32, 42, 87].
    */
    @Test
    void test_for_sortArray_006() {
        List<Object> array = List.of(15, 42, 87, 32, 11, 0);
        List<Object> expected = List.of(0, 11, 15, 32, 42, 87);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    /**
    * Test case for {@link SortArray1#sortArray(List)}.
    * The expected result is [23, 21, 14, 11].
    */
    @Test
    void test_for_sortArray_007() {
        List<Object> array = List.of(21, 14, 23, 11);
        List<Object> expected = List.of(23, 21, 14, 11);
        assertEquals(expected, SortArray1.sortArray(array));
    }
}
