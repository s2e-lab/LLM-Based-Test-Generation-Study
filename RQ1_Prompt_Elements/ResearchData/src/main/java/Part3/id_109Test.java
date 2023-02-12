package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MoveOneBallTest {
    @Test
    public void testMoveOneBall() {
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(3, 4, 5, 1, 2)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(3, 5, 10, 1, 2)));
        assertEquals(false, MoveOneBall.moveOneBall(Arrays.asList(4, 3, 1, 2)));
        assertEquals(false, MoveOneBall.moveOneBall(Arrays.asList(3, 5, 4, 1, 2)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList()));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(1, 2, 3, 4, 5, 6)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        assertEquals(true, MoveOneBall.moveOneBall(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}