package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BelowZeroTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario1.BelowZero.belowZero(Arrays.asList(1, 2, 3)));
        assertEquals(true, scenario1.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5)));
        assertEquals(false, scenario1.BelowZero.belowZero(Arrays.asList()));
        assertEquals(false, scenario1.BelowZero.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
        assertEquals(true, scenario1.BelowZero.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
        assertEquals(false, scenario1.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
        assertEquals(true, scenario1.BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
        assertEquals(true, scenario1.BelowZero.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));

    }

}