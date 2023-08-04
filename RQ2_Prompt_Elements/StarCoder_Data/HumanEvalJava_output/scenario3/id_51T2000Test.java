// RemoveVowelsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    /**
     * Test case for the {@link RemoveVowels#removeVowels(String)} method.
     * It tests the removeVowels method with the following inputs:
     * <ul>
     * <li>abcdef</li>
     * <li>aaaaa</li>
     * <li>aaBAA</li>
     * <li>zbcd</li>
     * <li></li>
     * <li>abcdef\nghijklm</li>
     * <li>fedcba</li>
     * <li>eeeee</li>
     * <li>acBAA</li>
     * <li>EcBOO</li>
     * <li>ybcd</li>
     * </ul>
     * It expects the following results:
     * <ul>
     * <li>bcdf</li>
     * <li></li>
     * <li>B</li>
     * <li>zbcd</li>
     * <li></li>
     * <li>bcdf\nghjklm</li>
     * <li>fdcb</li>
     * <li></li>
     * <li>cB</li>
     * <li>cB</li>
     * <li>ybcd</li>
     * </ul>
     */
    @Test
    void testRemoveVowels() {
        assertEquals("bcdf", RemoveVowels.removeVowels("abcdef"));
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
        assertEquals("zbcd", RemoveVowels.removeVowels("zbcd"));
        assertEquals("", RemoveVowels.removeVowels(""));
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
    }
}
