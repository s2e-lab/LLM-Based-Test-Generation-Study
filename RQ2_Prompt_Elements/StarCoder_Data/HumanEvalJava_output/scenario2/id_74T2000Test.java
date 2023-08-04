// TotalMatchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the two lists have the same number of chars.
     */
    @Test
    void testTotalMatch1() {
        List<Object> lst1 = List.of("abc", "def", "ghi");
        List<Object> lst2 = List.of("abc", "def", "ghi");
        List<Object> expected = List.of("abc", "def", "ghi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has more chars than the second list.
     */
    @Test
    void testTotalMatch2() {
        List<Object> lst1 = List.of("abc", "def", "ghi");
        List<Object> lst2 = List.of("abc", "def");
        List<Object> expected = List.of("abc", "def");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has less chars than the second list.
     */
    @Test
    void testTotalMatch3() {
        List<Object> lst1 = List.of("abc", "def");
        List<Object> lst2 = List.of("abc", "def", "ghi");
        List<Object> expected = List.of("abc", "def");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has more chars than the second list.
     */
    @Test
    void testTotalMatch4() {
        List<Object> lst1 = List.of("abc", "def", "ghi");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl");
        List<Object> expected = List.of("abc", "def", "ghi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has less chars than the second list.
     */
    @Test
    void testTotalMatch5() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl");
        List<Object> lst2 = List.of("abc", "def", "ghi");
        List<Object> expected = List.of("abc", "def", "ghi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has more chars than the second list.
     */
    @Test
    void testTotalMatch6() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl", "mno");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has less chars than the second list.
     */
    @Test
    void testTotalMatch7() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl", "mno");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has more chars than the second list.
     */
    @Test
    void testTotalMatch8() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl", "mno");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl", "mno");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has less chars than the second list.
     */
    @Test
    void testTotalMatch9() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl", "mno");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl", "mno");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has more chars than the second list.
     */
    @Test
    void testTotalMatch10() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
     * Test case for the {@link TotalMatch#totalMatch(List, List)} method.
     * It tests the case when the first list has less chars than the second list.
     */
    @Test
    void testTotalMatch11() {
        List<Object> lst1 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu");
        List<Object> lst2 = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        List<Object> expected = List.of("abc", "def", "ghi", "jkl", "mno", "pqr");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}
