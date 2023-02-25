package scenario2;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FixSpacesTest {

    @Test
    public void test() throws Exception{
        assertEquals("Example", scenario2.FixSpaces.fixSpaces("Example"));
		assertEquals("Mudasir_Hanif_", scenario2.FixSpaces.fixSpaces("Mudasir Hanif "));
		assertEquals("Yellow_Yellow__Dirty__Fellow", scenario2.FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
		assertEquals("Exa-mple", scenario2.FixSpaces.fixSpaces("Exa   mple"));
		assertEquals("-Exa_1_2_2_mple", scenario2.FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
		assertEquals(public static String fixSpaces(String text) {, scenario2.FixSpaces.*/);
		
    }

}