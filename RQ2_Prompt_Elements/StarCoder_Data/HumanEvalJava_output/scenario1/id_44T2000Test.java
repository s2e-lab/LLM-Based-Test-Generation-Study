// ChangeBaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

    @Test
    void testChangeBase() {
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("101010", ChangeBase.changeBase(42, 2));
        assertEquals("10101010", ChangeBase.changeBase(170, 2));
        assertEquals("1010101010", ChangeBase.changeBase(250, 2));
        assertEquals("101010101010", ChangeBase.changeBase(490, 2));
        assertEquals("10101010101010", ChangeBase.changeBase(1022, 2));
        assertEquals("1010101010101010", ChangeBase.changeBase(2054, 2));
        assertEquals("101010101010101010", ChangeBase.changeBase(4108, 2));
        assertEquals("10101010101010101010", ChangeBase.changeBase(8216, 2));
        assertEquals("1010101010101010101010", ChangeBase.changeBase(16432, 2));
    }
}
