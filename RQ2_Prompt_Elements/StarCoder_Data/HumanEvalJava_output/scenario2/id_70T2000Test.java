// StrangeSortListTest.java
package scenario2;

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
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with an empty list.
    */
    @Test
    void testStrangeSortListWithEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(lst, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers.
    */
    @Test
    void testStrangeSortListWithList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(10);
        expected.add(2);
        expected.add(9);
        expected.add(3);
        expected.add(8);
        expected.add(4);
        expected.add(7);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of strings.
    */
    @Test
    void testStrangeSortListWithList2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        lst.add("e");
        lst.add("f");
        lst.add("g");
        lst.add("h");
        lst.add("i");
        lst.add("j");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("j");
        expected.add("b");
        expected.add("i");
        expected.add("c");
        expected.add("h");
        expected.add("d");
        expected.add("g");
        expected.add("e");
        expected.add("f");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of mixed types.
    */
    @Test
    void testStrangeSortListWithList3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.add("c");
        lst.add(4);
        lst.add("d");
        lst.add(5);
        lst.add("e");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add("a");
        expected.add("e");
        expected.add("d");
        expected.add("c");
        expected.add("b");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithList4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.add("c");
        lst.add(4);
        lst.add("d");
        lst.add(5);
        lst.add("e");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add("a");
        expected.add("e");
        expected.add("d");
        expected.add("c");
        expected.add("b");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithList5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.add("c");
        lst.add(4);
        lst.add("d");
        lst.add(5);
        lst.add("e");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add("a");
        expected.add("e");
        expected.add("d");
        expected.add("c");
        expected.add("b");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithList6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.add("c");
        lst.add(4);
        lst.add("d");
        lst.add(5);
        lst.add("e");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add("a");
        expected.add("e");
        expected.add("d");
        expected.add("c");
        expected.add("b");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithList7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.add("c");
        lst.add(4);
        lst.add("d");
        lst.add(5);
        lst.add("e");
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add("a");
        expected.add("e");
        expected.add("d");
        expected.add("c");
        expected.add("b");
        assertEquals(expected, result);
    }

    /**
    * Test case for {@link StrangeSortList#strangeSortList(List)}.
    * It tests the method with a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithList8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add("a");
        lst.add(2);
        lst.add("b");
        lst.add(3);
        lst.