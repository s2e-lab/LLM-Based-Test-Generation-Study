package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import original.SortedListSum;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedListSumTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("aa"), scenario3.SortedListSum.sortedListSum(Arrays.asList("aa", "a", "aaa")));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("AI", "asdf", "school"), scenario3.SortedListSum.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(), scenario3.SortedListSum.sortedListSum(Arrays.asList("d", "b", "c", "a")));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("abcd", "dcba"), scenario3.SortedListSum.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("AI", "ai", "au"), scenario3.SortedListSum.sortedListSum(Arrays.asList("AI", "ai", "au")));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(), scenario3.SortedListSum.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), scenario3.SortedListSum.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));
	}

	
}