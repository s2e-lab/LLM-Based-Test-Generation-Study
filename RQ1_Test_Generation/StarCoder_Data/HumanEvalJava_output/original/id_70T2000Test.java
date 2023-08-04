// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

    /**
    * Test case number: 1
    * Test case values: [1, 2, 3, 4]
    */
    @Test
    void test1() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 2
    * Test case values: [5, 5, 5, 5]
    */
    @Test
    void test2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 3
    * Test case values: []
    */
    @Test
    void test3() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 4
    * Test case values: [1, 2, 3, 4, 5]
    */
    @Test
    void test4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 5
    * Test case values: [5, 6, 7, 8, 9]
    */
    @Test
    void test5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(9);
        expected.add(6);
        expected.add(8);
        expected.add(7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 6
    * Test case values: [1, 2, 3, 4, 5]
    */
    @Test
    void test6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 7
    * Test case values: [5, 6, 7, 8, 9, 1]
    */
    @Test
    void test7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(9);
        expected.add(5);
        expected.add(8);
        expected.add(6);
        expected.add(7);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 8
    * Test case values: [5, 5, 5, 5]
    */
    @Test
    void test8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(5);
        expected.add(5);
        expected.add(5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 9
    * Test case values: []
    */
    @Test
    void test9() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 10
    * Test case values: [1, 2, 3, 4, 5, 6, 7, 8]
    */
    @Test
    void test10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(8);
        expected.add(2);
        expected.add(7);
        expected.add(3);
        expected.add(6);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 11
    * Test case values: [0, 2, 2, 2, 5, 5, -5, -5]
    */
    @Test
    void test11() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        lst.add(2);
        lst.add(2);
        lst.add(2);
        lst.add(5);
        lst.add(5);
        lst.add(-5);
        lst.add(-5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-5);
        expected.add(5);
        expected.add(-5);
        expected.add(5);
        expected.add(0);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }

    /**
    * Test case number: 12
    * Test case values: [111111]
    */
    @Test
    void test12() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(111111);
        List<Object> expected = new ArrayList<Object>();
        expected.add(111111);
        assertEquals(expected, StrangeSortList.strangeSortList(lst));
    }
}
