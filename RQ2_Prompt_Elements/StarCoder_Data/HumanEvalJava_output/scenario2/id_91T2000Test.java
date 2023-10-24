// IsBoredTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

    /**
     * Test case for the {@link IsBored#isBored(String)} method.
     */
    @Test
    void testIsBored() {
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored(" "));
        assertEquals(0, IsBored.isBored("I am a boy."));
        assertEquals(1, IsBored.isBored("I am a boy. I am a girl."));
        assertEquals(1, IsBored.isBored("I am a boy. I am a girl. I am a boy."));
        assertEquals(2, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl."));
        assertEquals(2, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl. I am a boy."));
        assertEquals(3, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl."));
        assertEquals(3, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl. I am a boy."));
        assertEquals(4, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl."));
        assertEquals(4, IsBored.isBored("I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl. I am a boy. I am a girl. I am a boy."));
    }
}
