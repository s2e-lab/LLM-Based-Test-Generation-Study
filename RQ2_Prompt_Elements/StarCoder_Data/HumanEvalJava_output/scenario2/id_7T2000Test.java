// FilterBySubstringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

    /**
     * Test case for filtering an empty list of strings
     */
    @Test
    void testFilterBySubstringEmptyList() {
        List<Object> strings = new ArrayList<Object>();
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "a");
        assertEquals(0, result.size());
    }

    /**
     * Test case for filtering a list of strings for a substring that is not contained in any of the strings
     */
    @Test
    void testFilterBySubstringNonExistingSubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "d");
        assertEquals(0, result.size());
    }

    /**
     * Test case for filtering a list of strings for a substring that is contained in all of the strings
     */
    @Test
    void testFilterBySubstringExistingSubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "a");
        assertEquals(3, result.size());
    }

    /**
     * Test case for filtering a list of strings for a substring that is contained in some of the strings
     */
    @Test
    void testFilterBySubstringExistingSubstringSome() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "b");
        assertEquals(2, result.size());
    }

    /**
     * Test case for filtering a list of strings for a substring that is contained in some of the strings
     */
    @Test
    void testFilterBySubstringExistingSubstringSome2() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "c");
        assertEquals(1, result.size());
    }

    /**
     * Test case for filtering a list of strings for a substring that is contained in some of the strings
     */
    @Test
    void testFilterBySubstringExistingSubstringSome3() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "d");
        assertEquals(0, result.size());
    }
}
