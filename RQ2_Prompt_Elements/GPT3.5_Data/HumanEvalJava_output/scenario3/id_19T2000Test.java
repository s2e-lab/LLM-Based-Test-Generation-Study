// SortNumbers.java
package scenario3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SortNumbers {

    /**
     * Input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     *
     * > sortNumbers("three one five")
     * "one three five"
     * > sortNumbers("")
     * ""
     * > sortNumbers("three")
     * "three"
     * > sortNumbers("three five nine")
     * "three five nine"
     * > sortNumbers("five zero four seven nine eight")
     * "zero four five seven eight nine"
     * > sortNumbers("six five four three two one zero")
     * "zero one two three four five six"
     */
    public static String sortNumbers(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }

        String[] numberWords = numbers.split(" ");
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        Integer[] numberValues = new Integer[numberWords.length];
        for (int i = 0; i < numberWords.length; i++) {
            numberValues[i] = numberMap.get(numberWords[i]);
        }

        Arrays.sort(numberValues);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberValues.length; i++) {
            for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
                if (entry.getValue().equals(numberValues[i])) {
                    result.append(entry.getKey()).append(" ");
                    break;
                }
            }
        }

        return result.toString().trim();
    }
}

// SortNumbersTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    @Test
    void testEmptyString() {
        String result = SortNumbers.sortNumbers("");
        assertEquals("", result);
    }

    @Test
    void testSingleNumber() {
        String result = SortNumbers.sortNumbers("three");
        assertEquals("three", result);
    }

    @Test
    void testTwoNumbers() {
        String result = SortNumbers.sortNumbers("three five");
        assertEquals("three five", result);
    }

    @Test
    void testThreeNumbers() {
        String result = SortNumbers.sortNumbers("three five nine");
        assertEquals("three five nine", result);
    }

    @Test
    void testFourNumbers() {
        String result = SortNumbers.sortNumbers("five zero four seven nine eight");
        assertEquals("zero four five seven eight nine", result);
    }

    @Test
    void testSixNumbers() {
        String result = SortNumbers.sortNumbers("six five four three two one zero");
        assertEquals("zero one two three four five six", result);
    }

    @Test
    void testInvalidNumber() {
        String result = SortNumbers.sortNumbers("three five invalid");
        assertEquals("three five", result);
    }

    @Test
    void testDuplicateNumbers() {
        String result = SortNumbers.sortNumbers("three five five three");
        assertEquals("three three five five", result);
    }

    @Test
    void testNumbersWithDifferentCases() {
        String result = SortNumbers.sortNumbers("Three fIvE zErO");
        assertEquals("zErO fIvE Three", result);
    }

    @Test
    void testNumbersWithLeadingAndTrailingSpaces() {
        String result = SortNumbers.sortNumbers("  three five nine  ");
        assertEquals("three five nine", result);
    }
}