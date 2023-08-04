// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with a valid XML document.
    */
    @Test
    void testParseXMLSequentialValid() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with a valid XML document.
    */
    @Test
    void testParseXMLSequentialValidWithDTD() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialInvalid() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, handler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialInvalidWithDTD() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialInvalidWithDTDAndHandler() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}
    * with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialInvalidWithDTDAndHandlerAndErrorHandler() throws SAXException, IOException {
        // Arrange
        String xml = "<root><a>1</a><b>2</b><c>3</c></root>";
        InputSource xmlInput = new InputSource(new StringReader(xml));
        ElementHandler handler = new ElementHandler();
        ErrorHandler errorHandler = new ErrorHandler() {
            public void warning(SAXParseException exception) throws SAXException {
                throw exception;
            }
            public void error(SAXParseException exception) throws SAXException {
                throw exception;
            }
            public void fatalError(SAXParseException exception) throws SAXException {
                throw exception;
            }
        };

        // Act
        Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, true, handler, errorHandler);

        // Assert
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }
}

// ElementHandler.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * Handler for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
 * <p>
 * The handler will be called for each element in the XML document.
 */
public class ElementHandler implements ContentHandler {

    /**
     * Handle an element.
     *
     * @param element the element to handle
     */
    public void handleElement(Element element) {
    }
}

// Element.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * Represents an XML element.
 * <p>
 * The element has a name, a value, and a list of children.
 */
public class Element {

    /**
     * The name of the element.
     */
    private String name;

    /**
     * The value of the element.
     */
    private String value;

    /**
     * The children of the element.
     */
    private List<Element> children;

    /**
     * Create a new element.
     *
     * @param name the name of the element
     * @param value the value of the element
     */
    public Element(String name, String value) {
        this.name = name;
        this.value = value;
        this.children = new ArrayList<Element>();
    }

    /**
     * Get the name of the element.
     *
     * @return the name of the element
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of the element.
     *
     * @return the value of the element
     */
    public String getValue() {
        return value;
    }

    /**
     * Get the children of the element.
     *
     * @return the children of the element
     */
    public List<Element> getChildren() {
        return children;
    }

    /**
     * Get the number of children of the element.
     *
     * @return the number of children of the element
     */
    public int getChildCount() {
        return children.size();
    }

    /**
     *