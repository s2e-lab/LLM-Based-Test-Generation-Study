// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_1() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test1.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test1", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test1.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild(0);
        assertEquals("child1", child.getName());
        assertEquals("http://www.example.com/test", child.getNamespaceURI());
        assertEquals("test1.xml", child.getSystemId());
        assertEquals(1, child.getChildCount());
        Element grandchild = (Element) child.getChild(0);
        assertEquals("grandchild1", grandchild.getName());
        assertEquals("http://www.example.com/test", grandchild.getNamespaceURI());
        assertEquals("test1.xml", grandchild.getSystemId());
        assertEquals(0, grandchild.getChildCount());
        assertEquals(1, grandchild.getAttributeCount());
        assertEquals("value1", grandchild.getAttributeValue("attr1"));
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_2() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test2.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test2", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test2.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild(0);
        assertEquals("child1", child.getName());
        assertEquals("http://www.example.com/test", child.getNamespaceURI());
        assertEquals("test2.xml", child.getSystemId());
        assertEquals(1, child.getChildCount());
        Element grandchild = (Element) child.getChild(0);
        assertEquals("grandchild1", grandchild.getName());
        assertEquals("http://www.example.com/test", grandchild.getNamespaceURI());
        assertEquals("test2.xml", grandchild.getSystemId());
        assertEquals(0, grandchild.getChildCount());
        assertEquals(1, grandchild.getAttributeCount());
        assertEquals("value1", grandchild.getAttributeValue("attr1"));
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_3() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test3.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test3", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test3.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild(0);
        assertEquals("child1", child.getName());
        assertEquals("http://www.example.com/test", child.getNamespaceURI());
        assertEquals("test3.xml", child.getSystemId());
        assertEquals(1, child.getChildCount());
        Element grandchild = (Element) child.getChild(0);
        assertEquals("grandchild1", grandchild.getName());
        assertEquals("http://www.example.com/test", grandchild.getNamespaceURI());
        assertEquals("test3.xml", grandchild.getSystemId());
        assertEquals(0, grandchild.getChildCount());
        assertEquals(1, grandchild.getAttributeCount());
        assertEquals("value1", grandchild.getAttributeValue("attr1"));
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_4() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test4.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test4", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test4.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild(0);
        assertEquals("child1", child.getName());
        assertEquals("http://www.example.com/test", child.getNamespaceURI());
        assertEquals("test4.xml", child.getSystemId());
        assertEquals(1, child.getChildCount());
        Element grandchild = (Element) child.getChild(0);
        assertEquals("grandchild1", grandchild.getName());
        assertEquals("http://www.example.com/test", grandchild.getNamespaceURI());
        assertEquals("test4.xml", grandchild.getSystemId());
        assertEquals(0, grandchild.getChildCount());
        assertEquals(1, grandchild.getAttributeCount());
        assertEquals("value1", grandchild.getAttributeValue("attr1"));
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_5() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test5.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test5", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test5.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild(0);
        assertEquals("child1", child.getName());
        assertEquals("http://www.example.com/test", child.getNamespaceURI());
        assertEquals("test5.xml", child.getSystemId());
        assertEquals(1, child.getChildCount());
        Element grandchild = (Element) child.getChild(0);
        assertEquals("grandchild1", grandchild.getName());
        assertEquals("http://www.example.com/test", grandchild.getNamespaceURI());
        assertEquals("test5.xml", grandchild.getSystemId());
        assertEquals(0, grandchild.getChildCount());
        assertEquals(1, grandchild.getAttributeCount());
        assertEquals("value1", grandchild.getAttributeValue("attr1"));
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a well-formed XML document.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_6() throws SAXParseException, SAXException, IOException {
        InputSource xmlInput = TreeBuilder.fileToInputSource(new File("test/data/test6.xml"));
        Element tree = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("test6", tree.getName());
        assertEquals("http://www.example.com/test", tree.getNamespaceURI());
        assertEquals("test6.xml", tree.getSystemId());
        assertEquals(1, tree.getChildCount());
        Element child = (Element) tree.getChild