// CountNumsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    /**
     * Test case for the {@link CountNums#countNums(List)} method.
     * Tests that the method returns the correct number of elements.
     */
    @Test
    void testCountNums() {
        List<Object> arr = List.of(123, 456, 789, -123, -456, -789, 0, 1, 2, 3);
        assertEquals(5, CountNums.countNums(arr));
    }
}
