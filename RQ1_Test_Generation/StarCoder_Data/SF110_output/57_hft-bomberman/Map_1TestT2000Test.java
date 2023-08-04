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
    * Test method for {@link Map#getTile(int, int)}.
    */
    @Test
    void testGetTile() {
        Map map = new Map("src/test/resources/maps/map_1.xml");
        assertEquals(map.getTile(0, 0).getType(), "wall");
        assertEquals(map.getTile(0, 1).getType(), "wall");
        assertEquals(map.getTile(0, 2).getType(), "wall");
        assertEquals(map.getTile(0, 3).getType(), "wall");
        assertEquals(map.getTile(0, 4).getType(), "wall");
        assertEquals(map.getTile(0, 5).getType(), "wall");
        assertEquals(map.getTile(0, 6).getType(), "wall");
        assertEquals(map.getTile(0, 7).getType(), "wall");
        assertEquals(map.getTile(0, 8).getType(), "wall");
        assertEquals(map.getTile(0, 9).getType(), "wall");
        assertEquals(map.getTile(0, 10).getType(), "wall");
        assertEquals(map.getTile(0, 11).getType(), "wall");
        assertEquals(map.getTile(0, 12).getType(), "wall");
        assertEquals(map.getTile(0, 13).getType(), "wall");
        assertEquals(map.getTile(0, 14).getType(), "wall");
        assertEquals(map.getTile(0, 15).getType(), "wall");
        assertEquals(map.getTile(0, 16).getType(), "wall");
        assertEquals(map.getTile(0, 17).getType(), "wall");
        assertEquals(map.getTile(0, 18).getType(), "wall");
        assertEquals(map.getTile(0, 19).getType(), "wall");
        assertEquals(map.getTile(0, 20).getType(), "wall");
        assertEquals(map.getTile(0, 21).getType(), "wall");
        assertEquals(map.getTile(0, 22).getType(), "wall");
        assertEquals(map.getTile(0, 23).getType(), "wall");
        assertEquals(map.getTile(0, 24).getType(), "wall");
        assertEquals(map.getTile(0, 25).getType(), "wall");
        assertEquals(map.getTile(0, 26).getType(), "wall");
        assertEquals(map.getTile(0, 27).getType(), "wall");
        assertEquals(map.getTile(0, 28).getType(), "wall");
        assertEquals(map.getTile(0, 29).getType(), "wall");
        assertEquals(map.getTile(0, 30).getType(), "wall");
        assertEquals(map.getTile(0, 31).getType(), "wall");
        assertEquals(map.getTile(0, 32).getType(), "wall");
        assertEquals(map.getTile(0, 33).getType(), "wall");
        assertEquals(map.getTile(0, 34).getType(), "wall");
        assertEquals(map.getTile(0, 35).getType(), "wall");
        assertEquals(map.getTile(0, 36).getType(), "wall");
        assertEquals(map.getTile(0, 37).getType(), "wall");
        assertEquals(map.getTile(0, 38).getType(), "wall");
        assertEquals(map.getTile(0, 39).getType(), "wall");
        assertEquals(map.getTile(0, 40).getType(), "wall");
        assertEquals(map.getTile(0, 41).getType(), "wall");
        assertEquals(map.getTile(0, 42).getType(), "wall");
        assertEquals(map.getTile(0, 43).getType(), "wall");
        assertEquals(map.getTile(0, 44).getType(), "wall");
        assertEquals(map.getTile(0, 45).getType(), "wall");
        assertEquals(map.getTile(0, 46).getType(), "wall");
        assertEquals(map.getTile(0, 47).getType(), "wall");
        assertEquals(map.getTile(0, 48).getType(), "wall");
        assertEquals(map.getTile(0, 49).getType(), "wall");
        assertEquals(map.getTile(0, 50).getType(), "wall");
        assertEquals(map.getTile(0, 51).getType(), "wall");
        assertEquals(map.getTile(0, 52).getType(), "wall");
        assertEquals(map.getTile(0, 53).getType(), "wall");
        assertEquals(map.getTile(0, 54).getType(), "wall");
        assertEquals(map.getTile(0, 55).getType(), "wall");
        assertEquals(map.getTile(0, 56).getType(), "wall");
        assertEquals(map.getTile(0, 57).getType(), "wall");
        assertEquals(map.getTile(0, 58).getType(), "wall");
        assertEquals(map.getTile(0, 59).getType(), "wall");
        assertEquals(map.getTile(0, 60).getType(), "wall");
        assertEquals(map.getTile(0, 61).getType(), "wall");
        assertEquals(map.getTile(0, 62).getType(), "wall");
        assertEquals(map.getTile(0, 63).getType(), "wall");
        assertEquals(map.getTile(0, 64).getType(), "wall");
        assertEquals(map.getTile(0, 65).getType(), "wall");
        assertEquals(map.getTile(0, 66).getType(), "wall");
        assertEquals(map.getTile(0, 67).getType(), "wall");
        assertEquals(map.getTile(0, 68).getType(), "wall");
        assertEquals(map.getTile(0, 69).getType(), "wall");
        assertEquals(map.getTile(0, 70).getType(), "wall");
        assertEquals(map.getTile(0, 71).getType(), "wall");
        assertEquals(map.getTile(0, 72).getType(), "wall");
        assertEquals(map.getTile(0, 73).getType(), "wall");
        assertEquals(map.getTile(0, 74).getType(), "wall");
        assertEquals(map.getTile(0, 75).getType(), "wall");
        assertEquals(map.getTile(0, 76).getType(), "wall");
        assertEquals(map.getTile(0, 77).getType(), "wall");
        assertEquals(map.getTile(0, 78).getType(), "wall");
        assertEquals(map.getTile(0, 79).getType(), "wall");
        assertEquals(map.getTile(0, 80).getType(), "wall");
        assertEquals(map.getTile(0, 81).getType(), "wall");
        assertEquals(map.getTile(0, 82).getType(), "wall");
        assertEquals(map.getTile(0, 83).getType(), "wall");
        assertEquals(map.getTile(0, 84).getType(), "wall");
        assertEquals(map.getTile(0, 85).getType(), "wall");
        assertEquals(map.getTile(0, 86).getType(), "wall");
        assertEquals(map.getTile(0, 87).getType(), "wall");
        assertEquals(map.getTile(0, 88).getType(), "wall");
        assertEquals(map.getTile(0, 89).getType(), "wall");
        assertEquals(map.getTile(0, 90).getType(), "wall");
        assertEquals(map.getTile(0, 91).getType(), "wall");
        assertEquals(map.getTile(0, 92).getType(), "wall");
        assertEquals(map.getTile(0, 93).getType(), "wall");
        assertEquals(map.getTile(0, 94).getType(), "wall");
        assertEquals(map.getTile(0, 95).getType(), "wall");
        assertEquals(map.getTile(0, 96).getType(), "wall");
        assertEquals(map.getTile(0, 97).getType(), "wall");
        assertEquals(map.getTile(0, 98).getType(), "wall");
        assertEquals(map.getTile(0, 99).getType(), "wall");
        assertEquals(map.getTile(0, 100).getType(), "wall");
        assertEquals(map.getTile(0, 101).getType(), "wall");
        assertEquals(map.getTile(0, 102).getType(), "wall");