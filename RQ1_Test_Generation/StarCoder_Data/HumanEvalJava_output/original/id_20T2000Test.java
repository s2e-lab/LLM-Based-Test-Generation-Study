// FindClosestElementsTest.java
package original;

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
     */
    @Test
    void testFindClosestElements() {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.9);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.2);
        List<Double> expected = new ArrayList<Double>();
        expected.add(3.9);
        expected.add(4.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(5.9);
        numbers.add(4.0);
        numbers.add(5.0);
        expected.clear();
        expected.add(5.0);
        expected.add(5.9);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.2);
        expected.clear();
        expected.add(2.0);
        expected.add(2.2);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));

        numbers.clear();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.add(2.0);
        expected.clear();
        expected.add(2.0);
        expected.add(2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));

        numbers.clear();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.1);
        numbers.add(4.1);
        numbers.add(5.1);
        expected.clear();
        expected.add(2.2);
        expected.add(3.1);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }
}
