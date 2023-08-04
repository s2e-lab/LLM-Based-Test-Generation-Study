// AddElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 24.
    */
    @Test
    void testAddElements1() {
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements2() {
        List<Integer> arr = List.of(111, 121, 3, 4000, 5, 6);
        int k = 2;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 125.
    */
    @Test
    void testAddElements3() {
        List<Integer> arr = List.of(11, 21, 3, 90, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 125;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 24.
    */
    @Test
    void testAddElements4() {
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 1.
    */
    @Test
    void testAddElements5() {
        List<Integer> arr = List.of(1);
        int k = 1;
        int expected = 1;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements6() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 1;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements7() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 2;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements8() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 3;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements9() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    * The expected result is 0.
    */
    @Test
    void testAddElements10() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = 5;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }
}
