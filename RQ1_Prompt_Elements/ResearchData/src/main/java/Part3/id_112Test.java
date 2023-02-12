package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ReverseDeleteTest {
    @Test
    void test1() {
        assertEquals(Arrays.asList("bcd", false), ReverseDelete.reverseDelete("abcde", "ae"));
    }
    @Test
    void test2() {
        assertEquals(Arrays.asList("acdef", false), ReverseDelete.reverseDelete("abcdef", "b"));
    }
    @Test
    void test3() {
        assertEquals(Arrays.asList("cdedc", true), ReverseDelete.reverseDelete("abcdedcba", "ab"));
    }
    @Test
    void test4() {
        assertEquals(Arrays.asList("dik", false), ReverseDelete.reverseDelete("dwik", "w"));
    }
    @Test
    void test5() {
        assertEquals(Arrays.asList("", true), ReverseDelete.reverseDelete("a", "a"));
    }
    @Test
    void test6() {
        assertEquals(Arrays.asList("abcdedcba", true), ReverseDelete.reverseDelete("abcdedcba", ""));
    }
    @Test
    void test7() {
        assertEquals(Arrays.asList("abcdedcba", true), ReverseDelete.reverseDelete("abcdedcba", "v"));
    }
    @Test
    void test8() {
        assertEquals(Arrays.asList("abba", true), ReverseDelete.reverseDelete("vabba", "v"));
    }
    @Test
    void test9() {
        assertEquals(Arrays.asList("", true), ReverseDelete.reverseDelete("mamma", "mia"));
    }
    @Test
    void test10() {
        assertEquals(Arrays.asList("", true), ReverseDelete.reverseDelete("", ""));
    }
}