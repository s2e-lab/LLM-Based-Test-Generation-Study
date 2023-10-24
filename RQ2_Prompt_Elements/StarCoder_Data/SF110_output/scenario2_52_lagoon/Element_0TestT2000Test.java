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
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "CDATA", "value1");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "CDATA", "value2");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "CDATA", "value3");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "CDATA", "value4");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "CDATA", "value5");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "CDATA", "value6");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "CDATA", "value7");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "CDATA", "value8");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "CDATA", "value9");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "CDATA", "value10");
        assertEquals(0, element.lookupAttribute("", "attr1"));
        assertEquals(1, element.lookupAttribute("", "attr2"));
        assertEquals(2, element.lookupAttribute("", "attr3"));
        assertEquals(3, element.lookupAttribute("", "attr4"));
        assertEquals(4, element.lookupAttribute("", "attr5"));
        assertEquals(5, element.lookupAttribute("", "attr6"));
        assertEquals(6, element.lookupAttribute("", "attr7"));
        assertEquals(7, element.lookupAttribute("", "attr8"));
        assertEquals(8, element.lookupAttribute("", "attr9"));
        assertEquals(9, element.lookupAttribute("", "attr10"));
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
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "CDATA", "value1");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "CDATA", "value2");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "CDATA", "value3");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "CDATA", "value4");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "CDATA", "value5");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "CDATA", "value6");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "CDATA", "value7");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "CDATA", "value8");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "CDATA", "value9");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "CDATA", "value10");
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr1"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr2"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr3"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr4"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr5"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr6"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr7"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr8"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr9"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr10"));
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
        element.addAttribute("attr1", "http://www.example.com/root", "attr1", "CDATA", "value1");
        element.addAttribute("attr2", "http://www.example.com/root", "attr2", "CDATA", "value2");
        element.addAttribute("attr3", "http://www.example.com/root", "attr3", "CDATA", "value3");
        element.addAttribute("attr4", "http://www.example.com/root", "attr4", "CDATA", "value4");
        element.addAttribute("attr5", "http://www.example.com/root", "attr5", "CDATA", "value5");
        element.addAttribute("attr6", "http://www.example.com/root", "attr6", "CDATA", "value6");
        element.addAttribute("attr7", "http://www.example.com/root", "attr7", "CDATA", "value7");
        element.addAttribute("attr8", "http://www.example.com/root", "attr8", "CDATA", "value8");
        element.addAttribute("attr9", "http://www.example.com/root", "attr9", "CDATA", "value9");
        element.addAttribute("attr10", "http://www.example.com/root", "attr10", "CDATA", "value10");
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr1"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr2"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr3"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr4"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr5"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr6"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr7"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr8"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr9"));
        assertEquals(-1, element.lookupAttribute("http://www.example.com/root", "attr10"));
    }
}

// Element_3Test.