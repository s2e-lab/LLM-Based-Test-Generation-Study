package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ByLengthTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"), scenario3.ByLength.byLength(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3)));
		assertEquals(Arrays.asList(), scenario3.ByLength.byLength(Arrays.asList()));
		assertEquals(Arrays.asList("One"), scenario3.ByLength.byLength(Arrays.asList(1, -1, 55)));
		assertEquals(Arrays.asList("Three", "Two", "One"), scenario3.ByLength.byLength(Arrays.asList(1, -1, 3, 2)));
		assertEquals(Arrays.asList("Nine", "Eight", "Four"), scenario3.ByLength.byLength(Arrays.asList(9, 4, 8)));
		
    }

}