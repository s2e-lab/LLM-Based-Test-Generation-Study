package scenario3;

import java.util.ArrayList;
import java.util.List;
import original.FilterByPrefix;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterByPrefixTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList(), "a"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("abc", "array"), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList("abc", "bcd", "cde", "array"), "a"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList(), "john"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), scenario3.FilterByPrefix.filterByPrefix(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
	}

	
}