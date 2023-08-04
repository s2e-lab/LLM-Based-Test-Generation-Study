// SortNumbersTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    /**
     * Test case for {@link SortNumbers#sortNumbers(String)} where the input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     */
    @Test
    void testSortNumbers() {
        assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
        assertEquals("", SortNumbers.sortNumbers(""));
        assertEquals("three", SortNumbers.sortNumbers("three"));
        assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
        assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
        assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
    }
}
