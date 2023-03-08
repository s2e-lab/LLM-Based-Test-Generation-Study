package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 2, 6, 24, 15), scenario3.F.f(5));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28), scenario3.F.f(7));
        assertEquals(Arrays.asList(1), scenario3.F.f(1));
        assertEquals(Arrays.asList(1, 2, 6), scenario3.F.f(3));

    }

}