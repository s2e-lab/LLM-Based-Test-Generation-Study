// SortNumbersTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    @Test
    void testSortNumbers() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("eight nine six seven zero one two three four five"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("eight nine six seven zero one two three four five"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("eight nine six seven zero one two three four five"));
    }
}
