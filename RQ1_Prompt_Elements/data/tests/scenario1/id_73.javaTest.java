package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestChangeTest {

    @Test
    public void test() throws Exception{

        assertEquals(4, scenario1.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6)));
		assertEquals(1, scenario1.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 4, 3, 2, 2)));
		assertEquals(1, scenario1.SmallestChange.smallestChange(Arrays.asList(1, 4, 2)));
		assertEquals(1, scenario1.SmallestChange.smallestChange(Arrays.asList(1, 4, 4, 2)));
		assertEquals(0, scenario1.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 2, 1)));
		assertEquals(0, scenario1.SmallestChange.smallestChange(Arrays.asList(3, 1, 1, 3)));
		assertEquals(0, scenario1.SmallestChange.smallestChange(Arrays.asList(1)));
		assertEquals(1, scenario1.SmallestChange.smallestChange(Arrays.asList(0, 1)));
		
    }

}