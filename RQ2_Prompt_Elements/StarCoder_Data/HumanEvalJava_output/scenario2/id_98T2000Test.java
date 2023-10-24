// CountUpperTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string is empty.
     */
    @Test
    void testCountUpperEmptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains no uppercase vowels.
     */
    @Test
    void testCountUpperNoUppercaseVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefghijklmnopqrstuvwxyz"));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains only uppercase vowels.
     */
    @Test
    void testCountUpperOnlyUppercaseVowels() {
        assertEquals(5, CountUpper.countUpper("AEIOU"));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains uppercase vowels in odd indices.
     */
    @Test
    void testCountUpperUppercaseVowelsInOddIndices() {
        assertEquals(3, CountUpper.countUpper("AEIOUaeiou"));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains uppercase vowels in even indices.
     */
    @Test
    void testCountUpperUppercaseVowelsInEvenIndices() {
        assertEquals(2, CountUpper.countUpper("AEIOUaeiouAEIOUaeiou"));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains uppercase vowels in odd and even indices.
     */
    @Test
    void testCountUpperUppercaseVowelsInOddAndEvenIndices() {
        assertEquals(5, CountUpper.countUpper("AEIOUaeiouAEIOUaeiouAEIOUaeiou"));
    }

    /**
     * Test case for {@link CountUpper#countUpper(String)} where the string contains uppercase vowels in odd and even indices.
     */
    @Test
    void testCountUpperUppercaseVowelsInOddAndEvenIndices2() {
        assertEquals(5, CountUpper.countUpper("AEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiou"));
    }
}
