// MoveOneBallTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MoveOneBall}.
 * It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
 */
class MoveOneBallTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Arrays.asList();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSingleElementList() {
        List<Object> arr = Arrays.asList(1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSortedArray() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArray() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts() {
        List<Object> arr = Arrays.asList(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts2() {
        List<Object> arr = Arrays.asList(3, 5, 10, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts3() {
        List<Object> arr = Arrays.asList(5, 1, 2, 3, 4);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts4() {
        List<Object> arr = Arrays.asList(10, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts5() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts6() {
        List<Object> arr = Arrays.asList(4, 3, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testNonDecreasingArrayWithShifts7() {
        List<Object> arr = Arrays.asList(3, 5, 4, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }
}