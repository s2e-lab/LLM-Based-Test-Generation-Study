package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestSolve {
    @Test
    public void testSolve() {
        assertEquals("4321", Solve.solve("1234"));
        assertEquals("AB", Solve.solve("ab"));
        assertEquals("#A@c", Solve.solve("#a@C"));
        assertEquals("aSdF", Solve.solve("AsDf"));
        assertEquals("2@6#", Solve.solve("#6@2"));
        assertEquals("#A^d", Solve.solve("#$a^D"));
        assertEquals("#CCC", Solve.solve("#ccc"));
        assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
        assertEquals("#A@c", Solve.solve("#a@C"));
        assertEquals("#A^d", Solve.solve("#$a^D"));
    }
}