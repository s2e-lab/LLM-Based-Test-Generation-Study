package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FixSpacesTest {

    @Test
    public void test() throws Exception{

        assertEquals("Example", scenario1.FixSpaces.fixSpaces("Example"));
		assertEquals("Mudasir_Hanif_", scenario1.FixSpaces.fixSpaces("Mudasir Hanif "));
		assertEquals("Yellow_Yellow__Dirty__Fellow", scenario1.FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
		assertEquals("Exa-mple", scenario1.FixSpaces.fixSpaces("Exa   mple"));
		assertEquals("-Exa_1_2_2_mple", scenario1.FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
		
    }

}