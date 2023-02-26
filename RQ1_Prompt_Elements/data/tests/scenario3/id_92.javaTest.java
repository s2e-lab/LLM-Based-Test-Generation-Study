package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnyIntTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario3.AnyInt.anyInt(2, 3, 1));
		assertEquals(false, scenario3.AnyInt.anyInt(2.5, 2, 3));
		assertEquals(false, scenario3.AnyInt.anyInt(1.5, 5, 3.5));
		assertEquals(false, scenario3.AnyInt.anyInt(2, 6, 2));
		assertEquals(true, scenario3.AnyInt.anyInt(4, 2, 2));
		assertEquals(false, scenario3.AnyInt.anyInt(2.2, 2.2, 2.2));
		assertEquals(true, scenario3.AnyInt.anyInt(-4, 6, 2));
		assertEquals(true, scenario3.AnyInt.anyInt(2, 1, 1));
		assertEquals(true, scenario3.AnyInt.anyInt(3, 4, 7));
		assertEquals(false, scenario3.AnyInt.anyInt(3.0, 4, 7));
		
    }

}