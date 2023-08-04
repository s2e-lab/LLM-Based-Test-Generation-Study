// Map_1Test.java
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
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class Map_1Test {

    /**
    * Test of {@link Map#getTile(int, int)} method.
    */
    @Test
    void testGetTile() {
        Map map = new Map();
        Tile tile = map.getTile(0, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(1, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(2, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(3, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(4, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(5, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(6, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(7, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(8, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(9, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(10, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(11, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(12, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(13, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(14, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(15, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(16, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(17, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(18, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(19, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(20, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(21, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(22, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(23, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(24, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(25, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(26, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(27, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(28, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(29, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(30, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(31, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(32, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(33, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(34, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(35, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(36, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(37, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(38, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(39, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(40, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(41, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(42, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(43, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(44, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(45, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(46, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(47, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(48, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(49, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(50, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(51, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(52, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(53, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(54, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(55, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(56, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(57, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(58, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(59, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(60, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(61, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(62, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(63, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(64, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(65, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(66, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(67, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(68, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(69, 0);
        assertEquals(tile.getTileType(), TileType.EMPTY);
        tile = map.getTile(70, 