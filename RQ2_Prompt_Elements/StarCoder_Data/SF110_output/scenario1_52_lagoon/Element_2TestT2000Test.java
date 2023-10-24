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
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {

    /**
    * Test method for {@link Element#getAttributeNamespaceURI(int)}.
    */
    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/attr1");
        element.addAttribute("attr2", "http://www.example.com/attr2");
        element.addAttribute("attr3", "http://www.example.com/attr3");
        element.addAttribute("attr4", "http://www.example.com/attr4");
        element.addAttribute("attr5", "http://www.example.com/attr5");
        element.addAttribute("attr6", "http://www.example.com/attr6");
        element.addAttribute("attr7", "http://www.example.com/attr7");
        element.addAttribute("attr8", "http://www.example.com/attr8");
        element.addAttribute("attr9", "http://www.example.com/attr9");
        element.addAttribute("attr10", "http://www.example.com/attr10");
        assertEquals("http://www.example.com/attr1", element.getAttributeNamespaceURI(0));
        assertEquals("http://www.example.com/attr2", element.getAttributeNamespaceURI(1));
        assertEquals("http://www.example.com/attr3", element.getAttributeNamespaceURI(2));
        assertEquals("http://www.example.com/attr4", element.getAttributeNamespaceURI(3));
        assertEquals("http://www.example.com/attr5", element.getAttributeNamespaceURI(4));
        assertEquals("http://www.example.com/attr6", element.getAttributeNamespaceURI(5));
        assertEquals("http://www.example.com/attr7", element.getAttributeNamespaceURI(6));
        assertEquals("http://www.example.com/attr8", element.getAttributeNamespaceURI(7));
        assertEquals("http://www.example.com/attr9", element.getAttributeNamespaceURI(8));
        assertEquals("http://www.example.com/attr10", element.getAttributeNamespaceURI(9));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(10));
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
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_3Test {
		
    /**
    * Test method for {@link Element#getAttributeNamespaceURI(int)}.
    */
    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/attr1");
        element.addAttribute("attr2", "http://www.example.com/attr2");
        element.addAttribute("attr3", "http://www.example.com/attr3");
        element.addAttribute("attr4", "http://www.example.com/attr4");
        element.addAttribute("attr5", "http://www.example.com/attr5");
        element.addAttribute("attr6", "http://www.example.com/attr6");
        element.addAttribute("attr7", "http://www.example.com/attr7");
        element.addAttribute("attr8", "http://www.example.com/attr8");
        element.addAttribute("attr9", "http://www.example.com/attr9");
        element.addAttribute("attr10", "http://www.example.com/attr10");
        assertEquals("http://www.example.com/attr1", element.getAttributeNamespaceURI(0));
        assertEquals("http://www.example.com/attr2", element.getAttributeNamespaceURI(1));
        assertEquals("http://www.example.com/attr3", element.getAttributeNamespaceURI(2));
        assertEquals("http://www.example.com/attr4", element.getAttributeNamespaceURI(3));
        assertEquals("http://www.example.com/attr5", element.getAttributeNamespaceURI(4));
        assertEquals("http://www.example.com/attr6", element.getAttributeNamespaceURI(5));
        assertEquals("http://www.example.com/attr7", element.getAttributeNamespaceURI(6));
        assertEquals("http://www.example.com/attr8", element.getAttributeNamespaceURI(7));
        assertEquals("http://www.example.com/attr9", element.getAttributeNamespaceURI(8));
        assertEquals("http://www.example.com/attr10", element.getAttributeNamespaceURI(9));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(10));
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
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_4Test {
		
    /**
    * Test method for {@link Element#getAttributeNamespaceURI(int)}.
    */
    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/attr1");
        element.addAttribute("attr2", "http://www.example.com/attr2");
        element.addAttribute("attr3", "http://www.example.com/attr3");
        element.addAttribute("attr4", "http://www.example.com/attr4");
        element.addAttribute("attr5", "http://www.example.com/attr5");
        element.addAttribute("attr6", "http://www.example.com/attr6");
        element.addAttribute("attr7", "http://www.example.com/attr7");
        element.addAttribute("attr8", "http://www.example.com/attr8");
        element.addAttribute("attr9", "http://www.example.com/attr9");
        element.addAttribute("attr10", "http://www.example.com/attr10");
        assertEquals("http://www.example.com/attr1", element.getAttributeNamespaceURI(0));
        assertEquals("http://www.example.com/attr2", element.getAttributeNamespaceURI(1));
        assertEquals("http://www.example.com/attr3", element.getAttributeNamespaceURI(2));
        assertEquals("http://www.example.com/attr4", element.getAttributeNamespaceURI(3));
        assertEquals("http://www.example.com/attr5", element.getAttributeNamespaceURI(4));
        assertEquals("http://www.example.com/attr6", element.getAttributeNamespaceURI(5));
        assertEquals("http://www.example.com/attr7", element.getAttributeNamespaceURI(6));
        assertEquals("http://www.example.com/attr8", element.getAttributeNamespaceURI(7));
        assertEquals("http://www.example.com/attr9", element.getAttributeNamespaceURI(8));
        assertEquals("http://www.example.com/attr10", element.getAttributeNamespaceURI(9));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(10));
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
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_5Test {
		
    /**
    * Test method for {@link Element#getAttributeNamespaceURI(int)}.
    */
    @Test
    void testGetAttributeNamespaceURI() {
        Element element = new Element("root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/attr1");
        element.addAttribute("attr2", "http://www.example.com/attr2");
        element.addAttribute("attr3", "http://www.example.com/