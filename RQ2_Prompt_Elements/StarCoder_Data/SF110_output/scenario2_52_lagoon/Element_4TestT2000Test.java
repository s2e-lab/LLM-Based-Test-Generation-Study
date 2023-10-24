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
        assertEquals("CDATA", element.getAttributeType(0));
        assertEquals("CDATA", element.getAttributeType(1));
        assertEquals("CDATA", element.getAttributeType(2));
        assertEquals("CDATA", element.getAttributeType(3));
        assertEquals("CDATA", element.getAttributeType(4));
        assertEquals("CDATA", element.getAttributeType(5));
        assertEquals("CDATA", element.getAttributeType(6));
        assertEquals("CDATA", element.getAttributeType(7));
        assertEquals("CDATA", element.getAttributeType(8));
        assertEquals("CDATA", element.getAttributeType(9));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            element.getAttributeType(10);
        });
    }
}
