// MapReaderTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapReader}.
* It contains ten unit test cases for the {@link MapReader#getXMLValue(Node, String)} method.
*/
class MapReaderTest {

    private static final Logger logger = Logger.getLogger(MapReaderTest.class);

    /**
     * Test of getXMLValue method, of class MapReader.
     */
    @Test
    void testGetXMLValue() {
        logger.info("getXMLValue");
        Node node = null;
        String XMLPath = "";
        MapReader instance = new MapReader("");
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMapProperies method, of class MapReader.
     */
    @Test
    void testSetMapProperies() {
        logger.info("setMapProperies");
        Map map = null;
        MapReader instance = new MapReader("");
        instance.setMapProperies(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTiles method, of class MapReader.
     */
    @Test
    void testSetTiles() {
        logger.info("setTiles");
        Map map = null;
        MapReader instance = new MapReader("");
        instance.setTiles(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPowerups method, of class MapReader.
     */
    @Test
    void testSetPowerups() {
        logger.info("setPowerups");
        Map map = null;
        MapReader instance = new MapReader("");
        instance.setPowerups(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autoWall method, of class MapReader.
     */
    @Test
    void testAutoWall() {
        logger.info("autoWall");
        Map map = null;
        String Type = "";
        MapReader instance = new MapReader("");
        instance.autoWall(map, Type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartPoints method, of class MapReader.
     */
    @Test
    void testSetStartPoints() {
        logger.info("setStartPoints");
        Map map = null;
        MapReader instance = new MapReader("");
        instance.setStartPoints(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class MapReader.
     */
    @Test
    void testGetArea() {
        logger.info("getArea");
        MapReader instance = new MapReader("");
        Point expResult = null;
        Point result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
