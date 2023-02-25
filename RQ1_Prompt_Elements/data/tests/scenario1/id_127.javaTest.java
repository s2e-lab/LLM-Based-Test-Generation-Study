package scenario1;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    public void test() throws Exception{
        assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(2, 3)));
		assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(-1, 1), Arrays.asList(0, 4)));
		assertEquals("YES", scenario1.Intersection.intersection(Arrays.asList(-3, -1), Arrays.asList(-5, 5)));
		assertEquals("YES", scenario1.Intersection.intersection(Arrays.asList(-2, 2), Arrays.asList(-4, 0)));
		assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(-11, 2), Arrays.asList(-1, -1)));
		assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(3, 5)));
		assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(1, 2), Arrays.asList(1, 2)));
		assertEquals("NO", scenario1.Intersection.intersection(Arrays.asList(-2, -2), Arrays.asList(-3, -2)));
		assertEquals(public static String intersection(List<Integer> interval1, List<Integer> interval2) {, scenario1.Intersection.*/);
		
    }

}