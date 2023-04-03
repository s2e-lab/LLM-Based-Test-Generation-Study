// SortNumbersTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SortNumbers}.
 * It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
 */
class SortNumbersTest {

    @Test
    void testSortNumbersWithEmptyString() {
        String result = SortNumbers.sortNumbers("");
        assertEquals("", result);
    }

    @Test
    void testSortNumbersWithOneNumber() {
        String result = SortNumbers.sortNumbers("three");
        assertEquals("three", result);
    }

    @Test
    void testSortNumbersWithTwoNumbers() {
        String result = SortNumbers.sortNumbers("three five");
        assertEquals("three five", result);
    }

    @Test
    void testSortNumbersWithThreeNumbers() {
        String result = SortNumbers.sortNumbers("three five nine");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithFourNumbers() {
        String result = SortNumbers.sortNumbers("five zero four seven");
        assertEquals("zero four five seven", result);
    }

    @Test
    void testSortNumbersWithFiveNumbers() {
        String result = SortNumbers.sortNumbers("six five four three two one");
        assertEquals("one two three four five six", result);
    }

    @Test
    void testSortNumbersWithInvalidNumber() {
        String result = SortNumbers.sortNumbers("three five invalid");
        assertEquals("Invalid input", result);
    }

    @Test
    void testSortNumbersWithDuplicateNumbers() {
        String result = SortNumbers.sortNumbers("three five five nine");
        assertEquals("three five five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInUpperCase() {
        String result = SortNumbers.sortNumbers("THREE FIVE NINE");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInMixedCase() {
        String result = SortNumbers.sortNumbers("ThReE fIvE nInE");
        assertEquals("three five nine", result);
    }

    @Test
    void testSortNumbersWithNumbersInDescendingOrder() {
        String result = SortNumbers.sortNumbers("nine eight seven six five four three two one zero");
        assertEquals("zero one two three four five six seven eight nine", result);
    }
}