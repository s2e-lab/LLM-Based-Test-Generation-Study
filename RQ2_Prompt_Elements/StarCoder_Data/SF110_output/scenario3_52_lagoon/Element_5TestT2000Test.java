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
        // Test case 1:
        // Test that the method returns the value of the attribute at the specified index.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));

        // Test case 2:
        // Test that the method returns null if the index is -1.
        assertEquals(null, element.getAttributeValue(-1));

        // Test case 3:
        // Test that the method throws an IndexOutOfBoundsException if the index is out of bounds.
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeValue(3);
        });
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
        // Test case 1:
        // Test that the method returns the value of the attribute with the specified name.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals("value1", element.getAttributeValue("attr1"));
        assertEquals("value2", element.getAttributeValue("attr2"));
        assertEquals("value3", element.getAttributeValue("attr3"));

        // Test case 2:
        // Test that the method returns null if the attribute does not exist.
        assertEquals(null, element.getAttributeValue("attr4"));
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
* It contains ten unit test cases for the {@link Element#getAttributeCount()} method.
*/
class Element_3Test {
		
    /**
    * Test method for {@link Element#getAttributeCount()}.
    */
    @Test
    void testGetAttributeCount() {
        // Test case 1:
        // Test that the method returns the number of attributes.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals(3, element.getAttributeCount());

        // Test case 2:
        // Test that the method returns 0 if the element has no attributes.
        Element element2 = new Element("root");
        assertEquals(0, element2.getAttributeCount());
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
* It contains ten unit test cases for the {@link Element#getAttributeName(int)} method.
*/
class Element_2Test {
		
    /**
    * Test method for {@link Element#getAttributeName(int)}.
    */
    @Test
    void testGetAttributeName() {
        // Test case 1:
        // Test that the method returns the name of the attribute at the specified index.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals("attr1", element.getAttributeName(0));
        assertEquals("attr2", element.getAttributeName(1));
        assertEquals("attr3", element.getAttributeName(2));

        // Test case 2:
        // Test that the method returns null if the index is -1.
        assertEquals(null, element.getAttributeName(-1));

        // Test case 3:
        // Test that the method throws an IndexOutOfBoundsException if the index is out of bounds.
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeName(3);
        });
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
* It contains ten unit test cases for the {@link Element#getAttributeIndex(String)} method.
*/
class Element_1Test {
		
    /**
    * Test method for {@link Element#getAttributeIndex(String)}.
    */
    @Test
    void testGetAttributeIndex() {
        // Test case 1:
        // Test that the method returns the index of the attribute with the specified name.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals(0, element.getAttributeIndex("attr1"));
        assertEquals(1, element.getAttributeIndex("attr2"));
        assertEquals(2, element.getAttributeIndex("attr3"));

        // Test case 2:
        // Test that the method returns -1 if the attribute does not exist.
        assertEquals(-1, element.getAttributeIndex("attr4"));
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
* It contains ten unit test cases for the {@link Element#addAttribute(String, String)} method.
*/
class Element_0Test {
		
    /**
    * Test method for {@link Element#addAttribute(String, String)}.
    */
    @Test
    void testAddAttribute() {
        // Test case 1:
        // Test that the method adds an attribute to the element.
        Element element = new Element("root");
        element.addAttribute("attr1", "value1");
        element.addAttribute("attr2", "value2");
        element.addAttribute("attr3", "value3");
        assertEquals("value1", element.getAttributeValue(0));
        assertEquals("value2", element.getAttributeValue(1));
        assertEquals("value3", element.getAttributeValue(2));

        // Test case 2:
        // Test that the method throws an IllegalArgumentException if the attribute already exists.
        assertThrows(IllegalArgumentException.class, () -> {
            element.addAttribute("attr1", "value1");
        });
    }
}

// Element.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;

/**
 * An XML Element.
 */
public class Element extends NodeWithChildren {

    /**
     * Get the value of the attribute at the specified index.
     *
     * @return the attribute value,
     *         or <code>null</code> if index is -1
     * @param index the index as returned from {@link #lookupAttribute}
     * @throws IndexOutOfBoundsException if no such attribute exist.
     */
    public String getAttributeValue(int index) throws IndexOutOfBoundsException;

    /**
     * Get the value of the attribute with the specified name.
     *
     * @return the attribute value,
     *         or <code>null</code> if no such attribute exist.
     * @param name the name of the attribute
     */
    public String getAttributeValue(String name);

    /**
     * Get the number of attributes.
     *
     * @return the number of attributes
     */
    public int getAttribute