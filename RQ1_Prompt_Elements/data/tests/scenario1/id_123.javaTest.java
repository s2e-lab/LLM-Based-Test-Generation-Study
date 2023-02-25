package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetOddCollatzTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(1, 5, 7, 11, 13, 17), scenario1.GetOddCollatz.getOddCollatz(14));
		assertEquals(Arrays.asList(1, 5), scenario1.GetOddCollatz.getOddCollatz(5));
		assertEquals(Arrays.asList(1, 3, 5), scenario1.GetOddCollatz.getOddCollatz(12));
		assertEquals(Arrays.asList(1), scenario1.GetOddCollatz.getOddCollatz(1));
		assertEquals(public static List<Integer> getOddCollatz(int n) {, scenario1.GetOddCollatz.*/);
		
    }

}