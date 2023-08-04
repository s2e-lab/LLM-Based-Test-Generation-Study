// FlipCaseTest.java
package scenario3;


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
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
        assertEquals("", FlipCase.flipCase(""));
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
    }
}
