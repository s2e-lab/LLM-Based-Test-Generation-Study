// XmlElement_2Test.java
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_2Test {

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement2() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement3() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement4() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement5() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test
    void testAddSubElement6() throws Exception {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String)}
    *
    * @throws Exception
    */
    @Test