// TotalMatchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

    /**
    * Test case number: 1
    * Test case values: [], []
    * Expected output (Post-state): []
    */
    @Test
    void test1() {
        List<Object> lst1 = List.of();
        List<Object> lst2 = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 2
    * Test case values: ["hi", "admin"], ["hI", "Hi"]
    * Expected output (Post-state): ["hI", "Hi"]
    */
    @Test
    void test2() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hI", "Hi");
        List<Object> expected = List.of("hI", "Hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 3
    * Test case values: ["hi", "admin"], ["hi", "hi", "admin", "project"]
    * Expected output (Post-state): ["hi", "admin"]
    */
    @Test
    void test3() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hi", "hi", "admin", "project");
        List<Object> expected = List.of("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 4
    * Test case values: ["4"], ["1", "2", "3", "4", "5"]
    * Expected output (Post-state): ["4"]
    */
    @Test
    void test4() {
        List<Object> lst1 = List.of("4");
        List<Object> lst2 = List.of("1", "2", "3", "4", "5");
        List<Object> expected = List.of("4");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 5
    * Test case values: ["hi", "admin"], ["hI", "hi", "hi"]
    * Expected output (Post-state): ["hI", "hi", "hi"]
    */
    @Test
    void test5() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hI", "hi", "hi");
        List<Object> expected = List.of("hI", "hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 6
    * Test case values: ["hi", "admin"], ["hI", "hi", "hii"]
    * Expected output (Post-state): ["hi", "admin"]
    */
    @Test
    void test6() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hI", "hi", "hii");
        List<Object> expected = List.of("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 7
    * Test case values: [], ["this"]
    * Expected output (Post-state): []
    */
    @Test
    void test7() {
        List<Object> lst1 = List.of();
        List<Object> lst2 = List.of("this");
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 8
    * Test case values: ["this"], []
    * Expected output (Post-state): []
    */
    @Test
    void test8() {
        List<Object> lst1 = List.of("this");
        List<Object> lst2 = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 9
    * Test case values: ["hi", "admin"], ["hI", "Hi"]
    * Expected output (Post-state): ["hI", "Hi"]
    */
    @Test
    void test9() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hI", "Hi");
        List<Object> expected = List.of("hI", "Hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }

    /**
    * Test case number: 10
    * Test case values: ["hi", "admin"], ["hI", "hi", "hi"]
    * Expected output (Post-state): ["hI", "hi", "hi"]
    */
    @Test
    void test10() {
        List<Object> lst1 = List.of("hi", "admin");
        List<Object> lst2 = List.of("hI", "hi", "hi");
        List<Object> expected = List.of("hI", "hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}
