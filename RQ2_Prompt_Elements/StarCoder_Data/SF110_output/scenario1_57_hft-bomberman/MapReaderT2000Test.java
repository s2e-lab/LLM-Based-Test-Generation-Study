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

    @Test
    void getXMLValueTest1() {
        logger.info("getXMLValueTest1");
        Node node = null;
        String XMLPath = null;
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest2() {
        logger.info("getXMLValueTest2");
        Node node = null;
        String XMLPath = "";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest3() {
        logger.info("getXMLValueTest3");
        Node node = null;
        String XMLPath = "test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest4() {
        logger.info("getXMLValueTest4");
        Node node = null;
        String XMLPath = "/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest5() {
        logger.info("getXMLValueTest5");
        Node node = null;
        String XMLPath = "//test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest6() {
        logger.info("getXMLValueTest6");
        Node node = null;
        String XMLPath = "test/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest7() {
        logger.info("getXMLValueTest7");
        Node node = null;
        String XMLPath = "/test/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest8() {
        logger.info("getXMLValueTest8");
        Node node = null;
        String XMLPath = "//test/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest9() {
        logger.info("getXMLValueTest9");
        Node node = null;
        String XMLPath = "test/test/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }

    @Test
    void getXMLValueTest10() {
        logger.info("getXMLValueTest10");
        Node node = null;
        String XMLPath = "/test/test/test";
        MapReader instance = new MapReader();
        String expResult = "";
        String result = instance.getXMLValue(node, XMLPath);
        assertEquals(expResult, result);
    }
}
