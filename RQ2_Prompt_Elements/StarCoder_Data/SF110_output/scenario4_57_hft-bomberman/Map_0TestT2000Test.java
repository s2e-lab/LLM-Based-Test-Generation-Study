// Map_0Test.java
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
* It contains ten unit test cases for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {

    /**
    * Test method for {@link Map#getTileByIndex(int, int)}.
    */
    @Test
    void testGetTileByIndex() {
        Map map = new Map("src/test/resources/map/map_0.xml");
        assertEquals(map.getTileByIndex(0, 0).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 1).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 2).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 3).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 4).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 5).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 6).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 7).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 8).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 9).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 10).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 11).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 12).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 13).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 14).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 15).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 16).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 17).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 18).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 19).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 20).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 21).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 22).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 23).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 24).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 25).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 26).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 27).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 28).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 29).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 30).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 31).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 32).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 33).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 34).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 35).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 36).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 37).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 38).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 39).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 40).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 41).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 42).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 43).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 44).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 45).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 46).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 47).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 48).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 49).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 50).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 51).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 52).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 53).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 54).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 55).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 56).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 57).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 58).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 59).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 60).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 61).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 62).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 63).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 64).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 65).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 66).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 67).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 68).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 69).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 70).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 71).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 72).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 73).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 74).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 75).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 76).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 77).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 78).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 79).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 80).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 81).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 82).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 83).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 84).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 85).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 86).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 87).getType(), TileType.EMPTY);
        assertEquals(map.getTileByIndex(0, 88).getType(), TileType.EMPTY);