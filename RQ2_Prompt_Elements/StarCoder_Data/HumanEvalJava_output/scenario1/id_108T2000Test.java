// CountNumsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    /**
    * Test case for {@link CountNums#countNums(List)}.
    */
    @Test
    void testCountNums() {
        List<Object> arr1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(5, CountNums.countNums(arr1));
        List<Object> arr2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
        assertEquals(10, CountNums.countNums(arr2));
        List<Object> arr3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        assertEquals(10, CountNums.countNums(arr3));
        List<Object> arr4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
        assertEquals(9, CountNums.countNums(arr4));
        List<Object> arr5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 100);
        assertEquals(1, CountNums.countNums(arr5));
        List<Object> arr6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1000);
        assertEquals(0, CountNums.countNums(arr6));
        List<Object> arr7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10000);
        assertEquals(0, CountNums.countNums(arr7));
        List<Object> arr8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 100000);
        assertEquals(0, CountNums.countNums(arr8));
        List<Object> arr9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1000000);
        assertEquals(0, CountNums.countNums(arr9));
        List<Object> arr10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10000000);
        assertEquals(0, CountNums.countNums(arr10));
    }
}
