package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class BelowZeroTest {
    @Test
    void testBelowZero() {
        List<Object> operations = new ArrayList<>();
        operations.add(1);
        operations.add(2);
        operations.add(3);
        assertEquals(false, BelowZero.belowZero(operations));
        operations.add(-4);
        operations.add(5);
        assertEquals(true, BelowZero.belowZero(operations));
        operations.clear();
        assertEquals(false, BelowZero.belowZero(operations));
        operations.add(1);
        operations.add(2);
        operations.add(-3);
        operations.add(1);
        operations.add(2);
        operations.add(-3);
        assertEquals(false, BelowZero.belowZero(operations));
        operations.clear();
        operations.add(1);
        operations.add(2);
        operations.add(-4);
        operations.add(5);
        operations.add(6);
        assertEquals(true, BelowZero.belowZero(operations));
        operations.clear();
        operations.add(1);
        operations.add(-1);
        operations.add(2);
        operations.add(-2);
        operations.add(5);
        operations.add(-5);
        operations.add(4);
        operations.add(-4);
        assertEquals(false, BelowZero.belowZero(operations));
        operations.clear();
        operations.add(1);
        operations.add(-1);
        operations.add(2);
        operations.add(-2);
        operations.add(5);
        operations.add(-5);
        operations.add(4);
        operations.add(-5);
        assertEquals(true, BelowZero.belowZero(operations));
        operations.clear();
        operations.add(1);
        operations.add(-2);
        operations.add(2);
        operations.add(-2);
        operations.add(5);
        operations.add(-5);
        operations.add(4);
        operations.add(-4);
        assertEquals(true, BelowZero.belowZero(operations));
    }
}