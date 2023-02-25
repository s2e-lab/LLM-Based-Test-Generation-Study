package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetPositiveTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(2, 5, 6), scenario1.GetPositive.getPositive(Arrays.asList(-1, 2, -4, 5, 6)));
		assertEquals(Arrays.asList(5, 3, 2, 3, 9, 123, 1), scenario1.GetPositive.getPositive(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
		assertEquals(Arrays.asList(4, 5, 6), scenario1.GetPositive.getPositive(Arrays.asList(-1, -2, 4, 5, 6)));
		assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1), scenario1.GetPositive.getPositive(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10)));
		assertEquals(Arrays.asList(), scenario1.GetPositive.getPositive(Arrays.asList(-1, -2)));
		assertEquals(Arrays.asList(), scenario1.GetPositive.getPositive(Arrays.asList()));
		assertEquals(public static List<Object> getPositive(List<Object> l) {, scenario1.GetPositive.*/);
		
    }

}