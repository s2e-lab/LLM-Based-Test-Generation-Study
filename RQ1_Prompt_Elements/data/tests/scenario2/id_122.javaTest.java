package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddElementsTest {

    @Test
    public void test() throws Exception{

        assertEquals(-4, scenario2.AddElements.addElements(Arrays.asList(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
		assertEquals(0, scenario2.AddElements.addElements(Arrays.asList(111, 121, 3, 4000, 5, 6), 2));
		assertEquals(125, scenario2.AddElements.addElements(Arrays.asList(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
		assertEquals(24, scenario2.AddElements.addElements(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
		assertEquals(1, scenario2.AddElements.addElements(Arrays.asList(1), 1));
		
    }

}