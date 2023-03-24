// VowelsCountTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link VowelsCount}.
 * It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
 */
class VowelsCountTest {

    @Test
    void testVowelsCountWithEmptyString() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    @Test
    void testVowelsCountWithNoVowels() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    @Test
    void testVowelsCountWithAllVowels() {
        assertEquals(5, VowelsCount.vowelsCount("aeiou"));
    }

    @Test
    void testVowelsCountWithMixedCaseVowels() {
        assertEquals(5, VowelsCount.vowelsCount("aEiOu"));
    }

    @Test
    void testVowelsCountWithYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("sky"));
    }

    @Test
    void testVowelsCountWithYAtEndMixedCase() {
        assertEquals(1, VowelsCount.vowelsCount("sKy"));
    }

    @Test
    void testVowelsCountWithYNotAtEnd() {
        assertEquals(0, VowelsCount.vowelsCount("yellow"));
    }

    @Test
    void testVowelsCountWithYNotAtEndMixedCase() {
        assertEquals(0, VowelsCount.vowelsCount("yEllow"));
    }

    @Test
    void testVowelsCountWithYAtEndAndOtherVowels() {
        assertEquals(2, VowelsCount.vowelsCount("happy"));
    }

    @Test
    void testVowelsCountWithYAtEndAndOtherVowelsMixedCase() {
        assertEquals(2, VowelsCount.vowelsCount("hAppy"));
    }
}