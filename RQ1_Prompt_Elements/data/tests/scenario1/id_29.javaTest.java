package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterByPrefixTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(), scenario1.FilterByPrefix.filterByPrefix(Arrays.asList(), 'a'));
		assertEquals(Arrays.asList('abc', 'array'), scenario1.FilterByPrefix.filterByPrefix(Arrays.asList('abc', 'bcd', 'cde', 'array'), 'a'));
		assertEquals(Arrays.asList(), scenario1.FilterByPrefix.filterByPrefix(Arrays.asList(), "john"));
		assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), scenario1.FilterByPrefix.filterByPrefix(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
		assertEquals(public static List<Object> filterByPrefix(List<Object> strings, String prefix) {, scenario1.FilterByPrefix.*/);
		
    }

}