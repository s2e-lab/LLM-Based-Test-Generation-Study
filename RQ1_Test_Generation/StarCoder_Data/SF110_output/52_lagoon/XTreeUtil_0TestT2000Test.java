// XTreeUtil_0Test.java
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
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, false, null, null);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_1() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, true, null, null);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_2() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, false, "http://www.w3.org/2001/XMLSchema", null);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_3() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, true, "http://www.w3.org/2001/XMLSchema", null);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_4() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, false, null, new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>")));
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_5() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, true, null, new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>")));
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_6() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, false, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>")));
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test method for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    * @throws SAXParseException if any error occurs
    */
    @Test
    void testParseXML_7() throws IOException, SAXException, SAXParseException {
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource is = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(is, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>")));
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals