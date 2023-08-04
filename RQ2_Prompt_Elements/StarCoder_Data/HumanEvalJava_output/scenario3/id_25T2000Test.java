// FactorizeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

    @Test
    void testFactorize() {
        assertEquals(List.of(2, 2, 2), Factorize.factorize(8));
        assertEquals(List.of(5, 5), Factorize.factorize(25));
        assertEquals(List.of(2, 5, 7), Factorize.factorize(70));
        assertEquals(List.of(2), Factorize.factorize(2));
        assertEquals(List.of(2, 2), Factorize.factorize(4));
        assertEquals(List.of(2, 2, 2), Factorize.factorize(8));
        assertEquals(List.of(3, 19), Factorize.factorize(57));
        assertEquals(List.of(3, 3, 19, 19), Factorize.factorize(3249));
        assertEquals(List.of(3, 3, 3, 19, 19, 19), Factorize.factorize(185193));
        assertEquals(List.of(3, 19, 19, 19), Factorize.factorize(20577));
        assertEquals(List.of(2, 3, 3), Factorize.factorize(18));
    }
}
