// ByLengthTest.java
package original;

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
     * Test case for {@link ByLength#byLength(List)} where the array is empty.
     */
    @Test
    void testByLengthEmpty() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
     * Test case for {@link ByLength#byLength(List)} where the array has any strange number.
     */
    @Test
    void testByLengthStrange() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(-1);
        arr.add(55);
        List<Object> expected = new ArrayList<Object>();
        expected.add("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
     * Test case for {@link ByLength#byLength(List)} where the array has numbers from 1 to 9.
     */
    @Test
    void testByLengthNumbers() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(2);
        arr.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Eight");
        expected.add("Five");
        expected.add("Four");
        expected.add("Three");
        expected.add("Two");
        expected.add("Two");
        expected.add("One");
        expected.add("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
     * Test case for {@link ByLength#byLength(List)} where the array has numbers from 1 to 9.
     */
    @Test
    void testByLengthNumbers2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(9);
        arr.add(4);
        arr.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Nine");
        expected.add("Eight");
        expected.add("Four");
        assertEquals(expected, ByLength.byLength(arr));
    }
}
