package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveOneBallTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario3.MoveOneBall.moveOneBall(Arrays.asList(3, 4, 5, 1, 2)));
		assertEquals(true, scenario3.MoveOneBall.moveOneBall(Arrays.asList(3, 5, 10, 1, 2)));
		assertEquals(false, scenario3.MoveOneBall.moveOneBall(Arrays.asList(4, 3, 1, 2)));
		assertEquals(false, scenario3.MoveOneBall.moveOneBall(Arrays.asList(3, 5, 4, 1, 2)));
		assertEquals(true, scenario3.MoveOneBall.moveOneBall(Arrays.asList()));
		
    }

}