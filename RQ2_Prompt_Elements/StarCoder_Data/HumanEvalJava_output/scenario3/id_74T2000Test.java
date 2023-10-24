// TotalMatchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * The first list is empty.
    */
    @Test
    void testTotalMatch1() {
        List<Object> lst1 = List.of();
        List<Object> lst2 = List.of("this", "is", "a", "test");
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * The second list is empty.
    */
    @Test
    void testTotalMatch2() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists are empty.
    */
    @Test
    void testTotalMatch3() {
        List<Object> lst1 = List.of();
        List<Object> lst2 = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have the same number of chars.
    */
    @Test
    void testTotalMatch4() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch5() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch6() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch7() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch8() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch9() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case for {@link TotalMatch#totalMatch(List, List)}.
    * Both lists have different number of chars.
    */
    @Test
    void testTotalMatch10() {
        List<Object> lst1 = List.of("this", "is", "a", "test");
        List<Object> lst2 = List.of("this", "is", "a", "test", "this");
        List<Object> expected = List.of("this", "is", "a", "test");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}
