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
     * Test of {@link MapReader#getXMLValue(Node, String)} method, of class {@link MapReader}.
     */
    @Test
    void testGetXMLValue() {
        logger.info("getXMLValue");
        MapReader instance = new MapReader("src/test/resources/testmap.xml");
        String expResult = "test";
        String result = instance.getXMLValue(null, "test");
        assertEquals(expResult, result);
    }
}
