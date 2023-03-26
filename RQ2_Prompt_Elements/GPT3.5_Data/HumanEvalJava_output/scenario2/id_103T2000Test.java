Here's the source code for the RoundedAvgTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoundedAvgTest {

    @Test
    void testRoundedAvg1() {
        assertEquals("0b101", RoundedAvg.roundedAvg(1, 5));
    }

    @Test
    void testRoundedAvg2() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 3));
    }

    @Test
    void testRoundedAvg3() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(5, 1));
    }

    @Test
    void testRoundedAvg4() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 1));
    }

    @Test
    void testRoundedAvg5() {
        assertEquals("0b100", RoundedAvg.roundedAvg(90, 110));
    }

    @Test
    void testRoundedAvg6() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(10, 5));
    }

    @Test
    void testRoundedAvg7() {
        assertEquals("0b0", RoundedAvg.roundedAvg(0, 0));
    }

    @Test
    void testRoundedAvg8() {
        assertEquals("0b1", RoundedAvg.roundedAvg(0, 1));
    }

    @Test
    void testRoundedAvg9() {
        assertEquals("0b101", RoundedAvg.roundedAvg(3, 7));
    }

    @Test
    void testRoundedAvg10() {
        assertEquals("0b100", RoundedAvg.roundedAvg(98, 102));
    }
}
```

This test class contains ten unit test cases for the `roundedAvg` method of the `RoundedAvg` class. Each test case is annotated with the `@Test` annotation, which indicates that it is a JUnit test case. The `assertEquals` method is used to compare the expected result with the actual result returned by the `roundedAvg` method.