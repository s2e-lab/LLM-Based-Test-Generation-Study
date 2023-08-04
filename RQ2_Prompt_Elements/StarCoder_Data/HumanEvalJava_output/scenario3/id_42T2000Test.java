// IncrListTest.java
package scenario3;

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
     * It tests the method with an empty list.
     */
    @Test
    void testIncrListEmptyList() {
        List<Object> l = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength3() {
        List<Object> l = List.of(1, 2, 3);
        List<Object> expected = List.of(2, 3, 4);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength10() {
        List<Object> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 4, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength32() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength102() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength33() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength103() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength34() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength104() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength35() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength105() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength36() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength106() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength37() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testIncrListLength107() {
        List<Object> l = List.of(5, 2, 5, 2, 3, 3, 9, 0, 123);
        List<Object> expected = List.of(6, 3, 6, 3, 4, 4, 10, 1, 124);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testIncrListLength38() {
        List<Object> l = List.of(3, 2, 1);
        List<Object> expected = List.of(4, 3, 2);
        assertEquals(expected, IncrList.incrList(l));
    }

    /**
     * Test case for the {@link IncrList#incrList(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test