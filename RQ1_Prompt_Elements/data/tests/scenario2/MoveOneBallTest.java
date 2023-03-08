package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveOneBallTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario2.MoveOneBall.moveOneBall(Arrays.asList(3, 4, 5, 1, 2)));
        assertEquals(true, scenario2.MoveOneBall.moveOneBall(Arrays.asList(3, 5, 10, 1, 2)));
        assertEquals(false, scenario2.MoveOneBall.moveOneBall(Arrays.asList(4, 3, 1, 2)));
        assertEquals(false, scenario2.MoveOneBall.moveOneBall(Arrays.asList(3, 5, 4, 1, 2)));
        assertEquals(true, scenario2.MoveOneBall.moveOneBall(Arrays.asList()));

    }

}