// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns true if there are two numbers in the list that are closer
     * to each other than the given threshold.
     */
    @Test
    void testHasCloseElementsTrue() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if there are no two numbers in the list that are closer
     * to each other than the given threshold.
     */
    @Test
    void testHasCloseElementsFalse() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 2.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list is empty.
     */
    @Test
    void testHasCloseElementsEmptyList() {
        List<Double> numbers = List.of();
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only one number.
     */
    @Test
    void testHasCloseElementsSingleElementList() {
        List<Double> numbers = List.of(1.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only two numbers.
     */
    @Test
    void testHasCloseElementsTwoElementList() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only three numbers.
     */
    @Test
    void testHasCloseElementsThreeElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only four numbers.
     */
    @Test
    void testHasCloseElementsFourElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only five numbers.
     */
    @Test
    void testHasCloseElementsFiveElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only six numbers.
     */
    @Test
    void testHasCloseElementsSixElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only seven numbers.
     */
    @Test
    void testHasCloseElementsSevenElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only eight numbers.
     */
    @Test
    void testHasCloseElementsEightElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only nine numbers.
     */
    @Test
    void testHasCloseElementsNineElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
     * Test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
     * It checks if the method returns false if the list contains only ten numbers.
     */
    @Test
    void testHasCloseElementsTenElementList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }
}
