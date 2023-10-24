// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {

    /**
    * Test method for {@link TreeBuilder#fileToInputSource(File)}.
    *
    * @throws FileNotFoundException  if the file doesn't exist
    * @throws FileNotFoundException  if some I/O error occurs
    */
    @Test
    void testFileToInputSource() throws FileNotFoundException, IOException {
        File file = new File("src/test/resources/test.xml");
        InputSource inputSource = TreeBuilder.fileToInputSource(file);
        assertNotNull(inputSource);
        assertEquals(file.toURI().toURL().toString(), inputSource.getSystemId());
        assertEquals(file.toURI().toURL(), inputSource.getPublicId());
    }
}

// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
    /**
    * Test method for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    *
    * @throws SAXParseException if the XML data is not valid
    * @throws SAXException if any other error occurs while parsing the XML data
    * @throws IOException  if there was some I/O error while reading the input.
    */
    @Test
    void testParseXML() throws SAXParseException, SAXException, IOException {
        InputSource inputSource = new InputSource(new FileReader("src/test/resources/test.xml"));
        Element rootElement = TreeBuilder.parseXML(inputSource, false);
        assertNotNull(rootElement);
        assertEquals("root", rootElement.getName());
        assertEquals("http://www.example.com/test", rootElement.getNamespaceURI());
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test", "http://www.w3.org/2000/xmlns/"));
        assertEquals("http://www.example.com/test", rootElement.getAttribute("xmlns:test