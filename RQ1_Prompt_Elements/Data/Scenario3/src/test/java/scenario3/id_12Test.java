package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class LongestTest {
    @Test
    void testLongest() {
        List<Object> list = new ArrayList<>();
        assertEquals(null, Longest.longest(list));
        list.add("x");
        list.add("y");
        list.add("z");
        assertEquals("x", Longest.longest(list));
        list.add("yyy");
        list.add("zzzz");
        list.add("www");
        list.add("kkkk");
        list.add("abc");
        assertEquals("zzzz", Longest.longest(list));
    }
}