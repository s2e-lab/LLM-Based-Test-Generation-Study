// RemoveDuplicatesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testRemoveDuplicatesWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing one element.
     */
    @Test
    void testRemoveDuplicatesWithListContainingOneElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing two elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingTwoElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing three elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingThreeElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing four elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingFourElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing five elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingFiveElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing six elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingSixElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing seven elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingSevenElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing eight elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingEightElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing nine elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingNineElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     * It tests the method with a list containing ten elements.
     */
    @Test
    void testRemoveDuplicatesWithListContainingTenElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }
}
