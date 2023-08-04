// IscubeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

    /**
     * Test case for {@link Iscube#iscube(int)}.
     */
    @Test
    void testIscube() {
        assertTrue(Iscube.iscube(1));
        assertFalse(Iscube.iscube(2));
        assertTrue(Iscube.iscube(-1));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(0));
        assertFalse(Iscube.iscube(180));
        assertTrue(Iscube.iscube(1000));
        assertTrue(Iscube.iscube(1729));
    }
}
