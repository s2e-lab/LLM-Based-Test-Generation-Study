package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(1, 3, 4), scenario1.RemoveDuplicates.remove_duplicates(Arrays.asList(1, 2, 3, 2, 4)));
		assertEquals(Arrays.asList(), scenario1.RemoveDuplicates.removeDuplicates(Arrays.asList()));
		assertEquals(Arrays.asList(1, 2, 3, 4), scenario1.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 4)));
		assertEquals(Arrays.asList(1, 4, 5), scenario1.RemoveDuplicates.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4, 3, 5)));
		assertEquals(public static List<Object> removeDuplicates(List<Object> numbers) {, scenario1.RemoveDuplicates.*/);
		
    }

}