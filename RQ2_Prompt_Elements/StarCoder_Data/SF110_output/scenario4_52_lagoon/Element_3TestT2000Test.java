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
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(2));

        // Testcase 4: Element with three attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 3);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals("class", element.getAttributeLocalName(2));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(3));

        // Testcase 5: Element with four attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 4);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "title", "CDATA", "test");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals("class", element.getAttributeLocalName(2));
        assertEquals("title", element.getAttributeLocalName(3));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(4));

        // Testcase 6: Element with five attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 5);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "title", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "style", "CDATA", "test");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals("class", element.getAttributeLocalName(2));
        assertEquals("title", element.getAttributeLocalName(3));
        assertEquals("style", element.getAttributeLocalName(4));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(5));

        // Testcase 7: Element with six attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 6);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "title", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "style", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "onclick", "CDATA", "test");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals("class", element.getAttributeLocalName(2));
        assertEquals("title", element.getAttributeLocalName(3));
        assertEquals("style", element.getAttributeLocalName(4));
        assertEquals("onclick", element.getAttributeLocalName(5));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(6));

        // Testcase 8: Element with seven attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 7);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "title", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "style", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "onclick", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "ondblclick", "CDATA", "test");
        assertEquals("lang", element.getAttributeLocalName(0));
        assertEquals("dir", element.getAttributeLocalName(1));
        assertEquals("class", element.getAttributeLocalName(2));
        assertEquals("title", element.getAttributeLocalName(3));
        assertEquals("style", element.getAttributeLocalName(4));
        assertEquals("onclick", element.getAttributeLocalName(5));
        assertEquals("ondblclick", element.getAttributeLocalName(6));
        assertEquals(null, element.getAttributeLocalName(-1));
        assertEquals(null, element.getAttributeLocalName(7));

        // Testcase 9: Element with eight attributes
        element = new Element("http://www.w3.org/1999/xhtml", "html", 8);
        element.addAttribute("http://www.w3.org/1999/xhtml", "lang", "CDATA", "en");
        element.addAttribute("http://www.w3.org/1999/xhtml", "dir", "CDATA", "ltr");
        element.addAttribute("http://www.w3.org/1999/xhtml", "class", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "title", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "style", "CDATA", "test");
        element.addAttribute("http://www.w3.org/1999/xhtml", "onclick", "CDATA", "test");
        element.addAttribute("http://www.w3.