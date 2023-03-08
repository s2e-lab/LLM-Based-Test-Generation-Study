package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetOddCollatzTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 5, 7, 11, 13, 17), scenario2.GetOddCollatz.getOddCollatz(14));
        assertEquals(Arrays.asList(1, 5), scenario2.GetOddCollatz.getOddCollatz(5));
        assertEquals(Arrays.asList(1, 3, 5), scenario2.GetOddCollatz.getOddCollatz(12));
        assertEquals(Arrays.asList(1), scenario2.GetOddCollatz.getOddCollatz(1));

    }

}