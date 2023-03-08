package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatenateTest {

    @Test
    public void test() throws Exception {

        assertEquals("", scenario1.Concatenate.concatenate(Arrays.asList()));
        assertEquals("abc", scenario1.Concatenate.concatenate(Arrays.asList("a", "b", "c")));
        assertEquals("", scenario1.Concatenate.concatenate(Arrays.asList()));
        assertEquals("xyz", scenario1.Concatenate.concatenate(Arrays.asList("x", "y", "z")));
        assertEquals("xyzwk", scenario1.Concatenate.concatenate(Arrays.asList("x", "y", "z", "w", "k")));

    }

}