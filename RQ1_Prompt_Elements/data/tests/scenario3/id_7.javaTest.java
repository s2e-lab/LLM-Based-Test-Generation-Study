package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterBySubstringTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList(), "a"));
		assertEquals(Arrays.asList("abc", "bacd", "array"), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a"));
		assertEquals(Arrays.asList(), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList(), "john"));
		assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
		assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"), "xx"));
		assertEquals(Arrays.asList("grunt", "prune"), scenario3.FilterBySubstring.filterBySubstring(Arrays.asList("grunt", "trumpet", "prune", "gruesome"), "run"));
		assertEquals(public static List<Object> filterBySubstring(List<Object> strings, String substring) {, scenario3.FilterBySubstring.*/);
		
    }

}