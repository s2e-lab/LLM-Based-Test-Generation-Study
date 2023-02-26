package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipCaseTest {

    @Test
    public void test() throws Exception{

        assertEquals("hELLO", scenario2.FlipCase.flipCase("Hello"));
		assertEquals("", scenario2.FlipCase.flipCase(""));
		assertEquals("hELLO!", scenario2.FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", scenario2.FlipCase.flipCase("These violent delights have violent ends"));
		
    }

}