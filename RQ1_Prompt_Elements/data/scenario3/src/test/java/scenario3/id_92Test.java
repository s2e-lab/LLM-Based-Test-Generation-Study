package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AnyIntTest {
    @Test
    public void testAnyInt() {
        assertEquals(true, AnyInt.anyInt(2, 3, 1));
        assertEquals(false, AnyInt.anyInt(2.5, 2, 3));
        assertEquals(false, AnyInt.anyInt(1.5, 5, 3.5));
        assertEquals(false, AnyInt.anyInt(2, 6, 2));
        assertEquals(true, AnyInt.anyInt(4, 2, 2));
        assertEquals(false, AnyInt.anyInt(2.2, 2.2, 2.2));
        assertEquals(true, AnyInt.anyInt(-4, 6, 2));
        assertEquals(true, AnyInt.anyInt(2, 1, 1));
        assertEquals(true, AnyInt.anyInt(3, 4, 7));
        assertEquals(false, AnyInt.anyInt(3.0, 4, 7));
    }
}