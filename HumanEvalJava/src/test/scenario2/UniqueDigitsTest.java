package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueDigitsTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(1, 15, 33), scenario2.UniqueDigits.uniqueDigits(Arrays.asList(15, 33, 1422, 1)));
        assertEquals(Arrays.asList(), scenario2.UniqueDigits.uniqueDigits(Arrays.asList(152, 323, 1422, 10)));
        assertEquals(Arrays.asList(111, 151), scenario2.UniqueDigits.uniqueDigits(Arrays.asList(12345, 2033, 111, 151)));
        assertEquals(Arrays.asList(31, 135), scenario2.UniqueDigits.uniqueDigits(Arrays.asList(135, 103, 31)));

    }

}