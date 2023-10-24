// TotalMatchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

    @Test
    void test1() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c");
        List<Object> expected = List.of("a", "b", "c");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test2() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d");
        List<Object> expected = List.of("a", "b", "c", "d");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test3() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e");
        List<Object> expected = List.of("a", "b", "c", "d", "e");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test4() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test5() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test6() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test7() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test8() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test9() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    @Test
    void test10() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
        List<Object> expected = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}
