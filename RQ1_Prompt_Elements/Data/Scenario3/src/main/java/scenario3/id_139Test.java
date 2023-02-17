package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SpecialFactorialTest {
    @Test
    void testSpecialFactorial() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
        assertEquals(1, SpecialFactorial.specialFactorial(1));
        assertEquals(1, SpecialFactorial.specialFactorial(0));
        assertEquals(1, SpecialFactorial.specialFactorial(-1));
        assertEquals(1, SpecialFactorial.specialFactorial(-2));
        assertEquals(1, SpecialFactorial.specialFactorial(-3));
        assertEquals(1, SpecialFactorial.specialFactorial(-4));
        assertEquals(1, SpecialFactorial.specialFactorial(-5));
    }
}