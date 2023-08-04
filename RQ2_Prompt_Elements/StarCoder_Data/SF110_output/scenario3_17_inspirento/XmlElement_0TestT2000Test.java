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
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_0() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_1() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_2() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name2", "value2");
        assertEquals("value2", xmlElement.getAttribute("name2"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_3() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_4() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_5() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value5");
        assertEquals("value5", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_6() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value5");
        assertEquals("value5", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value6");
        assertEquals("value6", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_7() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value5");
        assertEquals("value5", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value6");
        assertEquals("value6", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value7");
        assertEquals("value7", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_8() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value5");
        assertEquals("value5", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value6");
        assertEquals("value6", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value7");
        assertEquals("value7", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value8");
        assertEquals("value8", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_9() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value2");
        assertEquals("value2", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value3");
        assertEquals("value3", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value4");
        assertEquals("value4", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value5");
        assertEquals("value5", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value6");
        assertEquals("value6", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value7");
        assertEquals("value7", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value8");
        assertEquals("value8", xmlElement.getAttribute("name"));
        xmlElement.addAttribute("name", "value9");
        assertEquals("value9", xmlElement.getAttribute("name"));
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
* It contains ten unit test cases for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_1Test {
		
    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_0() throws Exception {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("name", "value");
        assertEquals("value", xmlElement.getAttribute("name"));
    }

    /**
    * Test case for {@link XmlElement#addAttribute(String, String)}.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void test_addAttribute_1() throws Exception {
        XmlElement xml