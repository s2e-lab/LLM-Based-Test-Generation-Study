package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FilterByPrefixTest {
    @Test
    void testFilterByPrefix() {
        List<Object> list = new ArrayList<Object>();
        list.add("abc");
        list.add("bcd");
        list.add("cde");
        list.add("array");
        assertEquals(FilterByPrefix.filterByPrefix(list, "a"), Arrays.asList("abc", "array"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "b"), Arrays.asList("bcd"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "c"), Arrays.asList("cde"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "d"), Arrays.asList());
        assertEquals(FilterByPrefix.filterByPrefix(list, "e"), Arrays.asList());
        assertEquals(FilterByPrefix.filterByPrefix(list, ""), Arrays.asList("abc", "bcd", "cde", "array"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "a"), Arrays.asList("abc", "array"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "b"), Arrays.asList("bcd"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "c"), Arrays.asList("cde"));
        assertEquals(FilterByPrefix.filterByPrefix(list, "d"), Arrays.asList());
        assertEquals(FilterByPrefix.filterByPrefix(list, "e"), Arrays.asList());
        assertEquals(FilterByPrefix.filterByPrefix(list, ""), Arrays.asList("abc", "bcd", "cde", "array"));
    }
}