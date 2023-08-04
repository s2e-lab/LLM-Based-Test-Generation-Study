// MoveOneBallTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is empty.
    */
    @Test
    void testMoveOneBall_EmptyArray() {
        List<Object> arr = List.of();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty.
    */
    @Test
    void testMoveOneBall_NonEmptyArray() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is not sorted.
    */
    @Test
    void testMoveOneBall_NonSortedArray() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 10, 9);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted.
    */
    @Test
    void testMoveOneBall_SortedArray() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_2() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_3() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_4() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_5() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_6() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_7() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_8() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_9() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case for {@link MoveOneBall#moveOneBall(List)} where the given array is not empty and the array is sorted in reverse order.
    */
    @Test
    void testMoveOneBall_SortedArrayInReverseOrder_10() {
        List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }
}
