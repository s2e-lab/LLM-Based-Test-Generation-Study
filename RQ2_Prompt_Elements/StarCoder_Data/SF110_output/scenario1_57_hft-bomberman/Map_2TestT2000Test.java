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
    * Test of {@link Map#getStartPoint(int)} with playerNo = 1.
    */
    @Test
    void testGetStartPoint1() {
        Map map = new Map();
        Point expected = new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(1);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 2.
    */
    @Test
    void testGetStartPoint2() {
        Map map = new Map();
        Point expected = new Point(2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(2);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 3.
    */
    @Test
    void testGetStartPoint3() {
        Map map = new Map();
        Point expected = new Point(3 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(3);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 4.
    */
    @Test
    void testGetStartPoint4() {
        Map map = new Map();
        Point expected = new Point(4 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(4);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 5.
    */
    @Test
    void testGetStartPoint5() {
        Map map = new Map();
        Point expected = new Point(5 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(5);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 6.
    */
    @Test
    void testGetStartPoint6() {
        Map map = new Map();
        Point expected = new Point(6 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(6);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 7.
    */
    @Test
    void testGetStartPoint7() {
        Map map = new Map();
        Point expected = new Point(7 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(7);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 8.
    */
    @Test
    void testGetStartPoint8() {
        Map map = new Map();
        Point expected = new Point(8 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(8);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 9.
    */
    @Test
    void testGetStartPoint9() {
        Map map = new Map();
        Point expected = new Point(9 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(9);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 10.
    */
    @Test
    void testGetStartPoint10() {
        Map map = new Map();
        Point expected = new Point(10 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(10);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 11.
    */
    @Test
    void testGetStartPoint11() {
        Map map = new Map();
        Point expected = new Point(1 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(11);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 12.
    */
    @Test
    void testGetStartPoint12() {
        Map map = new Map();
        Point expected = new Point(2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(12);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 13.
    */
    @Test
    void testGetStartPoint13() {
        Map map = new Map();
        Point expected = new Point(3 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(13);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 14.
    */
    @Test
    void testGetStartPoint14() {
        Map map = new Map();
        Point expected = new Point(4 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(14);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 15.
    */
    @Test
    void testGetStartPoint15() {
        Map map = new Map();
        Point expected = new Point(5 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(15);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 16.
    */
    @Test
    void testGetStartPoint16() {
        Map map = new Map();
        Point expected = new Point(6 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(16);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 17.
    */
    @Test
    void testGetStartPoint17() {
        Map map = new Map();
        Point expected = new Point(7 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(17);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 18.
    */
    @Test
    void testGetStartPoint18() {
        Map map = new Map();
        Point expected = new Point(8 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2, // field
        2 * Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
        Point actual = map.getStartPoint(18);
        assertEquals(expected, actual);
    }

    /**
    * Test of {@link Map#getStartPoint(int)} with playerNo = 19.
    */
    @Test
    void testGetStartPoint19() {
        Map map = new Map();
        Point expected = new Point(9 * Constants.TILE_BORDER + Constants.TILE_BORDER