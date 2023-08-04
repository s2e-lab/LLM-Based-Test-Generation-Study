// StrangeSortListTest.java
package scenario1;

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
    * Test case for sorting a list of integers.
    */
    @Test
    void testStrangeSortList() {
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
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(10, result.get(9));
        assertEquals(2, result.get(1));
        assertEquals(9, result.get(8));
        assertEquals(3, result.get(2));
        assertEquals(8, result.get(7));
        assertEquals(4, result.get(3));
        assertEquals(7, result.get(6));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }

    /**
    * Test case for sorting a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithStrings() {
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
        assertEquals(20, result.size());
        assertEquals(1, result.get(0));
        assertEquals(10, result.get(9));
        assertEquals(2, result.get(1));
        assertEquals(9, result.get(8));
        assertEquals(3, result.get(2));
        assertEquals(8, result.get(7));
        assertEquals(4, result.get(3));
        assertEquals(7, result.get(6));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals("a", result.get(10));
        assertEquals("j", result.get(19));
        assertEquals("b", result.get(11));
        assertEquals("i", result.get(18));
        assertEquals("c", result.get(12));
        assertEquals("h", result.get(17));
        assertEquals("d", result.get(13));
        assertEquals("g", result.get(16));
        assertEquals("e", result.get(14));
        assertEquals("f", result.get(15));
    }

    /**
    * Test case for sorting a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithStringsAndNulls() {
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
        lst.add(null);
        lst.add(null);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(22, result.size());
        assertEquals(1, result.get(0));
        assertEquals(10, result.get(9));
        assertEquals(2, result.get(1));
        assertEquals(9, result.get(8));
        assertEquals(3, result.get(2));
        assertEquals(8, result.get(7));
        assertEquals(4, result.get(3));
        assertEquals(7, result.get(6));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals("a", result.get(10));
        assertEquals("j", result.get(19));
        assertEquals("b", result.get(11));
        assertEquals("i", result.get(18));
        assertEquals("c", result.get(12));
        assertEquals("h", result.get(17));
        assertEquals("d", result.get(13));
        assertEquals("g", result.get(16));
        assertEquals("e", result.get(14));
        assertEquals("f", result.get(15));
        assertEquals(null, result.get(20));
        assertEquals(null, result.get(21));
    }

    /**
    * Test case for sorting a list of integers and strings.
    */
    @Test
    void testStrangeSortListWithStringsAndNullsAndDuplicates() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.