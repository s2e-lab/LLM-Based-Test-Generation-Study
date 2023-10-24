// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {

    /**
    * Test method for {@link Map#getStartPoint(int)}.
    */
    @Test
    void testGetStartPoint() {
        Map map = new Map("src/test/resources/maps/map_1.xml");
        Point[] startpoints = map.getStartPoints();
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(1));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(2));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(3));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(4));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(5));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(6));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(7));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(8));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(9));
        assertEquals(new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2), map.getStartPoint(10));
    }
}
