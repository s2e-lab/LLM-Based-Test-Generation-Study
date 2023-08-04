// StrangeSortListTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list is not empty.
    */
    @Test
    void testStrangeSortList() {
        List<Object> lst = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(1, 4, 2, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list is empty.
    */
    @Test
    void testStrangeSortListEmpty() {
        List<Object> lst = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains only one element.
    */
    @Test
    void testStrangeSortListOneElement() {
        List<Object> lst = List.of(5);
        List<Object> expected = List.of(5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains two elements.
    */
    @Test
    void testStrangeSortListTwoElements() {
        List<Object> lst = List.of(5, 6);
        List<Object> expected = List.of(5, 6);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains three elements.
    */
    @Test
    void testStrangeSortListThreeElements() {
        List<Object> lst = List.of(5, 6, 7);
        List<Object> expected = List.of(5, 7, 6);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains four elements.
    */
    @Test
    void testStrangeSortListFourElements() {
        List<Object> lst = List.of(5, 6, 7, 8);
        List<Object> expected = List.of(5, 8, 6, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains five elements.
    */
    @Test
    void testStrangeSortListFiveElements() {
        List<Object> lst = List.of(5, 6, 7, 8, 9);
        List<Object> expected = List.of(5, 9, 6, 8, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains six elements.
    */
    @Test
    void testStrangeSortListSixElements() {
        List<Object> lst = List.of(5, 6, 7, 8, 9, 1);
        List<Object> expected = List.of(5, 9, 6, 8, 7, 1);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains seven elements.
    */
    @Test
    void testStrangeSortListSevenElements() {
        List<Object> lst = List.of(5, 5, 5, 5);
        List<Object> expected = List.of(5, 5, 5, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains eight elements.
    */
    @Test
    void testStrangeSortListEightElements() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expected = List.of(1, 8, 2, 7, 3, 6, 4, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains nine elements.
    */
    @Test
    void testStrangeSortListNineElements() {
        List<Object> lst = List.of(0, 2, 2, 2, 5, 5, -5, -5);
        List<Object> expected = List.of(-5, 5, -5, 5, 0, 2, 2, 2);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * Tests that the method returns the correct list when the list contains ten elements.
    */
    @Test
    void testStrangeSortListTenElements() {
        List<Object> lst = List.of(111111);
        List<Object> expected = List.of(111111);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }
}
