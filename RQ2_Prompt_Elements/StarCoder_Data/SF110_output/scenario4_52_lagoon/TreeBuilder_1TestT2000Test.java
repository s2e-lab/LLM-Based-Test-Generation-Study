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
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root/>")), false);
        assertEquals("root", root.getName());
        assertEquals(0, root.getChildCount());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_1() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root>text</root>")), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("text", root.getChild(0).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_2() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child/></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_3() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text", root.getChild(0).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_4() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_5() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_6() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_7() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_8() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML_9() throws SAXParseException, SAXException, IOException {
        TreeBuilder builder = new TreeBuilder();
        Element root = builder.parseXML(new InputSource(new StringReader("<root><child>text1</child><child>text2</child></root>")), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("text1", root.getChild(0).getText());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text2", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @