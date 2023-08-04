// HasCloseElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers is null.
    */
    @Test
    void testHasCloseElementsNullList() {
        List<Double> numbers = null;
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers is empty.
    */
    @Test
    void testHasCloseElementsEmptyList() {
        List<Double> numbers = List.of();
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the threshold is null.
    */
    @Test
    void testHasCloseElementsNullThreshold() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = null;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the threshold is negative.
    */
    @Test
    void testHasCloseElementsNegativeThreshold() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = -0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the threshold is zero.
    */
    @Test
    void testHasCloseElementsZeroThreshold() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.0;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the threshold is positive.
    */
    @Test
    void testHasCloseElementsPositiveThreshold() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains only one number.
    */
    @Test
    void testHasCloseElementsSingleNumberList() {
        List<Double> numbers = List.of(1.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains two numbers.
    */
    @Test
    void testHasCloseElementsTwoNumberList() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains three numbers.
    */
    @Test
    void testHasCloseElementsThreeNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains four numbers.
    */
    @Test
    void testHasCloseElementsFourNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains five numbers.
    */
    @Test
    void testHasCloseElementsFiveNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 0.5;
        Boolean expected = false;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains six numbers.
    */
    @Test
    void testHasCloseElementsSixNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains seven numbers.
    */
    @Test
    void testHasCloseElementsSevenNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains eight numbers.
    */
    @Test
    void testHasCloseElementsEightNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0, 4.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains nine numbers.
    */
    @Test
    void testHasCloseElementsNineNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains ten numbers.
    */
    @Test
    void testHasCloseElementsTenNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains eleven numbers.
    */
    @Test
    void testHasCloseElementsElevenNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean expected = true;
        assertEquals(expected, HasCloseElements.hasCloseElements(numbers, threshold));
    }

    /**
    * Test case for {@link HasCloseElements#hasCloseElements(List, Double)} where the list of numbers contains twelve numbers.
    */
    @Test
    void testHasCloseElementsTwelveNumberList() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0, 3.0, 