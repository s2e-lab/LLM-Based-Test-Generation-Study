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
        Map map = new Map_1();
        assertEquals(map.getTile(0, 0).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 1).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 2).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 3).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 4).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 5).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 6).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 7).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 8).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 9).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 10).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 11).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 12).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 13).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 14).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 15).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 16).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 17).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 18).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 19).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 20).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 21).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 22).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 23).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 24).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 25).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 26).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 27).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 28).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 29).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 30).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 31).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 32).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 33).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 34).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 35).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 36).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 37).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 38).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 39).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 40).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 41).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 42).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 43).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 44).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 45).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 46).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 47).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 48).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 49).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 50).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 51).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 52).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 53).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 54).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 55).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 56).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 57).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 58).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 59).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 60).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 61).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 62).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 63).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 64).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 65).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 66).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 67).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 68).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 69).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 70).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 71).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 72).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 73).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 74).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 75).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 76).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 77).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 78).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 79).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 80).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 81).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 82).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 83).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 84).getTileType(), TileType.EMPTY);
        assertEquals(map.getTile(0, 85).getTile