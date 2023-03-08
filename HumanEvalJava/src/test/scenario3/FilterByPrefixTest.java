package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterByPrefixTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList(), "a"));
        assertEquals(Arrays.asList("abc", "array"), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList("abc", "bcd", "cde", "array"), "a"));
        assertEquals(Arrays.asList(), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList(), "john"));
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));

    }

}