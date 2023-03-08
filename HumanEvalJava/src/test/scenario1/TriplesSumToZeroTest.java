package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriplesSumToZeroTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 3, 5, 0)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 3, 5, -1)));
        assertEquals(true, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 3, -2, 1)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3, 7)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 5, 7)));
        assertEquals(true, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(2, 4, -5, 3, 9, 7)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 3, 5, -100)));
        assertEquals(false, scenario1.TriplesSumToZero.triplesSumToZero(Arrays.asList(100, 3, 5, -100)));

    }

}