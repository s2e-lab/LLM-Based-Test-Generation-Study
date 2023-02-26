package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterIntegersTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(5), scenario1.FilterIntegers.filterIntegers(Arrays.asList("a", 3.14, 5)));
		assertEquals(Arrays.asList(1, 2, 3), scenario1.FilterIntegers.filterIntegers(Arrays.asList(1, 2, 3, "abc", Map.of(), Arrays.asList())));
		assertEquals(Arrays.asList(), scenario1.FilterIntegers.filterIntegers(Arrays.asList()));
		assertEquals(Arrays.asList(4, 9), scenario1.FilterIntegers.filterIntegers(Arrays.asList(4, Map.of(), Arrays.asList(), 23.2, 9, "adasd")));
		assertEquals(Arrays.asList(3, 3, 3), scenario1.FilterIntegers.filterIntegers(Arrays.asList(3, "c", 3, 3, "a", "b")));
		
    }

}