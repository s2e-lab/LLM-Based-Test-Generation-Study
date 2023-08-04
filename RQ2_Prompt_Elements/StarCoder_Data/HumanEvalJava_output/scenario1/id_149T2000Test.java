// SortedListSumTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    @Test
    void testSortedListSum() {
        List<String> lst = new ArrayList<String>();
        lst.add("123");
        lst.add("1234");
        lst.add("12345");
        lst.add("123456");
        lst.add("1234567");
        lst.add("12345678");
        lst.add("123456789");
        lst.add("1234567890");
        lst.add("12345678901");
        lst.add("123456789012");
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(result.get(0), "123456");
        assertEquals(result.get(1), "12345678");
        assertEquals(result.get(2), "1234567890");
        assertEquals(result.get(3), "123456789012");
    }
}
