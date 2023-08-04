// VowelsCountTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

    /**
     * Test case for the {@link VowelsCount#vowelsCount(String)} method.
     */
    @Test
    void testVowelsCount() {
        assertEquals(0, VowelsCount.vowelsCount(""));
        assertEquals(1, VowelsCount.vowelsCount("a"));
        assertEquals(2, VowelsCount.vowelsCount("ae"));
        assertEquals(3, VowelsCount.vowelsCount("aeiou"));
        assertEquals(4, VowelsCount.vowelsCount("aeiouy"));
        assertEquals(5, VowelsCount.vowelsCount("aeiouyaeiouy"));
        assertEquals(6, VowelsCount.vowelsCount("aeiouyaeiouyaeiouy"));
        assertEquals(7, VowelsCount.vowelsCount("aeiouyaeiouyaeiouyaeiouy"));
        assertEquals(8, VowelsCount.vowelsCount("aeiouyaeiouyaeiouyaeiouyaeiouy"));
        assertEquals(9, VowelsCount.vowelsCount("aeiouyaeiouyaeiouyaeiouyaeiouyaeiouy"));
        assertEquals(10, VowelsCount.vowelsCount("aeiouyaeiouyaeiouyaeiouyaeiouyaeiouyaeiouy"));
    }
}
