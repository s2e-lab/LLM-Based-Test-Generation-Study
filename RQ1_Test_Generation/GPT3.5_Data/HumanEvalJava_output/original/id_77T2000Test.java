// IscubeTest.java
package original;

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
        assertTrue(Iscube.iscube(216));
        assertTrue(Iscube.iscube(343));
        assertTrue(Iscube.iscube(512));
        assertTrue(Iscube.iscube(729));
        assertTrue(Iscube.iscube(1000));
    }

    @Test
    void testNegativeCube() {
        assertTrue(Iscube.iscube(-1));
        assertTrue(Iscube.iscube(-8));
        assertTrue(Iscube.iscube(-27));
        assertTrue(Iscube.iscube(-64));
        assertTrue(Iscube.iscube(-125));
        assertTrue(Iscube.iscube(-216));
        assertTrue(Iscube.iscube(-343));
        assertTrue(Iscube.iscube(-512));
        assertTrue(Iscube.iscube(-729));
        assertTrue(Iscube.iscube(-1000));
    }

    @Test
    void testNonCube() {
        assertFalse(Iscube.iscube(2));
        assertFalse(Iscube.iscube(3));
        assertFalse(Iscube.iscube(4));
        assertFalse(Iscube.iscube(5));
        assertFalse(Iscube.iscube(6));
        assertFalse(Iscube.iscube(7));
        assertFalse(Iscube.iscube(180));
        assertFalse(Iscube.iscube(1729));
    }

    @Test
    void testZero() {
        assertTrue(Iscube.iscube(0));
    }
}