package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxElementTest {

    @Test
    public void test() throws Exception{

        assertEquals(3, scenario3.MaxElement.maxElement(Arrays.asList(1, 2, 3)));
		assertEquals(123, scenario3.MaxElement.maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10)));
		assertEquals(3, scenario3.MaxElement.maxElement(Arrays.asList(1, 2, 3)));
		assertEquals(124, scenario3.MaxElement.maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10)));
		
    }

}