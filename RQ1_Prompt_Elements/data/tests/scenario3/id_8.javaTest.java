package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumProductTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(10, 24), scenario3.SumProduct.sumProduct(Arrays.asList(1, 2, 3, 4)));
		assertEquals(Arrays.asList(0, 1), scenario3.SumProduct.sumProduct(Arrays.asList()));
		assertEquals(Arrays.asList(3, 1), scenario3.SumProduct.sumProduct(Arrays.asList(1, 1, 1)));
		assertEquals(Arrays.asList(100, 0), scenario3.SumProduct.sumProduct(Arrays.asList(100, 0)));
		assertEquals(Arrays.asList(15, 105), scenario3.SumProduct.sumProduct(Arrays.asList(3, 5, 7)));
		assertEquals(Arrays.asList(10, 10), scenario3.SumProduct.sumProduct(Arrays.asList(10)));
		assertEquals(public static List<Integer> sumProduct(List<Object> numbers) {, scenario3.SumProduct.*/);
		
    }

}