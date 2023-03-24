// AddTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Add}.
 * It contains ten unit test cases for the {@link Add#add(int, int)} method.
 */
class AddTest {

    @Test
    void testAddZero() {
        assertEquals(0, Add.add(0, 0));
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(2, Add.add(1, 1));
        assertEquals(5, Add.add(2, 3));
        assertEquals(12, Add.add(5, 7));
        assertEquals(1297, Add.add(572, 725));
        assertEquals(855, Add.add(51, 804));
        assertEquals(741, Add.add(645, 96));
        assertEquals(1565, Add.add(712, 853));
        assertEquals(324, Add.add(223, 101));
        assertEquals(105, Add.add(76, 29));
        assertEquals(565, Add.add(416, 149));
    }
}