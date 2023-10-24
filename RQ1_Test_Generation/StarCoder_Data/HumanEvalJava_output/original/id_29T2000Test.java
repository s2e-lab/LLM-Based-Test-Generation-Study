// FilterByPrefixTest.java
package original;

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
        assertEquals(0, result.size());
    }

    /**
     * Test case for a list with one element.
     */
    @Test
    void testFilterByPrefixOneElement() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("abc", result.get(0));
    }

    /**
     * Test case for a list with multiple elements.
     */
    @Test
    void testFilterByPrefixMultipleElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("bcd");
        strings.add("cde");
        strings.add("array");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(2, result.size());
        assertEquals("abc", result.get(0));
        assertEquals("array", result.get(1));
    }

    /**
     * Test case for an empty prefix.
     */
    @Test
    void testFilterByPrefixEmptyPrefix() {
        List<Object> strings = new ArrayList<Object>();
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "");
        assertEquals(0, result.size());
    }

    /**
     * Test case for a prefix that does not match any element.
     */
    @Test
    void testFilterByPrefixNoMatch() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("xxy");
        strings.add("<NAME>");
        strings.add("xxxAAA");
        strings.add("xxx");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "john");
        assertEquals(0, result.size());
    }

    /**
     * Test case for a prefix that matches some elements.
     */
    @Test
    void testFilterByPrefixMatch() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("xxy");
        strings.add("<NAME>");
        strings.add("xxxAAA");
        strings.add("xxx");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "xxx");
        assertEquals(3, result.size());
        assertEquals("xxx", result.get(0));
        assertEquals("xxxAAA", result.get(1));
        assertEquals("xxx", result.get(2));
    }
}
