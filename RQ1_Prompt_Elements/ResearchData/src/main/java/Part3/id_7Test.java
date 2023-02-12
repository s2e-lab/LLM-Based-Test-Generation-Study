package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FilterBySubstringTest {
    @Test
    void testFilterBySubstring() {
        List<Object> list = new ArrayList<Object>();
        list.add("abc");
        list.add("bacd");
        list.add("cde");
        list.add("array");
        assertEquals(FilterBySubstring.filterBySubstring(list, "a"), Arrays.asList("abc", "bacd", "array"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "b"), Arrays.asList("abc", "bacd"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "c"), Arrays.asList("abc", "bacd", "cde"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "d"), Arrays.asList("bacd"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "e"), Arrays.asList("cde"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "r"), Arrays.asList("array"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "y"), Arrays.asList("array"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "z"), Arrays.asList());
        assertEquals(FilterBySubstring.filterBySubstring(list, ""), Arrays.asList("abc", "bacd", "cde", "array"));
        assertEquals(FilterBySubstring.filterBySubstring(list, "ab"), Arrays.asList("abc", "bacd"));
    }
}