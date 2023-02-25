package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorizeTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(2, 2, 2), scenario3.Factorize.factorize(8));
		assertEquals(Arrays.asList(5, 5), scenario3.Factorize.factorize(25));
		assertEquals(Arrays.asList(2, 5, 7), scenario3.Factorize.factorize(70));
		assertEquals(Arrays.asList(2), scenario3.Factorize.factorize(2));
		assertEquals(Arrays.asList(2, 2), scenario3.Factorize.factorize(4));
		assertEquals(Arrays.asList(2, 2, 2), scenario3.Factorize.factorize(8));
		assertEquals(Arrays.asList(3, 19), scenario3.Factorize.factorize(57));
		assertEquals(Arrays.asList(3, 3, 19, 19), scenario3.Factorize.factorize(3249));
		assertEquals(Arrays.asList(3, 3, 3, 19, 19, 19), scenario3.Factorize.factorize(185193));
		assertEquals(Arrays.asList(3, 19, 19, 19), scenario3.Factorize.factorize(20577));
		assertEquals(Arrays.asList(2, 3, 3), scenario3.Factorize.factorize(18));
		assertEquals(public static List<Integer> factorize(int n) {, scenario3.Factorize.*/);
		
    }

}