// TriTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {

    /**
     * Test case for {@link Tri#tri(int)}.
     */
    @Test
    void testTri() {
        List<Number> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(8);
        expected.add(3);
        expected.add(15);
        expected.add(4);
        expected.add(24);
        expected.add(5);
        expected.add(35);
        expected.add(6);
        expected.add(48);
        expected.add(7);
        expected.add(63);
        expected.add(8);
        expected.add(80);
        expected.add(9);
        expected.add(99);
        expected.add(10);
        expected.add(120);
        expected.add(11);
        assertEquals(expected, Tri.tri(20));
    }
}
