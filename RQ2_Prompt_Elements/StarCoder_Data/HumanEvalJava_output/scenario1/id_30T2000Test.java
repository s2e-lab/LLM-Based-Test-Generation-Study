// GetPositiveTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    @Test
    void testGetPositive() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(-1);
        l.add(0);
        l.add(10);
        l.add(-10);
        l.add(100);
        l.add(-100);
        l.add(1000);
        l.add(-1000);
        l.add(10000);
        l.add(-10000);
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(result.size(), 5);
        assertEquals(result.get(0), 1);
        assertEquals(result.get(1), 10);
        assertEquals(result.get(2), 100);
        assertEquals(result.get(3), 1000);
        assertEquals(result.get(4), 10000);
    }
}
