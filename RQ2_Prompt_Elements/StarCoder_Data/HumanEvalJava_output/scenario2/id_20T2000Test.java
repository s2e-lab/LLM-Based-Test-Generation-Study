// FindClosestElementsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 2.
     */
    @Test
    void testFindClosestElementsWithListLength2() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 3.
     */
    @Test
    void testFindClosestElementsWithListLength3() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 4.
     */
    @Test
    void testFindClosestElementsWithListLength4() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 5.
     */
    @Test
    void testFindClosestElementsWithListLength5() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 6.
     */
    @Test
    void testFindClosestElementsWithListLength6() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 7.
     */
    @Test
    void testFindClosestElementsWithListLength7() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 8.
     */
    @Test
    void testFindClosestElementsWithListLength8() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 9.
     */
    @Test
    void testFindClosestElementsWithListLength9() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length 10.
     */
    @Test
    void testFindClosestElementsWithListLength10() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
        numbers.add(10.0);
        List<Double> result = FindClosestElements.findClosestElements(numbers);
        assertEquals(2, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
    }
}
