// MoveOneBallTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

    /**
    * Test case number: 1
    * Test case values: [3, 4, 5, 1, 2]
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test1() {
        List<Object> arr = List.of(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 2
    * Test case values: [3, 5, 10, 1, 2]
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test2() {
        List<Object> arr = List.of(3, 5, 10, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 3
    * Test case values: [4, 3, 1, 2]
    * Expected output (False):
    * It is not possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test3() {
        List<Object> arr = List.of(4, 3, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 4
    * Test case values: [3, 5, 4, 1, 2]
    * Expected output (False):
    * It is not possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test4() {
        List<Object> arr = List.of(3, 5, 4, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 5
    * Test case values: []
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test5() {
        List<Object> arr = List.of();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 6
    * Test case values: [3, 4, 5, 1, 2]
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test6() {
        List<Object> arr = List.of(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 7
    * Test case values: [3, 5, 10, 1, 2]
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test7() {
        List<Object> arr = List.of(3, 5, 10, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 8
    * Test case values: [4, 3, 1, 2]
    * Expected output (False):
    * It is not possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test8() {
        List<Object> arr = List.of(4, 3, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 9
    * Test case values: [3, 5, 4, 1, 2]
    * Expected output (False):
    * It is not possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test9() {
        List<Object> arr = List.of(3, 5, 4, 1, 2);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    /**
    * Test case number: 10
    * Test case values: []
    * Expected output (True):
    * It is possible to get non-decreasing order for the given array by performing any number of right shift operations.
    */
    @Test
    void test10() {
        List<Object> arr = List.of();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }
}
