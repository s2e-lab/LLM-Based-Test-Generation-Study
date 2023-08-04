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

    @Test
    void testParseXMLSequential() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        Element root = SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), false, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequentialWithDTD() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        Element root = SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidation() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        Element root = SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler);
        assertEquals("root", root.getName());
        assertEquals(3, root.getChildCount());
        assertEquals("a", root.getChild(0).getName());
        assertEquals("1", root.getChild(0).getValue());
        assertEquals("b", root.getChild(1).getName());
        assertEquals("2", root.getChild(1).getValue());
        assertEquals("c", root.getChild(2).getName());
        assertEquals("3", root.getChild(2).getValue());
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure2() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure3() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure4() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure5() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure6() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure7() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure8() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure9() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }

    @Test
    void testParseXMLSequentialWithDTDAndValidationFailure10() throws SAXParseException, SAXException, IOException {
        ElementHandler handler = new ElementHandler();
        assertThrows(SAXParseException.class, () -> SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a>1</a><b>2</b><c>3</c></root>")), true, handler));
    }
}
