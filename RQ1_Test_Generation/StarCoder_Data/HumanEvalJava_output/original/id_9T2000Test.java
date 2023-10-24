// RollingMaxTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     */
    @Test
    void testRollingMax() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(4);
        expected.add(4);
        assertEquals(expected, RollingMax.rollingMax(numbers));
        numbers.clear();
        expected.clear();
        assertEquals(expected, RollingMax.rollingMax(numbers));
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, RollingMax.rollingMax(numbers));
        numbers.clear();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        expected.clear();
        expected.add(4);
        expected.add(4);
        expected.add(4);
        expected.add(4);
        assertEquals(expected, RollingMax.rollingMax(numbers));
        numbers.clear();
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(100);
        numbers.add(3);
        expected.clear();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(100);
        expected.add(100);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }
}
