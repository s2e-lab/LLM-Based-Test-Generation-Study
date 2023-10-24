// SortThirdTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

    /**
    * Test case for the {@link SortThird#sortThird(List)} method.
    */
    @Test
    void testSortThird() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(4);
        l2.add(7);
        l2.add(10);
        l2.add(2);
        l2.add(5);
        l2.add(8);
        l2.add(3);
        l2.add(6);
        assertEquals(l2, SortThird.sortThird(l));
    }
}
