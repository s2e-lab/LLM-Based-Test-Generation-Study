package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    public void test() throws Exception{

        assertEquals("", scenario3.Concatenate.concatenate(Arrays.asList()));
		assertEquals("abc", scenario3.Concatenate.concatenate(Arrays.asList("a", "b", "c")));
		assertEquals("", scenario3.Concatenate.concatenate(Arrays.asList()));
		assertEquals("xyz", scenario3.Concatenate.concatenate(Arrays.asList("x", "y", "z")));
		assertEquals("xyzwk", scenario3.Concatenate.concatenate(Arrays.asList("x", "y", "z", "w", "k")));
		
    }

}