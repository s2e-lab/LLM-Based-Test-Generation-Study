package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(1, 3, 4), scenario3.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4)));
		assertEquals(Arrays.asList(), scenario3.RemoveDuplicates.removeDuplicates(Arrays.asList()));
		assertEquals(Arrays.asList(1, 2, 3, 4), scenario3.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 4)));
		assertEquals(Arrays.asList(1, 4, 5), scenario3.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4, 3, 5)));
		
    }

}