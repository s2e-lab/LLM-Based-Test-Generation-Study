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
    void test_addAttribute_001() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        assertEquals("value1", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_002() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr1", "value2");
        assertEquals("value2", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_003() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        assertEquals("value2", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_004() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        assertEquals("value3", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_005() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        assertEquals("value4", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_006() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        assertEquals("value5", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_007() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        xmlElement.addAttribute("attr2", "value6");
        assertEquals("value6", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_008() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        xmlElement.addAttribute("attr2", "value6");
        xmlElement.addAttribute("attr1", "value7");
        assertEquals("value7", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_009() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        xmlElement.addAttribute("attr2", "value6");
        xmlElement.addAttribute("attr1", "value7");
        xmlElement.addAttribute("attr2", "value8");
        assertEquals("value8", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#addAttribute(String, String)}.
    */
    @Test
    void test_addAttribute_010() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        xmlElement.addAttribute("attr2", "value6");
        xmlElement.addAttribute("attr1", "value7");
        xmlElement.addAttribute("attr2", "value8");
        xmlElement.addAttribute("attr1", "value9");
        assertEquals("value9", xmlElement.getAttribute("attr1"));
    }
}

// XmlElement_1Test.java
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
* It contains ten unit test cases for the {@link XmlElement#getAttribute(String)} method.
*/
class XmlElement_1Test {
		
    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_001() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        assertEquals("value1", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_002() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr1", "value2");
        assertEquals("value2", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_003() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        assertEquals("value2", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_004() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        assertEquals("value3", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_005() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        assertEquals("value4", xmlElement.getAttribute("attr2"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_006() {
        XmlElement xmlElement = new XmlElement("test");
        xmlElement.addAttribute("attr1", "value1");
        xmlElement.addAttribute("attr2", "value2");
        xmlElement.addAttribute("attr1", "value3");
        xmlElement.addAttribute("attr2", "value4");
        xmlElement.addAttribute("attr1", "value5");
        assertEquals("value5", xmlElement.getAttribute("attr1"));
    }

    /**
    * Test method for {@link XmlElement#getAttribute(String)}.
    */
    @Test
    void test_getAttribute_007() {
        XmlElement xmlElement = new XmlElement("test");
        xml