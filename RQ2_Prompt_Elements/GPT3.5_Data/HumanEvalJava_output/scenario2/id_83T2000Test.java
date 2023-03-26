Here's the code for the test class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartsOneEndsTest {

    @Test
    void testStartsOneEndsWithOneDigit() {
        assertEquals(2, StartsOneEnds.startsOneEnds(1));
    }

    @Test
    void testStartsOneEndsWithTwoDigits() {
        assertEquals(20, StartsOneEnds.startsOneEnds(2));
    }

    @Test
    void testStartsOneEndsWithThreeDigits() {
        assertEquals(200, StartsOneEnds.startsOneEnds(3));
    }

    @Test
    void testStartsOneEndsWithFourDigits() {
        assertEquals(2000, StartsOneEnds.startsOneEnds(4));
    }

    @Test
    void testStartsOneEndsWithFiveDigits() {
        assertEquals(20000, StartsOneEnds.startsOneEnds(5));
    }

    @Test
    void testStartsOneEndsWithSixDigits() {
        assertEquals(200000, StartsOneEnds.startsOneEnds(6));
    }

    @Test
    void testStartsOneEndsWithSevenDigits() {
        assertEquals(2000000, StartsOneEnds.startsOneEnds(7));
    }

    @Test
    void testStartsOneEndsWithEightDigits() {
        assertEquals(20000000, StartsOneEnds.startsOneEnds(8));
    }

    @Test
    void testStartsOneEndsWithNineDigits() {
        assertEquals(200000000, StartsOneEnds.startsOneEnds(9));
    }

    @Test
    void testStartsOneEndsWithTenDigits() {
        assertEquals(2000000000, StartsOneEnds.startsOneEnds(10));
    }
}
```

This test class contains ten test cases that cover all possible values of n from 1 to 10. Each test case calls the `startsOneEnds` method with a specific value of n and checks that the returned value is equal to the expected value. The expected values are calculated manually based on the problem statement.