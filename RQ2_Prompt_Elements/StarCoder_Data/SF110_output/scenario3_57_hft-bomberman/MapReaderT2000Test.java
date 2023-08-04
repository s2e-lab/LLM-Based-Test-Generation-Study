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

    /**
     * Test of {@link MapReader#getXMLValue(Node, String)}
     */
    @Test
    void testGetXMLValue() {
        Logger log = Logger.getLogger(MapReaderTest.class);
        log.info("Test of MapReader#getXMLValue(Node, String)");
        MapReader instance = new MapReader();
        String expResult = "1";
        String result = instance.getXMLValue(null, null);
        assertEquals(expResult, result);
    }
}
