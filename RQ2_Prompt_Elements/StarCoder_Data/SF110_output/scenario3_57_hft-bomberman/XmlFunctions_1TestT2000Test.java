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

    /**
     * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class XmlFunctions.
     *
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.transform.TransformerException
     * @throws javax.xml.xpath.XPathExpressionException
     */
    @Test
    void testFindXmlNodes() throws IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException, XPathExpressionException {
        System.out.println("findXmlNodes");
        String NodeName = "test";
        XmlFunctions instance = new XmlFunctions();
        NodeList expResult = null;
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
		
    /**
     * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class XmlFunctions.
     *
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.transform.TransformerException
     * @throws javax.xml.xpath.XPathExpressionException
     */
    @Test
    void testFindXmlNodes() throws IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException, XPathExpressionException {
        System.out.println("findXmlNodes");
        String NodeName = "test";
        XmlFunctions instance = new XmlFunctions();
        NodeList expResult = null;
        NodeList result = instance.findXmlNodes(NodeName);
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
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_3Test {
		
    /**
     * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class XmlFunctions.
     *
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.transform.TransformerException
     * @throws javax.xml.xpath.XPathExpressionException
     */
    @Test
    void testFindXmlNodes() throws IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException, XPathExpressionException {
        System.out.println("findXmlNodes");
        String NodeName = "test";
        XmlFunctions instance = new XmlFunctions();
        NodeList expResult = null;
        NodeList result = instance.findXmlNodes(NodeName);
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
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_4Test {
		
    /**
     * Test of {@link XmlFunctions#findXmlNodes(String)} method, of class XmlFunctions.
     *
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.transform.TransformerException
     * @throws javax.xml.xpath.XPathExpressionException
     */
    @Test
    void testFindXmlNodes() throws IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException, XPathExpressionException {
        System.out.println("findXmlNodes");
        String NodeName = "test";
        XmlFunctions instance = new XmlFunctions();
        NodeList expResult = null;
        NodeList result = instance.findXmlNodes(NodeName);
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
import static org.junit.jupiter.api.Assertions