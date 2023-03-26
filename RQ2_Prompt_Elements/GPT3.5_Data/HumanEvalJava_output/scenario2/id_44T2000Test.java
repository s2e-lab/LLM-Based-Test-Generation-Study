Here's the code for the ChangeBaseTest class with ten unit test cases for the changeBase method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChangeBaseTest {

    @Test
    void testChangeBaseWithBase2() {
        assertEquals("1010", ChangeBase.changeBase(10, 2));
    }

    @Test
    void testChangeBaseWithBase3() {
        assertEquals("101", ChangeBase.changeBase(10, 3));
    }

    @Test
    void testChangeBaseWithBase4() {
        assertEquals("22", ChangeBase.changeBase(10, 4));
    }

    @Test
    void testChangeBaseWithBase5() {
        assertEquals("20", ChangeBase.changeBase(10, 5));
    }

    @Test
    void testChangeBaseWithBase6() {
        assertEquals("14", ChangeBase.changeBase(10, 6));
    }

    @Test
    void testChangeBaseWithBase7() {
        assertEquals("13", ChangeBase.changeBase(10, 7));
    }

    @Test
    void testChangeBaseWithBase8() {
        assertEquals("12", ChangeBase.changeBase(10, 8));
    }

    @Test
    void testChangeBaseWithBase9() {
        assertEquals("11", ChangeBase.changeBase(10, 9));
    }

    @Test
    void testChangeBaseWithBase10() {
        assertEquals("10", ChangeBase.changeBase(10, 10));
    }

    @Test
    void testChangeBaseWithBase16() {
        assertEquals("A", ChangeBase.changeBase(10, 16));
    }
}
```

This test class contains ten test cases for the changeBase method, each with a different base value. The expected output for each test case is calculated manually and compared with the actual output of the changeBase method using the assertEquals method from the JUnit library.