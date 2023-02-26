package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsBoredTest {

    @Test
    public void test() throws Exception{

        assertEquals(0, scenario1.IsBored.isBored("Hello world"));
		assertEquals(0, scenario1.IsBored.isBored("Is the sky blue?"));
		assertEquals(1, scenario1.IsBored.isBored("I love It !"));
		assertEquals(0, scenario1.IsBored.isBored("bIt"));
		assertEquals(2, scenario1.IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, scenario1.IsBored.isBored("You and I are going for a walk"));
		
    }

}