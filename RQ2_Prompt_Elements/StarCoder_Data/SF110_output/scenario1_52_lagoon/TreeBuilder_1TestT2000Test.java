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

    @Test
    void testParseXML_1() throws Exception {
        String xml = "<root><child/></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    @Test
    void testParseXML_2() throws Exception {
        String xml = "<root><child>text</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text = (Text) child.getChild(0);
        assertEquals("text", text.getText());
    }

    @Test
    void testParseXML_3() throws Exception {
        String xml = "<root><child>text1</child><child>text2</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Text text2 = (Text) child.getChild(1);
        assertEquals("text2", text2.getText());
    }

    @Test
    void testParseXML_4() throws Exception {
        String xml = "<root><child>text1<child>text2</child></child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild(1);
        assertEquals("child", child2.getName());
        assertEquals(1, child2.getChildCount());
        Text text2 = (Text) child2.getChild(0);
        assertEquals("text2", text2.getText());
    }

    @Test
    void testParseXML_5() throws Exception {
        String xml = "<root><child>text1<child>text2</child>text3</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild(1);
        assertEquals("child", child2.getName());
        assertEquals(1, child2.getChildCount());
        Text text2 = (Text) child2.getChild(0);
        assertEquals("text2", text2.getText());
        Text text3 = (Text) child.getChild(2);
        assertEquals("text3", text3.getText());
    }

    @Test
    void testParseXML_6() throws Exception {
        String xml = "<root><child>text1<child>text2</child>text3</child><child>text4</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(2, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild(1);
        assertEquals("child", child2.getName());
        assertEquals(1, child2.getChildCount());
        Text text2 = (Text) child2.getChild(0);
        assertEquals("text2", text2.getText());
        Text text3 = (Text) child.getChild(2);
        assertEquals("text3", text3.getText());
        child = root.getChild(1);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text4 = (Text) child.getChild(0);
        assertEquals("text4", text4.getText());
    }

    @Test
    void testParseXML_7() throws Exception {
        String xml = "<root><child>text1<child>text2</child>text3</child><child>text4</child><child>text5</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild(1);
        assertEquals("child", child2.getName());
        assertEquals(1, child2.getChildCount());
        Text text2 = (Text) child2.getChild(0);
        assertEquals("text2", text2.getText());
        Text text3 = (Text) child.getChild(2);
        assertEquals("text3", text3.getText());
        child = root.getChild(1);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text4 = (Text) child.getChild(0);
        assertEquals("text4", text4.getText());
        child = root.getChild(2);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text5 = (Text) child.getChild(0);
        assertEquals("text5", text5.getText());
    }

    @Test
    void testParseXML_8() throws Exception {
        String xml = "<root><child>text1<child>text2</child>text3</child><child>text4</child><child>text5</child><child>text6</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(4, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild(1);
        assertEquals("child", child2.getName());
        assertEquals(1, child2.getChildCount());
        Text text2 = (Text) child2.getChild(0);
        assertEquals("text2", text2.getText());
        Text text3 = (Text) child.getChild(2);
        assertEquals("text3", text3.getText());
        child = root.getChild(1);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text4 = (Text) child.getChild(0);
        assertEquals("text4", text4.getText());
        child = root.getChild(2);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text5 = (Text) child.getChild(0);
        assertEquals("text5", text5.getText());
        child = root.getChild(3);
        assertEquals("child", child.getName());
        assertEquals(1, child.getChildCount());
        Text text6 = (Text) child.getChild(0);
        assertEquals("text6", text6.getText());
    }

    @Test
    void testParseXML_9() throws Exception {
        String xml = "<root><child>text1<child>text2</child>text3</child><child>text4</child><child>text5</child><child>text6</child><child>text7</child></root>";
        Element root = TreeBuilder.parseXML(new InputSource(new StringReader(xml)), false);
        assertEquals("root", root.getName());
        assertEquals(5, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(2, child.getChildCount());
        Text text1 = (Text) child.getChild(0);
        assertEquals("text1", text1.getText());
        Element child2 = (Element) child.getChild