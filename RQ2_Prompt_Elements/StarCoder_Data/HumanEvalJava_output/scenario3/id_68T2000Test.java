// PluckTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array is empty.
    */
    @Test
    void testPluck_EmptyArray() {
        List<Object> arr = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only one element.
    */
    @Test
    void testPluck_SingleElementArray() {
        List<Object> arr = List.of(1);
        List<Object> expected = List.of(1, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only even elements.
    */
    @Test
    void testPluck_EvenElementsArray() {
        List<Object> arr = List.of(4, 2, 3);
        List<Object> expected = List.of(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only odd elements.
    */
    @Test
    void testPluck_OddElementsArray() {
        List<Object> arr = List.of(1, 2, 3);
        List<Object> expected = List.of(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only zeros.
    */
    @Test
    void testPluck_ZerosArray() {
        List<Object> arr = List.of(0, 0, 0);
        List<Object> expected = List.of(0, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only even and zeros.
    */
    @Test
    void testPluck_EvenAndZerosArray() {
        List<Object> arr = List.of(0, 0, 4, 0, 4, 2);
        List<Object> expected = List.of(0, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only odd and zeros.
    */
    @Test
    void testPluck_OddAndZerosArray() {
        List<Object> arr = List.of(0, 0, 1, 0, 5, 3);
        List<Object> expected = List.of(0, 3);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only even and odd elements.
    */
    @Test
    void testPluck_EvenAndOddElementsArray() {
        List<Object> arr = List.of(5, 4, 8, 4, 8);
        List<Object> expected = List.of(4, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only even and odd elements.
    */
    @Test
    void testPluck_EvenAndOddElementsArray2() {
        List<Object> arr = List.of(7, 6, 7, 1);
        List<Object> expected = List.of(6, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    /**
    * Test case for {@link Pluck#pluck(List)} where the given array has only even and odd elements.
    */
    @Test
    void testPluck_EvenAndOddElementsArray3() {
        List<Object> arr = List.of(7, 9, 7, 1);
        List<Object> expected = List.of();
        assertEquals(expected, Pluck.pluck(arr));
    }
}
