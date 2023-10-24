// FilterBySubstringTest.java
package original;

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
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list is empty.
    */
    @Test
    void testFilterBySubstring_emptyList() {
        List<Object> strings = new ArrayList<Object>();
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "a");
        assertEquals(0, result.size());
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains only one element.
    */
    @Test
    void testFilterBySubstring_listWithOneElement() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "a");
        assertEquals(1, result.size());
        assertEquals("abc", result.get(0));
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains multiple elements.
    */
    @Test
    void testFilterBySubstring_listWithMultipleElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("bacd");
        strings.add("cde");
        strings.add("array");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "a");
        assertEquals(3, result.size());
        assertEquals("abc", result.get(0));
        assertEquals("bacd", result.get(1));
        assertEquals("array", result.get(2));
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list is empty.
    */
    @Test
    void testFilterBySubstring_emptyList_withSubstring() {
        List<Object> strings = new ArrayList<Object>();
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "john");
        assertEquals(0, result.size());
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains multiple elements.
    */
    @Test
    void testFilterBySubstring_listWithMultipleElements_withSubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("xxy");
        strings.add("john doe");
        strings.add("xxxAAA");
        strings.add("xxx");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "xxx");
        assertEquals(3, result.size());
        assertEquals("xxx", result.get(0));
        assertEquals("xxxAAA", result.get(1));
        assertEquals("xxx", result.get(2));
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains multiple elements.
    */
    @Test
    void testFilterBySubstring_listWithMultipleElements_withSubstring_2() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("xxx");
        strings.add("asd");
        strings.add("aaaxxy");
        strings.add("john doe");
        strings.add("xxxAAA");
        strings.add("xxx");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "xx");
        assertEquals(4, result.size());
        assertEquals("xxx", result.get(0));
        assertEquals("aaaxxy", result.get(1));
        assertEquals("xxxAAA", result.get(2));
        assertEquals("xxx", result.get(3));
    }

    /**
    * Test case for {@link FilterBySubstring#filterBySubstring(List, String)} where the input list contains multiple elements.
    */
    @Test
    void testFilterBySubstring_listWithMultipleElements_withSubstring_3() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("grunt");
        strings.add("trumpet");
        strings.add("prune");
        strings.add("gruesome");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "run");
        assertEquals(2, result.size());
        assertEquals("grunt", result.get(0));
        assertEquals("prune", result.get(1));
    }
}
