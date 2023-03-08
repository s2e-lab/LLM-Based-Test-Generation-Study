package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseDeleteTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("bcd", false), scenario3.ReverseDelete.reverseDelete("abcde", "ae"));
        assertEquals(Arrays.asList("acdef", false), scenario3.ReverseDelete.reverseDelete("abcdef", "b"));
        assertEquals(Arrays.asList("cdedc", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", "ab"));
        assertEquals(Arrays.asList("dik", false), scenario3.ReverseDelete.reverseDelete("dwik", "w"));
        assertEquals(Arrays.asList("", true), scenario3.ReverseDelete.reverseDelete("a", "a"));
        assertEquals(Arrays.asList("abcdedcba", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", ""));
        assertEquals(Arrays.asList("abcdedcba", true), scenario3.ReverseDelete.reverseDelete("abcdedcba", "v"));
        assertEquals(Arrays.asList("abba", true), scenario3.ReverseDelete.reverseDelete("vabba", "v"));
        assertEquals(Arrays.asList("", true), scenario3.ReverseDelete.reverseDelete("mamma", "mia"));

    }

}