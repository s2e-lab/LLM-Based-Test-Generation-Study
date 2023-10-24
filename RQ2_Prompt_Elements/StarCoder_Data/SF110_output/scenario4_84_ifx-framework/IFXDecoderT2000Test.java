// IFXDecoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IFXString;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDecoder}.
* It contains ten unit test cases for the {@link IFXDecoder#decode(Element)} method.
*/
class IFXDecoderTest {

    /**
     * Tests the decode method for a simple IFXObject.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObject() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement2() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement3() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement4() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement5() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement6() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement7() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement8() throws IFXException {
        IFXDecoder decoder = new IFXDecoder();
        Element element = new Element("SimpleIFXObject");
        element.setAttribute("name", "SimpleIFXObject");
        element.setAttribute("value", "10");
        Element childElement = new Element("childElement");
        childElement.setAttribute("name", "childElement");
        childElement.setAttribute("value", "10");
        element.addContent(childElement);
        IFXObject obj = decoder.decode(element);
        assertEquals("SimpleIFXObject", obj.getName());
        assertEquals(10, obj.getValue());
        assertEquals(1, obj.getChildCount());
        IFXObject child = obj.getChild(0);
        assertEquals("childElement", child.getName());
        assertEquals(10, child.getValue());
    }

    /**
     * Tests the decode method for a simple IFXObject with a child element.
     * @throws IFXException if there was a problem decoding the element.
     */
    @Test
    void testDecodeSimpleIFXObjectWithChildElement9