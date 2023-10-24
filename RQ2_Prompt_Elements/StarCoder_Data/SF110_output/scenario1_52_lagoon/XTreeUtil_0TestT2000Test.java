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

    @Test
    void test_0() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = null;
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_1() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = null;
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_2() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_3() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"/>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_4() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"/></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_5() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"/></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_6() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType/></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_7() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType/></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_8() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence/></xs:complexType></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_9() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence/></xs:complexType></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(0, result.getChildCount());
    }

    @Test
    void test_10() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = false;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(1, result.getChildCount());
        assertEquals("child", result.getChild(0).getName());
    }

    @Test
    void test_11() throws Exception {
        InputSource xmlInput = new InputSource(new StringReader("<root/>"));
        boolean validateDTD = true;
        String schemaType = "http://www.w3.org/2001/XMLSchema";
        InputSource schema = new InputSource(new StringReader("<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"><xs:element name=\"root\"><xs:complexType><xs:sequence><xs:element name=\"child\"/></xs:sequence></xs:complexType></xs:element></xs:schema>"));
        Element result = XTreeUtil.parseXML(xmlInput, validateDTD, schemaType, schema);
        assertNotNull(result);
        assertEquals("root", result.getName());
        assertEquals(0, result.getAttributeCount());
        assertEquals(1, result.getChildCount());
        assertEquals("child", result.getChild(0).getName());
    }