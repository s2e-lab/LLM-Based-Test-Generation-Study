package scenario2;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EatTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(11, 4), scenario2.Eat.eat(5, 6, 10));
		assertEquals(Arrays.asList(12, 1), scenario2.Eat.eat(4, 8, 9));
		assertEquals(Arrays.asList(11, 0), scenario2.Eat.eat(1, 10, 10));
		assertEquals(Arrays.asList(7, 0), scenario2.Eat.eat(2, 11, 5));
		assertEquals(Arrays.asList(9, 2), scenario2.Eat.eat(4, 5, 7));
		assertEquals(Arrays.asList(5, 0), scenario2.Eat.eat(4, 5, 1));
		
    }

}