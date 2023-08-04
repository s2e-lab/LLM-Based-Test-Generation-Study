// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list is empty.
    */
    @Test
    void testIsSortedEmptyList() {
        List<Object> lst = List.of();
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has one element.
    */
    @Test
    void testIsSortedOneElementList() {
        List<Object> lst = List.of(1);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has two elements.
    */
    @Test
    void testIsSortedTwoElementList() {
        List<Object> lst = List.of(1, 2);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has three elements.
    */
    @Test
    void testIsSortedThreeElementList() {
        List<Object> lst = List.of(1, 2, 3);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has four elements.
    */
    @Test
    void testIsSortedFourElementList() {
        List<Object> lst = List.of(1, 2, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has five elements.
    */
    @Test
    void testIsSortedFiveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has six elements.
    */
    @Test
    void testIsSortedSixElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has seven elements.
    */
    @Test
    void testIsSortedSevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has eight elements.
    */
    @Test
    void testIsSortedEightElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has nine elements.
    */
    @Test
    void testIsSortedNineElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has ten elements.
    */
    @Test
    void testIsSortedTenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has eleven elements.
    */
    @Test
    void testIsSortedElevenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has twelve elements.
    */
    @Test
    void testIsSortedTwelveElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has thirteen elements.
    */
    @Test
    void testIsSortedThirteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has fourteen elements.
    */
    @Test
    void testIsSortedFourteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has fifteen elements.
    */
    @Test
    void testIsSortedFifteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has sixteen elements.
    */
    @Test
    void testIsSortedSixteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has seventeen elements.
    */
    @Test
    void testIsSortedSeventeenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has eighteen elements.
    */
    @Test
    void testIsSortedEighteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has nineteen elements.
    */
    @Test
    void testIsSortedNineteenElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertTrue(IsSorted.isSorted(lst));
    }

    /**
    * Test case for {@link IsSorted#isSorted(List)} where the list has twenty elements.
    */
    @Test
    void testIsSortedTwentyElementList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 