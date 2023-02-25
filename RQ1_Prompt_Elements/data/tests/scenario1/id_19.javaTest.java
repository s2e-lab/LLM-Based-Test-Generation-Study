package scenario1;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {

    @Test
    public void test() throws Exception{

        assertEquals("one three five", scenario1.SortNumbers.sortNumbers("three one five"));
		assertEquals("", scenario1.SortNumbers.sortNumbers(""));
		assertEquals("three", scenario1.SortNumbers.sortNumbers("three"));
		assertEquals("three five nine", scenario1.SortNumbers.sortNumbers("three five nine"));
		assertEquals("zero four five seven eight nine", scenario1.SortNumbers.sortNumbers("five zero four seven nine eight"));
		assertEquals("zero one two three four five six", scenario1.SortNumbers.sortNumbers("six five four three two one zero"));
		
    }

}