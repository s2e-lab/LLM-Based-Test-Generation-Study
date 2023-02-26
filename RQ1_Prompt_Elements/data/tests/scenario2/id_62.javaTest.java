package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DerivativeTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(1, 4, 12, 20), scenario2.Derivative.derivative(Arrays.asList(3, 1, 2, 4, 5)));
		assertEquals(Arrays.asList(2, 6), scenario2.Derivative.derivative(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(2, 2), scenario2.Derivative.derivative(Arrays.asList(3, 2, 1)));
		assertEquals(Arrays.asList(2, 2, 0, 16), scenario2.Derivative.derivative(Arrays.asList(3, 2, 1, 0, 4)));
		assertEquals(Arrays.asList(), scenario2.Derivative.derivative(Arrays.asList(1)));
		
    }

}