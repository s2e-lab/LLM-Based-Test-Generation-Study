package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FactorizeTest {
    @Test
    void testFactorize() {
        assertEquals(Arrays.asList(2, 2, 2), Factorize.factorize(8));
        assertEquals(Arrays.asList(5, 5), Factorize.factorize(25));
        assertEquals(Arrays.asList(2, 5, 7), Factorize.factorize(70));
        assertEquals(Arrays.asList(2), Factorize.factorize(2));
        assertEquals(Arrays.asList(2, 2), Factorize.factorize(4));
        assertEquals(Arrays.asList(2, 2, 2), Factorize.factorize(8));
        assertEquals(Arrays.asList(3, 19), Factorize.factorize(57));
        assertEquals(Arrays.asList(3, 3, 19, 19), Factorize.factorize(3249));
        assertEquals(Arrays.asList(3, 3, 3, 19, 19, 19), Factorize.factorize(185193));
        assertEquals(Arrays.asList(3, 19, 19, 19), Factorize.factorize(20577));
        assertEquals(Arrays.asList(2, 3, 3), Factorize.factorize(18));
    }
}