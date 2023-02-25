package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateIntegersTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(2, 10));
		assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(10, 2));
		assertEquals(Arrays.asList(2, 4, 6, 8), scenario3.GenerateIntegers.generateIntegers(132, 2));
		assertEquals(Arrays.asList(), scenario3.GenerateIntegers.generateIntegers(17, 89));
		assertEquals(public static List<Object> generateIntegers(int a, int b) {, scenario3.GenerateIntegers.*/);
		
    }

}