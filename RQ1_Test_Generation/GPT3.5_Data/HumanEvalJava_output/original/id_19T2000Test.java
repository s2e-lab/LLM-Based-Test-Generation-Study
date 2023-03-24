// SortNumbers.java
package revised;

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
        String[] numbersArray = numbers.split(" ");
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
        int[] numbersInt = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numberMap.containsKey(numbersArray[i])) {
                numbersInt[i] = numberMap.get(numbersArray[i]);
            } else {
                numbersInt[i] = -1;
            }
        }
        Arrays.sort(numbersInt);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbersInt.length; i++) {
            for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
                if (entry.getValue() == numbersInt[i]) {
                    result.append(entry.getKey()).append(" ");
                    break;
                }
            }
        }
        return result.toString().trim();
    }
}

// SortNumbersTest.java
package revised;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
    @Test
    void testSortNumbers() {
        assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
        assertEquals("", SortNumbers.sortNumbers(""));
        assertEquals("three", SortNumbers.sortNumbers("three"));
        assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
        assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
        assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("one two three four five six seven eight nine"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one two three four five six seven eight nine"));
        assertEquals("one two three four five six seven eight nine", SortNumbers.sortNumbers("one two three four five six seven eight nine eight seven six five four three two one"));
    }
}