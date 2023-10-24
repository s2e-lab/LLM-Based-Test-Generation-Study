// FilterBySubstringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {

    @Test
    void testFilterBySubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "Java");
        assertEquals(1, result.size());
        assertEquals("Java", result.get(0));
    }

    @Test
    void testFilterBySubstring2() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "C");
        assertEquals(3, result.size());
        assertEquals("C", result.get(0));
        assertEquals("C++", result.get(1));
        assertEquals("C#", result.get(2));
    }

    @Test
    void testFilterBySubstring3() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "C#");
        assertEquals(1, result.size());
        assertEquals("C#", result.get(0));
    }

    @Test
    void testFilterBySubstring4() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "Ruby");
        assertEquals(1, result.size());
        assertEquals("Ruby", result.get(0));
    }

    @Test
    void testFilterBySubstring5() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "PHP");
        assertEquals(1, result.size());
        assertEquals("PHP", result.get(0));
    }

    @Test
    void testFilterBySubstring6() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "JavaScript");
        assertEquals(1, result.size());
        assertEquals("JavaScript", result.get(0));
    }

    @Test
    void testFilterBySubstring7() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "Hello");
        assertEquals(1, result.size());
        assertEquals("Hello", result.get(0));
    }

    @Test
    void testFilterBySubstring8() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "World");
        assertEquals(1, result.size());
        assertEquals("World", result.get(0));
    }

    @Test
    void testFilterBySubstring9() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "Python");
        assertEquals(1, result.size());
        assertEquals("Python", result.get(0));
    }

    @Test
    void testFilterBySubstring10() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        strings.add("C");
        strings.add("C#");
        strings.add("Ruby");
        strings.add("PHP");
        strings.add("JavaScript");
        List<Object> result = FilterBySubstring.filterBySubstring(strings, "C++");
        assertEquals(1, result.size());
        assertEquals("C++", result.get(0));
    }
}
