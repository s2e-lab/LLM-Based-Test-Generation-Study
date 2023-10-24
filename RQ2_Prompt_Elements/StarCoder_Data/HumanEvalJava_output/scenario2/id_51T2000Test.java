// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    /**
     * * Test case for remove_vowels function.
     */
    @Test
    void testRemoveVowels() {
        assertEquals("bll", RemoveVowels.removeVowels("Hello"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello!"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello?"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello,"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello."));
        assertEquals("bll", RemoveVowels.removeVowels("Hello;"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello:"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello-"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello_"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello/"));
        assertEquals("bll", RemoveVowels.removeVowels("Hello\\"));
    }
}
