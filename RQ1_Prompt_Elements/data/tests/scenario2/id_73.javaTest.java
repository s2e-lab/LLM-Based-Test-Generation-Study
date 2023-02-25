package scenario2;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestChangeTest {

    @Test
    public void test() throws Exception{
        assertEquals(4, scenario2.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6)));
		assertEquals(1, scenario2.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 4, 3, 2, 2)));
		assertEquals(1, scenario2.SmallestChange.smallestChange(Arrays.asList(1, 4, 2)));
		assertEquals(1, scenario2.SmallestChange.smallestChange(Arrays.asList(1, 4, 4, 2)));
		assertEquals(0, scenario2.SmallestChange.smallestChange(Arrays.asList(1, 2, 3, 2, 1)));
		assertEquals(0, scenario2.SmallestChange.smallestChange(Arrays.asList(3, 1, 1, 3)));
		assertEquals(0, scenario2.SmallestChange.smallestChange(Arrays.asList(1)));
		assertEquals(1, scenario2.SmallestChange.smallestChange(Arrays.asList(0, 1)));
		assertEquals(public static int smallestChange(List<Integer> arr) {, scenario2.SmallestChange.*/);
		
    }

}