package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairsSumToZeroTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, 5, 0)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, -2, 1)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 2, 3, 7)));
        assertEquals(true, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, 5, 0)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 3, -2, 1)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1, 2, 3, 7)));
        assertEquals(true, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(1)));
        assertEquals(true, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 3, 2, 30)));
        assertEquals(true, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 3, 2, 31)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 4, 2, 30)));
        assertEquals(false, scenario1.PairsSumToZero.pairsSumToZero(Arrays.asList(-3, 9, -1, 4, 2, 31)));

    }

}