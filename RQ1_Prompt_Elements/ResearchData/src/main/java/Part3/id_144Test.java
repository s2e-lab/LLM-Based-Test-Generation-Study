package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimplifyTest {
    @Test
    public void testSimplify() {
        assertEquals(true, Simplify.simplify("1/5", "5/1"));
        assertEquals(false, Simplify.simplify("1/6", "2/1"));
        assertEquals(false, Simplify.simplify("7/10", "10/2"));
        assertEquals(true, Simplify.simplify("1/5", "5/1"));
        assertEquals(false, Simplify.simplify("1/6", "2/1"));
        assertEquals(true, Simplify.simplify("5/1", "3/1"));
        assertEquals(false, Simplify.simplify("7/10", "10/2"));
        assertEquals(true, Simplify.simplify("2/10", "50/10"));
        assertEquals(true, Simplify.simplify("7/2", "4/2"));
        assertEquals(true, Simplify.simplify("11/6", "6/1"));
    }
}