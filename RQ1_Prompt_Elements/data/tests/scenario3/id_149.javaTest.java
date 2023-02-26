package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedListSumTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("aa"), scenario3.SortedListSum.sortedListSum(Arrays.asList("aa", "a", "aaa")));
		assertEquals(Arrays.asList("AI", "asdf", "school"), scenario3.SortedListSum.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
		assertEquals(Arrays.asList(), scenario3.SortedListSum.sortedListSum(Arrays.asList("d", "b", "c", "a")));
		assertEquals(Arrays.asList("abcd", "dcba"), scenario3.SortedListSum.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));
		assertEquals(Arrays.asList("AI", "ai", "au"), scenario3.SortedListSum.sortedListSum(Arrays.asList("AI", "ai", "au")));
		assertEquals(Arrays.asList(), scenario3.SortedListSum.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
		assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), scenario3.SortedListSum.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));
		
    }

}