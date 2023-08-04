// IsSortedTest.java
package original;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    /**
    * Test that the method returns true if the list is empty.
    */
    @Test
    void testEmptyList() {
        List<Object> lst = List.of();
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains one element.
    */
    @Test
    void testSingleElementList() {
        List<Object> lst = List.of(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains two elements.
    */
    @Test
    void testTwoElementList() {
        List<Object> lst = List.of(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains three elements.
    */
    @Test
    void testThreeElementList() {
        List<Object> lst = List.of(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains four elements.
    */
    @Test
    void testFourElementList() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains five elements.
    */
    @Test
    void testFiveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains six elements.
    */
    @Test
    void testSixElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains seven elements.
    */
    @Test
    void testSevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains two elements
    * that are not in ascending order.
    */
    @Test
    void testTwoElementListNotAscending() {
        List<Object> lst = List.of(1, 3);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains three elements
    * that are not in ascending order.
    */
    @Test
    void testThreeElementListNotAscending() {
        List<Object> lst = List.of(1, 3, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains four elements
    * that are not in ascending order.
    */
    @Test
    void testFourElementListNotAscending() {
        List<Object> lst = List.of(1, 3, 2, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains five elements
    * that are not in ascending order.
    */
    @Test
    void testFiveElementListNotAscending() {
        List<Object> lst = List.of(1, 3, 2, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains six elements
    * that are not in ascending order.
    */
    @Test
    void testSixElementListNotAscending() {
        List<Object> lst = List.of(1, 3, 2, 4, 5, 6);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains seven elements
    * that are not in ascending order.
    */
    @Test
    void testSevenElementListNotAscending() {
        List<Object> lst = List.of(1, 3, 2, 4, 5, 6, 7);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains two elements
    * that are the same.
    */
    @Test
    void testTwoElementListSame() {
        List<Object> lst = List.of(1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains three elements
    * that are the same.
    */
    @Test
    void testThreeElementListSame() {
        List<Object> lst = List.of(1, 1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains four elements
    * that are the same.
    */
    @Test
    void testFourElementListSame() {
        List<Object> lst = List.of(1, 1, 1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains five elements
    * that are the same.
    */
    @Test
    void testFiveElementListSame() {
        List<Object> lst = List.of(1, 1, 1, 1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains six elements
    * that are the same.
    */
    @Test
    void testSixElementListSame() {
        List<Object> lst = List.of(1, 1, 1, 1, 1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns true if the list contains seven elements
    * that are the same.
    */
    @Test
    void testSevenElementListSame() {
        List<Object> lst = List.of(1, 1, 1, 1, 1, 1, 1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains two elements
    * that are the same and not in ascending order.
    */
    @Test
    void testTwoElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains three elements
    * that are the same and not in ascending order.
    */
    @Test
    void testThreeElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2, 3);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains four elements
    * that are the same and not in ascending order.
    */
    @Test
    void testFourElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains five elements
    * that are the same and not in ascending order.
    */
    @Test
    void testFiveElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains six elements
    * that are the same and not in ascending order.
    */
    @Test
    void testSixElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertFalse(IsSorted.isSorted(lst));
    }

    /**
    * Test that the method returns false if the list contains seven elements
    * that are the same and not in ascending order.
    */
    @Test
    void testSevenElementListSameNotAscending() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertFalse(IsSorted.isSorted(lst));
    }
}
