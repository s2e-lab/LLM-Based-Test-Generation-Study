package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlipCaseTest {

    @Test
    public void test() throws Exception {

        assertEquals("hELLO", scenario1.FlipCase.flipCase("Hello"));
        assertEquals("", scenario1.FlipCase.flipCase(""));
        assertEquals("hELLO!", scenario1.FlipCase.flipCase("Hello!"));
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", scenario1.FlipCase.flipCase("These violent delights have violent ends"));

    }

}