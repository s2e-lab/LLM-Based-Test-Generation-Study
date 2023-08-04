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
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to a non-empty XmlElement.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub", "data");
        XmlElement subElement = xmlElement.addSubElement("sub2", "data2");
        assertEquals("sub2", subElement.getName());
        assertEquals("data2", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
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
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to a non-empty XmlElement.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub", "data");
        XmlElement subElement = xmlElement.addSubElement("sub2", "data2");
        assertEquals("sub2", subElement.getName());
        assertEquals("data2", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
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
* It contains ten unit test cases for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_1Test {
		
    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to a non-empty XmlElement.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub", "data");
        XmlElement subElement = xmlElement.addSubElement("sub2", "data2");
        assertEquals("sub2", subElement.getName());
        assertEquals("data2", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }
}

// XmlElement_4Test.java
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
class XmlElement_4Test {
		
    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to a non-empty XmlElement.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub", "data");
        XmlElement subElement = xmlElement.addSubElement("sub2", "data2");
        assertEquals("sub2", subElement.getName());
        assertEquals("data2", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }
}

// XmlElement_5Test.java
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
class XmlElement_5Test {
		
    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }

    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to a non-empty XmlElement.
    */
    @Test
    void testAddSubElement_2() {
        XmlElement xmlElement = new XmlElement("root");
        xmlElement.addSubElement("sub", "data");
        XmlElement subElement = xmlElement.addSubElement("sub2", "data2");
        assertEquals("sub2", subElement.getName());
        assertEquals("data2", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }
}

// XmlElement_6Test.java
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
class XmlElement_6Test {
		
    /**
    * Test case for {@link XmlElement#addSubElement(String, String)}.
    * It tests the case where the sub element is added to an empty XmlElement.
    */
    @Test
    void testAddSubElement_1() {
        XmlElement xml