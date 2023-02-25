package scenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncrListTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(2, 3, 4), scenario2.IncrList.incrList(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124), scenario2.IncrList.incrList(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));
		assertEquals(Arrays.asList(), scenario2.IncrList.incrList(Arrays.asList()));
		assertEquals(Arrays.asList(4, 3, 2), scenario2.IncrList.incrList(Arrays.asList(3, 2, 1)));
		assertEquals(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124), scenario2.IncrList.incrList(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123)));
		assertEquals(public static List<Object> incrList(List<Object> l) {, scenario2.IncrList.*/);
		
    }

}