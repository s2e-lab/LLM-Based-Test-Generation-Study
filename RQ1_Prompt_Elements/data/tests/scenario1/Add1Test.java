package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Add1Test {

    @Test
    public void test() throws Exception {

        assertEquals(88, scenario1.Add1.add(Arrays.asList(4, 88)));
        assertEquals(122, scenario1.Add1.add(Arrays.asList(4, 5, 6, 7, 2, 122)));
        assertEquals(0, scenario1.Add1.add(Arrays.asList(4, 0, 6, 7)));
        assertEquals(12, scenario1.Add1.add(Arrays.asList(4, 4, 6, 8)));

    }

}