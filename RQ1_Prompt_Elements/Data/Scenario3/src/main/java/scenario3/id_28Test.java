package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ConcatenateTest {
    @Test
    void concatenateTest() {
        List<Object> list = new ArrayList<>();
        assertEquals("", Concatenate.concatenate(list));
        list.add("x");
        list.add("y");
        list.add("z");
        assertEquals("xyz", Concatenate.concatenate(list));
        list.add("w");
        list.add("k");
        assertEquals("xyzwk", Concatenate.concatenate(list));
    }
}