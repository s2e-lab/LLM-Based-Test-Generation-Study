Here's the completed code for RemoveVowelsTest.java:

```
package scenario2;

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
    void testRemoveVowels_mixed() {
        String input = "Hello, World!";
        String expectedOutput = "Hll, Wrld!";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_numbers() {
        String input = "1234567890";
        String expectedOutput = "1234567890";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_specialCharacters() {
        String input = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/~`";
        String expectedOutput = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/~`";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_whitespace() {
        String input = "   \t\n\r";
        String expectedOutput = "   \t\n\r";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_unicode() {
        String input = "こんにちは世界";
        String expectedOutput = "こんにちは世界";
        String actualOutput = RemoveVowels.removeVowels(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRemoveVowels_longString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expectedOutput = "Lrm psm dlr st mt, cnscttr dpscng lt. Sd nn rs. Sspndss lcts trtr, dgnssm st mt, dpscng nc, ltrcs sd, dlr.";
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

This test class contains ten unit test cases for the `removeVowels` method of the `RemoveVowels` class. The test cases cover a variety of scenarios, including empty strings, strings with no vowels, strings with only vowels, mixed strings, strings with numbers, special characters, whitespace, and Unicode characters. There is also a test case for null input, which should throw a `NullPointerException`.