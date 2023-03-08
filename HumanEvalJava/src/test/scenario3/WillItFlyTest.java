package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WillItFlyTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.WillItFly.willItFly(Arrays.asList(3, 2, 3), 9));
        assertEquals(false, scenario3.WillItFly.willItFly(Arrays.asList(1, 2), 5));
        assertEquals(true, scenario3.WillItFly.willItFly(Arrays.asList(3), 5));
        assertEquals(false, scenario3.WillItFly.willItFly(Arrays.asList(3, 2, 3), 1));
        assertEquals(false, scenario3.WillItFly.willItFly(Arrays.asList(1, 2, 3), 6));
        assertEquals(true, scenario3.WillItFly.willItFly(Arrays.asList(5), 5));

    }

}