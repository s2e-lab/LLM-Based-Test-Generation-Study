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
    * Test method for {@link XmlElement#addSubElement(String, String)}.
    */
    @Test
    void testAddSubElement() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
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
    * Test method for {@link XmlElement#addSubElement(String, String)}.
    */
    @Test
    void testAddSubElement() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
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
    * Test method for {@link XmlElement#addSubElement(String, String)}.
    */
    @Test
    void testAddSubElement() {
        XmlElement xmlElement = new XmlElement("root");
        XmlElement subElement = xmlElement.addSubElement("sub", "data");
        assertEquals("sub", subElement.getName());
        assertEquals("data", subElement.getData());
        assertEquals(xmlElement, subElement.getParent());
    }
}

// XmlElement_0Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import