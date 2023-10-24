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

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns true if the given point lies within the bounds.
     */
    @Test
    void testContain() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(2, 2)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns false if the given point lies outside the bounds.
     */
    @Test
    void testContain2() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertFalse(bounds.contain(new Point(5, 5)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns true if the given point lies on the upper bound.
     */
    @Test
    void testContain3() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(2, 1)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns true if the given point lies on the lower bound.
     */
    @Test
    void testContain4() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(2, 2)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns true if the given point lies on the right bound.
     */
    @Test
    void testContain5() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(3, 2)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns true if the given point lies on the left bound.
     */
    @Test
    void testContain6() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertTrue(bounds.contain(new Point(1, 2)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns false if the given point lies on the upper right bound.
     */
    @Test
    void testContain7() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertFalse(bounds.contain(new Point(3, 1)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns false if the given point lies on the upper left bound.
     */
    @Test
    void testContain8() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertFalse(bounds.contain(new Point(1, 1)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns false if the given point lies on the lower right bound.
     */
    @Test
    void testContain9() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertFalse(bounds.contain(new Point(3, 2)));
    }

    /**
     * Test case for {@link ExplosionBounds#contain(Point)}.
     * It tests whether the method returns false if the given point lies on the lower left bound.
     */
    @Test
    void testContain10() {
        ExplosionBounds bounds = new ExplosionBounds(1, 2, 3, 4);
        assertFalse(bounds.contain(new Point(1, 2)));
    }
}
