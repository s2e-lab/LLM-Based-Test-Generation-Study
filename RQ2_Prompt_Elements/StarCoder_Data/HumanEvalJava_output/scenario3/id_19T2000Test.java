// SortNumbersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with an empty string as input.
     */
    @Test
    void testSortNumbersEmptyString() {
        assertEquals("", SortNumbers.sortNumbers(""));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing a single number as input.
     */
    @Test
    void testSortNumbersSingleNumber() {
        assertEquals("three", SortNumbers.sortNumbers("three"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing two numbers as input.
     */
    @Test
    void testSortNumbersTwoNumbers() {
        assertEquals("one three", SortNumbers.sortNumbers("three one"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing three numbers as input.
     */
    @Test
    void testSortNumbersThreeNumbers() {
        assertEquals("one two three", SortNumbers.sortNumbers("three one two"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing four numbers as input.
     */
    @Test
    void testSortNumbersFourNumbers() {
        assertEquals("one two three four", SortNumbers.sortNumbers("three one two four"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing five numbers as input.
     */
    @Test
    void testSortNumbersFiveNumbers() {
        assertEquals("one two three four five", SortNumbers.sortNumbers("three one two four five"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing six numbers as input.
     */
    @Test
    void testSortNumbersSixNumbers() {
        assertEquals("one two three four five six", SortNumbers.sortNumbers("three one two four five six"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing seven numbers as input.
     */
    @Test
    void testSortNumbersSevenNumbers() {
        assertEquals("one two three four five six seven", SortNumbers.sortNumbers("three one two four five six seven"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing eight numbers as input.
     */
    @Test
    void testSortNumbersEightNumbers() {
        assertEquals("one two three four five six seven eight", SortNumbers.sortNumbers("three one two four five six seven eight"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing nine numbers as input.
     */
    @Test
    void testSortNumbersNineNumbers() {
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("three one two four five six seven eight nine"));
    }

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)}
     * with a string containing ten numbers as input.
     */
    @Test
    void testSortNumbersTenNumbers() {
        assertEquals("one two three four five six seven eight nine ten", SortNumbers.sortNumbers("three one two four five six seven eight nine ten"));
    }
}
