package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PluckTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(2, 1), scenario2.Pluck.pluck(Arrays.asList(4, 2, 3)));
		assertEquals(Arrays.asList(2, 1), scenario2.Pluck.pluck(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(), scenario2.Pluck.pluck(Arrays.asList()));
		assertEquals(Arrays.asList(0, 1), scenario2.Pluck.pluck(Arrays.asList(5, 0, 3, 0, 4, 2)));
		assertEquals(Arrays.asList(0, 3), scenario2.Pluck.pluck(Arrays.asList(1, 2, 3, 0, 5, 3)));
		assertEquals(Arrays.asList(4, 1), scenario2.Pluck.pluck(Arrays.asList(5, 4, 8, 4, 8)));
		assertEquals(Arrays.asList(6, 1), scenario2.Pluck.pluck(Arrays.asList(7, 6, 7, 1)));
		assertEquals(Arrays.asList(), scenario2.Pluck.pluck(Arrays.asList(7, 9, 7, 1)));
		assertEquals(public static List<Object> pluck(List<Object> arr) {, scenario2.Pluck.*/);
		
    }

}