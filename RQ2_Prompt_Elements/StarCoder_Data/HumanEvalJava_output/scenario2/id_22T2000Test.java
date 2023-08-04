// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with a list containing only null values.
     */
    @Test
    void testFilterIntegersWithOnlyNullValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(null);
        values.add(null);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with a list containing only non-integer values.
     */
    @Test
    void testFilterIntegersWithOnlyNonIntegerValues() {
        List<Object> values = new ArrayList<Object>();
        values.add("a");
        values.add(1.0);
        values.add(true);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with a list containing only integer values.
     */
    @Test
    void testFilterIntegersWithOnlyIntegerValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with a list containing some integer values and some non-integer values.
     */
    @Test
    void testFilterIntegersWithSomeIntegerValuesAndSomeNonIntegerValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add("a");
        values.add(3);
        values.add(4);
        values.add(5.0);
        values.add(true);
        values.add(6);
        values.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(6);
        expected.add(7);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} method.
     * It tests the method with a list containing some integer values and some null values.
     */
    @Test
    void testFilterIntegersWithSomeIntegerValuesAndSomeNullValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(1);
        values.add(2);
        values.add(null);
        values.add(3);
        values.add(4);
        values.add(null);
        values.add(5);
        values.add(6);
        values.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }
}
