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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = false;
        String schemaType = null;
        InputSource schema = null;

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = true;
        String schemaType = null;
        InputSource schema = null;

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = null;

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = null;

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = false;
        String schemaType = null;
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = true;
        String schemaType = null;
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
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
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
     * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
     * with an invalid XML document.
     */
    @Test
    void testParseXML_8() throws Exception {
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = false;
        String schemaType = null;
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));

        // Act
        Element root = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);

        // Assert
        assertNotNull(root);
        assertEquals("root", root.getName());
        assertEquals(1, root.getChildCount());
        Element child = root.getChild(0);
        assertEquals("child", child.getName());
        assertEquals(0, child.getChildCount());
    }

    /**
     * Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)}
     * with an invalid XML document.
     */
    @Test
    void testParseXML_9() throws Exception {
        // Arrange
        String xml = "<root><child/></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        boolean validateDTD = true;
        String schemaType = null;
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema