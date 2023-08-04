// XmlFunctions_0Test.java
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {

    private static final Logger LOGGER = Logger.getLogger(XmlFunctions_0Test.class);

    /**
    * Test of {@link XmlFunctions#getXmlValue(String)} method, of class XmlFunctions.
    */
    @Test
    void testGetXmlValue() {
        LOGGER.info("getXmlValue");
        String XmlPath = "src/test/resources/xml/test.xml";
        String expResult = "test";
        String result = XmlFunctions.getXmlValue(XmlPath);
        assertEquals(expResult, result);
    }
}

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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_1Test {
		
    private static final Logger LOGGER = Logger.getLogger(XmlFunctions_1Test.class);

    /**
    * Test of {@link XmlFunctions#getXmlValue(String)} method, of class XmlFunctions.
    */
    @Test
    void testGetXmlValue() {
        LOGGER.info("getXmlValue");
        String XmlPath = "src/test/resources/xml/test.xml";
        String expResult = "test";
        String result = XmlFunctions.getXmlValue(XmlPath);
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_2Test {
		
    private static final Logger LOGGER = Logger.getLogger(XmlFunctions_2Test.class);

    /**
    * Test of {@link XmlFunctions#getXmlValue(String)} method, of class XmlFunctions.
    */
    @Test
    void testGetXmlValue() {
        LOGGER.info("getXmlValue");
        String XmlPath = "src/test/resources/xml/test.xml";
        String expResult = "test";
        String result = XmlFunctions.getXmlValue(XmlPath);
        assertEquals(expResult, result);
    }
}

// XmlFunctions_3Test.java
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_3Test {
		
    private static final Logger LOGGER = Logger.getLogger(XmlFunctions_3Test.class);

    /**
    * Test of {@link XmlFunctions#getXmlValue(String)} method, of class XmlFunctions.
    */
    @Test
    void testGetXmlValue() {
        LOGGER.info("getXmlValue");
        String XmlPath = "src/test/resources/xml/test.xml";
        String expResult = "test";
        String result = XmlFunctions.getXmlValue(XmlPath);
        assertEquals(expResult, result);
    }
}

// XmlFunctions_4Test.java
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_4Test {
		
    private static final Logger LOGGER = Logger.getLogger(XmlFunctions_4Test.class);

    /**
    * Test of {@link XmlFunctions#getXmlValue(String)} method, of class XmlFunctions.
    */
    @Test
    void testGetXmlValue() {
        LOGGER.info("getXmlValue");
        String XmlPath = "src/test/resources/xml/test.xml";
        String expResult = "test";
        String result = XmlFunctions.getXmlValue(XmlPath);
        assertEquals(expResult, result);
    }
}

// XmlFunctions_5Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;