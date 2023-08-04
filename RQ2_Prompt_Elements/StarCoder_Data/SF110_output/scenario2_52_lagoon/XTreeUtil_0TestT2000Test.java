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
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_0() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, false, null, null);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_1() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, null, null);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_2() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", null);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_3() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_4() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_5() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_6() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_7() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_8() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
    * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
    * with a valid XML document.
    */
    @Test
    void testParseXML_9() throws Exception {
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        Element root = XTreeUtil.parseXML(xmlInput, true, "http://www.w3.org/2001/XMLSchema", new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>")));
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }
}
