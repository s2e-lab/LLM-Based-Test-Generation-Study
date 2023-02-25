package scenario3;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddCountTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(0, 1), scenario3.EvenOddCount.evenOddCount(7));
		assertEquals(Arrays.asList(1, 1), scenario3.EvenOddCount.evenOddCount(-78));
		assertEquals(Arrays.asList(2, 2), scenario3.EvenOddCount.evenOddCount(3452));
		assertEquals(Arrays.asList(3, 3), scenario3.EvenOddCount.evenOddCount(346211));
		assertEquals(Arrays.asList(3, 3), scenario3.EvenOddCount.evenOddCount(-345821));
		assertEquals(Arrays.asList(1, 0), scenario3.EvenOddCount.evenOddCount(-2));
		assertEquals(Arrays.asList(2, 3), scenario3.EvenOddCount.evenOddCount(-45347));
		assertEquals(Arrays.asList(1, 0), scenario3.EvenOddCount.evenOddCount(0));
		assertEquals(public static List<Integer> evenOddCount(int num) {, scenario3.EvenOddCount.*/);
		
    }

}