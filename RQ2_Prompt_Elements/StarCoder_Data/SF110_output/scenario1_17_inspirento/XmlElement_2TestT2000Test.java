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

    @Test
    void testAddSubElement() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
    }

    @Test
    void testAddSubElement2() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    @Test
    void testAddSubElement3() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getElements().get(0).getElements().get(0).getName());
    }

    @Test
    void testAddSubElement4() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
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

    @Test
    void testAddSubElement5() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
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

    @Test
    void testAddSubElement6() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
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

    @Test
    void testAddSubElement7() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement child = xmlElement.addSubElement("child.child.child.child.child.child.child");
        assertEquals("child", child.getName());
        assertEquals("root", child.getParent().getName());
        assertEquals(1, xmlElement.getElements().size());
        assertEquals(1, xmlElement.getElements().get(0).getElements().size());
        assertEquals("child", xmlElement.getElements().get(0).getElements().get(0).getName());
        assertEquals(1, xml