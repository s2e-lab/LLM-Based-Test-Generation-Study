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
    void testEmptyString() {
        assertEquals(0, IsBored.isBored(""));
    }
    
    @Test
    void testNoBoredom() {
        assertEquals(0, IsBored.isBored("Hello world"));
        assertEquals(0, IsBored.isBored("Is the sky blue?"));
        assertEquals(0, IsBored.isBored("bIt"));
        assertEquals(0, IsBored.isBored("You and I are going for a walk"));
    }
    
    @Test
    void testOneBoredom() {
        assertEquals(1, IsBored.isBored("I love It !"));
        assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }
    
    @Test
    void testMultipleBoredom() {
        assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
    }
    
    @Test
    void testBoredomWithPunctuation() {
        assertEquals(1, IsBored.isBored("I am happy!"));
        assertEquals(1, IsBored.isBored("I am happy?"));
        assertEquals(1, IsBored.isBored("I am happy."));
        assertEquals(1, IsBored.isBored("I am happy..."));
    }
}