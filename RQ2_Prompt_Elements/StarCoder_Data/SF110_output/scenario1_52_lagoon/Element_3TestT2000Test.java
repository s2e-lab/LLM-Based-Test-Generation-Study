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
        Element element = new Element("root", "http://www.w3.org/1999/xhtml", "html", "html");
        element.addAttribute("xmlns", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
        element.addAttribute("xlink:href", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:type", "simple");
        element.addAttribute("xlink:role", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:arcrole", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:title", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:to", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:label", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:show", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:actuate", "http://www.w3.org/1999/xhtml");
        element.addAttribute("xlink:from", "http://www.w