package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FTest {

    @Test
    public void test() throws Exception{

        assertEquals(Arrays.asList(1, 2, 6, 24, 15), scenario1.F.f(5));
		assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28), scenario1.F.f(7));
		assertEquals(Arrays.asList(1), scenario1.F.f(1));
		assertEquals(Arrays.asList(1, 2, 6), scenario1.F.f(3));
		
    }

}