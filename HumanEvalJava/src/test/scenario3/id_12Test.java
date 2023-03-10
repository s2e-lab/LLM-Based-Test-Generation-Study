package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestTest {
    @Test
	public void test1() throws Exception {
		assertEquals("a", scenario3.Longest.longest(Arrays.asList("a", "b", "c")));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ccc", scenario3.Longest.longest(Arrays.asList("a", "bb", "ccc")));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(null, scenario3.Longest.longest(Arrays.asList()));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("x", scenario3.Longest.longest(Arrays.asList("x", "y", "z")));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("zzzz", scenario3.Longest.longest(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc")));
	}

	
}