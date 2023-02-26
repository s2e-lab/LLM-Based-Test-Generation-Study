package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestElementsTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(3.9, 4.0), scenario2.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)));
		assertEquals(Arrays.asList(5.0, 5.9), scenario2.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)));
		assertEquals(Arrays.asList(2.0, 2.2), scenario2.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2)));
		assertEquals(Arrays.asList(2.0, 2.0), scenario2.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)));
		assertEquals(Arrays.asList(2.2, 3.1), scenario2.FindClosestElements.findClosestElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)));
		
    }

}