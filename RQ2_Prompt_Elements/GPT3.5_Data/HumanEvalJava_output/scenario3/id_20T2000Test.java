// FindClosestElements.java
package scenario3;

import java.util.Collections;
import java.util.List;

class FindClosestElements {

    /**
     * From a supplied list of numbers (of length at least two) select and return two that are the closest to each
     * other and return them in order (smaller number, larger number).
     *
     * > findClosestElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2])
     * [3.9, 4.0]
     * > findClosestElements([1.0, 2.0, 5.9, 4.0, 5.0])
     * [5.0, 5.9]
     * > findClosestElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
     * [2.0, 2.2]
     * > findClosestElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
     * [2.0, 2.0]
     * > findClosestElements([1.1, 2.2, 3.1, 4.1, 5.1])
     * [2.2, 3.1]
     */
    public static List<Double> findClosestElements(List<Double> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }
        Collections.sort(numbers);
        double minDiff = Double.MAX_VALUE;
        int index1 = 0;
        int index2 = 1;
        for (int i = 1; i < numbers.size(); i++) {
            double diff = numbers.get(i) - numbers.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                index1 = i - 1;
                index2 = i;
            }
        }
        return List.of(numbers.get(index1), numbers.get(index2));
    }
}

// FindClosestElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    @Test
    void testFindClosestElements() {
        List<Double> numbers1 = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        List<Double> expected1 = List.of(3.9, 4.0);
        assertEquals(expected1, FindClosestElements.findClosestElements(numbers1));

        List<Double> numbers2 = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        List<Double> expected2 = List.of(5.0, 5.9);
        assertEquals(expected2, FindClosestElements.findClosestElements(numbers2));

        List<Double> numbers3 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected3 = List.of(2.0, 2.2);
        assertEquals(expected3, FindClosestElements.findClosestElements(numbers3));

        List<Double> numbers4 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expected4 = List.of(2.0, 2.0);
        assertEquals(expected4, FindClosestElements.findClosestElements(numbers4));

        List<Double> numbers5 = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        List<Double> expected5 = List.of(2.2, 3.1);
        assertEquals(expected5, FindClosestElements.findClosestElements(numbers5));

        List<Double> numbers6 = List.of(1.0, 2.0);
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers6));

        List<Double> numbers7 = List.of(1.0);
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers7));

        List<Double> numbers8 = List.of();
        assertThrows(IllegalArgumentException.class, () -> FindClosestElements.findClosestElements(numbers8));

        List<Double> numbers9 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        List<Double> expected9 = List.of(9.0, 10.0);
        assertEquals(expected9, FindClosestElements.findClosestElements(numbers9));

        List<Double> numbers10 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.5);
        List<Double> expected10 = List.of(9.0, 9.5);
        assertEquals(expected10, FindClosestElements.findClosestElements(numbers10));
    }
}