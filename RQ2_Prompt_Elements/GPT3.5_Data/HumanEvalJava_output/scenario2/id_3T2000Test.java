Here's the code for the test class:

```
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BelowZeroTest {

    @Test
    void testBelowZero() {
        List<Object> operations1 = Arrays.asList(100.0, -50.0, 20.0, -80.0);
        assertTrue(BelowZero.belowZero(operations1));

        List<Object> operations2 = Arrays.asList(100, -50, 20, -80);
        assertTrue(BelowZero.belowZero(operations2));

        List<Object> operations3 = Arrays.asList(100.0, -50.0, 20.0, 80.0);
        assertFalse(BelowZero.belowZero(operations3));

        List<Object> operations4 = Arrays.asList(100, -50, 20, 80);
        assertFalse(BelowZero.belowZero(operations4));

        List<Object> operations5 = Arrays.asList(100.0, -50.0, 20.0, -80.0, 30.0);
        assertTrue(BelowZero.belowZero(operations5));

        List<Object> operations6 = Arrays.asList(100, -50, 20, -80, 30);
        assertTrue(BelowZero.belowZero(operations6));

        List<Object> operations7 = Arrays.asList(100.0, -50.0, 20.0, 80.0, -30.0);
        assertFalse(BelowZero.belowZero(operations7));

        List<Object> operations8 = Arrays.asList(100, -50, 20, 80, -30);
        assertFalse(BelowZero.belowZero(operations8));

        List<Object> operations9 = Arrays.asList(100.0, -50.0, 20.0, -80.0, 30.0, -10.0);
        assertTrue(BelowZero.belowZero(operations9));

        List<Object> operations10 = Arrays.asList(100, -50, 20, -80, 30, -10);
        assertTrue(BelowZero.belowZero(operations10));
    }
}
```