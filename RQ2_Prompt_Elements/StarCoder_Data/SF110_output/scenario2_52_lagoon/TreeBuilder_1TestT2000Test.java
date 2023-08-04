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
    * with a valid XML document.
    */
    @Test
    void testParseXML_1() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_2() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_3() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_4() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_5() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_6() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_7() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_8() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root [\n" +
            "  <!ELEMENT root (child+)>\n" +
            "  <!ELEMENT child (#PCDATA)>\n" +
            "]>\n" +
            "<root>\n" +
            "  <child>text</child>\n" +
            "  <child>text</child>\n" +
            "</root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        assertEquals("child", root.getChild(0).getName());
        assertEquals("child", root.getChild(1).getName());
        assertEquals("text", root.getChild(0).getText());
        assertEquals("text", root.getChild(1).getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_9() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE root