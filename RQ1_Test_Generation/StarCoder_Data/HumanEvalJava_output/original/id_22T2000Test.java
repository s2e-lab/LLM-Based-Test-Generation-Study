// FilterIntegersTest.java
package original;

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
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list contains only integers.
     */
    @Test
    void testFilterIntegersWithIntegers() {
        List<Object> values = new ArrayList<Object>();
        values.add(5);
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list contains integers and other values.
     */
    @Test
    void testFilterIntegersWithIntegersAndOtherValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(5);
        values.add(1);
        values.add(2);
        values.add(3);
        values.add("abc");
        values.add(new Object());
        values.add(new ArrayList<Object>());
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list is empty.
     */
    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list contains only other values.
     */
    @Test
    void testFilterIntegersWithOtherValues() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Object());
        values.add(new ArrayList<Object>());
        values.add(new Object());
        values.add(new ArrayList<Object>());
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list contains integers and other values.
     */
    @Test
    void testFilterIntegersWithIntegersAndOtherValues2() {
        List<Object> values = new ArrayList<Object>();
        values.add(4);
        values.add(new Object());
        values.add(new ArrayList<Object>());
        values.add(23.2);
        values.add(9);
        values.add("adasd");
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(9);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)} where the given list contains integers and other values.
     */
    @Test
    void testFilterIntegersWithIntegersAndOtherValues3() {
        List<Object> values = new ArrayList<Object>();
        values.add(3);
        values.add("c");
        values.add(3);
        values.add(3);
        values.add("a");
        values.add("b");
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }
}
