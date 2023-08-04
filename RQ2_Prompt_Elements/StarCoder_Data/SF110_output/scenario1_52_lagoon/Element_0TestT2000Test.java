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
* It contains ten unit test cases for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {

    /**
    * Test method for {@link Element#lookupAttribute(String, String)}.
    */
    @Test
    void testLookupAttribute() {
        Element element = new Element("root", "http://www.example.com/root", "root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "http://www.example.com/root");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "http://www.example.com/root");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "http://www.example.com/root");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "http://www.example.com/root");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "http://www.example.com/root");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "http://www.example.com/root");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "http://www.example.com/root");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "http://www.example.com/root");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "http://www.example.com/root");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "http://www.example.com/root");
        assertEquals(0, element.lookupAttribute("http://www.example.com/root", "attr1"));
        assertEquals(1, element.lookupAttribute("http://www.example.com/root", "attr2"));
        assertEquals(2, element.lookupAttribute("http://www.example.com/root", "attr3"));
        assertEquals(3, element.lookupAttribute("http://www.example.com/root", "attr4"));
        assertEquals(4, element.lookupAttribute("http://www.example.com/root", "attr5"));
        assertEquals(5, element.lookupAttribute("http://www.example.com/root", "attr6"));
        assertEquals(6, element.lookupAttribute("http://www.example.com/root", "attr7"));
        assertEquals(7, element.lookupAttribute("http://www.example.com/root", "attr8"));
        assertEquals(8, element.lookupAttribute("http://www.example.com/root", "attr9"));
        assertEquals(9, element.lookupAttribute("http://www.example.com/root", "attr10"));
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
* It contains ten unit test cases for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_1Test {
		
    /**
    * Test method for {@link Element#lookupAttribute(String, String)}.
    */
    @Test
    void testLookupAttribute() {
        Element element = new Element("root", "http://www.example.com/root", "root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "http://www.example.com/root");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "http://www.example.com/root");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "http://www.example.com/root");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "http://www.example.com/root");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "http://www.example.com/root");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "http://www.example.com/root");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "http://www.example.com/root");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "http://www.example.com/root");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "http://www.example.com/root");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "http://www.example.com/root");
        assertEquals(0, element.lookupAttribute("http://www.example.com/root", "attr1"));
        assertEquals(1, element.lookupAttribute("http://www.example.com/root", "attr2"));
        assertEquals(2, element.lookupAttribute("http://www.example.com/root", "attr3"));
        assertEquals(3, element.lookupAttribute("http://www.example.com/root", "attr4"));
        assertEquals(4, element.lookupAttribute("http://www.example.com/root", "attr5"));
        assertEquals(5, element.lookupAttribute("http://www.example.com/root", "attr6"));
        assertEquals(6, element.lookupAttribute("http://www.example.com/root", "attr7"));
        assertEquals(7, element.lookupAttribute("http://www.example.com/root", "attr8"));
        assertEquals(8, element.lookupAttribute("http://www.example.com/root", "attr9"));
        assertEquals(9, element.lookupAttribute("http://www.example.com/root", "attr10"));
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
        Element element = new Element("root", "http://www.example.com/root", "root", "http://www.example.com/root");
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "http://www.example.com/root");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "http://www.example.com/root");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "http://www.example.com/root");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "http://www.example.com/root");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "http://www.example.com/root");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "http://www.example.com/root");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "http://www.example.com/root");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "http://www.example.com/root");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "http://www.example.com/root");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "http://www.example.com/root");
        assertEquals(0, element.lookupAttribute("http://www.example.com/root", "attr1"));
        assertEquals(1, element.lookupAttribute("http://