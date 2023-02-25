package scenario2;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanArrangeTest {

    @Test
    public void test() throws Exception{
        assertEquals(3, scenario2.CanArrange.canArrange(Arrays.asList(1, 2, 4, 3, 5)));
		assertEquals(-1, scenario2.CanArrange.canArrange(Arrays.asList(1, 2, 4, 5)));
		assertEquals(2, scenario2.CanArrange.canArrange(Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10)));
		assertEquals(4, scenario2.CanArrange.canArrange(Arrays.asList(4, 8, 5, 7, 3)));
		assertEquals(-1, scenario2.CanArrange.canArrange(Arrays.asList()));
		assertEquals(public static int canArrange(List<Object> arr) {, scenario2.CanArrange.*/);
		
    }

}