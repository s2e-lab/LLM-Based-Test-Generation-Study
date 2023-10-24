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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_1Test {

    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement("sub1"));
        assertEquals(xmlElement2, xmlElement.getElement("sub2"));
        assertNull(xmlElement.getElement("sub3"));
        assertNull(xmlElement.getElement("sub1.sub2"));
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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_2Test {
		
    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement(".sub1"));
        assertEquals(xmlElement2, xmlElement.getElement(".sub2"));
        assertNull(xmlElement.getElement(".sub3"));
        assertNull(xmlElement.getElement(".sub1.sub2"));
    }
}

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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_3Test {
		
    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement("sub1."));
        assertEquals(xmlElement2, xmlElement.getElement("sub2."));
        assertNull(xmlElement.getElement("sub3."));
        assertNull(xmlElement.getElement("sub1.sub2."));
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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_4Test {
		
    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement(".sub1."));
        assertEquals(xmlElement2, xmlElement.getElement(".sub2."));
        assertNull(xmlElement.getElement(".sub3."));
        assertNull(xmlElement.getElement(".sub1.sub2."));
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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_5Test {
		
    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement("sub1.sub2"));
        assertEquals(xmlElement2, xmlElement.getElement("sub2.sub1"));
        assertNull(xmlElement.getElement("sub3.sub1"));
        assertNull(xmlElement.getElement("sub1.sub2.sub3"));
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
* It contains ten unit test cases for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_6Test {
		
    /**
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement(".sub1.sub2"));
        assertEquals(xmlElement2, xmlElement.getElement(".sub2.sub1"));
        assertNull(xmlElement.getElement(".sub3.sub1"));
        assertNull(xmlElement.getElement(".sub1.sub2.sub3"));
    }
}

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
    * Test case for {@link XmlElement#getElement(String)}.
    */
    @Test
    void testGetElement() {
        XmlElement xmlElement = new XmlElement();
        xmlElement.setName("root");
        XmlElement xmlElement1 = new XmlElement();
        xmlElement1.setName("sub1");
        XmlElement xmlElement2 = new XmlElement();
        xmlElement2.setName("sub2");
        xmlElement.addElement(xmlElement1);
        xmlElement.addElement(xmlElement2);
        assertEquals(xmlElement1, xmlElement.getElement("sub1.sub2."));
        assertEquals(xmlElement2, xmlElement.getElement("sub2.