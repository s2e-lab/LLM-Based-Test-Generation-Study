// XmlIO_0Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {

    /**
     * The logger.
     */
    private static final Logger LOG = Logger.getLogger(XmlIO_0Test.class.getName());

    /**
     * The root element name.
     */
    private static final String ROOT_XML_ELEMENT_NAME = "root";

    /**
     * The root element.
     */
    private XmlElement rootElement;

    /**
     * The current element.
     */
    private XmlElement currentElement;

    /**
     * The elements.
     */
    private Vector<XmlElement> elements;

    /**
     * The XML reader.
     */
    private XMLReader xr;

    /**
     * Test method for {@link XmlIO#load(InputStream)}.
     */
    @Test
    void testLoad() {
        // Test 1
        // Test with a valid XML file.
        // Create the input stream...
        InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test.xml");
        // Load the XML...
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
        // Test 2
        // Test with an invalid XML file.
        // Create the input stream...
        input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test_invalid.xml");
        // Load the XML...
        xmlIO = new XmlIO();
        assertFalse(xmlIO.load(input));
    }
}

// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_1Test {
		
    /**
     * The logger.
     */
    private static final Logger LOG = Logger.getLogger(XmlIO_1Test.class.getName());

    /**
     * The root element name.
     */
    private static final String ROOT_XML_ELEMENT_NAME = "root";

    /**
     * The root element.
     */
    private XmlElement rootElement;

    /**
     * The current element.
     */
    private XmlElement currentElement;

    /**
     * The elements.
     */
    private Vector<XmlElement> elements;

    /**
     * The XML reader.
     */
    private XMLReader xr;

    /**
     * Test method for {@link XmlIO#load(InputStream)}.
     */
    @Test
    void testLoad() {
        // Test 1
        // Test with a valid XML file.
        // Create the input stream...
        InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test.xml");
        // Load the XML...
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
        // Test 2
        // Test with an invalid XML file.
        // Create the input stream...
        input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test_invalid.xml");
        // Load the XML...
        xmlIO = new XmlIO();
        assertFalse(xmlIO.load(input));
    }
}

// XmlIO_2Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_2Test {
		
    /**
     * The logger.
     */
    private static final Logger LOG = Logger.getLogger(XmlIO_2Test.class.getName());

    /**
     * The root element name.
     */
    private static final String ROOT_XML_ELEMENT_NAME = "root";

    /**
     * The root element.
     */
    private XmlElement rootElement;

    /**
     * The current element.
     */
    private XmlElement currentElement;

    /**
     * The elements.
     */
    private Vector<XmlElement> elements;

    /**
     * The XML reader.
     */
    private XMLReader xr;

    /**
     * Test method for {@link XmlIO#load(InputStream)}.
     */
    @Test
    void testLoad() {
        // Test 1
        // Test with a valid XML file.
        // Create the input stream...
        InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test.xml");
        // Load the XML...
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
        // Test 2
        // Test with an invalid XML file.
        // Create the input stream...
        input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test_invalid.xml");
        // Load the XML...
        xmlIO = new XmlIO();
        assertFalse(xmlIO.load(input));
    }
}

// XmlIO_3Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_3Test {
		
    /**
     * The logger.
     */
    private static final Logger LOG = Logger.getLogger(XmlIO_3Test.class.getName());

    /**
     * The root element name.
     */
    private static final String ROOT_XML_ELEMENT_NAME = "root";

    /**
     * The root element.
     */
    private XmlElement rootElement;

    /**
     * The current element.
     */
    private XmlElement currentElement;

    /**
     * The elements.
     */
    private Vector<XmlElement> elements;

    /**
     * The XML reader.
     */
    private XMLReader xr;

    /**
     * Test method for {@link XmlIO#load(InputStream)}.
     */
    @Test
    void testLoad() {
        // Test 1
        // Test with a valid XML file.
        // Create the input stream...
        InputStream input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test.xml");
        // Load the XML...
        XmlIO xmlIO = new XmlIO();
        assertTrue(xmlIO.load(input));
        // Test 2
        // Test with an invalid XML file.
        // Create the input stream...
        input = getClass().getResourceAsStream("/com/allenstudio/ir/util/test_invalid.xml");
        //