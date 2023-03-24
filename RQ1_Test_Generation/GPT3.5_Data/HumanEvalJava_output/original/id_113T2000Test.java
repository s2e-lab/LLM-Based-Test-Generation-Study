// Here's the source code for the OddCountTest class:

package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OddCount}.
 * It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
 */
class OddCountTest {

    @Test
    void testOddCountWithOneString() {
        List<String> input = new ArrayList<>(Arrays.asList("1234567"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 4n the str4ng 4 of the 4nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithTwoStrings() {
        List<String> input = new ArrayList<>(Arrays.asList("3", "11111111"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithThreeStrings() {
        List<String> input = new ArrayList<>(Arrays.asList("271", "137", "314"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithEmptyList() {
        List<String> input = new ArrayList<>();
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithNullList() {
        List<String> input = null;
        assertThrows(NullPointerException.class, () -> OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithOneStringContainingOnlyEvenDigits() {
        List<String> input = new ArrayList<>(Arrays.asList("2468"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 0n the str0ng 0 of the 0nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithOneStringContainingOnlyOddDigits() {
        List<String> input = new ArrayList<>(Arrays.asList("13579"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 5n the str5ng 5 of the 5nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithOneStringContainingBothEvenAndOddDigits() {
        List<String> input = new ArrayList<>(Arrays.asList("24613579"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 3n the str3ng 3 of the 3nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithOneStringContainingNonDigitCharacters() {
        List<String> input = new ArrayList<>(Arrays.asList("12a4b6c7"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }

    @Test
    void testOddCountWithOneStringContainingLeadingZeros() {
        List<String> input = new ArrayList<>(Arrays.asList("00123"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("the number of odd elements 2n the str2ng 2 of the 2nput."));
        assertEquals(expectedOutput, OddCount.oddCount(input));
    }
}