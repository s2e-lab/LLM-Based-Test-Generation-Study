// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {

    /**
    * Test method for {@link Element#numberOfAttributes()}.
    */
    @Test
    void testNumberOfAttributes() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        assertEquals(0, element.numberOfAttributes());
    }
}

// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_2Test {
		
    /**
    * Test method for {@link Element#lookupAttribute(String, String)}.
    */
    @Test
    void testLookupAttribute() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        assertEquals(-1, element.lookupAttribute("http://www.w3.org/1999/xhtml", "class"));
    }
}

// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#addAttribute(String, String, String, String)} method.
*/
class Element_3Test {
		
    /**
    * Test method for {@link Element#addAttribute(String, String, String, String)}.
    */
    @Test
    void testAddAttribute() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals(1, element.numberOfAttributes());
    }
}

// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#removeAttribute(int)} method.
*/
class Element_4Test {
		
    /**
    * Test method for {@link Element#removeAttribute(int)}.
    */
    @Test
    void testRemoveAttribute() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.removeAttribute(0);
        assertEquals(0, element.numberOfAttributes());
    }
}

// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_5Test {
		
    /**
    * Test method for {@link Element#getAttributeNamespaceURI(int)}.
    */
    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals("http://www.w3.org/1999/xhtml", element.getAttributeNamespaceURI(0));
    }
}

// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_6Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals("class", element.getAttributeLocalName(0));
    }
}

// Element_7Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_7Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals("CDATA", element.getAttributeType(0));
    }
}

// Element_8Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_8Test {
		
    /**
    * Test method for {@link Element#getAttributeValue(int)}.
    */
    @Test
    void testGetAttributeValue() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals("test", element.getAttributeValue(0));
    }
}

// Element_9Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#setNamespaceMappings(Vector, Vector)} method.
*/
class Element_9Test {
		
    /**
    * Test method for {@link Element#setNamespaceMappings(Vector, Vector)}.
    */
    @Test
    void testSetNamespaceMappings() {
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        Vector prefixes = new Vector();
        Vector URIs = new Vector();
        element.setNamespaceMappings(prefixes, URIs);
        assertEquals(0, element.numberOfNamespaceMappings());
    }
}

// Element_10Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test