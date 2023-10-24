// FilterByPrefixTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

    /**
     * Test case for an empty list.
     */
    @Test
    void testFilterByPrefixEmptyList() {
        List<Object> strings = new ArrayList<Object>();
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for a list with one element.
     */
    @Test
    void testFilterByPrefixOneElement() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with two elements.
     */
    @Test
    void testFilterByPrefixTwoElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with three elements.
     */
    @Test
    void testFilterByPrefixThreeElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with four elements.
     */
    @Test
    void testFilterByPrefixFourElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with five elements.
     */
    @Test
    void testFilterByPrefixFiveElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with six elements.
     */
    @Test
    void testFilterByPrefixSixElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with seven elements.
     */
    @Test
    void testFilterByPrefixSevenElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with eight elements.
     */
    @Test
    void testFilterByPrefixEightElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with nine elements.
     */
    @Test
    void testFilterByPrefixNineElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");
        strings.add("i");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    /**
     * Test case for a list with ten elements.
     */
    @Test
    void testFilterByPrefixTenElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");
        strings.add("i");
        strings.add("j");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }
}
