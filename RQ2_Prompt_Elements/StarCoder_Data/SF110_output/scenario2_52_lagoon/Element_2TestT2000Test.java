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
        Element element = new Element("root");
        element.addAttribute("a", "a");
        element.addAttribute("b", "b");
        element.addAttribute("c", "c");
        element.addAttribute("d", "d");
        element.addAttribute("e", "e");
        element.addAttribute("f", "f");
        element.addAttribute("g", "g");
        element.addAttribute("h", "h");
        element.addAttribute("i", "i");
        element.addAttribute("j", "j");
        assertEquals(element.getAttributeNamespaceURI(0), "");
        assertEquals(element.getAttributeNamespaceURI(1), "");
        assertEquals(element.getAttributeNamespaceURI(2), "");
        assertEquals(element.getAttributeNamespaceURI(3), "");
        assertEquals(element.getAttributeNamespaceURI(4), "");
        assertEquals(element.getAttributeNamespaceURI(5), "");
        assertEquals(element.getAttributeNamespaceURI(6), "");
        assertEquals(element.getAttributeNamespaceURI(7), "");
        assertEquals(element.getAttributeNamespaceURI(8), "");
        assertEquals(element.getAttributeNamespaceURI(9), "");
    }
}
