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
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {

    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("root");
        element.addAttribute(new Attribute("attr1", "value1"));
        element.addAttribute(new Attribute("attr2", "value2"));
        element.addAttribute(new Attribute("attr3", "value3"));
        element.addAttribute(new Attribute("attr4", "value4"));
        element.addAttribute(new Attribute("attr5", "value5"));
        element.addAttribute(new Attribute("attr6", "value6"));
        element.addAttribute(new Attribute("attr7", "value7"));
        element.addAttribute(new Attribute("attr8", "value8"));
        element.addAttribute(new Attribute("attr9", "value9"));
        element.addAttribute(new Attribute("attr10", "value10"));
        assertEquals("attr1", element.getAttributeLocalName(0));
        assertEquals("attr2", element.getAttributeLocalName(1));
        assertEquals("attr3", element.getAttributeLocalName(2));
        assertEquals("attr4", element.getAttributeLocalName(3));
        assertEquals("attr5", element.getAttributeLocalName(4));
        assertEquals("attr6", element.getAttributeLocalName(5));
        assertEquals("attr7", element.getAttributeLocalName(6));
        assertEquals("attr8", element.getAttributeLocalName(7));
        assertEquals("attr9", element.getAttributeLocalName(8));
        assertEquals("attr10", element.getAttributeLocalName(9));
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
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_2Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("root");
        element.addAttribute(new Attribute("attr1", "value1"));
        element.addAttribute(new Attribute("attr2", "value2"));
        element.addAttribute(new Attribute("attr3", "value3"));
        element.addAttribute(new Attribute("attr4", "value4"));
        element.addAttribute(new Attribute("attr5", "value5"));
        element.addAttribute(new Attribute("attr6", "value6"));
        element.addAttribute(new Attribute("attr7", "value7"));
        element.addAttribute(new Attribute("attr8", "value8"));
        element.addAttribute(new Attribute("attr9", "value9"));
        element.addAttribute(new Attribute("attr10", "value10"));
        assertEquals("attr1", element.getAttributeLocalName(0));
        assertEquals("attr2", element.getAttributeLocalName(1));
        assertEquals("attr3", element.getAttributeLocalName(2));
        assertEquals("attr4", element.getAttributeLocalName(3));
        assertEquals("attr5", element.getAttributeLocalName(4));
        assertEquals("attr6", element.getAttributeLocalName(5));
        assertEquals("attr7", element.getAttributeLocalName(6));
        assertEquals("attr8", element.getAttributeLocalName(7));
        assertEquals("attr9", element.getAttributeLocalName(8));
        assertEquals("attr10", element.getAttributeLocalName(9));
    }
}

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
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_1Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("root");
        element.addAttribute(new Attribute("attr1", "value1"));
        element.addAttribute(new Attribute("attr2", "value2"));
        element.addAttribute(new Attribute("attr3", "value3"));
        element.addAttribute(new Attribute("attr4", "value4"));
        element.addAttribute(new Attribute("attr5", "value5"));
        element.addAttribute(new Attribute("attr6", "value6"));
        element.addAttribute(new Attribute("attr7", "value7"));
        element.addAttribute(new Attribute("attr8", "value8"));
        element.addAttribute(new Attribute("attr9", "value9"));
        element.addAttribute(new Attribute("attr10", "value10"));
        assertEquals("attr1", element.getAttributeLocalName(0));
        assertEquals("attr2", element.getAttributeLocalName(1));
        assertEquals("attr3", element.getAttributeLocalName(2));
        assertEquals("attr4", element.getAttributeLocalName(3));
        assertEquals("attr5", element.getAttributeLocalName(4));
        assertEquals("attr6", element.getAttributeLocalName(5));
        assertEquals("attr7", element.getAttributeLocalName(6));
        assertEquals("attr8", element.getAttributeLocalName(7));
        assertEquals("attr9", element.getAttributeLocalName(8));
        assertEquals("attr10", element.getAttributeLocalName(9));
    }
}

// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_0Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("root");
        element.addAttribute(new Attribute("attr1", "value1"));
        element.addAttribute(new Attribute("attr2", "value2"));
        element.addAttribute(new Attribute("attr3", "value3"));
        element.addAttribute(new Attribute("attr4", "value4"));
        element.addAttribute(new Attribute("attr5", "value5"));
        element.addAttribute(new Attribute("attr6", "value6"));
        element.addAttribute(new Attribute("attr7", "value7"));
        element.addAttribute(new Attribute("attr8", "value8"));
        element.addAttribute(new Attribute("attr9", "value9"));
        element.addAttribute(new Attribute("attr10", "value10"));
        assertEquals("attr1", element.getAttributeLocalName(0));
        assertEquals("attr2", element.getAttributeLocalName(1));
        assertEquals("attr3", element.getAttributeLocalName(2));
        assertEquals("attr4", element.getAttributeLocalName(3));
        assertEquals("attr5", element.getAttributeLocalName(4));
        assertEquals("attr6", element.getAttributeLocalName(5));
        assertEquals("attr7", element.getAttributeLocalName(6));
        assertEquals("attr8", element.getAttributeLocalName(7));
        assertEquals("attr9", element.getAttributeLocalName(8));
        assertEquals("attr10", element.getAttributeLocalName(9));
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
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_4Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        Element element = new Element("root");
        element.addAttribute(new Attribute("attr1", "value1"));
        element.addAttribute(new Attribute("attr2", "value2"));
        element.addAttribute(new Attribute("attr3", "value3"));
        element.addAttribute(new Attribute("attr4", "value4"));
        element.addAttribute(new Attribute("attr5", "value5"));
        element.addAttribute(new Attribute("attr6", "value6"));
        element.addAttribute(new Attribute("attr7", "value7"));
        element.addAttribute