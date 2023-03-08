package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestTest {

    @Test
    public void test() throws Exception {

        assertEquals("a", scenario3.Longest.longest(Arrays.asList("a", "b", "c")));
        assertEquals("ccc", scenario3.Longest.longest(Arrays.asList("a", "bb", "ccc")));
        assertEquals(null, scenario3.Longest.longest(Arrays.asList()));
        assertEquals("x", scenario3.Longest.longest(Arrays.asList("x", "y", "z")));
        assertEquals("zzzz", scenario3.Longest.longest(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc")));

    }

}