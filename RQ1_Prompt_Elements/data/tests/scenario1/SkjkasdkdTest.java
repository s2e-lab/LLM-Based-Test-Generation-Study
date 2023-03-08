package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SkjkasdkdTest {

    @Test
    public void test() throws Exception {

        assertEquals(10, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3)));
        assertEquals(25, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1)));
        assertEquals(13, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3)));
        assertEquals(11, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6)));
        assertEquals(3, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(0, 81, 12, 3, 1, 21)));
        assertEquals(7, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(0, 8, 1, 2, 1, 7)));
        assertEquals(19, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(8191)));
        assertEquals(19, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(8191, 123456, 127, 7)));
        assertEquals(10, scenario1.Skjkasdkd.skjkasdkd(Arrays.asList(127, 97, 8192)));

    }

}