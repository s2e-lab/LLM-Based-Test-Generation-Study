// XmlElement_7Test.java
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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_7Test {

    /**
    * Test method for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement root = new XmlElement("root");
        XmlElement child1 = new XmlElement("child1");
        XmlElement child2 = new XmlElement("child2");
        XmlElement child3 = new XmlElement("child3");
        XmlElement child4 = new XmlElement("child4");
        XmlElement child5 = new XmlElement("child5");
        XmlElement child6 = new XmlElement("child6");
        XmlElement child7 = new XmlElement("child7");
        XmlElement child8 = new XmlElement("child8");
        XmlElement child9 = new XmlElement("child9");
        XmlElement child10 = new XmlElement("child10");
        root.addElement(child1);
        root.addElement(child2);
        root.addElement(child3);
        root.addElement(child4);
        root.addElement(child5);
        root.addElement(child6);
        root.addElement(child7);
        root.addElement(child8);
        root.addElement(child9);
        root.addElement(child10);
        assertEquals(child1, root.getElement("child1"));
        assertEquals(child2, root.getElement("child2"));
        assertEquals(child3, root.getElement("child3"));
        assertEquals(child4, root.getElement("child4"));
        assertEquals(child5, root.getElement("child5"));
        assertEquals(child6, root.getElement("child6"));
        assertEquals(child7, root.getElement("child7"));
        assertEquals(child8, root.getElement("child8"));
        assertEquals(child9, root.getElement("child9"));
        assertEquals(child10, root.getElement("child10"));
        assertEquals(child1, root.getElement("child1.child1"));
        assertEquals(child2, root.getElement("child1.child2"));
        assertEquals(child3, root.getElement("child1.child3"));
        assertEquals(child4, root.getElement("child1.child4"));
        assertEquals(child5, root.getElement("child1.child5"));
        assertEquals(child6, root.getElement("child1.child6"));
        assertEquals(child7, root.getElement("child1.child7"));
        assertEquals(child8, root.getElement("child1.child8"));
        assertEquals(child9, root.getElement("child1.child9"));
        assertEquals(child10, root.getElement("child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child6"));
        assertEquals(child7, root.getElement("child1.child1.child7"));
        assertEquals(child8, root.getElement("child1.child1.child8"));
        assertEquals(child9, root.getElement("child1.child1.child9"));
        assertEquals(child10, root.getElement("child1.child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child1.child6"));
        assertEquals(child7, root.getElement("child1.child1.child1.child7"));
        assertEquals(child8, root.getElement("child1.child1.child1.child8"));
        assertEquals(child9, root.getElement("child1.child1.child1.child9"));
        assertEquals(child10, root.getElement("child1.child1.child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child1.child1.child6"));
        assertEquals(child7, root.getElement("child1.child1.child1.child1.child7"));
        assertEquals(child8, root.getElement("child1.child1.child1.child1.child8"));
        assertEquals(child9, root.getElement("child1.child1.child1.child1.child9"));
        assertEquals(child10, root.getElement("child1.child1.child1.child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1.child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child1.child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child1.child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child1.child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child1.child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child1.child1.child1.child6"));
        assertEquals(child7, root.getElement("child1.child1.child1.child1.child1.child7"));
        assertEquals(child8, root.getElement("child1.child1.child1.child1.child1.child8"));
        assertEquals(child9, root.getElement("child1.child1.child1.child1.child1.child9"));
        assertEquals(child10, root.getElement("child1.child1.child1.child1.child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1.child1.child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child1.child1.child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child1.child1.child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child1.child1.child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child1.child1.child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child1.child1.child1.child1.child6"));
        assertEquals(child7, root.getElement("child1.child1.child1.child1.child1.child1.child7"));
        assertEquals(child8, root.getElement("child1.child1.child1.child1.child1.child1.child8"));
        assertEquals(child9, root.getElement("child1.child1.child1.child1.child1.child1.child9"));
        assertEquals(child10, root.getElement("child1.child1.child1.child1.child1.child1.child10"));
        assertEquals(child1, root.getElement("child1.child1.child1.child1.child1.child1.child1.child1"));
        assertEquals(child2, root.getElement("child1.child1.child1.child1.child1.child1.child1.child2"));
        assertEquals(child3, root.getElement("child1.child1.child1.child1.child1.child1.child1.child3"));
        assertEquals(child4, root.getElement("child1.child1.child1.child1.child1.child1.child1.child4"));
        assertEquals(child5, root.getElement("child1.child1.child1.child1.child1.child1.child1.child5"));
        assertEquals(child6, root.getElement("child1.child1.child1.child1.child1.