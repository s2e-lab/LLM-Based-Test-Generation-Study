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
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {

    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("attr1", element.getAttributeType(0));
        assertEquals("attr2", element.getAttributeType(1));
        assertEquals("attr3", element.getAttributeType(2));
        assertEquals("attr4", element.getAttributeType(3));
        assertEquals("attr5", element.getAttributeType(4));
        assertEquals("attr6", element.getAttributeType(5));
        assertEquals("attr7", element.getAttributeType(6));
        assertEquals("attr8", element.getAttributeType(7));
        assertEquals("attr9", element.getAttributeType(8));
        assertEquals("attr10", element.getAttributeType(9));
        assertEquals(null, element.getAttributeType(-1));
        assertEquals(null, element.getAttributeType(10));
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
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_5Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        assertEquals(null, element.getAttributeType(0));
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
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_6Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        assertEquals("attr1", element.getAttributeType(0));
        assertEquals(null, element.getAttributeType(-1));
        assertEquals(null, element.getAttributeType(1));
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
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_7Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("attr1", element.getAttributeType(0));
        assertEquals("attr2", element.getAttributeType(1));
        assertEquals("attr3", element.getAttributeType(2));
        assertEquals("attr4", element.getAttributeType(3));
        assertEquals("attr5", element.getAttributeType(4));
        assertEquals("attr6", element.getAttributeType(5));
        assertEquals("attr7", element.getAttributeType(6));
        assertEquals("attr8", element.getAttributeType(7));
        assertEquals("attr9", element.getAttributeType(8));
        assertEquals("attr10", element.getAttributeType(9));
        assertEquals(null, element.getAttributeType(-1));
        assertEquals(null, element.getAttributeType(10));
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
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_8Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("attr1", element.getAttributeType(0));
        assertEquals("attr2", element.getAttributeType(1));
        assertEquals("attr3", element.getAttributeType(2));
        assertEquals("attr4", element.getAttributeType(3));
        assertEquals("attr5", element.getAttributeType(4));
        assertEquals("attr6", element.getAttributeType(5));
        assertEquals("attr7", element.getAttributeType(6));
        assertEquals("attr8", element.getAttributeType(7));
        assertEquals("attr9", element.getAttributeType(8));
        assertEquals("attr10", element.getAttributeType(9));
        assertEquals(null, element.getAttributeType(-1));
        assertEquals(null, element.getAttributeType(10));
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
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_9Test {
		
    /**
    * Test method for {@link Element#getAttributeType(int)}.
    */
    @Test
    void testGetAttributeType() {
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        element.addAttribute("attr4", "value4");
        element.addAttribute("attr5", "value5");
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("attr1", element.getAttributeType(0));
        assertEquals("attr2", element.getAttributeType(1));
        assertEquals("attr3", element.getAttributeType(2));
        assertEquals("attr4", element.getAttributeType(3));
        assertEquals("attr5", element.getAttributeType(4));
        assertEquals("attr6", element.getAttributeType(5));
        assertEquals("attr7", element.getAttributeType(6));
        assertEquals("attr8", element.getAttributeType(7));
        assertEquals("attr9", element.getAttributeType(8));