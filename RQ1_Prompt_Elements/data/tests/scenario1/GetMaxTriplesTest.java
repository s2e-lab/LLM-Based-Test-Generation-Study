package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxTriplesTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario1.GetMaxTriples.getMaxTriples(5));
		assertEquals(4, scenario1.GetMaxTriples.getMaxTriples(6));
		assertEquals(36, scenario1.GetMaxTriples.getMaxTriples(10));
		assertEquals(53361, scenario1.GetMaxTriples.getMaxTriples(100));
		
    }

}