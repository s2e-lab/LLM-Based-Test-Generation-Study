package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ExchangeTest {
    @Test
    void testExchange() {
        assertEquals("YES", Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4)));
        assertEquals("NO", Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 5, 3, 4)));
        assertEquals("YES", Exchange.exchange(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 1, 4, 3)));
        assertEquals("YES", Exchange.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 4)));
        assertEquals("NO", Exchange.exchange(Arrays.asList(5, 7, 3), Arrays.asList(2, 6, 3)));
        assertEquals("NO", Exchange.exchange(Arrays.asList(3, 2, 6, 1, 8, 9), Arrays.asList(3, 5, 5, 1, 1, 1)));
        assertEquals("YES", Exchange.exchange(Arrays.asList(100, 200), Arrays.asList(200, 200)));
        assertEquals("YES", Exchange.exchange(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        assertEquals("NO", Exchange.exchange(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11)));
        assertEquals("YES", Exchange.exchange(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 10, 9)));
    }
}