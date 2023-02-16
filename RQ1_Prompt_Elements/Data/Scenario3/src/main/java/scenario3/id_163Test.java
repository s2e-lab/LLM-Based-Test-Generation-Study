package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GenerateIntegersTest {
    @Test
    void testGenerateIntegers() {
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(2, 8));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(8, 2));
        assertEquals(Arrays.asList(), GenerateIntegers.generateIntegers(10, 14));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(2, 10));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(10, 2));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(132, 2));
        assertEquals(Arrays.asList(), GenerateIntegers.generateIntegers(17, 89));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(2, 8));
        assertEquals(Arrays.asList(2, 4, 6, 8), GenerateIntegers.generateIntegers(8, 2));
        assertEquals(Arrays.asList(), GenerateIntegers.generateIntegers(10, 14));
    }
}