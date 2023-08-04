// IncrListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list is empty.
     */
    @Test
    void testIncrListEmpty() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(l);
        assertTrue(result.isEmpty());
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list contains only integers.
     */
    @Test
    void testIncrListIntegers() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Object> result = IncrList.incrList(l);
        assertEquals(3, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list contains only strings.
     */
    @Test
    void testIncrListStrings() {
        List<Object> l = new ArrayList<Object>();
        l.add("a");
        l.add("b");
        l.add("c");
        List<Object> result = IncrList.incrList(l);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list contains integers and strings.
     */
    @Test
    void testIncrListMixed() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add("a");
        l.add(2);
        l.add("b");
        l.add(3);
        List<Object> result = IncrList.incrList(l);
        assertEquals(5, result.size());
        assertEquals(2, result.get(0));
        assertEquals("a", result.get(1));
        assertEquals(3, result.get(2));
        assertEquals("b", result.get(3));
        assertEquals(4, result.get(4));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list contains null values.
     */
    @Test
    void testIncrListNull() {
        List<Object> l = new ArrayList<Object>();
        l.add(null);
        l.add(null);
        l.add(null);
        List<Object> result = IncrList.incrList(l);
        assertEquals(3, result.size());
        assertNull(result.get(0));
        assertNull(result.get(1));
        assertNull(result.get(2));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the case when the list contains a mix of null and non-null values.
     */
    @Test
    void testIncrListMixedNull() {
        List<Object> l = new ArrayList<Object>();
        l.add(null);
        l.add(1);
        l.add(null);
        l.add("a");
        l.add(null);
        l.add(2);
        l.add(null);
        l.add("b");
        l.add(null);
        l.add(3);
        List<Object> result = IncrList.incrList(l);
        assertEquals(10, result.size());
        assertNull(result.get(0));
        assertEquals(2, result.get(1));
        assertNull(result.get(2));
        assertEquals("a", result.get(3));
        assertNull(result.get(4));
        assertEquals(3, result.get(5));
        assertNull(result.get(6));
        assertEquals("b", result.get(7));
        assertNull(result.get(8));
        assertEquals(4, result.get(9));
    }
}
