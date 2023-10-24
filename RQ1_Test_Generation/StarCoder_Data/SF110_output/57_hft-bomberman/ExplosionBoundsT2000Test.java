// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains ten unit test cases for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {

    @Test
    void testContain() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(2, 1)));
        assertTrue(bounds.contain(new Point(3, 1)));
        assertTrue(bounds.contain(new Point(4, 1)));
        assertTrue(bounds.contain(new Point(2, 2)));
        assertTrue(bounds.contain(new Point(3, 2)));
        assertTrue(bounds.contain(new Point(4, 2)));
        assertFalse(bounds.contain(new Point(1, 1)));
        assertFalse(bounds.contain(new Point(1, 2)));
        assertFalse(bounds.contain(new Point(1, 3)));
        assertFalse(bounds.contain(new Point(1, 4)));
        assertFalse(bounds.contain(new Point(2, 3)));
        assertFalse(bounds.contain(new Point(2, 4)));
        assertFalse(bounds.contain(new Point(3, 3)));
        assertFalse(bounds.contain(new Point(3, 4)));
        assertFalse(bounds.contain(new Point(4, 3)));
        assertFalse(bounds.contain(new Point(4, 4)));
    }
}
