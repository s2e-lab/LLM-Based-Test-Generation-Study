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
        // Arrange
        Element element = new Element("root");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:foo", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:bar", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:baz", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:qux", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:quux", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:corge", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:grault", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:garply", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:waldo", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:fred", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:plugh", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:xyzzy", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:thud", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wibble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wobble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:flob", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:wubble", "http://www.w3.org/2000/xmlns/");
        element.addAttribute("http://www.w3.org/2000/xmlns/", "xmlns:w