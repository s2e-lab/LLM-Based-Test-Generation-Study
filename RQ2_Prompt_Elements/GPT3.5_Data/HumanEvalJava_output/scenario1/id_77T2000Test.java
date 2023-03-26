Here's the completed IscubeTest.java file with ten unit test cases for the iscube() method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Iscube}.
 * It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
 */
class IscubeTest {

    @Test
    void testPositiveCube() {
        assertTrue(Iscube.iscube(1));
        assertTrue(Iscube.iscube(8));
        assertTrue(Iscube.iscube(27));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(125));
    }

    @Test
    void testNegativeCube() {
        assertFalse(Iscube.iscube(-1));
        assertFalse(Iscube.iscube(-8));
        assertFalse(Iscube.iscube(-27));
        assertFalse(Iscube.iscube(-64));
        assertFalse(Iscube.iscube(-125));
    }
}
```