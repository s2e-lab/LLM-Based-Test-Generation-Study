// XmlElement_0Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains ten unit test cases for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_0() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key", "value2");
        assertEquals("value2", xmlElement.getAttribute("key"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_1() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_2() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_3() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_4() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_5() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
        xmlElement.addAttribute("key6", "value6");
        assertEquals("value6", xmlElement.getAttribute("key6"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_6() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
        xmlElement.addAttribute("key6", "value6");
        assertEquals("value6", xmlElement.getAttribute("key6"));
        xmlElement.addAttribute("key7", "value7");
        assertEquals("value7", xmlElement.getAttribute("key7"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_7() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
        xmlElement.addAttribute("key6", "value6");
        assertEquals("value6", xmlElement.getAttribute("key6"));
        xmlElement.addAttribute("key7", "value7");
        assertEquals("value7", xmlElement.getAttribute("key7"));
        xmlElement.addAttribute("key8", "value8");
        assertEquals("value8", xmlElement.getAttribute("key8"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_8() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
        xmlElement.addAttribute("key6", "value6");
        assertEquals("value6", xmlElement.getAttribute("key6"));
        xmlElement.addAttribute("key7", "value7");
        assertEquals("value7", xmlElement.getAttribute("key7"));
        xmlElement.addAttribute("key8", "value8");
        assertEquals("value8", xmlElement.getAttribute("key8"));
        xmlElement.addAttribute("key9", "value9");
        assertEquals("value9", xmlElement.getAttribute("key9"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute_9() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("key", "value");
        assertEquals("value", xmlElement.getAttribute("key"));
        xmlElement.addAttribute("key2", "value2");
        assertEquals("value2", xmlElement.getAttribute("key2"));
        xmlElement.addAttribute("key3", "value3");
        assertEquals("value3", xmlElement.getAttribute("key3"));
        xmlElement.addAttribute("key4", "value4");
        assertEquals("value4", xmlElement.getAttribute("key4"));
        xmlElement.addAttribute("key5", "value5");
        assertEquals("value5", xmlElement.getAttribute("key5"));
        xmlElement.addAttribute("key6", "value6");
        assertEquals("value6", xmlElement.getAttribute("key6"));
        xmlElement.addAttribute("key7", "value7");
        assertEquals("value7", xmlElement.getAttribute("key7"));
        xmlElement.addAttribute("key8", "value8");
        assertEquals("value8", xmlElement.getAttribute("key8"));
        xmlElement.addAttribute("key9", "value9");
        assertEquals("value9", xmlElement.getAttribute("key9"));
        xmlElement.addAttribute("key10", "value10");
        assertEquals("value10", xmlElement.getAttribute("key10"));
   