package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CompareOneTest {
    @Test
    void testCompareOne() {
        assertEquals(CompareOne.compareOne(1, 2), 2);
        assertEquals(CompareOne.compareOne(1, 2.5), 2.5);
        assertEquals(CompareOne.compareOne(2, 3), 3);
        assertEquals(CompareOne.compareOne(5, 6), 6);
        assertEquals(CompareOne.compareOne(1, "2,3"), "2,3");
        assertEquals(CompareOne.compareOne("5,1", "6"), "6");
        assertEquals(CompareOne.compareOne("1", "2"), "2");
        assertEquals(CompareOne.compareOne("1", 1), null);
    }
}