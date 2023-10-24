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
    * Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
    * It tests the parsing of a well-formed XML document.
    */
    @Test
    void testParseXMLSequential() {
        try {
            ElementHandler handler = new ElementHandler() {
                public void processElement(Element element) {
                    if (element.getName().equals("root")) {
                        assertEquals(1, element.getChildCount());
                        Element child = element.getChild(0);
                        assertEquals("child", child.getName());
                        assertEquals(1, child.getChildCount());
                        Element grandchild = child.getChild(0);
                        assertEquals("grandchild", grandchild.getName());
                        assertEquals(0, grandchild.getChildCount());
                        assertEquals(0, grandchild.getAttributeCount());
                        assertEquals(0, grandchild.getNamespaceCount());
                        assertEquals(0, grandchild.getNamespacePrefixCount());
                        assertEquals(0, grandchild.getNamespaceURICount());
                        assertEquals(0, grandchild.getNamespacePrefix(0));
                        assertEquals(0, grandchild.getNamespaceURI(0));
                        assertEquals(0, grandchild.getAttributeCount());
                        assertEquals(0, grandchild.getAttributeNameCount());
                        assertEquals(0, grandchild.getAttributeValueCount());
                        assertEquals(0, grandchild.getAttributeName(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeType(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue(0));
                        assertEquals(0, grandchild.getAttributeValue