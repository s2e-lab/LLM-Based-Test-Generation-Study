// GetPositiveTest.java
package scenario2;

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
     * Test case for the {@link GetPositive#getPositive(List)} method.
     */
    @Test
    void testGetPositive() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(-1);
        l.add(2);
        l.add(-2);
        l.add(3);
        l.add(-3);
        l.add(4);
        l.add(-4);
        l.add(5);
        l.add(-5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, GetPositive.getPositive(l));
    }
}
