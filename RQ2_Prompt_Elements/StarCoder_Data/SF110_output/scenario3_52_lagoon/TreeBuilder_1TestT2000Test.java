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
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_2() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_3() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_4() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_5() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_6() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_7() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_8() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_9() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_10() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }
}

// TreeBuilder_2Test.java
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
class TreeBuilder_2Test {
		
    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_1() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = child.getChild(0);
        assertEquals("text", text.getText());
    }

    /**
    * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_2() throws Exception {
        String xml = "<root><child>text</child></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = TreeBuilder.parseXML(xmlInput, false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild