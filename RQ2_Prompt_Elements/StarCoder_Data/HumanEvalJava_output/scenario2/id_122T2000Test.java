// AddElementsTest.java
package scenario2;

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
    */
    @Test
    void testAddElements() {
        List<Integer> arr = List.of(12, 345, 2, 6, 7896);
        int k = 3;
        int expected = 408;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements2() {
        List<Integer> arr = List.of(50, 40, 30, 20);
        int k = 3;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements3() {
        List<Integer> arr = List.of(91, 746, 24, 100, 98);
        int k = 4;
        int expected = 235;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements4() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 10;
        int expected = 55;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements5() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 1;
        int expected = 1;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements6() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 0;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements7() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int k = 11;
        int expected = 66;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements8() {
        List<Integer> arr = List.of(12, 345, 2, 6, 7896);
        int k = 1;
        int expected = 12;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements9() {
        List<Integer> arr = List.of(12, 345, 2, 6, 7896);
        int k = 2;
        int expected = 408;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link AddElements#addElements(List, int)}.
    */
    @Test
    void testAddElements10() {
        List<Integer> arr = List.of(12, 345, 2, 6, 7896);
        int k = 10;
        int expected = 12 + 345 + 2 + 6 + 7896;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }
}
