package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FixSpacesTest {
    @Test
    public void testFixSpaces() {
        assertEquals("Example", FixSpaces.fixSpaces("Example"));
        assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
        assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
        assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
        assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
        assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
        assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
        assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
        assertEquals("-", FixSpaces.fixSpaces("   "));
        assertEquals("-", FixSpaces.fixSpaces("   "));
    }
}