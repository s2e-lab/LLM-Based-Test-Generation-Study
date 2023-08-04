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
        // Testcase 1: Element with no attributes
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 2: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 3: Element with two attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 2);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 4: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 5: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 6: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 7: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 8: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 9: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));

        // Testcase 10: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals(null, element.getAttributeNamespaceURI(0));
        assertEquals(null, element.getAttributeNamespaceURI(-1));
        assertEquals(null, element.getAttributeNamespaceURI(1));
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
* It contains ten unit test cases for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		
    /**
    * Test method for {@link Element#getAttributeLocalName(int)}.
    */
    @Test
    void testGetAttributeLocalName() {
        // Testcase 1: Element with no attributes
        Element element = new Element("http://www.w3.org/1999/xhtml", "html");
        assertEquals(null, element.getAttributeLocalName(0));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(1));

        // Testcase 2: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(1));

        // Testcase 3: Element with two attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 2);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals("dir", element.getAttributeLocalName(1));

        // Testcase 4: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(1));

        // Testcase 5: Element with one attribute
        element = new Element("http://www.w3.org/1999/xhtml", "html", 1);
        element.addAttribute("http://www.w3.org/1999/xhtml",