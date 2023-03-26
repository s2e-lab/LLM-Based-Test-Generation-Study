// UniqueDigits.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class UniqueDigits {

    /**
     * Given a list of positive integers x. return a sorted list of all
     * elements that hasn't any even digit.
     *
     * Note: Returned list should be sorted in increasing order.
     *
     * For example:
     * >>> uniqueDigits([15, 33, 1422, 1])
     * [1, 15, 33]
     * >>> uniqueDigits([152, 323, 1422, 10])
     * []
     *
     * > uniqueDigits([15, 33, 1422, 1])
     * [1, 15, 33]
     * > uniqueDigits([152, 323, 1422, 10])
     * []
     * > uniqueDigits([12345, 2033, 111, 151])
     * [111, 151]
     * > uniqueDigits([135, 103, 31])
     * [31, 135]
     */
    public static List<Integer> uniqueDigits(List<Integer> x) {
        List<Integer> result = new ArrayList<>();
        for (int i : x) {
            if (hasNoEvenDigit(i)) {
                result.add(i);
            }
        }
        result.sort(null);
        return result;
    }

    private static boolean hasNoEvenDigit(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}

// UniqueDigitsTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

    @Test
    void testEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testNoEvenDigits() {
        List<Integer> input = Arrays.asList(15, 33, 1422, 1);
        List<Integer> expected = Arrays.asList(1, 15, 33);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testAllEvenDigits() {
        List<Integer> input = Arrays.asList(152, 323, 1422, 10);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testMixedDigits() {
        List<Integer> input = Arrays.asList(12345, 2033, 111, 151);
        List<Integer> expected = Arrays.asList(111, 151);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testSingleDigit() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testTwoDigits() {
        List<Integer> input = Arrays.asList(13, 24);
        List<Integer> expected = Arrays.asList(13);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testThreeDigits() {
        List<Integer> input = Arrays.asList(135, 103, 31);
        List<Integer> expected = Arrays.asList(31, 135);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testFourDigits() {
        List<Integer> input = Arrays.asList(1234, 5678, 9012);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testFiveDigits() {
        List<Integer> input = Arrays.asList(12345, 67890, 13579);
        List<Integer> expected = Arrays.asList(13579);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }

    @Test
    void testLargeNumbers() {
        List<Integer> input = Arrays.asList(123456789, 987654321, 246813579);
        List<Integer> expected = Arrays.asList(123456789, 246813579);
        assertEquals(expected, UniqueDigits.uniqueDigits(input));
    }
}