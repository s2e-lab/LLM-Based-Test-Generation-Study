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
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_1() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_2() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_3() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_4() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_5() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_6() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_7() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals("c", root.getChild(2).getName());
            assertEquals("3", root.getChild(2).getValue());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential_8() {
        try {
            String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
            InputSource xmlInput = new InputSource(new StringReader(xml));
            ElementHandler handler = new ElementHandler();
            Element root = XTreeUtil.parseXMLSequential(xmlInput, false, null, null, handler);
            assertEquals("root", root.getName());
            assertEquals(3, root.getChildCount());
            assertEquals("a", root.getChild(0).getName());
            assertEquals("1", root.getChild(0).getValue());
            assertEquals("b", root.getChild(1).getName());
            assertEquals("2", root.getChild(1).getValue());
            assertEquals