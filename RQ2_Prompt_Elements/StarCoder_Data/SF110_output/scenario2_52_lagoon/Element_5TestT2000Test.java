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
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals("value6", element.getAttributeValue(5));
        assertEquals("value7", element.getAttributeValue(6));
        assertEquals("value8", element.getAttributeValue(7));
        assertEquals("value9", element.getAttributeValue(8));
        assertEquals("value10", element.getAttributeValue(9));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_4Test {
		
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
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals("value6", element.getAttributeValue(5));
        assertEquals("value7", element.getAttributeValue(6));
        assertEquals("value8", element.getAttributeValue(7));
        assertEquals("value9", element.getAttributeValue(8));
        assertEquals("value10", element.getAttributeValue(9));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_3Test {
		
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
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals("value6", element.getAttributeValue(5));
        assertEquals("value7", element.getAttributeValue(6));
        assertEquals("value8", element.getAttributeValue(7));
        assertEquals("value9", element.getAttributeValue(8));
        assertEquals("value10", element.getAttributeValue(9));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_2Test {
		
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
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals("value6", element.getAttributeValue(5));
        assertEquals("value7", element.getAttributeValue(6));
        assertEquals("value8", element.getAttributeValue(7));
        assertEquals("value9", element.getAttributeValue(8));
        assertEquals("value10", element.getAttributeValue(9));
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
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_1Test {
		
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
        element.addAttribute("attr6", "value6");
        element.addAttribute("attr7", "value7");
        element.addAttribute("attr8", "value8");
        element.addAttribute("attr9", "value9");
        element.addAttribute("attr10", "value10");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));
        assertEquals("value4", element.getAttributeValue(3));
        assertEquals("value5", element.getAttributeValue(4));
        assertEquals("value6", element.getAttributeValue(5));
        assertEquals("value7", element.getAttributeValue(6));
        assertEquals("value8", element.getAttributeValue(7));
        assertEquals("value9", element.getAttributeValue(8));
        assertEquals("value10", element.getAttributeValue(9));
    }
}

// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import