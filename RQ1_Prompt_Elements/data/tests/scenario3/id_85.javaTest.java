package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Add1Test {

    @Test
    public void test() throws Exception{

        assertEquals(88, scenario3.Add1.add(Arrays.asList(4, 88)));
		assertEquals(122, scenario3.Add1.add(Arrays.asList(4, 5, 6, 7, 2, 122)));
		assertEquals(0, scenario3.Add1.add(Arrays.asList(4, 0, 6, 7)));
		assertEquals(12, scenario3.Add1.add(Arrays.asList(4, 4, 6, 8)));
		
    }

}