Here's the completed RoundedAvgTest class with ten unit test cases for the RoundedAvg class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RoundedAvg}.
 * It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
 */
class RoundedAvgTest {

    @Test
    void testRoundedAvg1() {
        Object result = RoundedAvg.roundedAvg(1, 10);
        assertEquals("0b6", result);
    }

    @Test
    void testRoundedAvg2() {
        Object result = RoundedAvg.roundedAvg(5, 5);
        assertEquals("0b5", result);
    }

    @Test
    void testRoundedAvg3() {
        Object result = RoundedAvg.roundedAvg(10, 1);
        assertEquals(-1, result);
    }

    @Test
    void testRoundedAvg4() {
        Object result = RoundedAvg.roundedAvg(0, 0);
        assertEquals("0b0", result);
    }

    @Test
    void testRoundedAvg5() {
        Object result = RoundedAvg.roundedAvg(-5, 5);
        assertEquals("0b0", result);
    }

    @Test
    void testRoundedAvg6() {
        Object result = RoundedAvg.roundedAvg(1, 100);
        assertEquals("0b51", result);
    }

    @Test
    void testRoundedAvg7() {
        Object result = RoundedAvg.roundedAvg(2, 2);
        assertEquals("0b2", result);
    }

    @Test
    void testRoundedAvg8() {
        Object result = RoundedAvg.roundedAvg(1, 1);
        assertEquals("0b1", result);
    }

    @Test
    void testRoundedAvg9() {
        Object result = RoundedAvg.roundedAvg(100, 1000);
        assertEquals("0b550", result);
    }

    @Test
    void testRoundedAvg10() {
        Object result = RoundedAvg.roundedAvg(0, 100);
        assertEquals("0b50", result);
    }
}
```