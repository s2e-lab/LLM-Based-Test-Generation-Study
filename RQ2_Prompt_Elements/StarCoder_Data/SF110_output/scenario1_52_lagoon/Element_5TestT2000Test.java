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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {

    /**
    * Test method for {@link Element#getAttributeValue(int)}.
    */
    @Test
    void testGetAttributeValue() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals(null, element.getAttributeValue(-1));
        assertEquals(null, element.getAttributeValue(5));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(String)} method.
*/
class Element_4Test {
		
    /**
    * Test method for {@link Element#getAttributeValue(String)}.
    */
    @Test
    void testGetAttributeValue() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        assertEquals("value1", element.getAttributeValue("attr1"));
        assertEquals("value2", element.getAttributeValue("attr2"));
        assertEquals("value3", element.getAttributeValue("attr3"));
        assertEquals("value4", element.getAttributeValue("attr4"));
        assertEquals("value5", element.getAttributeValue("attr5"));
        assertEquals(null, element.getAttributeValue("attr6"));
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
* It contains ten unit test cases for the {@link Element#addAttribute(String, String)} method.
*/
class Element_3Test {
		
    /**
    * Test method for {@link Element#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals(null, element.getAttributeValue(-1));
        assertEquals(null, element.getAttributeValue(5));
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
* It contains ten unit test cases for the {@link Element#addAttribute(String)} method.
*/
class Element_2Test {
		
    /**
    * Test method for {@link Element#addAttribute(String)}.
    */
    @Test
    void testAddAttribute() {
        Element element = new Element("root");
        element.addAttribute("attr1");
        element.addAttribute("attr2");
        element.addAttribute("attr3");
        element.addAttribute("attr4");
        element.addAttribute("attr5");
        assertEquals("", element.getAttributeValue(0));
        assertEquals("", element.getAttributeValue(1));
        assertEquals("", element.getAttributeValue(2));
        assertEquals("", element.getAttributeValue(3));
        assertEquals("", element.getAttributeValue(4));
        assertEquals(null, element.getAttributeValue(-1));
        assertEquals(null, element.getAttributeValue(5));
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
* It contains ten unit test cases for the {@link Element#Element(String)} method.
*/
class Element_1Test {
		
    /**
    * Test method for {@link Element#Element(String)}.
    */
    @Test
    void testElement() {
        Element element = new Element("root");
        assertEquals("root", element.getName());
        assertEquals(0, element.getAttributeCount());
        assertEquals(0, element.getChildCount());
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
* It contains ten unit test cases for the {@link Element#Element(String, String)} method.
*/
class Element_0Test {
		
    /**
    * Test method for {@link Element#Element(String, String)}.
    */
    @Test
    void testElement() {
        Element element = new Element("root", "http://www.w3.org/1999/xhtml");
        assertEquals("root", element.getName());
        assertEquals("http://www.w3.org/1999/xhtml", element.getNamespace());
        assertEquals(0, element.getAttributeCount());
        assertEquals(0, element.getChildCount());
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(String, String)} method.
*/
class Element_6Test {
		
    /**
    * Test method for {@link Element#getAttributeValue(String, String)}.
    */
    @Test
    void testGetAttributeValue() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        assertEquals("value1", element.getAttributeValue("attr1", ""));
        assertEquals("value2", element.getAttributeValue("attr2", ""));
        assertEquals("value3", element.getAttributeValue("attr3", ""));
        assertEquals("value4", element.getAttributeValue("attr4", ""));
        assertEquals("value5", element.getAttributeValue("attr5", ""));
        assertEquals(null, element.getAttributeValue("attr6", ""));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(String, String, String)} method.
*/
class Element_7Test {
		
    /**
    * Test method for {@link Element#getAttributeValue(String, String, String)}.
    */
    @Test