// RemoveVowelsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    @Test
    void testRemoveVowels() {
        assertEquals("bll", RemoveVowels.removeVowels("abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
        assertEquals("bll", RemoveVowels.removeVowels("Abceeeef"));
    }
}
