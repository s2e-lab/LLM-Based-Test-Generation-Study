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
        Map map = new Map();
        Point point = map.getStartPoint(1);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(2);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(3);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(4);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(5);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(6);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(7);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(8);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(9);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(10);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
    }
}

// Map_3Test.java
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
class Map_3Test {
		
    /**
    * Test method for {@link Map#getStartPoint(int)}.
    */
    @Test
    void testGetStartPoint() {
        Map map = new Map();
        Point point = map.getStartPoint(1);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(2);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(3);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(4);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(5);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(6);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(7);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(8);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(9);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(10);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
    }
}

// Map_4Test.java
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
class Map_4Test {
		
    /**
    * Test method for {@link Map#getStartPoint(int)}.
    */
    @Test
    void testGetStartPoint() {
        Map map = new Map();
        Point point = map.getStartPoint(1);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(2);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(3);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(4);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(5);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(6);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        point = map.getStartPoint(7);
        assertEquals(point.x, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        assertEquals(point.y, 1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);