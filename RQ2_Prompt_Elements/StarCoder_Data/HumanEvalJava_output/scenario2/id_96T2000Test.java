// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

    /**
     * Test case for {@link CountUpTo#countUpTo(int)}.
     */
    @Test
    void testCountUpTo() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        expected.add(29);
        assertEquals(expected, CountUpTo.countUpTo(30));
    }
}
