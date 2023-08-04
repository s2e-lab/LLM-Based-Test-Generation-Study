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
    */
    @Test
    void testParseXMLSequential() throws IOException, SAXException {
        String xml = "<root><a><b>1</b><c>2</c></a><a><b>3</b><c>4</c></a></root>";
        StringReader sr = new StringReader(xml);
        InputSource is = new InputSource(sr);
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(is, false, null, null, handler);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        Element a = root.getChild(0);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        Element b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("1", b.getText());
        Element c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("2", c.getText());
        a = root.getChild(1);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("3", b.getText());
        c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("4", c.getText());
        assertEquals(2, handler.getElements().size());
        assertEquals("root", handler.getElements().get(0).getName());
        assertEquals("a", handler.getElements().get(1).getName());
        assertEquals("a", handler.getElements().get(2).getName());
    }
}

// XTreeUtil_2Test.java
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
class XTreeUtil_2Test {
		
    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    */
    @Test
    void testParseXMLSequential() throws IOException, SAXException {
        String xml = "<root><a><b>1</b><c>2</c></a><a><b>3</b><c>4</c></a></root>";
        StringReader sr = new StringReader(xml);
        InputSource is = new InputSource(sr);
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(is, false, null, null, handler);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        Element a = root.getChild(0);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        Element b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("1", b.getText());
        Element c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("2", c.getText());
        a = root.getChild(1);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("3", b.getText());
        c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("4", c.getText());
        assertEquals(2, handler.getElements().size());
        assertEquals("root", handler.getElements().get(0).getName());
        assertEquals("a", handler.getElements().get(1).getName());
        assertEquals("a", handler.getElements().get(2).getName());
    }
}

// XTreeUtil_3Test.java
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
class XTreeUtil_3Test {
		
    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    */
    @Test
    void testParseXMLSequential() throws IOException, SAXException {
        String xml = "<root><a><b>1</b><c>2</c></a><a><b>3</b><c>4</c></a></root>";
        StringReader sr = new StringReader(xml);
        InputSource is = new InputSource(sr);
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(is, false, null, null, handler);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        Element a = root.getChild(0);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        Element b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("1", b.getText());
        Element c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("2", c.getText());
        a = root.getChild(1);
        assertEquals("a", a.getName());
        assertEquals(2, a.getChildCount());
        b = a.getChild(0);
        assertEquals("b", b.getName());
        assertEquals("3", b.getText());
        c = a.getChild(1);
        assertEquals("c", c.getName());
        assertEquals("4", c.getText());
        assertEquals(2, handler.getElements().size());
        assertEquals("root", handler.getElements().get(0).getName());
        assertEquals("a", handler.getElements().get(1).getName());
        assertEquals("a", handler.getElements().get(2).getName());
    }
}

// XTreeUtil_4Test.java
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
class XTreeUtil_4Test {
		
    /**
    * Test method for {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)}.
    * @throws IOException if any error occurs
    * @throws SAXException if any error occurs
    */
    @Test
    void testParseXMLSequential() throws IOException, SAXException {
        String xml = "<root><a><b>1</b><c>2</c></a><a><b>3</b><c>4</c></a></root>";
        StringReader sr = new StringReader(xml);
        InputSource is = new InputSource(sr);
        ElementHandler handler = new ElementHandler();
        Element root = XTreeUtil.parseXMLSequential(is, false, null, null, handler);
        assertEquals("