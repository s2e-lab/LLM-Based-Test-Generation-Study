Here's the completed code for RemoveVowelsTest.java:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RemoveVowels}.
 * It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
 */
class RemoveVowelsTest {

    @Test
    void testRemoveVowels_emptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_noVowels() {
        String input = "xyz";
        String expectedOutput = "xyz";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_onlyVowels() {
        String input = "aeiouAEIOU";
        String expectedOutput = "";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_mixedVowelsAndConsonants() {
        String input = "Hello, World!";
        String expectedOutput = "Hll, Wrld!";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_allLowerCase() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expectedOutput = "bcdfghjklmnpqrstvwxyz";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_allUpperCase() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedOutput = "BCDFGHJKLMNPQRSTVWXYZ";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_numbersAndSpecialCharacters() {
        String input = "123!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";
        String expectedOutput = "123!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_unicodeCharacters() {
        String input = "こんにちは世界";
        String expectedOutput = "こんにちは世界";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_longString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expectedOutput = "Lrm psm dlr st mt, cnscttr dpcng lt. Sd nn rs. Sspndss lcts trtr, dgnssm st mt, dpcng nc, ltrcs sd, dlr.";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_nullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> {
            RemoveVowels.removeVowels(input);
        });
    }
}
```

This test class contains ten unit test cases for the `removeVowels` method of the `RemoveVowels` class. The test cases cover a variety of scenarios, including empty strings, strings with no vowels, strings with only vowels, mixed strings of vowels and consonants, strings with numbers and special characters, and strings with Unicode characters. There is also a test case for null input, which should throw a `NullPointerException`.