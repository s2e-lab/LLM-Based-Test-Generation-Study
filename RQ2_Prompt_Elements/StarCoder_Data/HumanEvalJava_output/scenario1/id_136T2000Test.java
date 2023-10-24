// LargestSmallestIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

    /**
    * Test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
    */
    @Test
    void testLargestSmallestIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-1);
        lst.add(-2);
        lst.add(-3);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(-3, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }
}
