// IsBoredTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsBored}.
 * It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
 */
class IsBoredTest {

    @Test
    void testNoBoredom() {
        assertEquals(0, IsBored.isBored("Hello world"));
        assertEquals(0, IsBored.isBored("Is the sky blue?"));
        assertEquals(0, IsBored.isBored("You and I are going for a walk"));
    }

    @Test
    void testOneBoredom() {
        assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
        assertEquals(1, IsBored.isBored("I love It !"));
    }

    @Test
    void testMultipleBoredoms() {
        assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, IsBored.isBored(""));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> IsBored.isBored(null));
    }

    @Test
    void testOnlyBoredom() {
        assertEquals(1, IsBored.isBored("I."));
        assertEquals(1, IsBored.isBored("I?"));
        assertEquals(1, IsBored.isBored("I!"));
    }

    @Test
    void testBoredomWithSpaces() {
        assertEquals(1, IsBored.isBored("  I am bored. "));
    }

    @Test
    void testBoredomWithMultipleSpaces() {
        assertEquals(1, IsBored.isBored("  I    am    bored. "));
    }

    @Test
    void testBoredomWithMultipleSentences() {
        assertEquals(1, IsBored.isBored("I am bored. This is a second sentence."));
    }

    @Test
    void testBoredomWithMultipleSentencesAndSpaces() {
        assertEquals(1, IsBored.isBored("  I am bored. This is a second sentence. "));
    }
}