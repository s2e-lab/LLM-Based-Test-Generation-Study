package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlipCaseTest {

    @Test
    public void test() throws Exception {

        assertEquals("hELLO", scenario3.FlipCase.flipCase("Hello"));
        assertEquals("", scenario3.FlipCase.flipCase(""));
        assertEquals("hELLO!", scenario3.FlipCase.flipCase("Hello!"));
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", scenario3.FlipCase.flipCase("These violent delights have violent ends"));

    }

}