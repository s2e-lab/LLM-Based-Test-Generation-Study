package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class PrimeFibTest {
    @Test
    void testPrimeFib() {
        assertEquals(2, PrimeFib.primeFib(1));
        assertEquals(3, PrimeFib.primeFib(2));
        assertEquals(5, PrimeFib.primeFib(3));
        assertEquals(13, PrimeFib.primeFib(4));
        assertEquals(89, PrimeFib.primeFib(5));
        assertEquals(233, PrimeFib.primeFib(6));
        assertEquals(1597, PrimeFib.primeFib(7));
        assertEquals(28657, PrimeFib.primeFib(8));
        assertEquals(514229, PrimeFib.primeFib(9));
        assertEquals(433494437, PrimeFib.primeFib(10));
    }
}