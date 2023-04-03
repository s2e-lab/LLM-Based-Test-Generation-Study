// FindClosestElementsTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FindClosestElements}.
 * It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
 */
class FindClosestElementsTest {

    @Test
    void testFindClosestElements() {
        List<Double> numbers1 = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        List<Double> expected1 = Arrays.asList(3.9, 4.0);
        assertEquals(expected1, FindClosestElements.findClosestElements(numbers1));

        List<Double> numbers2 = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        List<Double> expected2 = Arrays.asList(5.0, 5.9);
        assertEquals(expected2, FindClosestElements.findClosestElements(numbers2));

        List<Double> numbers3 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected3 = Arrays.asList(2.0, 2.2);
        assertEquals(expected3, FindClosestElements.findClosestElements(numbers3));

        List<Double> numbers4 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expected4 = Arrays.asList(2.0, 2.0);
        assertEquals(expected4, FindClosestElements.findClosestElements(numbers4));

        List<Double> numbers5 = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        List<Double> expected5 = Arrays.asList(2.2, 3.1);
        assertEquals(expected5, FindClosestElements.findClosestElements(numbers5));

        List<Double> numbers6 = Arrays.asList(1.0, 2.0);
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers6));

        List<Double> numbers7 = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers7));

        List<Double> numbers8 = null;
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers8));

        List<Double> numbers9 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        List<Double> expected9 = Arrays.asList(9.0, 10.0);
        assertEquals(expected9, FindClosestElements.findClosestElements(numbers9));

        List<Double> numbers10 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.5);
        List<Double> expected10 = Arrays.asList(9.0, 9.5);
        assertEquals(expected10, FindClosestElements.findClosestElements(numbers10));
    }
}