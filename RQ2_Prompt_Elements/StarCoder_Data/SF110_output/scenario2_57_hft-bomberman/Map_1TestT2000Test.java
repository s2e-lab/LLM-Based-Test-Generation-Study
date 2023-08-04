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
        assertEquals(map.getTile(0, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(1, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(2, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(3, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(4, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(5, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(6, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(7, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(8, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(9, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(10, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(11, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(12, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(13, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(14, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(15, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(16, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(17, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(18, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(19, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(20, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(21, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(22, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(23, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(24, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(25, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(26, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(27, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(28, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(29, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(30, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(31, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(32, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(33, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(34, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(35, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(36, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(37, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(38, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(39, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(40, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(41, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(42, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(43, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(44, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(45, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(46, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(47, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(48, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(49, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(50, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(51, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(52, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(53, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(54, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(55, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(56, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(57, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(58, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(59, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(60, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(61, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(62, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(63, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(64, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(65, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(66, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(67, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(68, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(69, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(70, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(71, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(72, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(73, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(74, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(75, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(76, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(77, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(78, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(79, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(80, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(81, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(82, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(83, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(84, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(85, 0).getTileType(),