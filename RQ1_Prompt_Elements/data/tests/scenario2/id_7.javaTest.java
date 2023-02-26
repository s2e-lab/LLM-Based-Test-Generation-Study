package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterBySubstringTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList(), "a"));
		assertEquals(Arrays.asList("abc", "bacd", "array"), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a"));
		assertEquals(Arrays.asList(), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList(), "john"));
		assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
		assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"), "xx"));
		assertEquals(Arrays.asList("grunt", "prune"), scenario2.FilterBySubstring.filterBySubstring(Arrays.asList("grunt", "trumpet", "prune", "gruesome"), "run"));
		
    }

}