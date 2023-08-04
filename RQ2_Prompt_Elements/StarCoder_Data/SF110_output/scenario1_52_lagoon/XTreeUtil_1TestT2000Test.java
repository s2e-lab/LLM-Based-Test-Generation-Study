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

    @Test
    void testParseXMLSequential_1() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c\" type=\"xs:integer\"/>" +
            "</xs:sequence>" +
            "</xs:complexType>" +
            "</xs:element>" +
            "</xs:schema>";
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        InputSource schemaInput = new InputSource(new StringReader(schema));
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(xmlInput, true, schemaType, schemaInput, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequential_2() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c\" type=\"xs:integer\"/>" +
            "</xs:sequence>" +
            "</xs:complexType>" +
            "</xs:element>" +
            "</xs:schema>";
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        InputSource schemaInput = new InputSource(new StringReader(schema));
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, schemaType, schemaInput, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequential_3() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c\" type=\"xs:integer\"/>" +
            "</xs:sequence>" +
            "</xs:complexType>" +
            "</xs:element>" +
            "</xs:schema>";
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        InputSource schemaInput = new InputSource(new StringReader(schema));
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(xmlInput, true, schemaType, null, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequential_4() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c\" type=\"xs:integer\"/>" +
            "</xs:sequence>" +
            "</xs:complexType>" +
            "</xs:element>" +
            "</xs:schema>";
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        InputSource schemaInput = new InputSource(new StringReader(schema));
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(xmlInput, false, schemaType, null, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequential_5() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c\" type=\"xs:integer\"/>" +
            "</xs:sequence>" +
            "</xs:complexType>" +
            "</xs:element>" +
            "</xs:schema>";
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        InputSource schemaInput = new InputSource(new StringReader(schema));
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(xmlInput, true, schemaType, schemaInput, null);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequential_6() throws SAXParseException, SAXException, IOException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        String schema = "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">" +
            "<xs:element name=\"root\">" +
            "<xs:complexType>" +
            "<xs:sequence>" +
            "<xs:element name=\"a\" type=\"xs:integer\"/>" +
            "<xs:element name=\"b\" type=\"xs:integer\"/>" +
            "<xs:element name=\"c