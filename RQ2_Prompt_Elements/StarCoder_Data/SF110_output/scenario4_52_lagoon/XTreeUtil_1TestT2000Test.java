// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains ten unit test cases for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        // Act
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
        assertEquals(3, handler.getElements().size());
        assertEquals("a", handler.getElements().get(0).getName());
        assertEquals("1", handler.getElements().get(0).getValue());
        assertEquals("b", handler.getElements().get(1).getName());
        assertEquals("2", handler.getElements().get(1).getValue());
        assertEquals("c", handler.getElements().get(2).getName());
        assertEquals("3", handler.getElements().get(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential_2() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        // Act
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
        assertEquals(3, handler.getElements().size());
        assertEquals("a", handler.getElements().get(0).getName());
        assertEquals("1", handler.getElements().get(0).getValue());
        assertEquals("b", handler.getElements().get(1).getName());
        assertEquals("2", handler.getElements().get(1).getValue());
        assertEquals("c", handler.getElements().get(2).getName());
        assertEquals("3", handler.getElements().get(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential_3() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        // Act
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
        assertEquals(3, handler.getElements().size());
        assertEquals("a", handler.getElements().get(0).getName());
        assertEquals("1", handler.getElements().get(0).getValue());
        assertEquals("b", handler.getElements().get(1).getName());
        assertEquals("2", handler.getElements().get(1).getValue());
        assertEquals("c", handler.getElements().get(2).getName());
        assertEquals("3", handler.getElements().get(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential_4() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        // Act
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
        assertEquals(3, handler.getElements().size());
        assertEquals("a", handler.getElements().get(0).getName());
        assertEquals("1", handler.getElements().get(0).getValue());
        assertEquals("b", handler.getElements().get(1).getName());
        assertEquals("2", handler.getElements().get(1).getValue());
        assertEquals("c", handler.getElements().get(2).getName());
        assertEquals("3", handler.getElements().get(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential_5() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        // Act
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
        assertEquals(3, handler.getElements().size());
        assertEquals("a", handler.getElements().get(0).getName());
        assertEquals("1", handler.getElements().get(0).getValue());
        assertEquals("b", handler.getElements().get(1).getName());
        assertEquals("2", handler.getElements().get(1).getValue());
        assertEquals("c", handler.getElements().get(2).getName());
        assertEquals("3", handler.getElements().get(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXMLSequential_6() throws IOException, SAXException, SAXParseException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();