// XmlFunctions_1Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_1Test {

    private static final Logger logger = Logger.getLogger(XmlFunctions_1Test.class);

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_1() {
        logger.info("testFindXmlNodes_1");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_2() {
        logger.info("testFindXmlNodes_2");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_3() {
        logger.info("testFindXmlNodes_3");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_4() {
        logger.info("testFindXmlNodes_4");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_5() {
        logger.info("testFindXmlNodes_5");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_6() {
        logger.info("testFindXmlNodes_6");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_7() {
        logger.info("testFindXmlNodes_7");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_8() {
        logger.info("testFindXmlNodes_8");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_9() {
        logger.info("testFindXmlNodes_9");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_10() {
        logger.info("testFindXmlNodes_10");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }
}

// XmlFunctions_2Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_2Test {
		
    private static final Logger logger = Logger.getLogger(XmlFunctions_2Test.class);

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_1() {
        logger.info("testFindXmlNodes_1");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_2() {
        logger.info("testFindXmlNodes_2");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class {@link XmlFunctions}.
    * It tests the method with a valid node name.
    */
    @Test
    void testFindXmlNodes_3() {
        logger.info("testFindXmlNodes_3");
        String NodeName = "node";
        XmlFunctions instance = new XmlFunctions("test.xml");
        NodeList expResult = instance.findXmlNodes(NodeName);
        NodeList result = instance.findXmlNodes(NodeName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link XmlFunctions#findXmlNodes(String)} method, of