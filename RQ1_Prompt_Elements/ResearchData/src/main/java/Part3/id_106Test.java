package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FTest {
    @Test
    void testF() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 15), F.f(5));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28), F.f(7));
        assertEquals(Arrays.asList(1), F.f(1));
        assertEquals(Arrays.asList(1, 2, 6), F.f(3));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55), F.f(11));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55, 39916800, 78), F.f(13));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55, 39916800, 78, 479001600, 143), F.f(15));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55, 39916800, 78, 479001600, 143, 6227020800, 231), F.f(17));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55, 39916800, 78, 479001600, 143, 6227020800, 231, 87178291200, 364), F.f(19));
        assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28, 40320, 945, 3628800, 55, 39916800, 78, 479001600, 143, 6227020800, 231, 87178291200, 364, 1307674368000, 575), F.f(21));
    }
}