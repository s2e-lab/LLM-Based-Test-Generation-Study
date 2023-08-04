// GetPositiveTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    /**
    * Test case for {@link GetPositive#getPositive(List)}.
    */
    @Test
    void testGetPositive() {
        List<Object> l1 = new ArrayList<Object>();
        l1.add(-1);
        l1.add(2);
        l1.add(-4);
        l1.add(5);
        l1.add(6);
        List<Object> expected1 = new ArrayList<Object>();
        expected1.add(2);
        expected1.add(5);
        expected1.add(6);
        assertEquals(expected1, GetPositive.getPositive(l1));

        List<Object> l2 = new ArrayList<Object>();
        l2.add(5);
        l2.add(3);
        l2.add(-5);
        l2.add(2);
        l2.add(-3);
        l2.add(3);
        l2.add(9);
        l2.add(0);
        l2.add(123);
        l2.add(1);
        l2.add(-10);
        List<Object> expected2 = new ArrayList<Object>();
        expected2.add(5);
        expected2.add(3);
        expected2.add(2);
        expected2.add(3);
        expected2.add(9);
        expected2.add(123);
        expected2.add(1);
        assertEquals(expected2, GetPositive.getPositive(l2));

        List<Object> l3 = new ArrayList<Object>();
        l3.add(-1);
        l3.add(-2);
        List<Object> expected3 = new ArrayList<Object>();
        assertEquals(expected3, GetPositive.getPositive(l3));

        List<Object> l4 = new ArrayList<Object>();
        List<Object> expected4 = new ArrayList<Object>();
        assertEquals(expected4, GetPositive.getPositive(l4));
    }
}
