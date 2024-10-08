// VowelsCountTest.java
package scenario3;


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
        assertEquals(2, VowelsCount.vowelsCount("abcde"));
        assertEquals(3, VowelsCount.vowelsCount("Alone"));
        assertEquals(2, VowelsCount.vowelsCount("key"));
        assertEquals(1, VowelsCount.vowelsCount("bye"));
        assertEquals(2, VowelsCount.vowelsCount("keY"));
        assertEquals(1, VowelsCount.vowelsCount("bYe"));
        assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
    }
}
