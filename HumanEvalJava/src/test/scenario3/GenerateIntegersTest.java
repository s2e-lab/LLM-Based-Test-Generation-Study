package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateIntegersTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(2, 10));
        assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(10, 2));
        assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(132, 2));
        assertEquals(Arrays.asList(), scenario3.GenerateIntegers.generateIntegers(17, 89));

    }

}