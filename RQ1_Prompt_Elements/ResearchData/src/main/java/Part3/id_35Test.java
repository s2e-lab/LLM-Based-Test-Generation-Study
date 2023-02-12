package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MaxElementTest {
    @Test
    void testMaxElement() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(3, MaxElement.maxElement(l));
        l.clear();
        l.add(5);
        l.add(3);
        l.add(-5);
        l.add(2);
        l.add(-3);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(123);
        l.add(1);
        l.add(-10);
        assertEquals(123, MaxElement.maxElement(l));
    }
}