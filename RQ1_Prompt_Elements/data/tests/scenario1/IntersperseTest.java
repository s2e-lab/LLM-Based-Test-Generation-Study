package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntersperseTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(), scenario1.Intersperse.intersperse(Arrays.asList(), 4));
		assertEquals(Arrays.asList(1, 4, 2, 4, 3), scenario1.Intersperse.intersperse(Arrays.asList(1, 2, 3), 4));
		assertEquals(Arrays.asList(), scenario1.Intersperse.intersperse(Arrays.asList(), 7));
		assertEquals(Arrays.asList(5, 8, 6, 8, 3, 8, 2), scenario1.Intersperse.intersperse(Arrays.asList(5, 6, 3, 2), 8));
		assertEquals(Arrays.asList(2, 2, 2, 2, 2), scenario1.Intersperse.intersperse(Arrays.asList(2, 2, 2), 2));
		
    }

}