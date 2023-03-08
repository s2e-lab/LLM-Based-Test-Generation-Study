package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatenateTest {

    @Test
    public void test() throws Exception {

        assertEquals("", scenario2.Concatenate.concatenate(Arrays.asList()));
        assertEquals("abc", scenario2.Concatenate.concatenate(Arrays.asList("a", "b", "c")));
        assertEquals("", scenario2.Concatenate.concatenate(Arrays.asList()));
        assertEquals("xyz", scenario2.Concatenate.concatenate(Arrays.asList("x", "y", "z")));
        assertEquals("xyzwk", scenario2.Concatenate.concatenate(Arrays.asList("x", "y", "z", "w", "k")));

    }

}