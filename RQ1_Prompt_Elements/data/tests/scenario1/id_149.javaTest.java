package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedListSumTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList("aa"), scenario1.SortedListSum.sortedListSum(Arrays.asList("aa", "a", "aaa")));
		assertEquals(Arrays.asList("AI", "asdf", "school"), scenario1.SortedListSum.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
		assertEquals(Arrays.asList(), scenario1.SortedListSum.sortedListSum(Arrays.asList("d", "b", "c", "a")));
		assertEquals(Arrays.asList("abcd", "dcba"), scenario1.SortedListSum.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));
		assertEquals(Arrays.asList("AI", "ai", "au"), scenario1.SortedListSum.sortedListSum(Arrays.asList("AI", "ai", "au")));
		assertEquals(Arrays.asList(), scenario1.SortedListSum.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
		assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), scenario1.SortedListSum.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));
		assertEquals(public static List<Object> sortedListSum(List<String> lst) {, scenario1.SortedListSum.*/);
		
    }

}