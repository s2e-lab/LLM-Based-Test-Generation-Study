// ByLengthTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array is null.
     */
    @Test
    void testByLengthNull() {
        List<Object> arr = null;
        List<Object> result = ByLength.byLength(arr);
        assertEquals(null, result);
    }

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array is empty.
     */
    @Test
    void testByLengthEmpty() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> result = ByLength.byLength(arr);
        assertEquals(0, result.size());
    }

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array contains only integers.
     */
    @Test
    void testByLengthIntegers() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(9, result.size());
        assertEquals("One", result.get(0));
        assertEquals("Two", result.get(1));
        assertEquals("Three", result.get(2));
        assertEquals("Four", result.get(3));
        assertEquals("Five", result.get(4));
        assertEquals("Six", result.get(5));
        assertEquals("Seven", result.get(6));
        assertEquals("Eight", result.get(7));
        assertEquals("Nine", result.get(8));
    }

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array contains only strings.
     */
    @Test
    void testByLengthStrings() {
        List<Object> arr = new ArrayList<Object>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");
        arr.add("Six");
        arr.add("Seven");
        arr.add("Eight");
        arr.add("Nine");
        List<Object> result = ByLength.byLength(arr);
        assertEquals(9, result.size());
        assertEquals("One", result.get(0));
        assertEquals("Two", result.get(1));
        assertEquals("Three", result.get(2));
        assertEquals("Four", result.get(3));
        assertEquals("Five", result.get(4));
        assertEquals("Six", result.get(5));
        assertEquals("Seven", result.get(6));
        assertEquals("Eight", result.get(7));
        assertEquals("Nine", result.get(8));
    }

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array contains both integers and strings.
     */
    @Test
    void testByLengthMixed() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("Two");
        arr.add(3);
        arr.add("Four");
        arr.add(5);
        arr.add("Six");
        arr.add(7);
        arr.add("Eight");
        arr.add(9);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(9, result.size());
        assertEquals("One", result.get(0));
        assertEquals("Two", result.get(1));
        assertEquals("Three", result.get(2));
        assertEquals("Four", result.get(3));
        assertEquals("Five", result.get(4));
        assertEquals("Six", result.get(5));
        assertEquals("Seven", result.get(6));
        assertEquals("Eight", result.get(7));
        assertEquals("Nine", result.get(8));
    }

    /**
     * Test case for the {@link ByLength#byLength(List)} method.
     * It tests the case where the input array contains integers and strings of different lengths.
     */
    @Test
    void testByLengthMixedDifferentLengths() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("Two");
        arr.add(3);
        arr.add("Four");
        arr.add(5);
        arr.add("Six");
        arr.add(7);
        arr.add("Eight");
        arr.add(9);
        arr.add("Ten");
        List<Object> result = ByLength.byLength(arr);
        assertEquals(10, result.size());
        assertEquals("One", result.get(0));
        assertEquals("Two", result.get(1));
        assertEquals("Three", result.get(2));
        assertEquals("Four", result.get(3));
        assertEquals("Five", result.get(4));
        assertEquals("Six", result.get(5));
        assertEquals("Seven", result.get(6));
        assertEquals("Eight", result.get(7));
        assertEquals("Nine", result.get(8));
        assertEquals("Ten", result.get(9));
    }
}
