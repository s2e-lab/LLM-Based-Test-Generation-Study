package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class UniqueTest {
    @Test
    void testUnique() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(3);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(2);
        result.add(3);
        result.add(5);
        result.add(9);
        result.add(123);
        assertEquals(result, Unique.unique(l));
    }
}