// XmlElement_3Test.java
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xmlElement = new XmlElement();
        XmlElement subElement = xmlElement.addSubElement("subElement", "subElementData");
        assertEquals("subElement", subElement.getName());
        assertEquals("subElementData", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements and attributes.
    */
    @Test
    void testAddSubElement_3() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes and data.
    */
    @Test
    void testAddSubElement_4() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data and a parent.
    */
    @Test
    void testAddSubElement_5() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data, a parent and a sibling.
    */
    @Test
    void testAddSubElement_6() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data, a parent, a sibling and a child.
    */
    @Test
    void testAddSubElement_7() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data, a parent, a sibling, a child and a
    * grandchild.
    */
    @Test
    void testAddSubElement_8() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data, a parent, a sibling, a child, a
    * grandchild and a great-grandchild.
    */
    @Test
    void testAddSubElement_9() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an XmlElement with
    * sub elements, attributes, data, a parent, a sibling, a child, a
    * grandchild, a great-grandchild and a great-great-grandchild.
    */
    @Test
    void testAddSubElement_10() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.addAttribute("attribute1", "attributeData1");
        xmlElement.addAttribute("attribute2", "attributeData2");
        xmlElement.addSubElement("subElement1", "subElementData1");
        xmlElement.addSubElement("subElement2", "subElementData2");
        xmlElement.setData("data");
        XmlElement subElement = xmlElement.addSubElement("subElement3", "subElementData3");
        assertEquals("subElement3", subElement.getName());
        assertEquals("subElementData3", subElement.getData());
    }
}

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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_2Test {
		
    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests