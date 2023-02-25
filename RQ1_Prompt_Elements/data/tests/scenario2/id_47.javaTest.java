package scenario2;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianTest {

    @Test
    public void test() throws Exception{
        assertEquals(15.0, scenario2.Median.median(Arrays.asList(-10, 4, 6, 1000, 10, 20)));
		assertEquals(3, scenario2.Median.median(Arrays.asList(3, 1, 2, 4, 5)));
		assertEquals(8.0, scenario2.Median.median(Arrays.asList(-10, 4, 6, 1000, 10, 20)));
		assertEquals(5, scenario2.Median.median(Arrays.asList(5)));
		assertEquals(5.5, scenario2.Median.median(Arrays.asList(6, 5)));
		assertEquals(7, scenario2.Median.median(Arrays.asList(8, 1, 3, 9, 9, 2, 7)));
		assertEquals(public static Number median(List<Integer> l) {, scenario2.Median.*/);
		
    }

}