// IncrListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

    @Test
    void testIncrList() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Object> result = IncrList.incrList(l);
        assertEquals(11, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
    }

    @Test
    void testIncrList2() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        List<Object> result = IncrList.incrList(l);
        assertEquals(11, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
    }

    @Test
    void testIncrList3() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        l.add("b");
        List<Object> result = IncrList.incrList(l);
        assertEquals(12, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
        assertEquals("b", result.get(11));
    }

    @Test
    void testIncrList4() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        l.add("b");
        l.add("c");
        List<Object> result = IncrList.incrList(l);
        assertEquals(12, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
        assertEquals("b", result.get(11));
    }

    @Test
    void testIncrList5() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        List<Object> result = IncrList.incrList(l);
        assertEquals(12, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
        assertEquals("b", result.get(11));
    }

    @Test
    void testIncrList6() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        List<Object> result = IncrList.incrList(l);
        assertEquals(13, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
        assertEquals("b", result.get(11));
        assertEquals("c", result.get(12));
    }

    @Test
    void testIncrList7() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        List<Object> result = IncrList.incrList(l);
        assertEquals(13, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(6, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(8, result.get(6));
        assertEquals(9, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(11, result.get(9));
        assertEquals("a", result.get(10));
        assertEquals("b", result.get(11));
        assertEquals("c", result.get(12));
    }

    @Test
    void testIncrList8() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
       