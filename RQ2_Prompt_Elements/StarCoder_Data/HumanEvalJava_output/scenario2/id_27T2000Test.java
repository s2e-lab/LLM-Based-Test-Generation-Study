// FlipCaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

    /**
     * Test case for the {@link FlipCase#flipCase(String)} method.
     */
    @Test
    void testFlipCase() {
        assertEquals("hELLO WORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("HELLO WORLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hELLO WORLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("HeLLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
        assertEquals("hELLO WORLD", FlipCase.flipCase("hElLo WoRLD"));
    }
}
