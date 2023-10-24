// FilterByPrefixTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterByPrefix}.
* It contains ten unit test cases for the {@link FilterByPrefix#filterByPrefix(List, String)} method.
*/
class FilterByPrefixTest {

    @Test
    void testFilterByPrefix() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abc");
        assertEquals(10, result.size());
    }

    @Test
    void testFilterByPrefix2() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcd");
        assertEquals(9, result.size());
    }

    @Test
    void testFilterByPrefix3() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcde");
        assertEquals(8, result.size());
    }

    @Test
    void testFilterByPrefix4() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdef");
        assertEquals(7, result.size());
    }

    @Test
    void testFilterByPrefix5() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefg");
        assertEquals(6, result.size());
    }

    @Test
    void testFilterByPrefix6() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefgh");
        assertEquals(5, result.size());
    }

    @Test
    void testFilterByPrefix7() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefghi");
        assertEquals(4, result.size());
    }

    @Test
    void testFilterByPrefix8() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefghij");
        assertEquals(3, result.size());
    }

    @Test
    void testFilterByPrefix9() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefghijk");
        assertEquals(2, result.size());
    }

    @Test
    void testFilterByPrefix10() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abcdef");
        strings.add("abcdefg");
        strings.add("abcdefgh");
        strings.add("abcdefghi");
        strings.add("abcdefghij");
        strings.add("abcdefghijk");
        strings.add("abcdefghijkl");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "abcdefghijkl");
        assertEquals(1, result.size());
    }
}
