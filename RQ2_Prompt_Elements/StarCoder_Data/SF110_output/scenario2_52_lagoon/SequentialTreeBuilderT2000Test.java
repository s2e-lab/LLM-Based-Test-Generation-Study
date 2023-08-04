// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequential() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(0, attributes.getLength());
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithAttributes() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root a='1' b='2'><a>1</a><b>2</b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(2, attributes.getLength());
                    assertEquals("1", attributes.getValue("a"));
                    assertEquals("2", attributes.getValue("b"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithNamespaces() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root xmlns='http://www.w3.org/1999/xhtml'><a>1</a><b>2</b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(1, attributes.getLength());
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithNamespacesAndAttributes() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root xmlns='http://www.w3.org/1999/xhtml' a='1' b='2'><a>1</a><b>2</b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(3, attributes.getLength());
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns"));
                    assertEquals("1", attributes.getValue("a"));
                    assertEquals("2", attributes.getValue("b"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithNamespacesAndAttributesAndPrefix() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root xmlns:a='http://www.w3.org/1999/xhtml' a:a='1' a:b='2'><a:a>1</a:a><a:b>2</a:b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(3, attributes.getLength());
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns:a"));
                    assertEquals("1", attributes.getValue("a:a"));
                    assertEquals("2", attributes.getValue("a:b"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithNamespacesAndAttributesAndPrefixAndDefaultNamespace() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root xmlns='http://www.w3.org/1999/xhtml' xmlns:a='http://www.w3.org/1999/xhtml' a:a='1' a:b='2'><a:a>1</a:a><a:b>2</a:b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(4, attributes.getLength());
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns"));
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns:a"));
                    assertEquals("1", attributes.getValue("a:a"));
                    assertEquals("2", attributes.getValue("a:b"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0, length);
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the parsing of a simple XML document.
    */
    @Test
    void testParseXMLSequentialWithNamespacesAndAttributesAndPrefixAndDefaultNamespaceAndPrefix() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root xmlns='http://www.w3.org/1999/xhtml' xmlns:a='http://www.w3.org/1999/xhtml' a:a='1' a:b='2'><a:a>1</a:a><a:b>2</a:b></root>")), false, new ElementHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    assertEquals("root", qName);
                    assertEquals(4, attributes.getLength());
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns"));
                    assertEquals("http://www.w3.org/1999/xhtml", attributes.getValue("xmlns:a"));
                    assertEquals("1", attributes.getValue("a:a"));
                    assertEquals("2", attributes.getValue("a:b"));
                }
                public void endElement(String uri, String localName, String qName) {
                    assertEquals("root", qName);
                }
                public void characters(char[] ch, int start, int length) {
                    assertEquals(0,