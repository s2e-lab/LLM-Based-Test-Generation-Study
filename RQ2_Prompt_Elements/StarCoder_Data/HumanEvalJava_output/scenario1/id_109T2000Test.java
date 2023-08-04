// MoveOneBallTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list is empty.
    */
    @Test
    void testMoveOneBallEmptyList() {
        List<Object> arr = List.of();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has one element.
    */
    @Test
    void testMoveOneBallOneElementList() {
        List<Object> arr = List.of(1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has two elements.
    */
    @Test
    void testMoveOneBallTwoElementList() {
        List<Object> arr = List.of(1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has three elements.
    */
    @Test
    void testMoveOneBallThreeElementList() {
        List<Object> arr = List.of(1, 2, 3);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has four elements.
    */
    @Test
    void testMoveOneBallFourElementList() {
        List<Object> arr = List.of(1, 2, 3, 4);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has five elements.
    */
    @Test
    void testMoveOneBallFiveElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has six elements.
    */
    @Test
    void testMoveOneBallSixElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has seven elements.
    */
    @Test
    void testMoveOneBallSevenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has eight elements.
    */
    @Test
    void testMoveOneBallEightElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has nine elements.
    */
    @Test
    void testMoveOneBallNineElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has ten elements.
    */
    @Test
    void testMoveOneBallTenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has eleven elements.
    */
    @Test
    void testMoveOneBallElevenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has twelve elements.
    */
    @Test
    void testMoveOneBallTwelveElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has thirteen elements.
    */
    @Test
    void testMoveOneBallThirteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has fourteen elements.
    */
    @Test
    void testMoveOneBallFourteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has fifteen elements.
    */
    @Test
    void testMoveOneBallFifteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has sixteen elements.
    */
    @Test
    void testMoveOneBallSixteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has seventeen elements.
    */
    @Test
    void testMoveOneBallSeventeenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has eighteen elements.
    */
    @Test
    void testMoveOneBallEighteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the list has nineteen elements.
    */
    @Test
    void testMoveOneBallNineteenElementList() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
   