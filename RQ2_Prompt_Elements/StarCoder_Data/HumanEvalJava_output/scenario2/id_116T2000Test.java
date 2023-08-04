// SortArrayTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

    /**
     * Test case for {@link SortArray#sortArray(List)}.
     */
    @Test
    void testSortArray() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(0);
        arr.add(1);
        arr.add(10);
        arr.add(100);
        arr.add(1000);
        arr.add(10000);
        arr.add(100000);
        arr.add(1000000);
        arr.add(10000000);
        arr.add(100000000);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        expected.add(10);
        expected.add(100);
        expected.add(1000);
        expected.add(10000);
        expected.add(100000);
        expected.add(1000000);
        expected.add(10000000);
        expected.add(100000000);
        assertEquals(expected, SortArray.sortArray(arr));
    }
}
